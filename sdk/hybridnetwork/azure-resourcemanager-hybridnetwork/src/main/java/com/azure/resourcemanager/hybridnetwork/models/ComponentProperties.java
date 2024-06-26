// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The component properties of the network function.
 */
@Immutable
public final class ComponentProperties {
    /*
     * The provisioning state of the component resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The JSON-serialized deployment profile of the component resource.
     */
    @JsonProperty(value = "deploymentProfile", access = JsonProperty.Access.WRITE_ONLY)
    private String deploymentProfile;

    /*
     * The deployment status of the component resource.
     */
    @JsonProperty(value = "deploymentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentStatusProperties deploymentStatus;

    /**
     * Creates an instance of ComponentProperties class.
     */
    public ComponentProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the component resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentProfile property: The JSON-serialized deployment profile of the component resource.
     * 
     * @return the deploymentProfile value.
     */
    public String deploymentProfile() {
        return this.deploymentProfile;
    }

    /**
     * Get the deploymentStatus property: The deployment status of the component resource.
     * 
     * @return the deploymentStatus value.
     */
    public DeploymentStatusProperties deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deploymentStatus() != null) {
            deploymentStatus().validate();
        }
    }
}
