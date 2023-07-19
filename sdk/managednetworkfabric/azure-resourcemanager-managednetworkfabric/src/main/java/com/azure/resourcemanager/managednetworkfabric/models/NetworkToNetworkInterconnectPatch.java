// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkToNetworkInterconnectPatchableProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Network To Network Interconnect resource patch definition. */
@Fluent
public final class NetworkToNetworkInterconnectPatch extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private NetworkToNetworkInterconnectPatchableProperties innerProperties;

    /** Creates an instance of NetworkToNetworkInterconnectPatch class. */
    public NetworkToNetworkInterconnectPatch() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private NetworkToNetworkInterconnectPatchableProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the layer2Configuration property: Common properties for Layer2Configuration.
     *
     * @return the layer2Configuration value.
     */
    public Layer2Configuration layer2Configuration() {
        return this.innerProperties() == null ? null : this.innerProperties().layer2Configuration();
    }

    /**
     * Set the layer2Configuration property: Common properties for Layer2Configuration.
     *
     * @param layer2Configuration the layer2Configuration value to set.
     * @return the NetworkToNetworkInterconnectPatch object itself.
     */
    public NetworkToNetworkInterconnectPatch withLayer2Configuration(Layer2Configuration layer2Configuration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkToNetworkInterconnectPatchableProperties();
        }
        this.innerProperties().withLayer2Configuration(layer2Configuration);
        return this;
    }

    /**
     * Get the optionBLayer3Configuration property: Common properties for Layer3Configuration.
     *
     * @return the optionBLayer3Configuration value.
     */
    public OptionBLayer3Configuration optionBLayer3Configuration() {
        return this.innerProperties() == null ? null : this.innerProperties().optionBLayer3Configuration();
    }

    /**
     * Set the optionBLayer3Configuration property: Common properties for Layer3Configuration.
     *
     * @param optionBLayer3Configuration the optionBLayer3Configuration value to set.
     * @return the NetworkToNetworkInterconnectPatch object itself.
     */
    public NetworkToNetworkInterconnectPatch withOptionBLayer3Configuration(
        OptionBLayer3Configuration optionBLayer3Configuration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkToNetworkInterconnectPatchableProperties();
        }
        this.innerProperties().withOptionBLayer3Configuration(optionBLayer3Configuration);
        return this;
    }

    /**
     * Get the npbStaticRouteConfiguration property: NPB Static Route Configuration properties.
     *
     * @return the npbStaticRouteConfiguration value.
     */
    public NpbStaticRouteConfiguration npbStaticRouteConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().npbStaticRouteConfiguration();
    }

    /**
     * Set the npbStaticRouteConfiguration property: NPB Static Route Configuration properties.
     *
     * @param npbStaticRouteConfiguration the npbStaticRouteConfiguration value to set.
     * @return the NetworkToNetworkInterconnectPatch object itself.
     */
    public NetworkToNetworkInterconnectPatch withNpbStaticRouteConfiguration(
        NpbStaticRouteConfiguration npbStaticRouteConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkToNetworkInterconnectPatchableProperties();
        }
        this.innerProperties().withNpbStaticRouteConfiguration(npbStaticRouteConfiguration);
        return this;
    }

    /**
     * Get the importRoutePolicy property: Import Route Policy information.
     *
     * @return the importRoutePolicy value.
     */
    public ImportRoutePolicyInformation importRoutePolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().importRoutePolicy();
    }

    /**
     * Set the importRoutePolicy property: Import Route Policy information.
     *
     * @param importRoutePolicy the importRoutePolicy value to set.
     * @return the NetworkToNetworkInterconnectPatch object itself.
     */
    public NetworkToNetworkInterconnectPatch withImportRoutePolicy(ImportRoutePolicyInformation importRoutePolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkToNetworkInterconnectPatchableProperties();
        }
        this.innerProperties().withImportRoutePolicy(importRoutePolicy);
        return this;
    }

    /**
     * Get the exportRoutePolicy property: Export Route Policy information.
     *
     * @return the exportRoutePolicy value.
     */
    public ExportRoutePolicyInformation exportRoutePolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().exportRoutePolicy();
    }

    /**
     * Set the exportRoutePolicy property: Export Route Policy information.
     *
     * @param exportRoutePolicy the exportRoutePolicy value to set.
     * @return the NetworkToNetworkInterconnectPatch object itself.
     */
    public NetworkToNetworkInterconnectPatch withExportRoutePolicy(ExportRoutePolicyInformation exportRoutePolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkToNetworkInterconnectPatchableProperties();
        }
        this.innerProperties().withExportRoutePolicy(exportRoutePolicy);
        return this;
    }

    /**
     * Get the egressAclId property: Egress Acl. ARM resource ID of Access Control Lists.
     *
     * @return the egressAclId value.
     */
    public String egressAclId() {
        return this.innerProperties() == null ? null : this.innerProperties().egressAclId();
    }

    /**
     * Set the egressAclId property: Egress Acl. ARM resource ID of Access Control Lists.
     *
     * @param egressAclId the egressAclId value to set.
     * @return the NetworkToNetworkInterconnectPatch object itself.
     */
    public NetworkToNetworkInterconnectPatch withEgressAclId(String egressAclId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkToNetworkInterconnectPatchableProperties();
        }
        this.innerProperties().withEgressAclId(egressAclId);
        return this;
    }

    /**
     * Get the ingressAclId property: Ingress Acl. ARM resource ID of Access Control Lists.
     *
     * @return the ingressAclId value.
     */
    public String ingressAclId() {
        return this.innerProperties() == null ? null : this.innerProperties().ingressAclId();
    }

    /**
     * Set the ingressAclId property: Ingress Acl. ARM resource ID of Access Control Lists.
     *
     * @param ingressAclId the ingressAclId value to set.
     * @return the NetworkToNetworkInterconnectPatch object itself.
     */
    public NetworkToNetworkInterconnectPatch withIngressAclId(String ingressAclId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkToNetworkInterconnectPatchableProperties();
        }
        this.innerProperties().withIngressAclId(ingressAclId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}