// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response from the List SAP Landscape Monitor Dashboard operation. */
@Fluent
public final class SapLandscapeMonitorListResultInner {
    /*
     * The list of Sap Landscape Monitor configuration.
     */
    @JsonProperty(value = "value")
    private List<SapLandscapeMonitorInner> value;

    /*
     * The URL to get the next set of SAP Landscape Monitor Dashboard.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of SapLandscapeMonitorListResultInner class. */
    public SapLandscapeMonitorListResultInner() {
    }

    /**
     * Get the value property: The list of Sap Landscape Monitor configuration.
     *
     * @return the value value.
     */
    public List<SapLandscapeMonitorInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Sap Landscape Monitor configuration.
     *
     * @param value the value value to set.
     * @return the SapLandscapeMonitorListResultInner object itself.
     */
    public SapLandscapeMonitorListResultInner withValue(List<SapLandscapeMonitorInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of SAP Landscape Monitor Dashboard.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of SAP Landscape Monitor Dashboard.
     *
     * @param nextLink the nextLink value to set.
     * @return the SapLandscapeMonitorListResultInner object itself.
     */
    public SapLandscapeMonitorListResultInner withNextLink(String nextLink) {
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
