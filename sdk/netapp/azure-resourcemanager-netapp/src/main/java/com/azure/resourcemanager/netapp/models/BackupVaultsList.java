// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.netapp.fluent.models.BackupVaultInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of Backup Vaults.
 */
@Fluent
public final class BackupVaultsList {
    /*
     * A list of Backup Vaults
     */
    @JsonProperty(value = "value")
    private List<BackupVaultInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of BackupVaultsList class.
     */
    public BackupVaultsList() {
    }

    /**
     * Get the value property: A list of Backup Vaults.
     * 
     * @return the value value.
     */
    public List<BackupVaultInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of Backup Vaults.
     * 
     * @param value the value value to set.
     * @return the BackupVaultsList object itself.
     */
    public BackupVaultsList withValue(List<BackupVaultInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the BackupVaultsList object itself.
     */
    public BackupVaultsList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
