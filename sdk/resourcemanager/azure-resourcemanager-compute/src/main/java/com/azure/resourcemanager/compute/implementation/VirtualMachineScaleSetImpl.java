// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.compute.implementation;

import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.SubResource;
import com.azure.core.management.provider.IdentifierProvider;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.AuthorizationManager;
import com.azure.resourcemanager.authorization.models.BuiltInRole;
import com.azure.resourcemanager.authorization.utils.RoleAssignmentHelper;
import com.azure.resourcemanager.compute.ComputeManager;
import com.azure.resourcemanager.compute.fluent.models.ProximityPlacementGroupInner;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineScaleSetExtensionInner;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineScaleSetInner;
import com.azure.resourcemanager.compute.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.models.ApiEntityReference;
import com.azure.resourcemanager.compute.models.BillingProfile;
import com.azure.resourcemanager.compute.models.BootDiagnostics;
import com.azure.resourcemanager.compute.models.CachingTypes;
import com.azure.resourcemanager.compute.models.DiagnosticsProfile;
import com.azure.resourcemanager.compute.models.DiffDiskOptions;
import com.azure.resourcemanager.compute.models.DiffDiskPlacement;
import com.azure.resourcemanager.compute.models.DiffDiskSettings;
import com.azure.resourcemanager.compute.models.DiskCreateOptionTypes;
import com.azure.resourcemanager.compute.models.ImageReference;
import com.azure.resourcemanager.compute.models.KnownLinuxVirtualMachineImage;
import com.azure.resourcemanager.compute.models.KnownWindowsVirtualMachineImage;
import com.azure.resourcemanager.compute.models.LinuxConfiguration;
import com.azure.resourcemanager.compute.models.NetworkApiVersion;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.models.OrchestrationMode;
import com.azure.resourcemanager.compute.models.Plan;
import com.azure.resourcemanager.compute.models.ProximityPlacementGroup;
import com.azure.resourcemanager.compute.models.ProximityPlacementGroupType;
import com.azure.resourcemanager.compute.models.PurchasePlan;
import com.azure.resourcemanager.compute.models.ResourceIdentityType;
import com.azure.resourcemanager.compute.models.RunCommandInput;
import com.azure.resourcemanager.compute.models.RunCommandInputParameter;
import com.azure.resourcemanager.compute.models.RunCommandResult;
import com.azure.resourcemanager.compute.models.SshConfiguration;
import com.azure.resourcemanager.compute.models.SshPublicKey;
import com.azure.resourcemanager.compute.models.StorageAccountTypes;
import com.azure.resourcemanager.compute.models.UpgradeMode;
import com.azure.resourcemanager.compute.models.UpgradePolicy;
import com.azure.resourcemanager.compute.models.VaultSecretGroup;
import com.azure.resourcemanager.compute.models.VirtualHardDisk;
import com.azure.resourcemanager.compute.models.VirtualMachineCustomImage;
import com.azure.resourcemanager.compute.models.VirtualMachineEvictionPolicyTypes;
import com.azure.resourcemanager.compute.models.VirtualMachinePriorityTypes;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSet;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetDataDisk;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetExtension;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetExtensionProfile;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetIpConfiguration;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetManagedDiskParameters;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetNetworkConfiguration;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetNetworkProfile;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetOSDisk;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetOSProfile;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetPublicIpAddressConfiguration;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetSku;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetSkuTypes;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetStorageProfile;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetUpdate;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetVMProfile;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetVMs;
import com.azure.resourcemanager.compute.models.WinRMConfiguration;
import com.azure.resourcemanager.compute.models.WinRMListener;
import com.azure.resourcemanager.compute.models.WindowsConfiguration;
import com.azure.resourcemanager.msi.models.Identity;
import com.azure.resourcemanager.network.NetworkManager;
import com.azure.resourcemanager.network.models.ApplicationSecurityGroup;
import com.azure.resourcemanager.network.models.LoadBalancer;
import com.azure.resourcemanager.network.models.LoadBalancerBackend;
import com.azure.resourcemanager.network.models.LoadBalancerInboundNatPool;
import com.azure.resourcemanager.network.models.LoadBalancerPrivateFrontend;
import com.azure.resourcemanager.network.models.Network;
import com.azure.resourcemanager.network.models.NetworkSecurityGroup;
import com.azure.resourcemanager.network.models.VirtualMachineScaleSetNetworkInterface;
import com.azure.resourcemanager.resources.fluentcore.arm.AvailabilityZoneId;
import com.azure.resourcemanager.resources.fluentcore.arm.ResourceId;
import com.azure.resourcemanager.resources.fluentcore.arm.ResourceUtils;
import com.azure.resourcemanager.resources.fluentcore.arm.models.implementation.GroupableParentResourceImpl;
import com.azure.resourcemanager.resources.fluentcore.model.Creatable;
import com.azure.resourcemanager.resources.fluentcore.utils.PagedConverter;
import com.azure.resourcemanager.resources.fluentcore.utils.ResourceManagerUtils;
import com.azure.resourcemanager.storage.StorageManager;
import com.azure.resourcemanager.storage.models.StorageAccount;
import reactor.core.Exceptions;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/** Implementation of VirtualMachineScaleSet. */
public class VirtualMachineScaleSetImpl extends
    GroupableParentResourceImpl<VirtualMachineScaleSet, VirtualMachineScaleSetInner, VirtualMachineScaleSetImpl, ComputeManager>
    implements VirtualMachineScaleSet, VirtualMachineScaleSet.DefinitionManagedOrUnmanaged,
    VirtualMachineScaleSet.DefinitionManaged, VirtualMachineScaleSet.DefinitionUnmanaged, VirtualMachineScaleSet.Update,
    VirtualMachineScaleSet.DefinitionStages.WithSystemAssignedIdentityBasedAccessOrCreate,
    VirtualMachineScaleSet.DefinitionStages.WithUserAssignedManagedServiceIdentity,
    VirtualMachineScaleSet.UpdateStages.WithSystemAssignedIdentityBasedAccessOrApply,
    VirtualMachineScaleSet.UpdateStages.WithUserAssignedManagedServiceIdentity {
    // Clients
    private final StorageManager storageManager;
    private final NetworkManager networkManager;
    // used to generate unique name for any dependency resources
    private final IdentifierProvider namer;
    private boolean isMarketplaceLinuxImage = false;
    // name of an existing subnet in the primary network to use
    private String existingPrimaryNetworkSubnetNameToAssociate;
    // unique key of a creatable storage accounts to be used for virtual machines child resources that
    // requires storage [OS disk]
    private List<String> creatableStorageAccountKeys = new ArrayList<>();
    // reference to an existing storage account to be used for virtual machines child resources that
    // requires storage [OS disk]
    private List<StorageAccount> existingStorageAccountsToAssociate = new ArrayList<>();
    // the child resource extensions
    private Map<String, VirtualMachineScaleSetExtension> extensions;
    // reference to the primary and internal Internet facing load balancer
    private LoadBalancer primaryInternetFacingLoadBalancer;
    private LoadBalancer primaryInternalLoadBalancer;
    // Load balancer specific variables used during update
    private boolean removePrimaryInternetFacingLoadBalancerOnUpdate;
    private boolean removePrimaryInternalLoadBalancerOnUpdate;
    private LoadBalancer primaryInternetFacingLoadBalancerToAttachOnUpdate;
    private LoadBalancer primaryInternalLoadBalancerToAttachOnUpdate;
    private List<String> primaryInternetFacingLBBackendsToRemoveOnUpdate = new ArrayList<>();
    private List<String> primaryInternetFacingLBInboundNatPoolsToRemoveOnUpdate = new ArrayList<>();
    private List<String> primaryInternalLBBackendsToRemoveOnUpdate = new ArrayList<>();
    private List<String> primaryInternalLBInboundNatPoolsToRemoveOnUpdate = new ArrayList<>();
    private List<String> primaryInternetFacingLBBackendsToAddOnUpdate = new ArrayList<>();
    private List<String> primaryInternetFacingLBInboundNatPoolsToAddOnUpdate = new ArrayList<>();
    private List<String> primaryInternalLBBackendsToAddOnUpdate = new ArrayList<>();
    private List<String> primaryInternalLBInboundNatPoolsToAddOnUpdate = new ArrayList<>();
    // Flag indicates native disk is selected for OS and Data disks
    private boolean isUnmanagedDiskSelected;
    // To track the managed data disks
    private final ManagedDataDiskCollection managedDataDisks;
    // Utility to setup MSI for the virtual machine scale set
    VirtualMachineScaleSetMsiHandler virtualMachineScaleSetMsiHandler;
    // To manage boot diagnostics specific operations
    private final BootDiagnosticsHandler bootDiagnosticsHandler;
    // Name of the new proximity placement group
    private String newProximityPlacementGroupName;
    // Type fo the new proximity placement group
    private ProximityPlacementGroupType newProximityPlacementGroupType;
    // To manage OS profile
    private boolean removeOsProfile;
    private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetImpl.class);
    // A transition indicator. Only if the profile is set from null to non-null will this indicator change from false to true.
    // Currently, it's only used in checking if the vm profile defaults has to be set.
    private boolean profileAttached = false;

    VirtualMachineScaleSetImpl(String name, VirtualMachineScaleSetInner innerModel, final ComputeManager computeManager,
        final StorageManager storageManager, final NetworkManager networkManager,
        final AuthorizationManager authorizationManager) {
        super(name, innerModel, computeManager);
        this.storageManager = storageManager;
        this.networkManager = networkManager;
        this.namer = this.manager().resourceManager().internalContext().createIdentifierProvider(this.name());
        this.managedDataDisks = new ManagedDataDiskCollection(this);
        this.virtualMachineScaleSetMsiHandler = new VirtualMachineScaleSetMsiHandler(authorizationManager, this);
        this.bootDiagnosticsHandler = new BootDiagnosticsHandler(this);
        this.newProximityPlacementGroupName = null;
        this.newProximityPlacementGroupType = null;
    }

    @Override
    protected void initializeChildrenFromInner() {
        this.extensions = new HashMap<>();
        if (this.innerModel() != null
            && this.innerModel().virtualMachineProfile() != null
            && this.innerModel().virtualMachineProfile().extensionProfile() != null) {
            if (this.innerModel().virtualMachineProfile().extensionProfile().extensions() != null) {
                for (VirtualMachineScaleSetExtensionInner inner : this.innerModel()
                    .virtualMachineProfile()
                    .extensionProfile()
                    .extensions()) {
                    this.extensions.put(inner.name(), new VirtualMachineScaleSetExtensionImpl(inner, this));
                }
            }
        }
    }

    @Override
    public VirtualMachineScaleSetVMs virtualMachines() {
        return new VirtualMachineScaleSetVMsImpl(this, this.manager().serviceClient().getVirtualMachineScaleSetVMs(),
            this.myManager);
    }

    @Override
    public PagedIterable<VirtualMachineScaleSetSku> listAvailableSkus() {
        return PagedConverter.mapPage(
            this.manager().serviceClient().getVirtualMachineScaleSets().listSkus(this.resourceGroupName(), this.name()),
            VirtualMachineScaleSetSkuImpl::new);
    }

    @Override
    public void deallocate() {
        this.deallocateAsync().block();
    }

    @Override
    public Mono<Void> deallocateAsync() {
        return this.manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .deallocateAsync(this.resourceGroupName(), this.name(), null, null)
            .map(aVoid -> this.refreshAsync())
            .then();
    }

    @Override
    public void powerOff() {
        this.powerOffAsync().block();
    }

    @Override
    public Mono<Void> powerOffAsync() {
        return this.manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .powerOffAsync(this.resourceGroupName(), this.name(), null, null);
    }

    @Override
    public void restart() {
        this.restartAsync().block();
    }

    @Override
    public Mono<Void> restartAsync() {
        return this.manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .restartAsync(this.resourceGroupName(), this.name(), null);
    }

    @Override
    public void start() {
        this.startAsync().block();
    }

    @Override
    public Mono<Void> startAsync() {
        return this.manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .startAsync(this.resourceGroupName(), this.name(), null);
    }

    @Override
    public void reimage() {
        this.reimageAsync().block();
    }

    @Override
    public Mono<Void> reimageAsync() {
        return this.manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .reimageAsync(this.resourceGroupName(), this.name(), null);
    }

    @Override
    public RunCommandResult runPowerShellScriptInVMInstance(String vmId, List<String> scriptLines,
        List<RunCommandInputParameter> scriptParameters) {
        return this.manager()
            .virtualMachineScaleSets()
            .runPowerShellScriptInVMInstance(this.resourceGroupName(), this.name(), vmId, scriptLines,
                scriptParameters);
    }

    @Override
    public Mono<RunCommandResult> runPowerShellScriptInVMInstanceAsync(String vmId, List<String> scriptLines,
        List<RunCommandInputParameter> scriptParameters) {
        return this.manager()
            .virtualMachineScaleSets()
            .runPowerShellScriptInVMInstanceAsync(this.resourceGroupName(), this.name(), vmId, scriptLines,
                scriptParameters);
    }

    @Override
    public RunCommandResult runShellScriptInVMInstance(String vmId, List<String> scriptLines,
        List<RunCommandInputParameter> scriptParameters) {
        return this.manager()
            .virtualMachineScaleSets()
            .runShellScriptInVMInstance(this.resourceGroupName(), this.name(), vmId, scriptLines, scriptParameters);
    }

    @Override
    public Mono<RunCommandResult> runShellScriptInVMInstanceAsync(String vmId, List<String> scriptLines,
        List<RunCommandInputParameter> scriptParameters) {
        return this.manager()
            .virtualMachineScaleSets()
            .runShellScriptInVMInstanceAsync(this.resourceGroupName(), this.name(), vmId, scriptLines,
                scriptParameters);
    }

    @Override
    public RunCommandResult runCommandInVMInstance(String vmId, RunCommandInput inputCommand) {
        return this.manager()
            .virtualMachineScaleSets()
            .runCommandInVMInstance(this.resourceGroupName(), this.name(), vmId, inputCommand);
    }

    @Override
    public Mono<RunCommandResult> runCommandVMInstanceAsync(String vmId, RunCommandInput inputCommand) {
        return this.manager()
            .virtualMachineScaleSets()
            .runCommandVMInstanceAsync(this.resourceGroupName(), this.name(), vmId, inputCommand);
    }

    @Override
    public String computerNamePrefix() {
        if (this.innerModel() != null && this.innerModel().virtualMachineProfile() != null) {
            return this.innerModel().virtualMachineProfile().osProfile().computerNamePrefix();
        } else {
            return null;
        }
    }

    @Override
    public OperatingSystemTypes osType() {
        if (this.innerModel() != null && this.innerModel().virtualMachineProfile() != null) {
            return this.innerModel().virtualMachineProfile().storageProfile().osDisk().osType();
        } else {
            return null;
        }
    }

    @Override
    public CachingTypes osDiskCachingType() {
        if (this.innerModel() != null && this.innerModel().virtualMachineProfile() != null) {
            return this.innerModel().virtualMachineProfile().storageProfile().osDisk().caching();
        } else {
            return null;
        }
    }

    @Override
    public String osDiskName() {
        if (this.innerModel() != null && this.innerModel().virtualMachineProfile() != null) {
            return this.innerModel().virtualMachineProfile().storageProfile().osDisk().name();
        } else {
            return null;
        }
    }

    @Override
    public boolean isEphemeralOSDisk() {
        return this.innerModel() != null
            && this.innerModel().virtualMachineProfile() != null
            && this.innerModel().virtualMachineProfile().storageProfile() != null
            && this.innerModel().virtualMachineProfile().storageProfile().osDisk() != null
            && this.innerModel().virtualMachineProfile().storageProfile().osDisk().diffDiskSettings() != null
            && this.innerModel().virtualMachineProfile().storageProfile().osDisk().diffDiskSettings().placement()
                != null;
    }

    @Override
    public UpgradeMode upgradeModel() {
        // flexible vmss won't have an upgrade mode
        return this.innerModel().upgradePolicy() == null ? null : this.innerModel().upgradePolicy().mode();
    }

    @Override
    public boolean overProvisionEnabled() {
        return ResourceManagerUtils.toPrimitiveBoolean(this.innerModel().overprovision());
    }

    @Override
    public VirtualMachineScaleSetSkuTypes sku() {
        return VirtualMachineScaleSetSkuTypes.fromSku(this.innerModel().sku());
    }

    @Override
    public int capacity() {
        if (isVMProfileNotSet()) {
            return 0;
        }
        return ResourceManagerUtils.toPrimitiveInt(this.innerModel().sku().capacity());
    }

    @Override
    public Network getPrimaryNetwork() throws IOException {
        VirtualMachineScaleSetIpConfiguration ipConfiguration = primaryNicDefaultIpConfiguration();
        if (ipConfiguration == null) {
            return null;
        }
        String subnetId = ipConfiguration.subnet().id();
        String virtualNetworkId = ResourceUtils.parentResourceIdFromResourceId(subnetId);
        return this.networkManager.networks().getById(virtualNetworkId);
    }

    @Override
    public LoadBalancer getPrimaryInternetFacingLoadBalancer() throws IOException {
        if (this.primaryInternetFacingLoadBalancer == null) {
            loadCurrentPrimaryLoadBalancersIfAvailableAsync().block();
        }
        return this.primaryInternetFacingLoadBalancer;
    }

    @Override
    public Map<String, LoadBalancerBackend> listPrimaryInternetFacingLoadBalancerBackends() throws IOException {
        if (this.getPrimaryInternetFacingLoadBalancer() != null) {
            return getBackendsAssociatedWithIpConfiguration(this.primaryInternetFacingLoadBalancer,
                primaryNicDefaultIpConfiguration());
        }
        return new HashMap<>();
    }

    @Override
    public Map<String, LoadBalancerInboundNatPool> listPrimaryInternetFacingLoadBalancerInboundNatPools()
        throws IOException {
        if (this.getPrimaryInternetFacingLoadBalancer() != null) {
            return getInboundNatPoolsAssociatedWithIpConfiguration(this.primaryInternetFacingLoadBalancer,
                primaryNicDefaultIpConfiguration());
        }
        return new HashMap<>();
    }

    @Override
    public LoadBalancer getPrimaryInternalLoadBalancer() throws IOException {
        if (this.primaryInternalLoadBalancer == null) {
            loadCurrentPrimaryLoadBalancersIfAvailableAsync().block();
        }
        return this.primaryInternalLoadBalancer;
    }

    @Override
    public Map<String, LoadBalancerBackend> listPrimaryInternalLoadBalancerBackends() throws IOException {
        if (this.getPrimaryInternalLoadBalancer() != null) {
            return getBackendsAssociatedWithIpConfiguration(this.primaryInternalLoadBalancer,
                primaryNicDefaultIpConfiguration());
        }
        return new HashMap<>();
    }

    @Override
    public Map<String, LoadBalancerInboundNatPool> listPrimaryInternalLoadBalancerInboundNatPools() throws IOException {
        if (this.getPrimaryInternalLoadBalancer() != null) {
            return getInboundNatPoolsAssociatedWithIpConfiguration(this.primaryInternalLoadBalancer,
                primaryNicDefaultIpConfiguration());
        }
        return new HashMap<>();
    }

    @Override
    public List<String> primaryPublicIpAddressIds() throws IOException {
        LoadBalancer loadBalancer = this.getPrimaryInternetFacingLoadBalancer();
        if (loadBalancer != null) {
            return loadBalancer.publicIpAddressIds();
        }
        return new ArrayList<>();
    }

    @Override
    public List<String> vhdContainers() {
        if (this.storageProfile() != null
            && this.storageProfile().osDisk() != null
            && this.storageProfile().osDisk().vhdContainers() != null) {
            return this.storageProfile().osDisk().vhdContainers();
        }
        return new ArrayList<>();
    }

    @Override
    public VirtualMachineScaleSetStorageProfile storageProfile() {
        if (this.innerModel().virtualMachineProfile() != null) {
            return this.innerModel().virtualMachineProfile().storageProfile();
        } else {
            return null;
        }
    }

    @Override
    public VirtualMachineScaleSetNetworkProfile networkProfile() {
        if (this.innerModel().virtualMachineProfile() != null) {
            return this.innerModel().virtualMachineProfile().networkProfile();
        } else {
            return null;
        }
    }

    @Override
    public Map<String, VirtualMachineScaleSetExtension> extensions() {
        return Collections.unmodifiableMap(this.extensions);
    }

    @Override
    public VirtualMachinePriorityTypes virtualMachinePriority() {
        if (this.innerModel().virtualMachineProfile() != null) {
            return this.innerModel().virtualMachineProfile().priority();
        } else {
            return null;
        }
    }

    @Override
    public BillingProfile billingProfile() {
        if (this.innerModel().virtualMachineProfile() != null) {
            return this.innerModel().virtualMachineProfile().billingProfile();
        } else {
            return null;
        }
    }

    @Override
    public VirtualMachineScaleSetPublicIpAddressConfiguration virtualMachinePublicIpConfig() {
        VirtualMachineScaleSetIpConfiguration nicConfig = this.primaryNicDefaultIpConfiguration();
        if (nicConfig == null) {
            return null;
        }
        return nicConfig.publicIpAddressConfiguration();
    }

    @Override
    public VirtualMachineEvictionPolicyTypes virtualMachineEvictionPolicy() {
        if (this.innerModel() != null && this.innerModel().virtualMachineProfile() != null) {
            return this.innerModel().virtualMachineProfile().evictionPolicy();
        } else {
            return null;
        }
    }

    @Override
    public boolean isIpForwardingEnabled() {
        VirtualMachineScaleSetNetworkConfiguration nicConfig = primaryNicConfiguration();
        if (nicConfig == null || nicConfig.enableIpForwarding() == null) {
            return false;
        }
        return nicConfig.enableIpForwarding();
    }

    @Override
    public boolean isAcceleratedNetworkingEnabled() {
        VirtualMachineScaleSetNetworkConfiguration nicConfig = primaryNicConfiguration();
        if (nicConfig == null || nicConfig.enableAcceleratedNetworking() == null) {
            return false;
        }
        return nicConfig.enableAcceleratedNetworking();
    }

    @Override
    public String networkSecurityGroupId() {
        VirtualMachineScaleSetNetworkConfiguration nicConfig = primaryNicConfiguration();
        if (nicConfig != null && nicConfig.networkSecurityGroup() != null) {
            return nicConfig.networkSecurityGroup().id();
        } else {
            return null;
        }
    }

    @Override
    public boolean isSinglePlacementGroupEnabled() {
        if (this.innerModel().singlePlacementGroup() != null) {
            return this.innerModel().singlePlacementGroup();
        } else {
            return false;
        }
    }

    @Override
    public List<String> applicationGatewayBackendAddressPoolsIds() {
        VirtualMachineScaleSetIpConfiguration nicIpConfig = this.primaryNicDefaultIpConfiguration();
        if (nicIpConfig == null) {
            return Collections.emptyList();
        }
        List<SubResource> backendPools = nicIpConfig.applicationGatewayBackendAddressPools();
        List<String> result = new ArrayList<>();
        if (backendPools != null) {
            for (SubResource backendPool : backendPools) {
                result.add(backendPool.id());
            }
        }
        return result;
    }

    @Override
    public List<String> applicationSecurityGroupIds() {
        VirtualMachineScaleSetIpConfiguration nicIpConfig = this.primaryNicDefaultIpConfiguration();
        if (nicIpConfig == null) {
            return Collections.emptyList();
        }
        List<String> asgIds = new ArrayList<>();
        if (nicIpConfig.applicationSecurityGroups() != null) {
            for (SubResource asg : nicIpConfig.applicationSecurityGroups()) {
                asgIds.add(asg.id());
            }
        }
        return asgIds;
    }

    @Override
    public Boolean doNotRunExtensionsOnOverprovisionedVMs() {
        return this.innerModel().doNotRunExtensionsOnOverprovisionedVMs();
    }

    @Override
    public ProximityPlacementGroup proximityPlacementGroup() {
        if (innerModel().proximityPlacementGroup() == null) {
            return null;
        } else {
            ResourceId id = ResourceId.fromString(innerModel().proximityPlacementGroup().id());
            ProximityPlacementGroupInner plgInner = manager().serviceClient()
                .getProximityPlacementGroups()
                .getByResourceGroup(id.resourceGroupName(), id.name());
            if (plgInner == null) {
                return null;
            } else {
                return new ProximityPlacementGroupImpl(plgInner);
            }
        }
    }

    @Override
    public AdditionalCapabilities additionalCapabilities() {
        return this.innerModel().additionalCapabilities();
    }

    @Override
    public Plan plan() {
        return this.innerModel().plan();
    }

    @Override
    public OrchestrationMode orchestrationMode() {
        return this.innerModel().orchestrationMode() == null
            ? OrchestrationMode.UNIFORM
            : this.innerModel().orchestrationMode();
    }

    @Override
    public VirtualMachineScaleSetNetworkInterface getNetworkInterfaceByInstanceId(String instanceId, String name) {
        return this.networkManager.networkInterfaces()
            .getByVirtualMachineScaleSetInstanceId(this.resourceGroupName(), this.name(), instanceId, name);
    }

    @Override
    public Mono<VirtualMachineScaleSetNetworkInterface> getNetworkInterfaceByInstanceIdAsync(String instanceId,
        String name) {
        return this.networkManager.networkInterfaces()
            .getByVirtualMachineScaleSetInstanceIdAsync(this.resourceGroupName(), this.name(), instanceId, name);
    }

    @Override
    public PagedIterable<VirtualMachineScaleSetNetworkInterface> listNetworkInterfaces() {
        return this.networkManager.networkInterfaces()
            .listByVirtualMachineScaleSet(this.resourceGroupName(), this.name());
    }

    @Override
    public PagedIterable<VirtualMachineScaleSetNetworkInterface>
        listNetworkInterfacesByInstanceId(String virtualMachineInstanceId) {
        return this.networkManager.networkInterfaces()
            .listByVirtualMachineScaleSetInstanceId(this.resourceGroupName(), this.name(), virtualMachineInstanceId);
    }

    @Override
    public PagedFlux<VirtualMachineScaleSetNetworkInterface>
        listNetworkInterfacesByInstanceIdAsync(String virtualMachineInstanceId) {
        return this.networkManager.networkInterfaces()
            .listByVirtualMachineScaleSetInstanceIdAsync(this.resourceGroupName(), this.name(),
                virtualMachineInstanceId);
    }

    // Fluent setters

    @Override
    public VirtualMachineScaleSetImpl withSku(VirtualMachineScaleSetSkuTypes skuType) {
        this.innerModel().withSku(skuType.sku());
        initVMProfileIfNecessary();
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withFlexibleOrchestrationMode() {
        return withFlexibleOrchestrationMode(1);
    }

    @Override
    public VirtualMachineScaleSetImpl withFlexibleOrchestrationMode(int faultDomainCount) {
        this.innerModel().withOrchestrationMode(OrchestrationMode.FLEXIBLE);
        this.innerModel().withPlatformFaultDomainCount(faultDomainCount);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withSku(VirtualMachineScaleSetSku sku) {
        return this.withSku(sku.skuType());
    }

    @Override
    public VirtualMachineScaleSetImpl withExistingPrimaryNetworkSubnet(Network network, String subnetName) {
        initVMProfileIfNecessary();
        this.existingPrimaryNetworkSubnetNameToAssociate = mergePath(network.id(), "subnets", subnetName);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withExistingPrimaryInternetFacingLoadBalancer(LoadBalancer loadBalancer) {
        if (loadBalancer.publicIpAddressIds().isEmpty()) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("Parameter loadBalancer must be an Internet facing load balancer"));
        }
        initVMProfileIfNecessary();
        if (isInCreateMode()) {
            this.primaryInternetFacingLoadBalancer = loadBalancer;
            associateLoadBalancerToIpConfiguration(this.primaryInternetFacingLoadBalancer,
                this.primaryNicDefaultIpConfiguration());
        } else {
            this.primaryInternetFacingLoadBalancerToAttachOnUpdate = loadBalancer;
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withPrimaryInternetFacingLoadBalancerBackends(String... backendNames) {
        initVMProfileIfNecessary();
        if (this.isInCreateMode()) {
            VirtualMachineScaleSetIpConfiguration defaultPrimaryIpConfig = this.primaryNicDefaultIpConfiguration();
            removeAllBackendAssociationFromIpConfiguration(this.primaryInternetFacingLoadBalancer,
                defaultPrimaryIpConfig);
            associateBackEndsToIpConfiguration(this.primaryInternetFacingLoadBalancer.id(), defaultPrimaryIpConfig,
                backendNames);
        } else {
            addToList(this.primaryInternetFacingLBBackendsToAddOnUpdate, backendNames);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withPrimaryInternetFacingLoadBalancerInboundNatPools(String... natPoolNames) {
        initVMProfileIfNecessary();
        if (this.isInCreateMode()) {
            VirtualMachineScaleSetIpConfiguration defaultPrimaryIpConfig = this.primaryNicDefaultIpConfiguration();
            removeAllInboundNatPoolAssociationFromIpConfiguration(this.primaryInternetFacingLoadBalancer,
                defaultPrimaryIpConfig);
            associateInboundNATPoolsToIpConfiguration(this.primaryInternetFacingLoadBalancer.id(),
                defaultPrimaryIpConfig, natPoolNames);
        } else {
            addToList(this.primaryInternetFacingLBInboundNatPoolsToAddOnUpdate, natPoolNames);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withExistingPrimaryInternalLoadBalancer(LoadBalancer loadBalancer) {
        if (!loadBalancer.publicIpAddressIds().isEmpty()) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("Parameter loadBalancer must be an internal load balancer"));
        }
        String lbNetworkId = null;
        for (LoadBalancerPrivateFrontend frontEnd : loadBalancer.privateFrontends().values()) {
            if (frontEnd.networkId() != null) {
                lbNetworkId = frontEnd.networkId();
            }
        }
        initVMProfileIfNecessary();
        if (isInCreateMode()) {
            String vmNICNetworkId
                = ResourceUtils.parentResourceIdFromResourceId(this.existingPrimaryNetworkSubnetNameToAssociate);
            // Azure has a really wired BUG that - it throws exception when vnet of VMSS and LB are not same
            // (code: NetworkInterfaceAndInternalLoadBalancerMustUseSameVnet) but at the same time Azure update
            // the VMSS's network section to refer this invalid internal LB. This makes VMSS un-usable and portal
            // will show a error above VMSS profile page.
            //
            if (!vmNICNetworkId.equalsIgnoreCase(lbNetworkId)) {
                throw logger.logExceptionAsError(
                    new IllegalArgumentException("Virtual network associated with scale set virtual machines"
                        + " and internal load balancer must be same. " + "'" + vmNICNetworkId + "'" + "'"
                        + lbNetworkId));
            }

            this.primaryInternalLoadBalancer = loadBalancer;
            associateLoadBalancerToIpConfiguration(this.primaryInternalLoadBalancer,
                this.primaryNicDefaultIpConfiguration());
        } else {
            String vmNicVnetId
                = ResourceUtils.parentResourceIdFromResourceId(primaryNicDefaultIpConfiguration().subnet().id());
            if (!vmNicVnetId.equalsIgnoreCase(lbNetworkId)) {
                throw logger.logExceptionAsError(
                    new IllegalArgumentException("Virtual network associated with scale set virtual machines"
                        + " and internal load balancer must be same. " + "'" + vmNicVnetId + "'" + "'" + lbNetworkId));
            }
            this.primaryInternalLoadBalancerToAttachOnUpdate = loadBalancer;
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withPrimaryInternalLoadBalancerBackends(String... backendNames) {
        initVMProfileIfNecessary();
        if (this.isInCreateMode()) {
            VirtualMachineScaleSetIpConfiguration defaultPrimaryIpConfig = primaryNicDefaultIpConfiguration();
            removeAllBackendAssociationFromIpConfiguration(this.primaryInternalLoadBalancer, defaultPrimaryIpConfig);
            associateBackEndsToIpConfiguration(this.primaryInternalLoadBalancer.id(), defaultPrimaryIpConfig,
                backendNames);
        } else {
            addToList(this.primaryInternalLBBackendsToAddOnUpdate, backendNames);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withPrimaryInternalLoadBalancerInboundNatPools(String... natPoolNames) {
        initVMProfileIfNecessary();
        if (this.isInCreateMode()) {
            VirtualMachineScaleSetIpConfiguration defaultPrimaryIpConfig = this.primaryNicDefaultIpConfiguration();
            removeAllInboundNatPoolAssociationFromIpConfiguration(this.primaryInternalLoadBalancer,
                defaultPrimaryIpConfig);
            associateInboundNATPoolsToIpConfiguration(this.primaryInternalLoadBalancer.id(), defaultPrimaryIpConfig,
                natPoolNames);
        } else {
            addToList(this.primaryInternalLBInboundNatPoolsToAddOnUpdate, natPoolNames);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutPrimaryInternalLoadBalancer() {
        if (this.isInUpdateMode()) {
            this.removePrimaryInternalLoadBalancerOnUpdate = true;
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutPrimaryInternetFacingLoadBalancer() {
        if (this.isInUpdateMode()) {
            this.removePrimaryInternetFacingLoadBalancerOnUpdate = true;
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutPrimaryInternetFacingLoadBalancerBackends(String... backendNames) {
        addToList(this.primaryInternetFacingLBBackendsToRemoveOnUpdate, backendNames);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutPrimaryInternalLoadBalancerBackends(String... backendNames) {
        addToList(this.primaryInternalLBBackendsToRemoveOnUpdate, backendNames);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutPrimaryInternetFacingLoadBalancerNatPools(String... natPoolNames) {
        addToList(this.primaryInternetFacingLBInboundNatPoolsToRemoveOnUpdate, natPoolNames);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutPrimaryInternalLoadBalancerNatPools(String... natPoolNames) {
        addToList(this.primaryInternalLBInboundNatPoolsToRemoveOnUpdate, natPoolNames);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withPopularWindowsImage(KnownWindowsVirtualMachineImage knownImage) {
        return withSpecificWindowsImageVersion(knownImage.imageReference());
    }

    @Override
    public VirtualMachineScaleSetImpl withLatestWindowsImage(String publisher, String offer, String sku) {
        ImageReference imageReference
            = new ImageReference().withPublisher(publisher).withOffer(offer).withSku(sku).withVersion("latest");
        return withSpecificWindowsImageVersion(imageReference);
    }

    @Override
    public VirtualMachineScaleSetImpl withSpecificWindowsImageVersion(ImageReference imageReference) {
        initVMProfileIfNecessary();
        this.innerModel()
            .virtualMachineProfile()
            .storageProfile()
            .osDisk()
            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE);
        this.innerModel().virtualMachineProfile().storageProfile().withImageReference(imageReference);
        this.innerModel().virtualMachineProfile().osProfile().withWindowsConfiguration(new WindowsConfiguration());
        // sets defaults for "Stored(Custom)Image" or "VM(Platform)Image"
        this.innerModel().virtualMachineProfile().osProfile().windowsConfiguration().withProvisionVMAgent(true);
        this.innerModel().virtualMachineProfile().osProfile().windowsConfiguration().withEnableAutomaticUpdates(true);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withGeneralizedWindowsCustomImage(String customImageId) {
        initVMProfileIfNecessary();
        ImageReference imageReferenceInner = new ImageReference();
        imageReferenceInner.withId(customImageId);
        this.innerModel()
            .virtualMachineProfile()
            .storageProfile()
            .osDisk()
            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE);
        this.innerModel().virtualMachineProfile().storageProfile().withImageReference(imageReferenceInner);
        this.innerModel().virtualMachineProfile().osProfile().withWindowsConfiguration(new WindowsConfiguration());
        // sets defaults for "Stored(Custom)Image" or "VM(Platform)Image"
        this.innerModel().virtualMachineProfile().osProfile().windowsConfiguration().withProvisionVMAgent(true);
        this.innerModel().virtualMachineProfile().osProfile().windowsConfiguration().withEnableAutomaticUpdates(true);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withSpecializedWindowsCustomImage(String customImageId) {
        this.withGeneralizedWindowsCustomImage(customImageId);
        this.removeOsProfile = true;
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withStoredWindowsImage(String imageUrl) {
        initVMProfileIfNecessary();
        VirtualHardDisk userImageVhd = new VirtualHardDisk();
        userImageVhd.withUri(imageUrl);
        this.innerModel()
            .virtualMachineProfile()
            .storageProfile()
            .osDisk()
            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE);
        this.innerModel().virtualMachineProfile().storageProfile().osDisk().withImage(userImageVhd);
        // For platform image osType will be null, azure will pick it from the image metadata.
        this.innerModel().virtualMachineProfile().storageProfile().osDisk().withOsType(OperatingSystemTypes.WINDOWS);
        this.innerModel().virtualMachineProfile().osProfile().withWindowsConfiguration(new WindowsConfiguration());
        // sets defaults for "Stored(Custom)Image" or "VM(Platform)Image"
        this.innerModel().virtualMachineProfile().osProfile().windowsConfiguration().withProvisionVMAgent(true);
        this.innerModel().virtualMachineProfile().osProfile().windowsConfiguration().withEnableAutomaticUpdates(true);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withPopularLinuxImage(KnownLinuxVirtualMachineImage knownImage) {
        return withSpecificLinuxImageVersion(knownImage.imageReference());
    }

    @Override
    public VirtualMachineScaleSetImpl withLatestLinuxImage(String publisher, String offer, String sku) {
        ImageReference imageReference
            = new ImageReference().withPublisher(publisher).withOffer(offer).withSku(sku).withVersion("latest");
        return withSpecificLinuxImageVersion(imageReference);
    }

    @Override
    public VirtualMachineScaleSetImpl withSpecificLinuxImageVersion(ImageReference imageReference) {
        initVMProfileIfNecessary();
        this.innerModel()
            .virtualMachineProfile()
            .storageProfile()
            .osDisk()
            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE);
        this.innerModel().virtualMachineProfile().storageProfile().withImageReference(imageReference);
        this.innerModel().virtualMachineProfile().osProfile().withLinuxConfiguration(new LinuxConfiguration());
        this.isMarketplaceLinuxImage = true;
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withGeneralizedLinuxCustomImage(String customImageId) {
        initVMProfileIfNecessary();
        ImageReference imageReferenceInner = new ImageReference();
        imageReferenceInner.withId(customImageId);
        this.innerModel()
            .virtualMachineProfile()
            .storageProfile()
            .osDisk()
            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE);
        this.innerModel().virtualMachineProfile().storageProfile().withImageReference(imageReferenceInner);
        this.innerModel().virtualMachineProfile().osProfile().withLinuxConfiguration(new LinuxConfiguration());
        this.isMarketplaceLinuxImage = true;
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withSpecializedLinuxCustomImage(String customImageId) {
        this.withGeneralizedLinuxCustomImage(customImageId);
        this.removeOsProfile = true;
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withStoredLinuxImage(String imageUrl) {
        initVMProfileIfNecessary();
        VirtualHardDisk userImageVhd = new VirtualHardDisk();
        userImageVhd.withUri(imageUrl);
        this.innerModel()
            .virtualMachineProfile()
            .storageProfile()
            .osDisk()
            .withCreateOption(DiskCreateOptionTypes.FROM_IMAGE);
        this.innerModel().virtualMachineProfile().storageProfile().osDisk().withImage(userImageVhd);
        // For platform image osType will be null, azure will pick it from the image metadata.
        this.innerModel().virtualMachineProfile().storageProfile().osDisk().withOsType(OperatingSystemTypes.LINUX);
        this.innerModel().virtualMachineProfile().osProfile().withLinuxConfiguration(new LinuxConfiguration());
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withAdminUsername(String adminUserName) {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().osProfile().withAdminUsername(adminUserName);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withRootUsername(String adminUserName) {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().osProfile().withAdminUsername(adminUserName);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withAdminPassword(String password) {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().osProfile().withAdminPassword(password);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withRootPassword(String password) {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().osProfile().withAdminPassword(password);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withSsh(String publicKeyData) {
        initVMProfileIfNecessary();
        VirtualMachineScaleSetOSProfile osProfile = this.innerModel().virtualMachineProfile().osProfile();
        if (osProfile.linuxConfiguration().ssh() == null) {
            SshConfiguration sshConfiguration = new SshConfiguration();
            sshConfiguration.withPublicKeys(new ArrayList<SshPublicKey>());
            osProfile.linuxConfiguration().withSsh(sshConfiguration);
        }
        SshPublicKey sshPublicKey = new SshPublicKey();
        sshPublicKey.withKeyData(publicKeyData);
        sshPublicKey.withPath("/home/" + osProfile.adminUsername() + "/.ssh/authorized_keys");
        osProfile.linuxConfiguration().ssh().publicKeys().add(sshPublicKey);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withVMAgent() {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().osProfile().windowsConfiguration().withProvisionVMAgent(true);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutVMAgent() {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().osProfile().windowsConfiguration().withProvisionVMAgent(false);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withAutoUpdate() {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().osProfile().windowsConfiguration().withEnableAutomaticUpdates(true);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutAutoUpdate() {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().osProfile().windowsConfiguration().withEnableAutomaticUpdates(false);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withTimeZone(String timeZone) {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().osProfile().windowsConfiguration().withTimeZone(timeZone);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withWinRM(WinRMListener listener) {
        initVMProfileIfNecessary();
        if (this.innerModel().virtualMachineProfile().osProfile().windowsConfiguration().winRM() == null) {
            WinRMConfiguration winRMConfiguration = new WinRMConfiguration();
            this.innerModel().virtualMachineProfile().osProfile().windowsConfiguration().withWinRM(winRMConfiguration);
        }
        this.innerModel().virtualMachineProfile().osProfile().windowsConfiguration().winRM().listeners().add(listener);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withOSDiskCaching(CachingTypes cachingType) {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().storageProfile().osDisk().withCaching(cachingType);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withOSDiskName(String name) {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().storageProfile().osDisk().withName(name);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withEphemeralOSDisk() {
        if (isVMProfileNotSet()) {
            return this;
        }
        initVMProfileIfNecessary();
        VirtualMachineScaleSetOSDisk disk = this.innerModel().virtualMachineProfile().storageProfile().osDisk();
        disk.withCaching(CachingTypes.READ_ONLY);
        disk.withDiffDiskSettings(new DiffDiskSettings());
        disk.diffDiskSettings().withOption(DiffDiskOptions.LOCAL);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withComputerNamePrefix(String namePrefix) {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().osProfile().withComputerNamePrefix(namePrefix);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withUpgradeMode(UpgradeMode upgradeMode) {
        if (this.innerModel().upgradePolicy() == null) {
            this.innerModel().withUpgradePolicy(new UpgradePolicy());
        }
        this.innerModel().upgradePolicy().withMode(upgradeMode);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withOverProvision(boolean enabled) {
        this.innerModel().withOverprovision(enabled);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withOverProvisioning() {
        return this.withOverProvision(true);
    }

    @Override
    public VirtualMachineScaleSetImpl withoutOverProvisioning() {
        return this.withOverProvision(false);
    }

    @Override
    public VirtualMachineScaleSetImpl withCapacity(long capacity) {
        this.innerModel().sku().withCapacity(capacity);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withNewStorageAccount(String name) {
        StorageAccount.DefinitionStages.WithGroup definitionWithGroup
            = this.storageManager.storageAccounts().define(name).withRegion(this.regionName());
        Creatable<StorageAccount> definitionAfterGroup;
        if (this.creatableGroup != null) {
            definitionAfterGroup = definitionWithGroup.withNewResourceGroup(this.creatableGroup);
        } else {
            definitionAfterGroup = definitionWithGroup.withExistingResourceGroup(this.resourceGroupName());
        }
        return withNewStorageAccount(definitionAfterGroup);
    }

    @Override
    public VirtualMachineScaleSetImpl withNewStorageAccount(Creatable<StorageAccount> creatable) {
        this.creatableStorageAccountKeys.add(this.addDependency(creatable));
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withExistingStorageAccount(StorageAccount storageAccount) {
        this.existingStorageAccountsToAssociate.add(storageAccount);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withCustomData(String base64EncodedCustomData) {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().osProfile().withCustomData(base64EncodedCustomData);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withSecrets(List<VaultSecretGroup> secrets) {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().osProfile().withSecrets(secrets);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutSecrets() {
        initVMProfileIfNecessary();
        this.innerModel().virtualMachineProfile().osProfile().withSecrets(new ArrayList<VaultSecretGroup>());
        return this;
    }

    @Override
    public VirtualMachineScaleSetExtensionImpl defineNewExtension(String name) {
        return new VirtualMachineScaleSetExtensionImpl(new VirtualMachineScaleSetExtensionInner().withName(name), this);
    }

    protected VirtualMachineScaleSetImpl withExtension(VirtualMachineScaleSetExtensionImpl extension) {
        this.extensions.put(extension.name(), extension);
        return this;
    }

    @Override
    public VirtualMachineScaleSetExtensionImpl updateExtension(String name) {
        return (VirtualMachineScaleSetExtensionImpl) this.extensions.get(name);
    }

    @Override
    public VirtualMachineScaleSetImpl withoutExtension(String name) {
        if (this.extensions.containsKey(name)) {
            this.extensions.remove(name);
        }
        return this;
    }

    @Override
    public boolean isManagedDiskEnabled() {
        if (this.innerModel() == null || this.innerModel().virtualMachineProfile() == null) {
            return false;
        }
        VirtualMachineScaleSetStorageProfile storageProfile
            = this.innerModel().virtualMachineProfile().storageProfile();
        if (isOsDiskFromCustomImage(storageProfile)) {
            return true;
        }
        if (isOSDiskFromStoredImage(storageProfile)) {
            return false;
        }
        if (isOSDiskFromPlatformImage(storageProfile)) {
            if (this.isUnmanagedDiskSelected) {
                return false;
            }
        }
        if (isInCreateMode()) {
            return true;
        } else {
            List<String> vhdContainers = storageProfile.osDisk().vhdContainers();
            return vhdContainers == null || vhdContainers.size() == 0;
        }
    }

    @Override
    public boolean isManagedServiceIdentityEnabled() {
        ResourceIdentityType type = this.managedServiceIdentityType();
        return type != null && !type.equals(ResourceIdentityType.NONE);
    }

    @Override
    public String systemAssignedManagedServiceIdentityTenantId() {
        if (this.innerModel().identity() != null) {
            return this.innerModel().identity().tenantId();
        }
        return null;
    }

    @Override
    public String systemAssignedManagedServiceIdentityPrincipalId() {
        if (this.innerModel().identity() != null) {
            return this.innerModel().identity().principalId();
        }
        return null;
    }

    @Override
    public ResourceIdentityType managedServiceIdentityType() {
        if (this.innerModel().identity() != null) {
            return this.innerModel().identity().type();
        }
        return null;
    }

    @Override
    public Set<String> userAssignedManagedServiceIdentityIds() {
        if (this.innerModel().identity() != null && this.innerModel().identity().userAssignedIdentities() != null) {
            return Collections
                .unmodifiableSet(new HashSet<String>(this.innerModel().identity().userAssignedIdentities().keySet()));
        }
        return Collections.unmodifiableSet(new HashSet<String>());
    }

    @Override
    public Set<AvailabilityZoneId> availabilityZones() {
        Set<AvailabilityZoneId> zones = new HashSet<>();
        if (this.innerModel().zones() != null) {
            for (String zone : this.innerModel().zones()) {
                zones.add(AvailabilityZoneId.fromString(zone));
            }
        }
        return Collections.unmodifiableSet(zones);
    }

    @Override
    public boolean isBootDiagnosticsEnabled() {
        return this.bootDiagnosticsHandler.isBootDiagnosticsEnabled();
    }

    @Override
    public String bootDiagnosticsStorageUri() {
        return this.bootDiagnosticsHandler.bootDiagnosticsStorageUri();
    }

    @Override
    public StorageAccountTypes managedOSDiskStorageAccountType() {
        if (this.innerModel().virtualMachineProfile() != null
            && this.innerModel().virtualMachineProfile().storageProfile() != null
            && this.innerModel().virtualMachineProfile().storageProfile().osDisk() != null
            && this.innerModel().virtualMachineProfile().storageProfile().osDisk().managedDisk() != null) {
            return this.innerModel()
                .virtualMachineProfile()
                .storageProfile()
                .osDisk()
                .managedDisk()
                .storageAccountType();
        }
        return null;
    }

    @Override
    public VirtualMachineScaleSetImpl withUnmanagedDisks() {
        this.isUnmanagedDiskSelected = true;
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withNewDataDisk(int sizeInGB) {
        throwIfManagedDiskDisabled(ManagedUnmanagedDiskErrors.VMSS_BOTH_UNMANAGED_AND_MANAGED_DISK_NOT_ALLOWED);
        this.managedDataDisks.implicitDisksToAssociate
            .add(new VirtualMachineScaleSetDataDisk().withLun(-1).withDiskSizeGB(sizeInGB));
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withNewDataDisk(int sizeInGB, int lun, CachingTypes cachingType) {
        throwIfManagedDiskDisabled(ManagedUnmanagedDiskErrors.VMSS_BOTH_UNMANAGED_AND_MANAGED_DISK_NOT_ALLOWED);
        this.managedDataDisks.implicitDisksToAssociate
            .add(new VirtualMachineScaleSetDataDisk().withLun(lun).withDiskSizeGB(sizeInGB).withCaching(cachingType));
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withNewDataDisk(int sizeInGB, int lun, CachingTypes cachingType,
        StorageAccountTypes storageAccountType) {
        throwIfManagedDiskDisabled(ManagedUnmanagedDiskErrors.VMSS_BOTH_UNMANAGED_AND_MANAGED_DISK_NOT_ALLOWED);
        VirtualMachineScaleSetManagedDiskParameters managedDiskParameters
            = new VirtualMachineScaleSetManagedDiskParameters();
        managedDiskParameters.withStorageAccountType(storageAccountType);
        this.managedDataDisks.implicitDisksToAssociate.add(new VirtualMachineScaleSetDataDisk().withLun(lun)
            .withDiskSizeGB(sizeInGB)
            .withCaching(cachingType)
            .withManagedDisk(managedDiskParameters));
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutDataDisk(int lun) {
        if (!isManagedDiskEnabled()) {
            return this;
        }
        this.managedDataDisks.diskLunsToRemove.add(lun);
        return this;
    }

    /* TODO: Broken by change in Azure API behavior
    @Override
    public VirtualMachineScaleSetImpl withDataDiskUpdated(int lun, int newSizeInGB) {
        throwIfManagedDiskDisabled(ManagedUnmanagedDiskErrors.VMSS_NO_MANAGED_DISK_TO_UPDATE);
        VirtualMachineScaleSetDataDisk dataDisk = getDataDiskInner(lun);
        if (dataDisk == null) {
            throw new RuntimeException(String.format("A data disk with lun '%d' not found", lun));
        }
        dataDisk
            .withDiskSizeGB(newSizeInGB);
        return this;
    }
    
    @Override
    public VirtualMachineScaleSetImpl withDataDiskUpdated(int lun, int newSizeInGB, CachingTypes cachingType) {
        throwIfManagedDiskDisabled(ManagedUnmanagedDiskErrors.VMSS_NO_MANAGED_DISK_TO_UPDATE);
        VirtualMachineScaleSetDataDisk dataDisk = getDataDiskInner(lun);
        if (dataDisk == null) {
            throw new RuntimeException(String.format("A data disk with lun '%d' not found", lun));
        }
        dataDisk
            .withDiskSizeGB(newSizeInGB)
            .withCaching(cachingType);
        return this;
    }
    
    @Override
    public VirtualMachineScaleSetImpl withDataDiskUpdated(int lun,
        int newSizeInGB,
        CachingTypes cachingType,
        StorageAccountTypes storageAccountType) {
            throwIfManagedDiskDisabled(ManagedUnmanagedDiskErrors.VMSS_NO_MANAGED_DISK_TO_UPDATE);
            VirtualMachineScaleSetDataDisk dataDisk = getDataDiskInner(lun);
            if (dataDisk == null) {
                throw new RuntimeException(String.format("A data disk with lun '%d' not found", lun));
            }
            dataDisk
                .withDiskSizeGB(newSizeInGB)
                .withCaching(cachingType)
                .managedDisk()
                .withStorageAccountType(storageAccountType);
            return this;
    }
    
    private VirtualMachineScaleSetDataDisk getDataDiskInner(int lun) {
        VirtualMachineScaleSetStorageProfile storageProfile = this
                .inner()
                .virtualMachineProfile()
                .storageProfile();
        List<VirtualMachineScaleSetDataDisk> dataDisks = storageProfile
                .dataDisks();
        if (dataDisks == null) {
            return null;
        }
        for (VirtualMachineScaleSetDataDisk dataDisk : dataDisks) {
            if (dataDisk.lun() == lun) {
                return dataDisk;
            }
        }
        return null;
    }
    */

    @Override
    public VirtualMachineScaleSetImpl withNewDataDiskFromImage(int imageLun) {
        this.managedDataDisks.newDisksFromImage.add(new VirtualMachineScaleSetDataDisk().withLun(imageLun));
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withNewDataDiskFromImage(int imageLun, int newSizeInGB,
        CachingTypes cachingType) {
        this.managedDataDisks.newDisksFromImage.add(new VirtualMachineScaleSetDataDisk().withLun(imageLun)
            .withDiskSizeGB(newSizeInGB)
            .withCaching(cachingType));
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withNewDataDiskFromImage(int imageLun, int newSizeInGB, CachingTypes cachingType,
        StorageAccountTypes storageAccountType) {
        VirtualMachineScaleSetManagedDiskParameters managedDiskParameters
            = new VirtualMachineScaleSetManagedDiskParameters();
        managedDiskParameters.withStorageAccountType(storageAccountType);
        this.managedDataDisks.newDisksFromImage.add(new VirtualMachineScaleSetDataDisk().withLun(imageLun)
            .withDiskSizeGB(newSizeInGB)
            .withManagedDisk(managedDiskParameters)
            .withCaching(cachingType));
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withOSDiskStorageAccountType(StorageAccountTypes accountType) {
        initVMProfileIfNecessary();
        // withers is limited to VMSS based on ManagedDisk.
        this.innerModel()
            .virtualMachineProfile()
            .storageProfile()
            .osDisk()
            .withManagedDisk(new VirtualMachineScaleSetManagedDiskParameters().withStorageAccountType(accountType));
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withDataDiskDefaultCachingType(CachingTypes cachingType) {
        this.managedDataDisks.setDefaultCachingType(cachingType);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withDataDiskDefaultStorageAccountType(StorageAccountTypes storageAccountType) {
        this.managedDataDisks.setDefaultStorageAccountType(storageAccountType);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withSystemAssignedManagedServiceIdentity() {
        this.virtualMachineScaleSetMsiHandler.withLocalManagedServiceIdentity();
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutSystemAssignedManagedServiceIdentity() {
        this.virtualMachineScaleSetMsiHandler.withoutLocalManagedServiceIdentity();
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withSystemAssignedIdentityBasedAccessTo(String resourceId, BuiltInRole role) {
        this.virtualMachineScaleSetMsiHandler.withAccessTo(resourceId, role);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withSystemAssignedIdentityBasedAccessToCurrentResourceGroup(BuiltInRole asRole) {
        this.virtualMachineScaleSetMsiHandler.withAccessToCurrentResourceGroup(asRole);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withSystemAssignedIdentityBasedAccessTo(String scope, String roleDefinitionId) {
        this.virtualMachineScaleSetMsiHandler.withAccessTo(scope, roleDefinitionId);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl
        withSystemAssignedIdentityBasedAccessToCurrentResourceGroup(String roleDefinitionId) {
        this.virtualMachineScaleSetMsiHandler.withAccessToCurrentResourceGroup(roleDefinitionId);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withNewUserAssignedManagedServiceIdentity(Creatable<Identity> creatableIdentity) {
        this.virtualMachineScaleSetMsiHandler.withNewExternalManagedServiceIdentity(creatableIdentity);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withExistingUserAssignedManagedServiceIdentity(Identity identity) {
        this.virtualMachineScaleSetMsiHandler.withExistingExternalManagedServiceIdentity(identity);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutUserAssignedManagedServiceIdentity(String identityId) {
        this.virtualMachineScaleSetMsiHandler.withoutExternalManagedServiceIdentity(identityId);
        return this;
    }

    // Create Update specific methods
    //
    @Override
    protected void beforeCreating() {
        setExtensions();
    }

    @Override
    protected Mono<VirtualMachineScaleSetInner> createInner() {
        // support flexible vmss with no profile
        if (this.orchestrationMode() == OrchestrationMode.FLEXIBLE
            // presence of sku indicates that the vm profile is not null, otherwise, vm profile is null.
            && isVMProfileNotSet()) {
            return createInnerNoProfile();
        }
        if (this.shouldSetProfileDefaults()) {
            this.setOSProfileDefaults();
            this.setOSDiskDefault();
        }
        this.setPrimaryIpConfigurationSubnet();
        return this.setPrimaryIpConfigurationBackendsAndInboundNatPoolsAsync().flatMap(virtualMachineScaleSet -> {
            if (isManagedDiskEnabled()) {
                this.managedDataDisks.setDataDisksDefaults();
            } else {
                List<VirtualMachineScaleSetDataDisk> dataDisks
                    = this.innerModel().virtualMachineProfile().storageProfile().dataDisks();
                VirtualMachineScaleSetUnmanagedDataDiskImpl.setDataDisksDefaults(dataDisks, this.name());
            }
            this.handleUnManagedOSDiskContainers();
            this.bootDiagnosticsHandler.handleDiagnosticsSettings();
            this.virtualMachineScaleSetMsiHandler.processCreatedExternalIdentities();
            this.virtualMachineScaleSetMsiHandler.handleExternalIdentities();
            this.adjustProfileForFlexibleMode();
            return this.createNewProximityPlacementGroupAsync()
                .then(this.manager()
                    .serviceClient()
                    .getVirtualMachineScaleSets()
                    .createOrUpdateAsync(resourceGroupName(), name(), innerModel()));
        });
    }

    @Override
    protected void afterCreating() {
        this.clearCachedProperties();
        this.virtualMachineScaleSetMsiHandler.clear();
    }

    @Override
    public Mono<VirtualMachineScaleSet> updateResourceAsync() {
        final VirtualMachineScaleSetImpl self = this;
        // support flexible vmss with no profile
        if (this.orchestrationMode() == OrchestrationMode.FLEXIBLE
            && this.innerModel().virtualMachineProfile() == null) {
            return updateResourceAsyncNoProfile(self);
        }
        setExtensions();
        if (this.shouldSetProfileDefaults()) {
            this.setOSProfileDefaults();
            this.setOSDiskDefault();
        }
        this.setPrimaryIpConfigurationSubnet();
        return this.setPrimaryIpConfigurationBackendsAndInboundNatPoolsAsync().map(virtualMachineScaleSet -> {
            if (isManagedDiskEnabled()) {
                this.managedDataDisks.setDataDisksDefaults();
            } else if (this.innerModel() != null && this.innerModel().virtualMachineProfile() != null) {
                List<VirtualMachineScaleSetDataDisk> dataDisks
                    = this.innerModel().virtualMachineProfile().storageProfile().dataDisks();
                VirtualMachineScaleSetUnmanagedDataDiskImpl.setDataDisksDefaults(dataDisks, this.name());
            }
            this.handleUnManagedOSDiskContainers();
            this.bootDiagnosticsHandler.handleDiagnosticsSettings();
            this.virtualMachineScaleSetMsiHandler.processCreatedExternalIdentities();
            this.adjustProfileForFlexibleMode();
            //
            VirtualMachineScaleSetUpdate updateParameter = VMSSPatchPayload.preparePatchPayload(this);
            //
            this.virtualMachineScaleSetMsiHandler.handleExternalIdentities(updateParameter);
            return updateParameter;
        })
            .flatMap(updateParameter -> this.manager()
                .serviceClient()
                .getVirtualMachineScaleSets()
                .updateAsync(resourceGroupName(), name(), updateParameter)
                .map(vmssInner -> {
                    setInner(vmssInner);
                    self.clearCachedProperties();
                    self.initializeChildrenFromInner();
                    self.virtualMachineScaleSetMsiHandler.clear();
                    return self;
                }));
    }

    @Override
    public Mono<VirtualMachineScaleSet> refreshAsync() {
        return super.refreshAsync().map(scaleSet -> {
            VirtualMachineScaleSetImpl impl = (VirtualMachineScaleSetImpl) scaleSet;
            impl.clearCachedProperties();
            impl.initializeChildrenFromInner();
            return impl;
        });
    }

    @Override
    protected Mono<VirtualMachineScaleSetInner> getInnerAsync() {
        return this.manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    // Helpers
    //

    private boolean isVMProfileNotSet() {
        return this.innerModel().sku() == null;
    }

    private void adjustProfileForFlexibleMode() {
        if (this.orchestrationMode() == OrchestrationMode.FLEXIBLE) {
            if (this.innerModel().virtualMachineProfile().networkProfile().networkInterfaceConfigurations() != null) {
                this.innerModel()
                    .virtualMachineProfile()
                    .networkProfile()
                    .networkInterfaceConfigurations()
                    .forEach(virtualMachineScaleSetNetworkConfiguration -> {
                        if (virtualMachineScaleSetNetworkConfiguration.ipConfigurations() != null) {
                            virtualMachineScaleSetNetworkConfiguration.ipConfigurations()
                                .forEach(virtualMachineScaleSetIpConfiguration -> {
                                    // this property is not allowed to appear when creating vmss in flexible mode, though it's defined in the swagger file
                                    virtualMachineScaleSetIpConfiguration.withLoadBalancerInboundNatPools(null);
                                });
                        }
                    });
            }
            this.innerModel()
                // upgradePolicy is not supported in flexible vmss
                .withUpgradePolicy(null)
                .virtualMachineProfile()
                .networkProfile()
                // NetworkApiVersion must be specified when creating in flexible mode
                .withNetworkApiVersion(NetworkApiVersion.TWO_ZERO_TWO_ZERO_ONE_ONE_ZERO_ONE);
        }
    }

    private Mono<VirtualMachineScaleSetInner> createInnerNoProfile() {
        this.innerModel().withVirtualMachineProfile(null);
        return manager().serviceClient()
            .getVirtualMachineScaleSets()
            .createOrUpdateAsync(resourceGroupName(), name(), innerModel());
    }

    private Mono<VirtualMachineScaleSet> updateResourceAsyncNoProfile(VirtualMachineScaleSetImpl self) {
        return manager().serviceClient()
            .getVirtualMachineScaleSets()
            .updateAsync(resourceGroupName(), name(), VMSSPatchPayload.preparePatchPayload(this))
            .map(vmssInner -> {
                setInner(vmssInner);
                self.clearCachedProperties();
                self.initializeChildrenFromInner();
                self.virtualMachineScaleSetMsiHandler.clear();
                return self;
            });
    }

    private void initVMProfileIfNecessary() {
        if (this.innerModel().virtualMachineProfile() == null) {
            this.innerModel().withVirtualMachineProfile(initDefaultVMProfile());
            this.profileAttached = true;
        }
    }

    private VirtualMachineScaleSetVMProfile initDefaultVMProfile() {
        VirtualMachineScaleSetImpl impl
            = (VirtualMachineScaleSetImpl) this.manager().virtualMachineScaleSets().define(this.name());
        if (this.orchestrationMode() == OrchestrationMode.FLEXIBLE) {
            if (this.innerModel().platformFaultDomainCount() != null) {
                impl.withFlexibleOrchestrationMode(this.innerModel().platformFaultDomainCount());
            } else {
                impl.withFlexibleOrchestrationMode();
            }
        }
        return impl.innerModel().virtualMachineProfile();
    }

    private boolean isInUpdateMode() {
        return !this.isInCreateMode();
    }

    private void setOSProfileDefaults() {
        if (this.innerModel().sku().capacity() == null) {
            this.withCapacity(2);
        }
        if (this.innerModel().upgradePolicy() == null || this.innerModel().upgradePolicy().mode() == null) {
            this.innerModel().withUpgradePolicy(new UpgradePolicy().withMode(UpgradeMode.AUTOMATIC));
        }
        VirtualMachineScaleSetOSProfile osProfile = this.innerModel().virtualMachineProfile().osProfile();
        VirtualMachineScaleSetOSDisk osDisk = this.innerModel().virtualMachineProfile().storageProfile().osDisk();
        if (!removeOsProfile && isOSDiskFromImage(osDisk)) {
            // ODDisk CreateOption: FROM_IMAGE
            //
            if (this.osType() == OperatingSystemTypes.LINUX || this.isMarketplaceLinuxImage) {
                if (osProfile.linuxConfiguration() == null) {
                    osProfile.withLinuxConfiguration(new LinuxConfiguration());
                }
                osProfile.linuxConfiguration().withDisablePasswordAuthentication(osProfile.adminPassword() == null);
            }
            if (this.computerNamePrefix() == null) {
                // VM name cannot contain only numeric values and cannot exceed 15 chars
                if (this.name().matches("[0-9]+")) {
                    withComputerNamePrefix(this.namer.getRandomName("vmss-vm", 12));
                } else if (this.name().length() <= 12) {
                    withComputerNamePrefix(this.name() + "-vm");
                } else {
                    withComputerNamePrefix(this.namer.getRandomName("vmss-vm", 12));
                }
            }
        } else {
            // NOP [ODDisk CreateOption: ATTACH, ATTACH is not supported for VMSS]
            this.innerModel().virtualMachineProfile().withOsProfile(null);
        }
    }

    private void setOSDiskDefault() {
        VirtualMachineScaleSetStorageProfile storageProfile
            = this.innerModel().virtualMachineProfile().storageProfile();
        VirtualMachineScaleSetOSDisk osDisk = storageProfile.osDisk();
        if (isOSDiskFromImage(osDisk)) {
            // ODDisk CreateOption: FROM_IMAGE
            //
            if (isManagedDiskEnabled()) {
                // Note:
                // Managed disk
                //     Supported: PlatformImage and CustomImage
                //     UnSupported: StoredImage
                //
                if (osDisk.managedDisk() == null) {
                    osDisk.withManagedDisk(new VirtualMachineScaleSetManagedDiskParameters());
                }
                if (osDisk.managedDisk().storageAccountType() == null) {
                    osDisk.managedDisk().withStorageAccountType(StorageAccountTypes.STANDARD_LRS);
                }
                osDisk.withVhdContainers(null);
                // We won't set osDisk.name() explicitly for managed disk, if it is null CRP generates unique
                // name for the disk resource within the resource group.
            } else {
                // Note:
                // Native (un-managed) disk
                //     Supported: PlatformImage and StoredImage
                //     UnSupported: CustomImage
                //
                osDisk.withManagedDisk(null);
                if (osDisk.name() == null) {
                    withOSDiskName(this.name() + "-os-disk");
                }
            }
        }
        if (this.osDiskCachingType() == null) {
            withOSDiskCaching(CachingTypes.READ_WRITE);
        }
    }

    /*
     * Profile defaults should be set when:
     * 1. creating vmss
     * 2. attaching a profile to existing flexible vmss
     * @return
     */
    private boolean shouldSetProfileDefaults() {
        return isInCreateMode() || (this.orchestrationMode() == OrchestrationMode.FLEXIBLE && this.profileAttached);
    }

    private void setExtensions() {
        if (this.extensions.size() > 0
            && this.innerModel() != null
            && this.innerModel().virtualMachineProfile() != null) {
            this.innerModel()
                .virtualMachineProfile()
                .withExtensionProfile(new VirtualMachineScaleSetExtensionProfile())
                .extensionProfile()
                .withExtensions(innersFromWrappers(this.extensions.values()));
        }
    }

    @Override
    public void beforeGroupCreateOrUpdate() {
        // Adding delayed storage account dependency if needed
        //
        this.prepareOSDiskContainers();
        this.bootDiagnosticsHandler.prepare();
    }

    protected void prepareOSDiskContainers() {
        if (this.innerModel() == null || this.innerModel().virtualMachineProfile() == null || isManagedDiskEnabled()) {
            return;
        }
        final VirtualMachineScaleSetStorageProfile storageProfile
            = innerModel().virtualMachineProfile().storageProfile();
        if (isOSDiskFromStoredImage(storageProfile)) {
            // There is a restriction currently that virtual machine's disk cannot be stored in multiple storage
            // accounts if scale set is based on stored image. Remove this check once azure start supporting it.
            //
            return;
        }
        if (this.isInCreateMode()
            && this.creatableStorageAccountKeys.isEmpty()
            && this.existingStorageAccountsToAssociate.isEmpty()) {
            String accountName = this.namer.getRandomName("stg", 24).replace("-", "");
            Creatable<StorageAccount> storageAccountCreatable;
            if (this.creatableGroup != null) {
                storageAccountCreatable = this.storageManager.storageAccounts()
                    .define(accountName)
                    .withRegion(this.regionName())
                    .withNewResourceGroup(this.creatableGroup);
            } else {
                storageAccountCreatable = this.storageManager.storageAccounts()
                    .define(accountName)
                    .withRegion(this.regionName())
                    .withExistingResourceGroup(this.resourceGroupName());
            }
            this.creatableStorageAccountKeys.add(this.addDependency(storageAccountCreatable));
        }
    }

    private void handleUnManagedOSDiskContainers() {
        if (this.innerModel() == null || this.innerModel().virtualMachineProfile() == null) {
            return;
        }
        final VirtualMachineScaleSetStorageProfile storageProfile
            = innerModel().virtualMachineProfile().storageProfile();
        if (isManagedDiskEnabled()) {
            storageProfile.osDisk().withVhdContainers(null);
            return;
        }
        if (isOSDiskFromStoredImage(storageProfile)) {
            // There is a restriction currently that virtual machine's disk cannot be stored in multiple storage
            // accounts if scale set is based on stored image. Remove this check once azure start supporting it.
            //
            storageProfile.osDisk().vhdContainers().clear();
            return;
        }

        String containerName = null;
        for (String containerUrl : storageProfile.osDisk().vhdContainers()) {
            containerName = containerUrl.substring(containerUrl.lastIndexOf("/") + 1);
            break;
        }

        if (containerName == null) {
            containerName = "vhds";
        }

        if (isInCreateMode()
            && this.creatableStorageAccountKeys.isEmpty()
            && this.existingStorageAccountsToAssociate.isEmpty()) {
            throw logger.logExceptionAsError(
                new IllegalStateException("Expected storage account(s) for VMSS OS disk containers not found"));
        }

        for (String storageAccountKey : this.creatableStorageAccountKeys) {
            StorageAccount storageAccount = this.<StorageAccount>taskResult(storageAccountKey);
            storageProfile.osDisk()
                .vhdContainers()
                .add(mergePath(storageAccount.endPoints().primary().blob(), containerName));
        }

        for (StorageAccount storageAccount : this.existingStorageAccountsToAssociate) {
            storageProfile.osDisk()
                .vhdContainers()
                .add(mergePath(storageAccount.endPoints().primary().blob(), containerName));
        }
        this.creatableStorageAccountKeys.clear();
        this.existingStorageAccountsToAssociate.clear();
    }

    private void setPrimaryIpConfigurationSubnet() {
        if (isInUpdateMode()) {
            return;
        }
        initVMProfileIfNecessary();
        VirtualMachineScaleSetIpConfiguration ipConfig = this.primaryNicDefaultIpConfiguration();
        ipConfig.withSubnet(new ApiEntityReference().withId(this.existingPrimaryNetworkSubnetNameToAssociate));
        this.existingPrimaryNetworkSubnetNameToAssociate = null;
    }

    private Mono<VirtualMachineScaleSetImpl> setPrimaryIpConfigurationBackendsAndInboundNatPoolsAsync() {
        if (isInCreateMode()) {
            return Mono.just(this);
        }

        try {
            return this.loadCurrentPrimaryLoadBalancersIfAvailableAsync().map(virtualMachineScaleSet -> {
                initVMProfileIfNecessary();
                VirtualMachineScaleSetIpConfiguration primaryIpConfig = primaryNicDefaultIpConfiguration();
                if (this.primaryInternetFacingLoadBalancer != null) {
                    removeBackendsFromIpConfiguration(this.primaryInternetFacingLoadBalancer.id(), primaryIpConfig,
                        this.primaryInternetFacingLBBackendsToRemoveOnUpdate.toArray(new String[0]));

                    associateBackEndsToIpConfiguration(primaryInternetFacingLoadBalancer.id(), primaryIpConfig,
                        this.primaryInternetFacingLBBackendsToAddOnUpdate.toArray(new String[0]));

                    removeInboundNatPoolsFromIpConfiguration(this.primaryInternetFacingLoadBalancer.id(),
                        primaryIpConfig,
                        this.primaryInternetFacingLBInboundNatPoolsToRemoveOnUpdate.toArray(new String[0]));

                    associateInboundNATPoolsToIpConfiguration(primaryInternetFacingLoadBalancer.id(), primaryIpConfig,
                        this.primaryInternetFacingLBInboundNatPoolsToAddOnUpdate.toArray(new String[0]));
                }

                if (this.primaryInternalLoadBalancer != null) {
                    removeBackendsFromIpConfiguration(this.primaryInternalLoadBalancer.id(), primaryIpConfig,
                        this.primaryInternalLBBackendsToRemoveOnUpdate.toArray(new String[0]));

                    associateBackEndsToIpConfiguration(primaryInternalLoadBalancer.id(), primaryIpConfig,
                        this.primaryInternalLBBackendsToAddOnUpdate.toArray(new String[0]));

                    removeInboundNatPoolsFromIpConfiguration(this.primaryInternalLoadBalancer.id(), primaryIpConfig,
                        this.primaryInternalLBInboundNatPoolsToRemoveOnUpdate.toArray(new String[0]));

                    associateInboundNATPoolsToIpConfiguration(primaryInternalLoadBalancer.id(), primaryIpConfig,
                        this.primaryInternalLBInboundNatPoolsToAddOnUpdate.toArray(new String[0]));
                }

                if (this.removePrimaryInternetFacingLoadBalancerOnUpdate) {
                    if (this.primaryInternetFacingLoadBalancer != null) {
                        removeLoadBalancerAssociationFromIpConfiguration(this.primaryInternetFacingLoadBalancer,
                            primaryIpConfig);
                    }
                }

                if (this.removePrimaryInternalLoadBalancerOnUpdate) {
                    if (this.primaryInternalLoadBalancer != null) {
                        removeLoadBalancerAssociationFromIpConfiguration(this.primaryInternalLoadBalancer,
                            primaryIpConfig);
                    }
                }

                if (this.primaryInternetFacingLoadBalancerToAttachOnUpdate != null) {
                    if (this.primaryInternetFacingLoadBalancer != null) {
                        removeLoadBalancerAssociationFromIpConfiguration(this.primaryInternetFacingLoadBalancer,
                            primaryIpConfig);
                    }
                    associateLoadBalancerToIpConfiguration(this.primaryInternetFacingLoadBalancerToAttachOnUpdate,
                        primaryIpConfig);
                    if (!this.primaryInternetFacingLBBackendsToAddOnUpdate.isEmpty()) {
                        removeAllBackendAssociationFromIpConfiguration(
                            this.primaryInternetFacingLoadBalancerToAttachOnUpdate, primaryIpConfig);
                        associateBackEndsToIpConfiguration(this.primaryInternetFacingLoadBalancerToAttachOnUpdate.id(),
                            primaryIpConfig, this.primaryInternetFacingLBBackendsToAddOnUpdate.toArray(new String[0]));
                    }
                    if (!this.primaryInternetFacingLBInboundNatPoolsToAddOnUpdate.isEmpty()) {
                        removeAllInboundNatPoolAssociationFromIpConfiguration(
                            this.primaryInternetFacingLoadBalancerToAttachOnUpdate, primaryIpConfig);
                        associateInboundNATPoolsToIpConfiguration(
                            this.primaryInternetFacingLoadBalancerToAttachOnUpdate.id(), primaryIpConfig,
                            this.primaryInternetFacingLBInboundNatPoolsToAddOnUpdate.toArray(new String[0]));
                    }
                }

                if (this.primaryInternalLoadBalancerToAttachOnUpdate != null) {
                    if (this.primaryInternalLoadBalancer != null) {
                        removeLoadBalancerAssociationFromIpConfiguration(this.primaryInternalLoadBalancer,
                            primaryIpConfig);
                    }
                    associateLoadBalancerToIpConfiguration(this.primaryInternalLoadBalancerToAttachOnUpdate,
                        primaryIpConfig);
                    if (!this.primaryInternalLBBackendsToAddOnUpdate.isEmpty()) {
                        removeAllBackendAssociationFromIpConfiguration(this.primaryInternalLoadBalancerToAttachOnUpdate,
                            primaryIpConfig);
                        associateBackEndsToIpConfiguration(this.primaryInternalLoadBalancerToAttachOnUpdate.id(),
                            primaryIpConfig, this.primaryInternalLBBackendsToAddOnUpdate.toArray(new String[0]));
                    }

                    if (!this.primaryInternalLBInboundNatPoolsToAddOnUpdate.isEmpty()) {
                        removeAllInboundNatPoolAssociationFromIpConfiguration(
                            this.primaryInternalLoadBalancerToAttachOnUpdate, primaryIpConfig);
                        associateInboundNATPoolsToIpConfiguration(this.primaryInternalLoadBalancerToAttachOnUpdate.id(),
                            primaryIpConfig, this.primaryInternalLBInboundNatPoolsToAddOnUpdate.toArray(new String[0]));
                    }
                }

                this.removePrimaryInternetFacingLoadBalancerOnUpdate = false;
                this.removePrimaryInternalLoadBalancerOnUpdate = false;
                this.primaryInternetFacingLoadBalancerToAttachOnUpdate = null;
                this.primaryInternalLoadBalancerToAttachOnUpdate = null;
                this.primaryInternetFacingLBBackendsToRemoveOnUpdate.clear();
                this.primaryInternetFacingLBInboundNatPoolsToRemoveOnUpdate.clear();
                this.primaryInternalLBBackendsToRemoveOnUpdate.clear();
                this.primaryInternalLBInboundNatPoolsToRemoveOnUpdate.clear();
                this.primaryInternetFacingLBBackendsToAddOnUpdate.clear();
                this.primaryInternetFacingLBInboundNatPoolsToAddOnUpdate.clear();
                this.primaryInternalLBBackendsToAddOnUpdate.clear();
                this.primaryInternalLBInboundNatPoolsToAddOnUpdate.clear();
                return this;
            });
        } catch (IOException ioException) {
            throw logger.logExceptionAsError(new RuntimeException(ioException));
        }
    }

    private void clearCachedProperties() {
        this.primaryInternetFacingLoadBalancer = null;
        this.primaryInternalLoadBalancer = null;
        this.profileAttached = false;
    }

    private Mono<VirtualMachineScaleSetImpl> loadCurrentPrimaryLoadBalancersIfAvailableAsync() throws IOException {
        Mono<VirtualMachineScaleSetImpl> self = Mono.just(this);
        if (this.primaryInternetFacingLoadBalancer != null && this.primaryInternalLoadBalancer != null) {
            return self;
        }

        String firstLoadBalancerId = null;
        VirtualMachineScaleSetIpConfiguration ipConfig = primaryNicDefaultIpConfiguration();
        if (ipConfig == null) {
            return self;
        }
        if (!ipConfig.loadBalancerBackendAddressPools().isEmpty()) {
            firstLoadBalancerId
                = ResourceUtils.parentResourceIdFromResourceId(ipConfig.loadBalancerBackendAddressPools().get(0).id());
        }

        if (firstLoadBalancerId == null && !ipConfig.loadBalancerInboundNatPools().isEmpty()) {
            firstLoadBalancerId
                = ResourceUtils.parentResourceIdFromResourceId(ipConfig.loadBalancerInboundNatPools().get(0).id());
        }

        if (firstLoadBalancerId == null) {
            return self;
        }

        self = self.concatWith(Mono.just(firstLoadBalancerId)
            .flatMap(id -> this.networkManager.loadBalancers().getByIdAsync(id).map(loadBalancer1 -> {
                if (loadBalancer1.publicIpAddressIds() != null && loadBalancer1.publicIpAddressIds().size() > 0) {
                    this.primaryInternetFacingLoadBalancer = loadBalancer1;
                } else {
                    this.primaryInternalLoadBalancer = loadBalancer1;
                }
                return this;
            }))).last();

        String secondLoadBalancerId = null;
        for (SubResource subResource : ipConfig.loadBalancerBackendAddressPools()) {
            if (!subResource.id().toLowerCase(Locale.ROOT).startsWith(firstLoadBalancerId.toLowerCase(Locale.ROOT))) {
                secondLoadBalancerId = ResourceUtils.parentResourceIdFromResourceId(subResource.id());
                break;
            }
        }

        if (secondLoadBalancerId == null) {
            for (SubResource subResource : ipConfig.loadBalancerInboundNatPools()) {
                if (!subResource.id()
                    .toLowerCase(Locale.ROOT)
                    .startsWith(firstLoadBalancerId.toLowerCase(Locale.ROOT))) {
                    secondLoadBalancerId = ResourceUtils.parentResourceIdFromResourceId(subResource.id());
                    break;
                }
            }
        }

        if (secondLoadBalancerId == null) {
            return self;
        }

        return self.concatWith(Mono.just(secondLoadBalancerId)
            .flatMap(id -> networkManager.loadBalancers().getByIdAsync(id).map(loadBalancer2 -> {
                if (loadBalancer2.publicIpAddressIds() != null && loadBalancer2.publicIpAddressIds().size() > 0) {
                    this.primaryInternetFacingLoadBalancer = loadBalancer2;
                } else {
                    this.primaryInternalLoadBalancer = loadBalancer2;
                }
                return this;
            }))).last();
    }

    private VirtualMachineScaleSetIpConfiguration primaryNicDefaultIpConfiguration() {
        if (this.innerModel() == null || this.innerModel().virtualMachineProfile() == null) {
            return null;
        }
        List<VirtualMachineScaleSetNetworkConfiguration> nicConfigurations
            = this.innerModel().virtualMachineProfile().networkProfile().networkInterfaceConfigurations();

        for (VirtualMachineScaleSetNetworkConfiguration nicConfiguration : nicConfigurations) {
            if (nicConfiguration.primary()) {
                if (nicConfiguration.ipConfigurations().size() > 0) {
                    VirtualMachineScaleSetIpConfiguration ipConfig = nicConfiguration.ipConfigurations().get(0);
                    if (ipConfig.loadBalancerBackendAddressPools() == null) {
                        ipConfig.withLoadBalancerBackendAddressPools(new ArrayList<>());
                    }
                    if (ipConfig.loadBalancerInboundNatPools() == null) {
                        ipConfig.withLoadBalancerInboundNatPools(new ArrayList<>());
                    }
                    return ipConfig;
                }
            }
        }
        throw logger.logExceptionAsError(
            new RuntimeException("Could not find the primary nic configuration or an IP configuration in it"));
    }

    private VirtualMachineScaleSetNetworkConfiguration primaryNicConfiguration() {
        if (this.innerModel() == null || this.innerModel().virtualMachineProfile() == null) {
            return null;
        }
        List<VirtualMachineScaleSetNetworkConfiguration> nicConfigurations
            = this.innerModel().virtualMachineProfile().networkProfile().networkInterfaceConfigurations();

        for (VirtualMachineScaleSetNetworkConfiguration nicConfiguration : nicConfigurations) {
            if (nicConfiguration.primary()) {
                return nicConfiguration;
            }
        }
        throw logger.logExceptionAsError(new RuntimeException("Could not find the primary nic configuration"));
    }

    private static void associateBackEndsToIpConfiguration(String loadBalancerId,
        VirtualMachineScaleSetIpConfiguration ipConfig, String... backendNames) {
        if (ipConfig == null || ipConfig.loadBalancerBackendAddressPools() == null) {
            return;
        }
        List<SubResource> backendSubResourcesToAssociate = new ArrayList<>();

        for (String backendName : backendNames) {
            String backendPoolId = mergePath(loadBalancerId, "backendAddressPools", backendName);
            boolean found = false;
            for (SubResource subResource : ipConfig.loadBalancerBackendAddressPools()) {
                if (subResource.id().equalsIgnoreCase(backendPoolId)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                backendSubResourcesToAssociate.add(new SubResource().withId(backendPoolId));
            }
        }

        for (SubResource backendSubResource : backendSubResourcesToAssociate) {
            ipConfig.loadBalancerBackendAddressPools().add(backendSubResource);
        }
    }

    private static void associateInboundNATPoolsToIpConfiguration(String loadBalancerId,
        VirtualMachineScaleSetIpConfiguration ipConfig, String... inboundNatPools) {
        List<SubResource> inboundNatPoolSubResourcesToAssociate = new ArrayList<>();
        for (String inboundNatPool : inboundNatPools) {
            String inboundNatPoolId = mergePath(loadBalancerId, "inboundNatPools", inboundNatPool);
            boolean found = false;
            for (SubResource subResource : ipConfig.loadBalancerInboundNatPools()) {
                if (subResource.id().equalsIgnoreCase(inboundNatPoolId)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                inboundNatPoolSubResourcesToAssociate.add(new SubResource().withId(inboundNatPoolId));
            }
        }

        for (SubResource backendSubResource : inboundNatPoolSubResourcesToAssociate) {
            ipConfig.loadBalancerInboundNatPools().add(backendSubResource);
        }
    }

    private static Map<String, LoadBalancerBackend> getBackendsAssociatedWithIpConfiguration(LoadBalancer loadBalancer,
        VirtualMachineScaleSetIpConfiguration ipConfig) {
        if (ipConfig == null || ipConfig.loadBalancerBackendAddressPools() == null) {
            return Collections.emptyMap();
        }
        String loadBalancerId = loadBalancer.id();
        Map<String, LoadBalancerBackend> attachedBackends = new HashMap<>();
        Map<String, LoadBalancerBackend> lbBackends = loadBalancer.backends();
        for (LoadBalancerBackend lbBackend : lbBackends.values()) {
            String backendId = mergePath(loadBalancerId, "backendAddressPools", lbBackend.name());
            for (SubResource subResource : ipConfig.loadBalancerBackendAddressPools()) {
                if (subResource.id().equalsIgnoreCase(backendId)) {
                    attachedBackends.put(lbBackend.name(), lbBackend);
                }
            }
        }
        return attachedBackends;
    }

    private static Map<String, LoadBalancerInboundNatPool> getInboundNatPoolsAssociatedWithIpConfiguration(
        LoadBalancer loadBalancer, VirtualMachineScaleSetIpConfiguration ipConfig) {
        if (ipConfig == null || ipConfig.loadBalancerInboundNatPools() == null) {
            return Collections.emptyMap();
        }
        String loadBalancerId = loadBalancer.id();
        Map<String, LoadBalancerInboundNatPool> attachedInboundNatPools = new HashMap<>();
        Map<String, LoadBalancerInboundNatPool> lbInboundNatPools = loadBalancer.inboundNatPools();
        for (LoadBalancerInboundNatPool lbInboundNatPool : lbInboundNatPools.values()) {
            String inboundNatPoolId = mergePath(loadBalancerId, "inboundNatPools", lbInboundNatPool.name());
            for (SubResource subResource : ipConfig.loadBalancerInboundNatPools()) {
                if (subResource.id().equalsIgnoreCase(inboundNatPoolId)) {
                    attachedInboundNatPools.put(lbInboundNatPool.name(), lbInboundNatPool);
                }
            }
        }
        return attachedInboundNatPools;
    }

    private static void associateLoadBalancerToIpConfiguration(LoadBalancer loadBalancer,
        VirtualMachineScaleSetIpConfiguration ipConfig) {
        Collection<LoadBalancerBackend> backends = loadBalancer.backends().values();
        String[] backendNames = new String[backends.size()];
        int i = 0;
        for (LoadBalancerBackend backend : backends) {
            backendNames[i] = backend.name();
            i++;
        }

        associateBackEndsToIpConfiguration(loadBalancer.id(), ipConfig, backendNames);

        Collection<LoadBalancerInboundNatPool> inboundNatPools = loadBalancer.inboundNatPools().values();
        String[] natPoolNames = new String[inboundNatPools.size()];
        i = 0;
        for (LoadBalancerInboundNatPool inboundNatPool : inboundNatPools) {
            natPoolNames[i] = inboundNatPool.name();
            i++;
        }

        associateInboundNATPoolsToIpConfiguration(loadBalancer.id(), ipConfig, natPoolNames);
    }

    private static void removeLoadBalancerAssociationFromIpConfiguration(LoadBalancer loadBalancer,
        VirtualMachineScaleSetIpConfiguration ipConfig) {
        removeAllBackendAssociationFromIpConfiguration(loadBalancer, ipConfig);
        removeAllInboundNatPoolAssociationFromIpConfiguration(loadBalancer, ipConfig);
    }

    private static void removeAllBackendAssociationFromIpConfiguration(LoadBalancer loadBalancer,
        VirtualMachineScaleSetIpConfiguration ipConfig) {
        if (ipConfig == null || ipConfig.loadBalancerBackendAddressPools() == null) {
            return;
        }
        List<SubResource> toRemove = new ArrayList<>();
        for (SubResource subResource : ipConfig.loadBalancerBackendAddressPools()) {
            if (subResource.id()
                .toLowerCase(Locale.ROOT)
                .startsWith(loadBalancer.id().toLowerCase(Locale.ROOT) + "/")) {
                toRemove.add(subResource);
            }
        }

        for (SubResource subResource : toRemove) {
            ipConfig.loadBalancerBackendAddressPools().remove(subResource);
        }
    }

    private static void removeAllInboundNatPoolAssociationFromIpConfiguration(LoadBalancer loadBalancer,
        VirtualMachineScaleSetIpConfiguration ipConfig) {
        if (ipConfig == null || ipConfig.loadBalancerInboundNatPools() == null) {
            return;
        }
        List<SubResource> toRemove = new ArrayList<>();
        for (SubResource subResource : ipConfig.loadBalancerInboundNatPools()) {
            if (subResource.id()
                .toLowerCase(Locale.ROOT)
                .startsWith(loadBalancer.id().toLowerCase(Locale.ROOT) + "/")) {
                toRemove.add(subResource);
            }
        }

        for (SubResource subResource : toRemove) {
            ipConfig.loadBalancerInboundNatPools().remove(subResource);
        }
    }

    private static void removeBackendsFromIpConfiguration(String loadBalancerId,
        VirtualMachineScaleSetIpConfiguration ipConfig, String... backendNames) {
        if (ipConfig == null || ipConfig.loadBalancerBackendAddressPools() == null) {
            return;
        }
        List<SubResource> toRemove = new ArrayList<>();
        for (String backendName : backendNames) {
            String backendPoolId = mergePath(loadBalancerId, "backendAddressPools", backendName);
            for (SubResource subResource : ipConfig.loadBalancerBackendAddressPools()) {
                if (subResource.id().equalsIgnoreCase(backendPoolId)) {
                    toRemove.add(subResource);
                    break;
                }
            }
        }

        for (SubResource subResource : toRemove) {
            ipConfig.loadBalancerBackendAddressPools().remove(subResource);
        }
    }

    private static void removeInboundNatPoolsFromIpConfiguration(String loadBalancerId,
        VirtualMachineScaleSetIpConfiguration ipConfig, String... inboundNatPoolNames) {
        if (ipConfig == null || ipConfig.loadBalancerInboundNatPools() == null) {
            return;
        }
        List<SubResource> toRemove = new ArrayList<>();
        for (String natPoolName : inboundNatPoolNames) {
            String inboundNatPoolId = mergePath(loadBalancerId, "inboundNatPools", natPoolName);
            for (SubResource subResource : ipConfig.loadBalancerInboundNatPools()) {
                if (subResource.id().equalsIgnoreCase(inboundNatPoolId)) {
                    toRemove.add(subResource);
                    break;
                }
            }
        }

        for (SubResource subResource : toRemove) {
            ipConfig.loadBalancerInboundNatPools().remove(subResource);
        }
    }

    private static <T> void addToList(List<T> list, T[] items) {
        list.addAll(Arrays.asList(items));
    }

    private static String mergePath(String... segments) {
        StringBuilder builder = new StringBuilder();
        for (String segment : segments) {
            while (segment.length() > 1 && segment.endsWith("/")) {
                segment = segment.substring(0, segment.length() - 1);
            }

            if (segment.length() > 0) {
                builder.append(segment);
                builder.append("/");
            }
        }

        String merged = builder.toString();
        if (merged.endsWith("/")) {
            merged = merged.substring(0, merged.length() - 1);
        }
        return merged;
    }

    RoleAssignmentHelper.IdProvider idProvider() {
        return new RoleAssignmentHelper.IdProvider() {
            @Override
            public String principalId() {
                if (innerModel() != null && innerModel().identity() != null) {
                    return innerModel().identity().principalId();
                } else {
                    return null;
                }
            }

            @Override
            public String resourceId() {
                if (innerModel() != null) {
                    return innerModel().id();
                } else {
                    return null;
                }
            }
        };
    }

    protected VirtualMachineScaleSetImpl
        withUnmanagedDataDisk(VirtualMachineScaleSetUnmanagedDataDiskImpl unmanagedDisk) {
        initVMProfileIfNecessary();
        if (this.innerModel().virtualMachineProfile().storageProfile().dataDisks() == null) {
            this.innerModel()
                .virtualMachineProfile()
                .storageProfile()
                .withDataDisks(new ArrayList<VirtualMachineScaleSetDataDisk>());
        }
        List<VirtualMachineScaleSetDataDisk> dataDisks
            = this.innerModel().virtualMachineProfile().storageProfile().dataDisks();
        dataDisks.add(unmanagedDisk.innerModel());
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withAvailabilityZone(AvailabilityZoneId zoneId) {
        // Note: Only for virtual machine scale set, new zone can be specified, hence
        // this option is available for both definition and update cases.
        //
        //
        if (this.innerModel().zones() == null) {
            this.innerModel().withZones(new ArrayList<>());
        }
        this.innerModel().zones().add(zoneId.toString());
        return this;
    }

    /**
     * Checks whether the OS disk is based on an image (image from PIR or custom image [captured, bringYourOwnFeature]).
     *
     * @param osDisk the osDisk value in the storage profile
     * @return true if the OS disk is configured to use image from PIR or custom image
     */
    private boolean isOSDiskFromImage(VirtualMachineScaleSetOSDisk osDisk) {
        return osDisk.createOption() == DiskCreateOptionTypes.FROM_IMAGE;
    }

    /**
     * Checks whether the OS disk is based on a CustomImage.
     *
     * <p>A custom image is represented by {@link VirtualMachineCustomImage}.
     *
     * @param storageProfile the storage profile
     * @return true if the OS disk is configured to be based on custom image.
     */
    private boolean isOsDiskFromCustomImage(VirtualMachineScaleSetStorageProfile storageProfile) {
        ImageReference imageReference = storageProfile.imageReference();
        return isOSDiskFromImage(storageProfile.osDisk()) && imageReference != null && imageReference.id() != null;
    }

    /**
     * Checks whether the OS disk is based on an platform image (image in PIR).
     *
     * @param storageProfile the storage profile
     * @return true if the OS disk is configured to be based on platform image.
     */
    private boolean isOSDiskFromPlatformImage(VirtualMachineScaleSetStorageProfile storageProfile) {
        ImageReference imageReference = storageProfile.imageReference();
        return isOSDiskFromImage(storageProfile.osDisk())
            && imageReference != null
            && imageReference.publisher() != null
            && imageReference.offer() != null
            && imageReference.sku() != null
            && imageReference.version() != null;
    }

    /**
     * Checks whether the OS disk is based on a stored image ('captured' or 'bring your own feature').
     *
     * @param storageProfile the storage profile
     * @return true if the OS disk is configured to use custom image ('captured' or 'bring your own feature')
     */
    private boolean isOSDiskFromStoredImage(VirtualMachineScaleSetStorageProfile storageProfile) {
        VirtualMachineScaleSetOSDisk osDisk = storageProfile.osDisk();
        return isOSDiskFromImage(osDisk) && osDisk.image() != null && osDisk.image().uri() != null;
    }

    private void throwIfManagedDiskDisabled(String message) {
        if (!this.isManagedDiskEnabled()) {
            throw logger.logExceptionAsError(new UnsupportedOperationException(message));
        }
    }

    @Override
    public VirtualMachineScaleSetImpl withBootDiagnosticsOnManagedStorageAccount() {
        this.bootDiagnosticsHandler.withBootDiagnostics(true);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withBootDiagnostics() {
        this.bootDiagnosticsHandler.withBootDiagnostics(false);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withBootDiagnostics(Creatable<StorageAccount> creatable) {
        this.bootDiagnosticsHandler.withBootDiagnostics(creatable);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withBootDiagnostics(StorageAccount storageAccount) {
        this.bootDiagnosticsHandler.withBootDiagnostics(storageAccount);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withBootDiagnostics(String storageAccountBlobEndpointUri) {
        this.bootDiagnosticsHandler.withBootDiagnostics(storageAccountBlobEndpointUri);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutBootDiagnostics() {
        this.bootDiagnosticsHandler.withoutBootDiagnostics();
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withMaxPrice(Double maxPrice) {
        this.innerModel().virtualMachineProfile().withBillingProfile(new BillingProfile().withMaxPrice(maxPrice));
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withVirtualMachinePriority(VirtualMachinePriorityTypes priority) {
        this.innerModel().virtualMachineProfile().withPriority(priority);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withLowPriorityVirtualMachine() {
        this.withVirtualMachinePriority(VirtualMachinePriorityTypes.LOW);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withLowPriorityVirtualMachine(VirtualMachineEvictionPolicyTypes policy) {
        this.withLowPriorityVirtualMachine();
        this.innerModel().virtualMachineProfile().withEvictionPolicy(policy);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withSpotPriorityVirtualMachine() {
        this.withVirtualMachinePriority(VirtualMachinePriorityTypes.SPOT);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withSpotPriorityVirtualMachine(VirtualMachineEvictionPolicyTypes policy) {
        this.withSpotPriorityVirtualMachine();
        this.innerModel().virtualMachineProfile().withEvictionPolicy(policy);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withVirtualMachinePublicIp() {
        initVMProfileIfNecessary();
        VirtualMachineScaleSetIpConfiguration nicIpConfig = this.primaryNicDefaultIpConfiguration();
        if (nicIpConfig.publicIpAddressConfiguration() != null) {
            return this;
        } else {
            VirtualMachineScaleSetPublicIpAddressConfiguration pipConfig
                = new VirtualMachineScaleSetPublicIpAddressConfiguration();
            pipConfig.withName("pip1");
            pipConfig.withIdleTimeoutInMinutes(15);
            //
            nicIpConfig.withPublicIpAddressConfiguration(pipConfig);
            return this;
        }
    }

    @Override
    public VirtualMachineScaleSetImpl withVirtualMachinePublicIp(String leafDomainLabel) {
        initVMProfileIfNecessary();
        VirtualMachineScaleSetIpConfiguration nicIpConfig = this.primaryNicDefaultIpConfiguration();
        if (nicIpConfig.publicIpAddressConfiguration() != null) {
            if (nicIpConfig.publicIpAddressConfiguration().dnsSettings() != null) {
                nicIpConfig.publicIpAddressConfiguration().dnsSettings().withDomainNameLabel(leafDomainLabel);
            } else {
                nicIpConfig.publicIpAddressConfiguration()
                    .withDnsSettings(new VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings());
                nicIpConfig.publicIpAddressConfiguration().dnsSettings().withDomainNameLabel(leafDomainLabel);
            }
        } else {
            VirtualMachineScaleSetPublicIpAddressConfiguration pipConfig
                = new VirtualMachineScaleSetPublicIpAddressConfiguration();
            pipConfig.withName("pip1");
            pipConfig.withIdleTimeoutInMinutes(15);
            pipConfig.withDnsSettings(new VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings());
            pipConfig.dnsSettings().withDomainNameLabel(leafDomainLabel);
            nicIpConfig.withPublicIpAddressConfiguration(pipConfig);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl
        withVirtualMachinePublicIp(VirtualMachineScaleSetPublicIpAddressConfiguration pipConfig) {
        initVMProfileIfNecessary();
        VirtualMachineScaleSetIpConfiguration nicIpConfig = this.primaryNicDefaultIpConfiguration();
        nicIpConfig.withPublicIpAddressConfiguration(pipConfig);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withAcceleratedNetworking() {
        initVMProfileIfNecessary();
        VirtualMachineScaleSetNetworkConfiguration nicConfig = this.primaryNicConfiguration();
        nicConfig.withEnableAcceleratedNetworking(true);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutAcceleratedNetworking() {
        initVMProfileIfNecessary();
        VirtualMachineScaleSetNetworkConfiguration nicConfig = this.primaryNicConfiguration();
        nicConfig.withEnableAcceleratedNetworking(false);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withIpForwarding() {
        initVMProfileIfNecessary();
        VirtualMachineScaleSetNetworkConfiguration nicConfig = this.primaryNicConfiguration();
        nicConfig.withEnableIpForwarding(true);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutIpForwarding() {
        VirtualMachineScaleSetNetworkConfiguration nicConfig = this.primaryNicConfiguration();
        if (nicConfig == null) {
            return this;
        }
        nicConfig.withEnableIpForwarding(false);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withExistingNetworkSecurityGroup(NetworkSecurityGroup networkSecurityGroup) {
        initVMProfileIfNecessary();
        VirtualMachineScaleSetNetworkConfiguration nicConfig = this.primaryNicConfiguration();
        nicConfig.withNetworkSecurityGroup(new SubResource().withId(networkSecurityGroup.id()));
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withExistingNetworkSecurityGroupId(String networkSecurityGroupId) {
        initVMProfileIfNecessary();
        VirtualMachineScaleSetNetworkConfiguration nicConfig = this.primaryNicConfiguration();
        nicConfig.withNetworkSecurityGroup(new SubResource().withId(networkSecurityGroupId));
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutNetworkSecurityGroup() {
        VirtualMachineScaleSetNetworkConfiguration nicConfig = this.primaryNicConfiguration();
        if (nicConfig == null) {
            return this;
        }
        nicConfig.withNetworkSecurityGroup(null);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withSinglePlacementGroup() {
        this.innerModel().withSinglePlacementGroup(true);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutSinglePlacementGroup() {
        this.innerModel().withSinglePlacementGroup(false);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withExistingApplicationGatewayBackendPool(String backendPoolId) {
        initVMProfileIfNecessary();
        VirtualMachineScaleSetIpConfiguration nicIpConfig = primaryNicDefaultIpConfiguration();
        if (nicIpConfig.applicationGatewayBackendAddressPools() == null) {
            nicIpConfig.withApplicationGatewayBackendAddressPools(new ArrayList<>());
        }
        boolean found = false;
        for (SubResource backendPool : nicIpConfig.applicationGatewayBackendAddressPools()) {
            if (backendPool.id().equalsIgnoreCase(backendPoolId)) {
                found = true;
                break;
            }
        }
        if (!found) {
            nicIpConfig.applicationGatewayBackendAddressPools().add(new SubResource().withId(backendPoolId));
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutApplicationGatewayBackendPool(String backendPoolId) {
        VirtualMachineScaleSetIpConfiguration nicIpConfig = primaryNicDefaultIpConfiguration();
        if (nicIpConfig == null || nicIpConfig.applicationGatewayBackendAddressPools() == null) {
            return this;
        } else {
            int foundIndex = -1;
            int index = -1;
            for (SubResource backendPool : nicIpConfig.applicationGatewayBackendAddressPools()) {
                index = index + 1;
                if (backendPool.id().equalsIgnoreCase(backendPoolId)) {
                    foundIndex = index;
                    break;
                }
            }
            if (foundIndex != -1) {
                nicIpConfig.applicationGatewayBackendAddressPools().remove(foundIndex);
            }
            return this;
        }
    }

    @Override
    public VirtualMachineScaleSetImpl
        withExistingApplicationSecurityGroup(ApplicationSecurityGroup applicationSecurityGroup) {
        return withExistingApplicationSecurityGroupId(applicationSecurityGroup.id());
    }

    @Override
    public VirtualMachineScaleSetImpl withExistingApplicationSecurityGroupId(String applicationSecurityGroupId) {
        initVMProfileIfNecessary();
        VirtualMachineScaleSetIpConfiguration nicIpConfig = primaryNicDefaultIpConfiguration();
        if (nicIpConfig.applicationSecurityGroups() == null) {
            nicIpConfig.withApplicationSecurityGroups(new ArrayList<>());
        }
        boolean found = false;
        for (SubResource asg : nicIpConfig.applicationSecurityGroups()) {
            if (asg.id().equalsIgnoreCase(applicationSecurityGroupId)) {
                found = true;
                break;
            }
        }
        if (!found) {
            nicIpConfig.applicationSecurityGroups().add(new SubResource().withId(applicationSecurityGroupId));
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withoutApplicationSecurityGroup(String applicationSecurityGroupId) {
        VirtualMachineScaleSetIpConfiguration nicIpConfig = primaryNicDefaultIpConfiguration();
        if (nicIpConfig == null || nicIpConfig.applicationSecurityGroups() == null) {
            return this;
        } else {
            int foundIndex = -1;
            int index = -1;
            for (SubResource asg : nicIpConfig.applicationSecurityGroups()) {
                index = index + 1;
                if (asg.id().equalsIgnoreCase(applicationSecurityGroupId)) {
                    foundIndex = index;
                    break;
                }
            }
            if (foundIndex != -1) {
                nicIpConfig.applicationSecurityGroups().remove(foundIndex);
            }
            return this;
        }
    }

    @Override
    public VirtualMachineScaleSetImpl withProximityPlacementGroup(String proximityPlacementGroupId) {
        this.innerModel().withProximityPlacementGroup(new SubResource().withId(proximityPlacementGroupId));
        this.newProximityPlacementGroupName = null;
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withNewProximityPlacementGroup(String proximityPlacementGroupName,
        ProximityPlacementGroupType type) {
        this.newProximityPlacementGroupName = proximityPlacementGroupName;
        this.newProximityPlacementGroupType = type;

        this.innerModel().withProximityPlacementGroup(null);

        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl
        withDoNotRunExtensionsOnOverprovisionedVMs(Boolean doNotRunExtensionsOnOverprovisionedVMs) {
        this.innerModel().withDoNotRunExtensionsOnOverprovisionedVMs(doNotRunExtensionsOnOverprovisionedVMs);
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        this.innerModel().withAdditionalCapabilities(additionalCapabilities);
        return this;
    }

    private Mono<VirtualMachineScaleSetImpl> createNewProximityPlacementGroupAsync() {
        if (isInCreateMode()) {
            if (this.newProximityPlacementGroupName != null && !this.newProximityPlacementGroupName.isEmpty()) {
                ProximityPlacementGroupInner plgInner = new ProximityPlacementGroupInner();
                plgInner.withProximityPlacementGroupType(this.newProximityPlacementGroupType);
                plgInner.withLocation(this.innerModel().location());
                return this.manager()
                    .serviceClient()
                    .getProximityPlacementGroups()
                    .createOrUpdateAsync(this.resourceGroupName(), this.newProximityPlacementGroupName, plgInner)
                    .map(ppgInner -> {
                        this.innerModel().withProximityPlacementGroup((new SubResource().withId(ppgInner.id())));
                        return this;
                    });
            }
        }
        return Mono.just(this);
    }

    @Override
    public VirtualMachineScaleSetImpl withPlan(PurchasePlan plan) {
        this.innerModel().withPlan(new Plan());
        this.innerModel().plan().withPublisher(plan.publisher()).withProduct(plan.product()).withName(plan.name());
        return this;
    }

    @Override
    public VirtualMachineScaleSetImpl withPlacement(DiffDiskPlacement placement) {
        this.innerModel().virtualMachineProfile().storageProfile().osDisk().diffDiskSettings().withPlacement(placement);
        return this;
    }

    /**
     * Class to manage Data Disk collection.
     */
    private class ManagedDataDiskCollection {
        private final List<VirtualMachineScaleSetDataDisk> implicitDisksToAssociate = new ArrayList<>();
        private final List<Integer> diskLunsToRemove = new ArrayList<>();
        private final List<VirtualMachineScaleSetDataDisk> newDisksFromImage = new ArrayList<>();
        private final VirtualMachineScaleSetImpl vmss;
        private CachingTypes defaultCachingType;
        private StorageAccountTypes defaultStorageAccountType;

        ManagedDataDiskCollection(VirtualMachineScaleSetImpl vmss) {
            this.vmss = vmss;
        }

        void setDefaultCachingType(CachingTypes cachingType) {
            this.defaultCachingType = cachingType;
        }

        void setDefaultStorageAccountType(StorageAccountTypes defaultStorageAccountType) {
            this.defaultStorageAccountType = defaultStorageAccountType;
        }

        void setDataDisksDefaults() {
            if (this.vmss.innerModel() == null || this.vmss.innerModel().virtualMachineProfile() == null) {
                return;
            }
            VirtualMachineScaleSetStorageProfile storageProfile
                = this.vmss.innerModel().virtualMachineProfile().storageProfile();
            if (isPending()) {
                if (storageProfile.dataDisks() == null) {
                    storageProfile.withDataDisks(new ArrayList<>());
                }
                List<VirtualMachineScaleSetDataDisk> dataDisks = storageProfile.dataDisks();
                final List<Integer> usedLuns = new ArrayList<>();
                // Get all used luns
                //
                for (VirtualMachineScaleSetDataDisk dataDisk : dataDisks) {
                    if (dataDisk.lun() != -1) {
                        usedLuns.add(dataDisk.lun());
                    }
                }
                for (VirtualMachineScaleSetDataDisk dataDisk : this.implicitDisksToAssociate) {
                    if (dataDisk.lun() != -1) {
                        usedLuns.add(dataDisk.lun());
                    }
                }
                for (VirtualMachineScaleSetDataDisk dataDisk : this.newDisksFromImage) {
                    if (dataDisk.lun() != -1) {
                        usedLuns.add(dataDisk.lun());
                    }
                }
                // Func to get the next available lun
                //
                Callable<Integer> nextLun = () -> {
                    Integer lun = 0;
                    while (usedLuns.contains(lun)) {
                        lun++;
                    }
                    usedLuns.add(lun);
                    return lun;
                };
                try {
                    setImplicitDataDisks(nextLun);
                } catch (Exception ex) {
                    throw logger.logExceptionAsError(Exceptions.propagate(ex));
                }
                setImageBasedDataDisks();
                removeDataDisks();
            }
            if (storageProfile.dataDisks() != null && storageProfile.dataDisks().size() == 0) {
                if (vmss.isInCreateMode()) {
                    // If there is no data disks at all, then setting it to null rather than [] is necessary.
                    // This is for take advantage of CRP's implicit creation of the data disks if the image has
                    // more than one data disk image(s).
                    //
                    storageProfile.withDataDisks(null);
                }
            }
            this.clear();
        }

        private void clear() {
            implicitDisksToAssociate.clear();
            diskLunsToRemove.clear();
            newDisksFromImage.clear();
        }

        private boolean isPending() {
            return implicitDisksToAssociate.size() > 0 || diskLunsToRemove.size() > 0 || newDisksFromImage.size() > 0;
        }

        private void setImplicitDataDisks(Callable<Integer> nextLun) throws Exception {
            if (this.vmss.innerModel() == null || this.vmss.innerModel().virtualMachineProfile() == null) {
                return;
            }
            VirtualMachineScaleSetStorageProfile storageProfile
                = this.vmss.innerModel().virtualMachineProfile().storageProfile();
            List<VirtualMachineScaleSetDataDisk> dataDisks = storageProfile.dataDisks();
            for (VirtualMachineScaleSetDataDisk dataDisk : this.implicitDisksToAssociate) {
                dataDisk.withCreateOption(DiskCreateOptionTypes.EMPTY);
                if (dataDisk.lun() == -1) {
                    dataDisk.withLun(nextLun.call());
                }
                if (dataDisk.managedDisk() == null) {
                    dataDisk.withManagedDisk(new VirtualMachineScaleSetManagedDiskParameters());
                }
                if (dataDisk.caching() == null) {
                    dataDisk.withCaching(getDefaultCachingType());
                }
                if (dataDisk.managedDisk().storageAccountType() == null) {
                    dataDisk.managedDisk().withStorageAccountType(getDefaultStorageAccountType());
                }
                dataDisk.withName(null);
                dataDisks.add(dataDisk);
            }
        }

        private void setImageBasedDataDisks() {
            if (this.vmss.innerModel() == null || this.vmss.innerModel().virtualMachineProfile() == null) {
                return;
            }
            VirtualMachineScaleSetStorageProfile storageProfile
                = this.vmss.innerModel().virtualMachineProfile().storageProfile();
            List<VirtualMachineScaleSetDataDisk> dataDisks = storageProfile.dataDisks();
            for (VirtualMachineScaleSetDataDisk dataDisk : this.newDisksFromImage) {
                dataDisk.withCreateOption(DiskCreateOptionTypes.FROM_IMAGE);
                // Don't set default storage account type for the disk, either user has to specify it explicitly or let
                // CRP pick it from the image
                dataDisk.withName(null);
                dataDisks.add(dataDisk);
            }
        }

        private void removeDataDisks() {
            if (this.vmss.innerModel() == null || this.vmss.innerModel().virtualMachineProfile() == null) {
                return;
            }
            VirtualMachineScaleSetStorageProfile storageProfile
                = this.vmss.innerModel().virtualMachineProfile().storageProfile();
            List<VirtualMachineScaleSetDataDisk> dataDisks = storageProfile.dataDisks();
            for (Integer lun : this.diskLunsToRemove) {
                int indexToRemove = 0;
                for (VirtualMachineScaleSetDataDisk dataDisk : dataDisks) {
                    if (dataDisk.lun() == lun) {
                        dataDisks.remove(indexToRemove);
                        break;
                    }
                    indexToRemove++;
                }
            }
        }

        private CachingTypes getDefaultCachingType() {
            if (defaultCachingType == null) {
                return CachingTypes.READ_WRITE;
            }
            return defaultCachingType;
        }

        private StorageAccountTypes getDefaultStorageAccountType() {
            if (defaultStorageAccountType == null) {
                return StorageAccountTypes.STANDARD_LRS;
            }
            return defaultStorageAccountType;
        }
    }

    /** Class to manage VMSS boot diagnostics settings. */
    private class BootDiagnosticsHandler {
        private final VirtualMachineScaleSetImpl vmssImpl;
        private String creatableDiagnosticsStorageAccountKey;
        private String creatableStorageAccountKey;
        private StorageAccount existingStorageAccountToAssociate;
        private boolean useManagedStorageAccount = false;

        BootDiagnosticsHandler(VirtualMachineScaleSetImpl vmssImpl) {
            this.vmssImpl = vmssImpl;
            if (isBootDiagnosticsEnabled()
                && this.vmssInner() != null
                && this.vmssInner().virtualMachineProfile() != null
                && this.vmssInner().virtualMachineProfile().diagnosticsProfile().bootDiagnostics().storageUri()
                    == null) {
                this.useManagedStorageAccount = true;
            }
        }

        public boolean isBootDiagnosticsEnabled() {
            if (this.vmssInner() == null || this.vmssInner().virtualMachineProfile() == null) {
                return false;
            }
            DiagnosticsProfile diagnosticsProfile = this.vmssInner().virtualMachineProfile().diagnosticsProfile();
            if (diagnosticsProfile != null
                && diagnosticsProfile.bootDiagnostics() != null
                && diagnosticsProfile.bootDiagnostics().enabled() != null) {
                return diagnosticsProfile.bootDiagnostics().enabled();
            }
            return false;
        }

        public String bootDiagnosticsStorageUri() {
            if (this.vmssInner() == null || this.vmssInner().virtualMachineProfile() == null) {
                return null;
            }
            DiagnosticsProfile diagnosticsProfile = this.vmssInner().virtualMachineProfile().diagnosticsProfile();
            // Even though diagnostics can disabled azure still keep the storage uri
            if (diagnosticsProfile != null && diagnosticsProfile.bootDiagnostics() != null) {
                return diagnosticsProfile.bootDiagnostics().storageUri();
            }
            return null;
        }

        BootDiagnosticsHandler withBootDiagnostics(boolean useManagedStorageAccount) {
            // Diagnostics storage uri will be set later by this.handleDiagnosticsSettings(..)
            //
            this.enableDisable(true);
            this.useManagedStorageAccount = useManagedStorageAccount;
            return this;
        }

        BootDiagnosticsHandler withBootDiagnostics(Creatable<StorageAccount> creatable) {
            // Diagnostics storage uri will be set later by this.handleDiagnosticsSettings(..)
            //
            this.enableDisable(true);
            this.useManagedStorageAccount = false;
            this.creatableDiagnosticsStorageAccountKey = this.vmssImpl.addDependency(creatable);
            return this;
        }

        BootDiagnosticsHandler withBootDiagnostics(String storageAccountBlobEndpointUri) {
            if (this.vmssInner() == null || this.vmssInner().virtualMachineProfile() == null) {
                return this;
            }
            this.enableDisable(true);
            this.useManagedStorageAccount = false;
            this.vmssInner()
                .virtualMachineProfile()
                .diagnosticsProfile()
                .bootDiagnostics()
                .withStorageUri(storageAccountBlobEndpointUri);
            return this;
        }

        BootDiagnosticsHandler withBootDiagnostics(StorageAccount storageAccount) {
            return this.withBootDiagnostics(storageAccount.endPoints().primary().blob());
        }

        BootDiagnosticsHandler withoutBootDiagnostics() {
            this.enableDisable(false);
            this.useManagedStorageAccount = false;
            return this;
        }

        void prepare() {
            if (useManagedStorageAccount) {
                return;
            }

            this.creatableStorageAccountKey = null;
            this.existingStorageAccountToAssociate = null;
            if (this.vmssInner() == null || this.vmssInner().virtualMachineProfile() == null) {
                return;
            }
            DiagnosticsProfile diagnosticsProfile = this.vmssInner().virtualMachineProfile().diagnosticsProfile();
            if (diagnosticsProfile == null
                || diagnosticsProfile.bootDiagnostics() == null
                || diagnosticsProfile.bootDiagnostics().storageUri() != null) {
                return;
            }
            boolean enableBD = ResourceManagerUtils.toPrimitiveBoolean(diagnosticsProfile.bootDiagnostics().enabled());
            if (!enableBD) {
                return;
            }

            if (this.creatableDiagnosticsStorageAccountKey != null) {
                return;
            }
            if (!this.vmssImpl.creatableStorageAccountKeys.isEmpty()) {
                this.creatableStorageAccountKey = this.vmssImpl.creatableStorageAccountKeys.get(0);
                return;
            }
            if (!this.vmssImpl.existingStorageAccountsToAssociate.isEmpty()) {
                this.existingStorageAccountToAssociate = this.vmssImpl.existingStorageAccountsToAssociate.get(0);
                return;
            }

            String accountName = this.vmssImpl.namer.getRandomName("stg", 24).replace("-", "");
            Creatable<StorageAccount> storageAccountCreatable;
            if (this.vmssImpl.creatableGroup != null) {
                storageAccountCreatable = this.vmssImpl.storageManager.storageAccounts()
                    .define(accountName)
                    .withRegion(this.vmssImpl.regionName())
                    .withNewResourceGroup(this.vmssImpl.creatableGroup);
            } else {
                storageAccountCreatable = this.vmssImpl.storageManager.storageAccounts()
                    .define(accountName)
                    .withRegion(this.vmssImpl.regionName())
                    .withExistingResourceGroup(this.vmssImpl.resourceGroupName());
            }
            this.creatableDiagnosticsStorageAccountKey = this.vmssImpl.addDependency(storageAccountCreatable);
        }

        void handleDiagnosticsSettings() {
            if (useManagedStorageAccount) {
                return;
            }

            if (this.vmssInner() == null || this.vmssInner().virtualMachineProfile() == null) {
                return;
            }

            DiagnosticsProfile diagnosticsProfile = this.vmssInner().virtualMachineProfile().diagnosticsProfile();
            if (diagnosticsProfile == null
                || diagnosticsProfile.bootDiagnostics() == null
                || diagnosticsProfile.bootDiagnostics().storageUri() != null) {
                return;
            }
            boolean enableBD = ResourceManagerUtils.toPrimitiveBoolean(diagnosticsProfile.bootDiagnostics().enabled());
            if (!enableBD) {
                return;
            }
            StorageAccount storageAccount = null;
            if (creatableDiagnosticsStorageAccountKey != null) {
                storageAccount = this.vmssImpl.taskResult(creatableDiagnosticsStorageAccountKey);
            } else if (this.creatableStorageAccountKey != null) {
                storageAccount = this.vmssImpl.taskResult(this.creatableStorageAccountKey);
            } else if (this.existingStorageAccountToAssociate != null) {
                storageAccount = this.existingStorageAccountToAssociate;
            }
            if (storageAccount == null) {
                throw logger.logExceptionAsError(new IllegalStateException(
                    "Unable to retrieve expected storageAccount instance for BootDiagnostics"));
            }
            vmssInner().virtualMachineProfile()
                .diagnosticsProfile()
                .bootDiagnostics()
                .withStorageUri(storageAccount.endPoints().primary().blob());
        }

        private VirtualMachineScaleSetInner vmssInner() {
            // Inner cannot be cached as parent VirtualMachineScaleSetImpl can refresh the inner in various cases
            //
            return this.vmssImpl.innerModel();
        }

        private void enableDisable(boolean enable) {
            if (this.vmssInner() == null || this.vmssInner().virtualMachineProfile() == null) {
                return;
            }
            if (this.vmssInner().virtualMachineProfile().diagnosticsProfile() == null) {
                this.vmssInner().virtualMachineProfile().withDiagnosticsProfile(new DiagnosticsProfile());
            }
            if (this.vmssInner().virtualMachineProfile().diagnosticsProfile().bootDiagnostics() == null) {
                this.vmssInner()
                    .virtualMachineProfile()
                    .diagnosticsProfile()
                    .withBootDiagnostics(new BootDiagnostics());
            }
            if (enable) {
                this.vmssInner().virtualMachineProfile().diagnosticsProfile().bootDiagnostics().withEnabled(true);
            } else {
                this.vmssInner().virtualMachineProfile().diagnosticsProfile().bootDiagnostics().withEnabled(false);
                this.vmssInner().virtualMachineProfile().diagnosticsProfile().bootDiagnostics().withStorageUri(null);
            }
        }
    }
}
