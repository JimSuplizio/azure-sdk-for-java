// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the control plane nodes of the provisioned cluster.
 */
@Fluent
public final class ControlPlaneProfile {
    /*
     * Number of control plane nodes. The default value is 1, and the count should be an odd number
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * VM sku size of the control plane nodes
     */
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /*
     * IP Address of the Kubernetes API server
     */
    @JsonProperty(value = "controlPlaneEndpoint")
    private ControlPlaneProfileControlPlaneEndpoint controlPlaneEndpoint;

    /**
     * Creates an instance of ControlPlaneProfile class.
     */
    public ControlPlaneProfile() {
    }

    /**
     * Get the count property: Number of control plane nodes. The default value is 1, and the count should be an odd
     * number.
     * 
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Number of control plane nodes. The default value is 1, and the count should be an odd
     * number.
     * 
     * @param count the count value to set.
     * @return the ControlPlaneProfile object itself.
     */
    public ControlPlaneProfile withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the vmSize property: VM sku size of the control plane nodes.
     * 
     * @return the vmSize value.
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: VM sku size of the control plane nodes.
     * 
     * @param vmSize the vmSize value to set.
     * @return the ControlPlaneProfile object itself.
     */
    public ControlPlaneProfile withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the controlPlaneEndpoint property: IP Address of the Kubernetes API server.
     * 
     * @return the controlPlaneEndpoint value.
     */
    public ControlPlaneProfileControlPlaneEndpoint controlPlaneEndpoint() {
        return this.controlPlaneEndpoint;
    }

    /**
     * Set the controlPlaneEndpoint property: IP Address of the Kubernetes API server.
     * 
     * @param controlPlaneEndpoint the controlPlaneEndpoint value to set.
     * @return the ControlPlaneProfile object itself.
     */
    public ControlPlaneProfile withControlPlaneEndpoint(ControlPlaneProfileControlPlaneEndpoint controlPlaneEndpoint) {
        this.controlPlaneEndpoint = controlPlaneEndpoint;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (controlPlaneEndpoint() != null) {
            controlPlaneEndpoint().validate();
        }
    }
}
