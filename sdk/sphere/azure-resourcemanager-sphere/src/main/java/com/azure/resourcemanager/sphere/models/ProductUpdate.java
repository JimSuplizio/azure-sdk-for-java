// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sphere.fluent.models.ProductUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The type used for update operations of the Product. */
@Fluent
public final class ProductUpdate {
    /*
     * The updatable properties of the Product.
     */
    @JsonProperty(value = "properties")
    private ProductUpdateProperties innerProperties;

    /** Creates an instance of ProductUpdate class. */
    public ProductUpdate() {
    }

    /**
     * Get the innerProperties property: The updatable properties of the Product.
     *
     * @return the innerProperties value.
     */
    private ProductUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: Description of the product.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of the product.
     *
     * @param description the description value to set.
     * @return the ProductUpdate object itself.
     */
    public ProductUpdate withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProductUpdateProperties();
        }
        this.innerProperties().withDescription(description);
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