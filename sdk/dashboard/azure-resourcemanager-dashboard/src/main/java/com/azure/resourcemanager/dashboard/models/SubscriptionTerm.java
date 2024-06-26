// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The current billing term of the SaaS Subscription.
 */
@Fluent
public final class SubscriptionTerm {
    /*
     * The unit of the billing term.
     */
    @JsonProperty(value = "termUnit")
    private String termUnit;

    /*
     * The date and time in UTC of when the billing term starts.
     */
    @JsonProperty(value = "startDate")
    private OffsetDateTime startDate;

    /*
     * The date and time in UTC of when the billing term ends.
     */
    @JsonProperty(value = "endDate")
    private OffsetDateTime endDate;

    /**
     * Creates an instance of SubscriptionTerm class.
     */
    public SubscriptionTerm() {
    }

    /**
     * Get the termUnit property: The unit of the billing term.
     * 
     * @return the termUnit value.
     */
    public String termUnit() {
        return this.termUnit;
    }

    /**
     * Set the termUnit property: The unit of the billing term.
     * 
     * @param termUnit the termUnit value to set.
     * @return the SubscriptionTerm object itself.
     */
    public SubscriptionTerm withTermUnit(String termUnit) {
        this.termUnit = termUnit;
        return this;
    }

    /**
     * Get the startDate property: The date and time in UTC of when the billing term starts.
     * 
     * @return the startDate value.
     */
    public OffsetDateTime startDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: The date and time in UTC of when the billing term starts.
     * 
     * @param startDate the startDate value to set.
     * @return the SubscriptionTerm object itself.
     */
    public SubscriptionTerm withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the endDate property: The date and time in UTC of when the billing term ends.
     * 
     * @return the endDate value.
     */
    public OffsetDateTime endDate() {
        return this.endDate;
    }

    /**
     * Set the endDate property: The date and time in UTC of when the billing term ends.
     * 
     * @param endDate the endDate value to set.
     * @return the SubscriptionTerm object itself.
     */
    public SubscriptionTerm withEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
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
