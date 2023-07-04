// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.models.AadConfiguration;
import com.azure.resourcemanager.networkcloud.models.AdministratorConfiguration;
import com.azure.resourcemanager.networkcloud.models.AvailableUpgrade;
import com.azure.resourcemanager.networkcloud.models.ControlPlaneNodeConfiguration;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.FeatureStatus;
import com.azure.resourcemanager.networkcloud.models.InitialAgentPoolConfiguration;
import com.azure.resourcemanager.networkcloud.models.KubernetesClusterDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.KubernetesClusterNode;
import com.azure.resourcemanager.networkcloud.models.KubernetesClusterProvisioningState;
import com.azure.resourcemanager.networkcloud.models.ManagedResourceGroupConfiguration;
import com.azure.resourcemanager.networkcloud.models.NetworkConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** KubernetesCluster represents the Kubernetes cluster hosted on Network Cloud. */
@Fluent
public final class KubernetesClusterInner extends Resource {
    /*
     * ExtendedLocation represents the Azure custom location where the resource will be created.
     *
     * The extended location of the cluster associated with the resource.
     */
    @JsonProperty(value = "extendedLocation", required = true)
    private ExtendedLocation extendedLocation;

    /*
     * KubernetesClusterProperties represents the properties of Kubernetes cluster resource.
     *
     * The list of the resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private KubernetesClusterProperties innerProperties = new KubernetesClusterProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of KubernetesClusterInner class. */
    public KubernetesClusterInner() {
    }

    /**
     * Get the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the KubernetesClusterInner object itself.
     */
    public KubernetesClusterInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the innerProperties property: KubernetesClusterProperties represents the properties of Kubernetes cluster
     * resource.
     *
     * <p>The list of the resource properties.
     *
     * @return the innerProperties value.
     */
    private KubernetesClusterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the aadConfiguration property: AadConfiguration represents the Azure Active Directory Integration properties.
     *
     * <p>The Azure Active Directory Integration properties.
     *
     * @return the aadConfiguration value.
     */
    public AadConfiguration aadConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().aadConfiguration();
    }

    /**
     * Set the aadConfiguration property: AadConfiguration represents the Azure Active Directory Integration properties.
     *
     * <p>The Azure Active Directory Integration properties.
     *
     * @param aadConfiguration the aadConfiguration value to set.
     * @return the KubernetesClusterInner object itself.
     */
    public KubernetesClusterInner withAadConfiguration(AadConfiguration aadConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubernetesClusterProperties();
        }
        this.innerProperties().withAadConfiguration(aadConfiguration);
        return this;
    }

    /**
     * Get the administratorConfiguration property: AdministratorConfiguration represents the administrative credentials
     * that will be applied to the control plane and agent pool nodes in Kubernetes clusters.
     *
     * <p>The administrative credentials that will be applied to the control plane and agent pool nodes that do not
     * specify their own values.
     *
     * @return the administratorConfiguration value.
     */
    public AdministratorConfiguration administratorConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().administratorConfiguration();
    }

    /**
     * Set the administratorConfiguration property: AdministratorConfiguration represents the administrative credentials
     * that will be applied to the control plane and agent pool nodes in Kubernetes clusters.
     *
     * <p>The administrative credentials that will be applied to the control plane and agent pool nodes that do not
     * specify their own values.
     *
     * @param administratorConfiguration the administratorConfiguration value to set.
     * @return the KubernetesClusterInner object itself.
     */
    public KubernetesClusterInner withAdministratorConfiguration(
        AdministratorConfiguration administratorConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubernetesClusterProperties();
        }
        this.innerProperties().withAdministratorConfiguration(administratorConfiguration);
        return this;
    }

    /**
     * Get the attachedNetworkIds property: The full list of network resource IDs that are attached to this cluster,
     * including those attached only to specific agent pools.
     *
     * @return the attachedNetworkIds value.
     */
    public List<String> attachedNetworkIds() {
        return this.innerProperties() == null ? null : this.innerProperties().attachedNetworkIds();
    }

    /**
     * Get the availableUpgrades property: The list of versions that this Kubernetes cluster can be upgraded to.
     *
     * @return the availableUpgrades value.
     */
    public List<AvailableUpgrade> availableUpgrades() {
        return this.innerProperties() == null ? null : this.innerProperties().availableUpgrades();
    }

    /**
     * Get the clusterId property: The resource ID of the Network Cloud cluster.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterId();
    }

    /**
     * Get the connectedClusterId property: The resource ID of the connected cluster set up when this Kubernetes cluster
     * is created.
     *
     * @return the connectedClusterId value.
     */
    public String connectedClusterId() {
        return this.innerProperties() == null ? null : this.innerProperties().connectedClusterId();
    }

    /**
     * Get the controlPlaneKubernetesVersion property: The current running version of Kubernetes on the control plane.
     *
     * @return the controlPlaneKubernetesVersion value.
     */
    public String controlPlaneKubernetesVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().controlPlaneKubernetesVersion();
    }

    /**
     * Get the controlPlaneNodeConfiguration property: ControlPlaneNodeConfiguration represents the selection of virtual
     * machines and size of the control plane for a Kubernetes cluster.
     *
     * <p>The defining characteristics of the control plane for this Kubernetes Cluster.
     *
     * @return the controlPlaneNodeConfiguration value.
     */
    public ControlPlaneNodeConfiguration controlPlaneNodeConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().controlPlaneNodeConfiguration();
    }

    /**
     * Set the controlPlaneNodeConfiguration property: ControlPlaneNodeConfiguration represents the selection of virtual
     * machines and size of the control plane for a Kubernetes cluster.
     *
     * <p>The defining characteristics of the control plane for this Kubernetes Cluster.
     *
     * @param controlPlaneNodeConfiguration the controlPlaneNodeConfiguration value to set.
     * @return the KubernetesClusterInner object itself.
     */
    public KubernetesClusterInner withControlPlaneNodeConfiguration(
        ControlPlaneNodeConfiguration controlPlaneNodeConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubernetesClusterProperties();
        }
        this.innerProperties().withControlPlaneNodeConfiguration(controlPlaneNodeConfiguration);
        return this;
    }

    /**
     * Get the detailedStatus property: The current status of the Kubernetes cluster.
     *
     * @return the detailedStatus value.
     */
    public KubernetesClusterDetailedStatus detailedStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatus();
    }

    /**
     * Get the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    public String detailedStatusMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatusMessage();
    }

    /**
     * Get the featureStatuses property: The current feature settings.
     *
     * @return the featureStatuses value.
     */
    public List<FeatureStatus> featureStatuses() {
        return this.innerProperties() == null ? null : this.innerProperties().featureStatuses();
    }

    /**
     * Get the initialAgentPoolConfigurations property: The agent pools that are created with this Kubernetes cluster
     * for running critical system services and workloads. This data in this field is only used during creation, and the
     * field will be empty following the creation of the Kubernetes Cluster. After creation, the management of agent
     * pools is done using the agentPools sub-resource.
     *
     * @return the initialAgentPoolConfigurations value.
     */
    public List<InitialAgentPoolConfiguration> initialAgentPoolConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().initialAgentPoolConfigurations();
    }

    /**
     * Set the initialAgentPoolConfigurations property: The agent pools that are created with this Kubernetes cluster
     * for running critical system services and workloads. This data in this field is only used during creation, and the
     * field will be empty following the creation of the Kubernetes Cluster. After creation, the management of agent
     * pools is done using the agentPools sub-resource.
     *
     * @param initialAgentPoolConfigurations the initialAgentPoolConfigurations value to set.
     * @return the KubernetesClusterInner object itself.
     */
    public KubernetesClusterInner withInitialAgentPoolConfigurations(
        List<InitialAgentPoolConfiguration> initialAgentPoolConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubernetesClusterProperties();
        }
        this.innerProperties().withInitialAgentPoolConfigurations(initialAgentPoolConfigurations);
        return this;
    }

    /**
     * Get the kubernetesVersion property: The Kubernetes version for this cluster. Accepts n.n, n.n.n, and n.n.n-n
     * format. The interpreted version used will be resolved into this field after creation or update.
     *
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().kubernetesVersion();
    }

    /**
     * Set the kubernetesVersion property: The Kubernetes version for this cluster. Accepts n.n, n.n.n, and n.n.n-n
     * format. The interpreted version used will be resolved into this field after creation or update.
     *
     * @param kubernetesVersion the kubernetesVersion value to set.
     * @return the KubernetesClusterInner object itself.
     */
    public KubernetesClusterInner withKubernetesVersion(String kubernetesVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubernetesClusterProperties();
        }
        this.innerProperties().withKubernetesVersion(kubernetesVersion);
        return this;
    }

    /**
     * Get the managedResourceGroupConfiguration property: ManagedResourceGroupConfiguration represents the
     * configuration of the resource group managed by Azure.
     *
     * <p>The configuration of the managed resource group associated with the resource.
     *
     * @return the managedResourceGroupConfiguration value.
     */
    public ManagedResourceGroupConfiguration managedResourceGroupConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().managedResourceGroupConfiguration();
    }

    /**
     * Set the managedResourceGroupConfiguration property: ManagedResourceGroupConfiguration represents the
     * configuration of the resource group managed by Azure.
     *
     * <p>The configuration of the managed resource group associated with the resource.
     *
     * @param managedResourceGroupConfiguration the managedResourceGroupConfiguration value to set.
     * @return the KubernetesClusterInner object itself.
     */
    public KubernetesClusterInner withManagedResourceGroupConfiguration(
        ManagedResourceGroupConfiguration managedResourceGroupConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubernetesClusterProperties();
        }
        this.innerProperties().withManagedResourceGroupConfiguration(managedResourceGroupConfiguration);
        return this;
    }

    /**
     * Get the networkConfiguration property: NetworkConfiguration specifies the Kubernetes cluster network related
     * configuration.
     *
     * <p>The configuration of the Kubernetes cluster networking, including the attachment of networks that span the
     * cluster.
     *
     * @return the networkConfiguration value.
     */
    public NetworkConfiguration networkConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().networkConfiguration();
    }

    /**
     * Set the networkConfiguration property: NetworkConfiguration specifies the Kubernetes cluster network related
     * configuration.
     *
     * <p>The configuration of the Kubernetes cluster networking, including the attachment of networks that span the
     * cluster.
     *
     * @param networkConfiguration the networkConfiguration value to set.
     * @return the KubernetesClusterInner object itself.
     */
    public KubernetesClusterInner withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubernetesClusterProperties();
        }
        this.innerProperties().withNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * Get the nodes property: The details of the nodes in this cluster.
     *
     * @return the nodes value.
     */
    public List<KubernetesClusterNode> nodes() {
        return this.innerProperties() == null ? null : this.innerProperties().nodes();
    }

    /**
     * Get the provisioningState property: The provisioning state of the Kubernetes cluster resource.
     *
     * @return the provisioningState value.
     */
    public KubernetesClusterProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property extendedLocation in model KubernetesClusterInner"));
        } else {
            extendedLocation().validate();
        }
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model KubernetesClusterInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KubernetesClusterInner.class);
}