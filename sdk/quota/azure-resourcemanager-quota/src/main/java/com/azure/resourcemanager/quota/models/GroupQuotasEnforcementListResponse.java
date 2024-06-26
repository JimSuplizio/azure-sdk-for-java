// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.quota.fluent.models.GroupQuotasEnforcementResponseInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of Azure regions, where the group quotas is enabled for enforcement.
 */
@Fluent
public final class GroupQuotasEnforcementListResponse {
    /*
     * List of Azure Regions.
     */
    @JsonProperty(value = "value")
    private List<GroupQuotasEnforcementResponseInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of GroupQuotasEnforcementListResponse class.
     */
    public GroupQuotasEnforcementListResponse() {
    }

    /**
     * Get the value property: List of Azure Regions.
     * 
     * @return the value value.
     */
    public List<GroupQuotasEnforcementResponseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Azure Regions.
     * 
     * @param value the value value to set.
     * @return the GroupQuotasEnforcementListResponse object itself.
     */
    public GroupQuotasEnforcementListResponse withValue(List<GroupQuotasEnforcementResponseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
