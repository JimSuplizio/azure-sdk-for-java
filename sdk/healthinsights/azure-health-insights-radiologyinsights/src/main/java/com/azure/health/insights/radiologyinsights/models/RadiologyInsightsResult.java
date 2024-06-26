// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.models.ResponseError;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Response for the Radiology Insights request.
 */
@Immutable
public final class RadiologyInsightsResult {

    /*
     * The unique ID of the operation.
     */
    @Generated
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The status of the operation
     */
    @Generated
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private JobStatus status;

    /*
     * The date and time when the processing job was created.
     */
    @Generated
    @JsonProperty(value = "createdDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDateTime;

    /*
     * The date and time when the processing job is set to expire.
     */
    @Generated
    @JsonProperty(value = "expirationDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expirationDateTime;

    /*
     * The date and time when the processing job was last updated.
     */
    @Generated
    @JsonProperty(value = "lastUpdateDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdateDateTime;

    /*
     * Error object that describes the error when status is "Failed".
     */
    @Generated
    @JsonProperty(value = "error")
    private ResponseError error;

    /*
     * The result of the operation.
     */
    @Generated
    @JsonProperty(value = "result")
    private RadiologyInsightsInferenceResult result;

    /**
     * Creates an instance of RadiologyInsightsResult class.
     */
    @Generated
    private RadiologyInsightsResult() {
    }

    /**
     * Get the id property: The unique ID of the operation.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the status property: The status of the operation.
     *
     * @return the status value.
     */
    @Generated
    public JobStatus getStatus() {
        return this.status;
    }

    /**
     * Get the createdDateTime property: The date and time when the processing job was created.
     *
     * @return the createdDateTime value.
     */
    @Generated
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the expirationDateTime property: The date and time when the processing job is set to expire.
     *
     * @return the expirationDateTime value.
     */
    @Generated
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }

    /**
     * Get the lastUpdateDateTime property: The date and time when the processing job was last updated.
     *
     * @return the lastUpdateDateTime value.
     */
    @Generated
    public OffsetDateTime getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }

    /**
     * Get the error property: Error object that describes the error when status is "Failed".
     *
     * @return the error value.
     */
    @Generated
    public ResponseError getError() {
        return this.error;
    }

    /**
     * Get the result property: The result of the operation.
     *
     * @return the result value.
     */
    @Generated
    public RadiologyInsightsInferenceResult getResult() {
        return this.result;
    }
}
