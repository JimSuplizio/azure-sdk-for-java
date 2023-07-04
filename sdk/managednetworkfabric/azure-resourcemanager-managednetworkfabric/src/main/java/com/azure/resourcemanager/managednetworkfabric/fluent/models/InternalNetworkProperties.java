// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managednetworkfabric.models.AnnotationResource;
import com.azure.resourcemanager.managednetworkfabric.models.BgpConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.ConnectedSubnet;
import com.azure.resourcemanager.managednetworkfabric.models.EnabledDisabledState;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.azure.resourcemanager.managednetworkfabric.models.StaticRouteConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Internal Network Properties. */
@Fluent
public final class InternalNetworkProperties extends AnnotationResource {
    /*
     * List of resources the InternalNetwork is disabled on. Can be either entire NetworkFabric or NetworkRack.
     */
    @JsonProperty(value = "disabledOnResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> disabledOnResources;

    /*
     * Administrative state of the InternalNetwork. Example: Enabled | Disabled.
     */
    @JsonProperty(value = "administrativeState", access = JsonProperty.Access.WRITE_ONLY)
    private EnabledDisabledState administrativeState;

    /*
     * List of resources the BGP is disabled on. Can be either entire NetworkFabric or NetworkRack.
     */
    @JsonProperty(value = "bgpDisabledOnResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> bgpDisabledOnResources;

    /*
     * List of resources the BFD for BGP is disabled on. Can be either entire NetworkFabric or NetworkRack.
     */
    @JsonProperty(value = "bfdDisabledOnResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> bfdDisabledOnResources;

    /*
     * List of resources the BFD of StaticRoutes is disabled on. Can be either entire NetworkFabric or NetworkRack.
     */
    @JsonProperty(value = "bfdForStaticRoutesDisabledOnResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> bfdForStaticRoutesDisabledOnResources;

    /*
     * Gets the provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Vlan identifier. Example: 1001.
     */
    @JsonProperty(value = "vlanId", required = true)
    private int vlanId;

    /*
     * Maximum transmission unit. Default value is 1500.
     */
    @JsonProperty(value = "mtu")
    private Integer mtu;

    /*
     * List with object connected IPv4 Subnets.
     */
    @JsonProperty(value = "connectedIPv4Subnets")
    private List<ConnectedSubnet> connectedIPv4Subnets;

    /*
     * List with object connected IPv6 Subnets.
     */
    @JsonProperty(value = "connectedIPv6Subnets")
    private List<ConnectedSubnet> connectedIPv6Subnets;

    /*
     * Static Route Configuration properties.
     */
    @JsonProperty(value = "staticRouteConfiguration")
    private StaticRouteConfiguration staticRouteConfiguration;

    /*
     * BGP configuration properties
     */
    @JsonProperty(value = "bgpConfiguration")
    private BgpConfiguration bgpConfiguration;

    /*
     * ARM resource ID of importRoutePolicy.
     */
    @JsonProperty(value = "importRoutePolicyId")
    private String importRoutePolicyId;

    /*
     * ARM resource ID of importRoutePolicy.
     */
    @JsonProperty(value = "exportRoutePolicyId")
    private String exportRoutePolicyId;

    /** Creates an instance of InternalNetworkProperties class. */
    public InternalNetworkProperties() {
    }

    /**
     * Get the disabledOnResources property: List of resources the InternalNetwork is disabled on. Can be either entire
     * NetworkFabric or NetworkRack.
     *
     * @return the disabledOnResources value.
     */
    public List<String> disabledOnResources() {
        return this.disabledOnResources;
    }

    /**
     * Get the administrativeState property: Administrative state of the InternalNetwork. Example: Enabled | Disabled.
     *
     * @return the administrativeState value.
     */
    public EnabledDisabledState administrativeState() {
        return this.administrativeState;
    }

    /**
     * Get the bgpDisabledOnResources property: List of resources the BGP is disabled on. Can be either entire
     * NetworkFabric or NetworkRack.
     *
     * @return the bgpDisabledOnResources value.
     */
    public List<String> bgpDisabledOnResources() {
        return this.bgpDisabledOnResources;
    }

    /**
     * Get the bfdDisabledOnResources property: List of resources the BFD for BGP is disabled on. Can be either entire
     * NetworkFabric or NetworkRack.
     *
     * @return the bfdDisabledOnResources value.
     */
    public List<String> bfdDisabledOnResources() {
        return this.bfdDisabledOnResources;
    }

    /**
     * Get the bfdForStaticRoutesDisabledOnResources property: List of resources the BFD of StaticRoutes is disabled on.
     * Can be either entire NetworkFabric or NetworkRack.
     *
     * @return the bfdForStaticRoutesDisabledOnResources value.
     */
    public List<String> bfdForStaticRoutesDisabledOnResources() {
        return this.bfdForStaticRoutesDisabledOnResources;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the vlanId property: Vlan identifier. Example: 1001.
     *
     * @return the vlanId value.
     */
    public int vlanId() {
        return this.vlanId;
    }

    /**
     * Set the vlanId property: Vlan identifier. Example: 1001.
     *
     * @param vlanId the vlanId value to set.
     * @return the InternalNetworkProperties object itself.
     */
    public InternalNetworkProperties withVlanId(int vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get the mtu property: Maximum transmission unit. Default value is 1500.
     *
     * @return the mtu value.
     */
    public Integer mtu() {
        return this.mtu;
    }

    /**
     * Set the mtu property: Maximum transmission unit. Default value is 1500.
     *
     * @param mtu the mtu value to set.
     * @return the InternalNetworkProperties object itself.
     */
    public InternalNetworkProperties withMtu(Integer mtu) {
        this.mtu = mtu;
        return this;
    }

    /**
     * Get the connectedIPv4Subnets property: List with object connected IPv4 Subnets.
     *
     * @return the connectedIPv4Subnets value.
     */
    public List<ConnectedSubnet> connectedIPv4Subnets() {
        return this.connectedIPv4Subnets;
    }

    /**
     * Set the connectedIPv4Subnets property: List with object connected IPv4 Subnets.
     *
     * @param connectedIPv4Subnets the connectedIPv4Subnets value to set.
     * @return the InternalNetworkProperties object itself.
     */
    public InternalNetworkProperties withConnectedIPv4Subnets(List<ConnectedSubnet> connectedIPv4Subnets) {
        this.connectedIPv4Subnets = connectedIPv4Subnets;
        return this;
    }

    /**
     * Get the connectedIPv6Subnets property: List with object connected IPv6 Subnets.
     *
     * @return the connectedIPv6Subnets value.
     */
    public List<ConnectedSubnet> connectedIPv6Subnets() {
        return this.connectedIPv6Subnets;
    }

    /**
     * Set the connectedIPv6Subnets property: List with object connected IPv6 Subnets.
     *
     * @param connectedIPv6Subnets the connectedIPv6Subnets value to set.
     * @return the InternalNetworkProperties object itself.
     */
    public InternalNetworkProperties withConnectedIPv6Subnets(List<ConnectedSubnet> connectedIPv6Subnets) {
        this.connectedIPv6Subnets = connectedIPv6Subnets;
        return this;
    }

    /**
     * Get the staticRouteConfiguration property: Static Route Configuration properties.
     *
     * @return the staticRouteConfiguration value.
     */
    public StaticRouteConfiguration staticRouteConfiguration() {
        return this.staticRouteConfiguration;
    }

    /**
     * Set the staticRouteConfiguration property: Static Route Configuration properties.
     *
     * @param staticRouteConfiguration the staticRouteConfiguration value to set.
     * @return the InternalNetworkProperties object itself.
     */
    public InternalNetworkProperties withStaticRouteConfiguration(StaticRouteConfiguration staticRouteConfiguration) {
        this.staticRouteConfiguration = staticRouteConfiguration;
        return this;
    }

    /**
     * Get the bgpConfiguration property: BGP configuration properties.
     *
     * @return the bgpConfiguration value.
     */
    public BgpConfiguration bgpConfiguration() {
        return this.bgpConfiguration;
    }

    /**
     * Set the bgpConfiguration property: BGP configuration properties.
     *
     * @param bgpConfiguration the bgpConfiguration value to set.
     * @return the InternalNetworkProperties object itself.
     */
    public InternalNetworkProperties withBgpConfiguration(BgpConfiguration bgpConfiguration) {
        this.bgpConfiguration = bgpConfiguration;
        return this;
    }

    /**
     * Get the importRoutePolicyId property: ARM resource ID of importRoutePolicy.
     *
     * @return the importRoutePolicyId value.
     */
    public String importRoutePolicyId() {
        return this.importRoutePolicyId;
    }

    /**
     * Set the importRoutePolicyId property: ARM resource ID of importRoutePolicy.
     *
     * @param importRoutePolicyId the importRoutePolicyId value to set.
     * @return the InternalNetworkProperties object itself.
     */
    public InternalNetworkProperties withImportRoutePolicyId(String importRoutePolicyId) {
        this.importRoutePolicyId = importRoutePolicyId;
        return this;
    }

    /**
     * Get the exportRoutePolicyId property: ARM resource ID of importRoutePolicy.
     *
     * @return the exportRoutePolicyId value.
     */
    public String exportRoutePolicyId() {
        return this.exportRoutePolicyId;
    }

    /**
     * Set the exportRoutePolicyId property: ARM resource ID of importRoutePolicy.
     *
     * @param exportRoutePolicyId the exportRoutePolicyId value to set.
     * @return the InternalNetworkProperties object itself.
     */
    public InternalNetworkProperties withExportRoutePolicyId(String exportRoutePolicyId) {
        this.exportRoutePolicyId = exportRoutePolicyId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InternalNetworkProperties withAnnotation(String annotation) {
        super.withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (connectedIPv4Subnets() != null) {
            connectedIPv4Subnets().forEach(e -> e.validate());
        }
        if (connectedIPv6Subnets() != null) {
            connectedIPv6Subnets().forEach(e -> e.validate());
        }
        if (staticRouteConfiguration() != null) {
            staticRouteConfiguration().validate();
        }
        if (bgpConfiguration() != null) {
            bgpConfiguration().validate();
        }
    }
}