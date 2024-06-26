// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters supplied to the Update Reference Data Set operation. */
@Fluent
public final class ReferenceDataSetUpdateParameters {
    /*
     * Key-value pairs of additional properties for the reference data set.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of ReferenceDataSetUpdateParameters class. */
    public ReferenceDataSetUpdateParameters() {
    }

    /**
     * Get the tags property: Key-value pairs of additional properties for the reference data set.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Key-value pairs of additional properties for the reference data set.
     *
     * @param tags the tags value to set.
     * @return the ReferenceDataSetUpdateParameters object itself.
     */
    public ReferenceDataSetUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
