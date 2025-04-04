// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This is the executed Validation.
 */
@Fluent
public final class ExecutedValidation implements JsonSerializable<ExecutedValidation> {
    /*
     * This property specifies the type of image version validation.
     */
    private String type;

    /*
     * This property specifies the status of the validationProfile of the image version.
     */
    private ValidationStatus status;

    /*
     * This property specifies the valid version of the validation.
     */
    private String version;

    /*
     * This property specifies the starting timestamp.
     */
    private OffsetDateTime executionTime;

    /**
     * Creates an instance of ExecutedValidation class.
     */
    public ExecutedValidation() {
    }

    /**
     * Get the type property: This property specifies the type of image version validation.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: This property specifies the type of image version validation.
     * 
     * @param type the type value to set.
     * @return the ExecutedValidation object itself.
     */
    public ExecutedValidation withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the status property: This property specifies the status of the validationProfile of the image version.
     * 
     * @return the status value.
     */
    public ValidationStatus status() {
        return this.status;
    }

    /**
     * Set the status property: This property specifies the status of the validationProfile of the image version.
     * 
     * @param status the status value to set.
     * @return the ExecutedValidation object itself.
     */
    public ExecutedValidation withStatus(ValidationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the version property: This property specifies the valid version of the validation.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: This property specifies the valid version of the validation.
     * 
     * @param version the version value to set.
     * @return the ExecutedValidation object itself.
     */
    public ExecutedValidation withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the executionTime property: This property specifies the starting timestamp.
     * 
     * @return the executionTime value.
     */
    public OffsetDateTime executionTime() {
        return this.executionTime;
    }

    /**
     * Set the executionTime property: This property specifies the starting timestamp.
     * 
     * @param executionTime the executionTime value to set.
     * @return the ExecutedValidation object itself.
     */
    public ExecutedValidation withExecutionTime(OffsetDateTime executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("version", this.version);
        jsonWriter.writeStringField("executionTime",
            this.executionTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.executionTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExecutedValidation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExecutedValidation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExecutedValidation.
     */
    public static ExecutedValidation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExecutedValidation deserializedExecutedValidation = new ExecutedValidation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedExecutedValidation.type = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedExecutedValidation.status = ValidationStatus.fromString(reader.getString());
                } else if ("version".equals(fieldName)) {
                    deserializedExecutedValidation.version = reader.getString();
                } else if ("executionTime".equals(fieldName)) {
                    deserializedExecutedValidation.executionTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExecutedValidation;
        });
    }
}
