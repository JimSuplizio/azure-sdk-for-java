// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Summary for an orchestration service of a virtual machine scale set.
 */
@Immutable
public final class OrchestrationServiceSummary implements JsonSerializable<OrchestrationServiceSummary> {
    /*
     * The name of the service.
     */
    private OrchestrationServiceNames serviceName;

    /*
     * The current state of the service.
     */
    private OrchestrationServiceState serviceState;

    /**
     * Creates an instance of OrchestrationServiceSummary class.
     */
    public OrchestrationServiceSummary() {
    }

    /**
     * Get the serviceName property: The name of the service.
     * 
     * @return the serviceName value.
     */
    public OrchestrationServiceNames serviceName() {
        return this.serviceName;
    }

    /**
     * Get the serviceState property: The current state of the service.
     * 
     * @return the serviceState value.
     */
    public OrchestrationServiceState serviceState() {
        return this.serviceState;
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
     * Reads an instance of OrchestrationServiceSummary from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OrchestrationServiceSummary if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OrchestrationServiceSummary.
     */
    public static OrchestrationServiceSummary fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OrchestrationServiceSummary deserializedOrchestrationServiceSummary = new OrchestrationServiceSummary();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serviceName".equals(fieldName)) {
                    deserializedOrchestrationServiceSummary.serviceName
                        = OrchestrationServiceNames.fromString(reader.getString());
                } else if ("serviceState".equals(fieldName)) {
                    deserializedOrchestrationServiceSummary.serviceState
                        = OrchestrationServiceState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOrchestrationServiceSummary;
        });
    }
}
