// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureadexternalidentities.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.azureadexternalidentities.fluent.models.B2CTenantResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The collection of Azure AD B2C tenant resources. */
@Immutable
public final class B2CTenantResourceList {
    /*
     * List of Azure AD B2C tenant resources
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<B2CTenantResourceInner> value;

    /**
     * Get the value property: List of Azure AD B2C tenant resources.
     *
     * @return the value value.
     */
    public List<B2CTenantResourceInner> value() {
        return this.value;
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
