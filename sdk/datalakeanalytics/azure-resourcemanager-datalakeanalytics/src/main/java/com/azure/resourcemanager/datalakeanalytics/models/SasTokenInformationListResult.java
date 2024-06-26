// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.SasTokenInformationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SAS response that contains the storage account, container and associated SAS token for connection use. */
@Immutable
public final class SasTokenInformationListResult {
    /*
     * The results of the list operation.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<SasTokenInformationInner> value;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of SasTokenInformationListResult class. */
    public SasTokenInformationListResult() {
    }

    /**
     * Get the value property: The results of the list operation.
     *
     * @return the value value.
     */
    public List<SasTokenInformationInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
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
