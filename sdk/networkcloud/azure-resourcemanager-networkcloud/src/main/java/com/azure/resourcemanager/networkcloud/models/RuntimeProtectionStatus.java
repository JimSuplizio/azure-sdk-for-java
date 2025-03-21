// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * RuntimeProtectionStatus represents the runtime protection status of the bare metal machine.
 */
@Immutable
public final class RuntimeProtectionStatus implements JsonSerializable<RuntimeProtectionStatus> {
    /*
     * The timestamp when the malware definitions were last updated.
     */
    private OffsetDateTime definitionsLastUpdated;

    /*
     * The version of the malware definitions.
     */
    private String definitionsVersion;

    /*
     * The timestamp of the most recently completed scan, or empty if there has never been a scan.
     */
    private OffsetDateTime scanCompletedTime;

    /*
     * The timestamp of the most recently scheduled scan, or empty if no scan has been scheduled.
     */
    private OffsetDateTime scanScheduledTime;

    /*
     * The timestamp of the most recently started scan, or empty if there has never been a scan.
     */
    private OffsetDateTime scanStartedTime;

    /**
     * Creates an instance of RuntimeProtectionStatus class.
     */
    public RuntimeProtectionStatus() {
    }

    /**
     * Get the definitionsLastUpdated property: The timestamp when the malware definitions were last updated.
     * 
     * @return the definitionsLastUpdated value.
     */
    public OffsetDateTime definitionsLastUpdated() {
        return this.definitionsLastUpdated;
    }

    /**
     * Get the definitionsVersion property: The version of the malware definitions.
     * 
     * @return the definitionsVersion value.
     */
    public String definitionsVersion() {
        return this.definitionsVersion;
    }

    /**
     * Get the scanCompletedTime property: The timestamp of the most recently completed scan, or empty if there has
     * never been a scan.
     * 
     * @return the scanCompletedTime value.
     */
    public OffsetDateTime scanCompletedTime() {
        return this.scanCompletedTime;
    }

    /**
     * Get the scanScheduledTime property: The timestamp of the most recently scheduled scan, or empty if no scan has
     * been scheduled.
     * 
     * @return the scanScheduledTime value.
     */
    public OffsetDateTime scanScheduledTime() {
        return this.scanScheduledTime;
    }

    /**
     * Get the scanStartedTime property: The timestamp of the most recently started scan, or empty if there has never
     * been a scan.
     * 
     * @return the scanStartedTime value.
     */
    public OffsetDateTime scanStartedTime() {
        return this.scanStartedTime;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RuntimeProtectionStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RuntimeProtectionStatus if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RuntimeProtectionStatus.
     */
    public static RuntimeProtectionStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RuntimeProtectionStatus deserializedRuntimeProtectionStatus = new RuntimeProtectionStatus();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("definitionsLastUpdated".equals(fieldName)) {
                    deserializedRuntimeProtectionStatus.definitionsLastUpdated = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("definitionsVersion".equals(fieldName)) {
                    deserializedRuntimeProtectionStatus.definitionsVersion = reader.getString();
                } else if ("scanCompletedTime".equals(fieldName)) {
                    deserializedRuntimeProtectionStatus.scanCompletedTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("scanScheduledTime".equals(fieldName)) {
                    deserializedRuntimeProtectionStatus.scanScheduledTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("scanStartedTime".equals(fieldName)) {
                    deserializedRuntimeProtectionStatus.scanStartedTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRuntimeProtectionStatus;
        });
    }
}
