// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The details of the event associated with a prefix. */
@Immutable
public final class PeeringServicePrefixEvent {
    /*
     * The timestamp of the event associated with a prefix.
     */
    @JsonProperty(value = "eventTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime eventTimestamp;

    /*
     * The type of the event associated with a prefix.
     */
    @JsonProperty(value = "eventType", access = JsonProperty.Access.WRITE_ONLY)
    private String eventType;

    /*
     * The summary of the event associated with a prefix.
     */
    @JsonProperty(value = "eventSummary", access = JsonProperty.Access.WRITE_ONLY)
    private String eventSummary;

    /*
     * The level of the event associated with a prefix.
     */
    @JsonProperty(value = "eventLevel", access = JsonProperty.Access.WRITE_ONLY)
    private String eventLevel;

    /*
     * The description of the event associated with a prefix.
     */
    @JsonProperty(value = "eventDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String eventDescription;

    /** Creates an instance of PeeringServicePrefixEvent class. */
    public PeeringServicePrefixEvent() {
    }

    /**
     * Get the eventTimestamp property: The timestamp of the event associated with a prefix.
     *
     * @return the eventTimestamp value.
     */
    public OffsetDateTime eventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * Get the eventType property: The type of the event associated with a prefix.
     *
     * @return the eventType value.
     */
    public String eventType() {
        return this.eventType;
    }

    /**
     * Get the eventSummary property: The summary of the event associated with a prefix.
     *
     * @return the eventSummary value.
     */
    public String eventSummary() {
        return this.eventSummary;
    }

    /**
     * Get the eventLevel property: The level of the event associated with a prefix.
     *
     * @return the eventLevel value.
     */
    public String eventLevel() {
        return this.eventLevel;
    }

    /**
     * Get the eventDescription property: The description of the event associated with a prefix.
     *
     * @return the eventDescription value.
     */
    public String eventDescription() {
        return this.eventDescription;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
