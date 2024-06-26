// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Flexible server edition capabilities.
 */
@Immutable
public final class FlexibleServerEditionCapability extends CapabilityBase {
    /*
     * Server edition name
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Default sku name for the server edition
     */
    @JsonProperty(value = "defaultSkuName", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultSkuName;

    /*
     * The list of editions supported by this server edition.
     */
    @JsonProperty(value = "supportedStorageEditions", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageEditionCapability> supportedStorageEditions;

    /*
     * List of supported server SKUs.
     */
    @JsonProperty(value = "supportedServerSkus", access = JsonProperty.Access.WRITE_ONLY)
    private List<ServerSkuCapability> supportedServerSkus;

    /**
     * Creates an instance of FlexibleServerEditionCapability class.
     */
    public FlexibleServerEditionCapability() {
    }

    /**
     * Get the name property: Server edition name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the defaultSkuName property: Default sku name for the server edition.
     * 
     * @return the defaultSkuName value.
     */
    public String defaultSkuName() {
        return this.defaultSkuName;
    }

    /**
     * Get the supportedStorageEditions property: The list of editions supported by this server edition.
     * 
     * @return the supportedStorageEditions value.
     */
    public List<StorageEditionCapability> supportedStorageEditions() {
        return this.supportedStorageEditions;
    }

    /**
     * Get the supportedServerSkus property: List of supported server SKUs.
     * 
     * @return the supportedServerSkus value.
     */
    public List<ServerSkuCapability> supportedServerSkus() {
        return this.supportedServerSkus;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (supportedStorageEditions() != null) {
            supportedStorageEditions().forEach(e -> e.validate());
        }
        if (supportedServerSkus() != null) {
            supportedServerSkus().forEach(e -> e.validate());
        }
    }
}
