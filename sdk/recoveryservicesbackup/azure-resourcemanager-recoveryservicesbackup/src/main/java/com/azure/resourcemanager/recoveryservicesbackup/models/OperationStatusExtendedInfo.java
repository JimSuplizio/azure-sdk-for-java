// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Base class for additional information of operation status.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "objectType",
    defaultImpl = OperationStatusExtendedInfo.class,
    visible = true)
@JsonTypeName("OperationStatusExtendedInfo")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "OperationStatusJobExtendedInfo", value = OperationStatusJobExtendedInfo.class),
    @JsonSubTypes.Type(name = "OperationStatusJobsExtendedInfo", value = OperationStatusJobsExtendedInfo.class),
    @JsonSubTypes.Type(
        name = "OperationStatusProvisionILRExtendedInfo",
        value = OperationStatusProvisionIlrExtendedInfo.class),
    @JsonSubTypes.Type(
        name = "OperationStatusValidateOperationExtendedInfo",
        value = OperationStatusValidateOperationExtendedInfo.class) })
@Immutable
public class OperationStatusExtendedInfo {
    /*
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     */
    @JsonTypeId
    @JsonProperty(value = "objectType", required = true)
    private String objectType;

    /**
     * Creates an instance of OperationStatusExtendedInfo class.
     */
    public OperationStatusExtendedInfo() {
        this.objectType = "OperationStatusExtendedInfo";
    }

    /**
     * Get the objectType property: This property will be used as the discriminator for deciding the specific types in
     * the polymorphic chain of types.
     * 
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
