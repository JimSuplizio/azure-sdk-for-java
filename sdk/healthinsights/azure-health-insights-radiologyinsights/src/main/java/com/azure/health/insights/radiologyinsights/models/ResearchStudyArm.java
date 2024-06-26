// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResearchStudyArm model.
 */
@Immutable
public final class ResearchStudyArm {

    /*
     * Label for study arm
     */
    @Generated
    @JsonProperty(value = "name")
    private final String name;

    /*
     * Categorization of study arm
     */
    @Generated
    @JsonProperty(value = "type")
    private FhirR4CodeableConcept type;

    /*
     * Short explanation of study path
     */
    @Generated
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of ResearchStudyArm class.
     *
     * @param name the name value to set.
     */
    @Generated
    @JsonCreator
    private ResearchStudyArm(@JsonProperty(value = "name") String name) {
        this.name = name;
    }

    /**
     * Get the name property: Label for study arm.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the type property: Categorization of study arm.
     *
     * @return the type value.
     */
    @Generated
    public FhirR4CodeableConcept getType() {
        return this.type;
    }

    /**
     * Get the description property: Short explanation of study path.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }
}
