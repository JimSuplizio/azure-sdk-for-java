// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A VM scanning configuration for a security offering of a Aws environment.
 */
@Fluent
public class VmScannersAws extends VmScannersBase {
    /*
     * The cloud role ARN in AWS for this feature
     */
    @JsonProperty(value = "cloudRoleArn")
    private String cloudRoleArn;

    /**
     * Creates an instance of VmScannersAws class.
     */
    public VmScannersAws() {
    }

    /**
     * Get the cloudRoleArn property: The cloud role ARN in AWS for this feature.
     * 
     * @return the cloudRoleArn value.
     */
    public String cloudRoleArn() {
        return this.cloudRoleArn;
    }

    /**
     * Set the cloudRoleArn property: The cloud role ARN in AWS for this feature.
     * 
     * @param cloudRoleArn the cloudRoleArn value to set.
     * @return the VmScannersAws object itself.
     */
    public VmScannersAws withCloudRoleArn(String cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VmScannersAws withEnabled(Boolean enabled) {
        super.withEnabled(enabled);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VmScannersAws withConfiguration(VmScannersBaseConfiguration configuration) {
        super.withConfiguration(configuration);
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
    }
}
