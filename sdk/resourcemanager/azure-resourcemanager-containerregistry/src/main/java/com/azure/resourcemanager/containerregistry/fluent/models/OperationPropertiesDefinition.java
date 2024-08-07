// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerregistry.models.OperationServiceSpecificationDefinition;
import java.io.IOException;

/**
 * The definition of Azure Monitoring properties.
 */
@Fluent
public final class OperationPropertiesDefinition implements JsonSerializable<OperationPropertiesDefinition> {
    /*
     * The definition of Azure Monitoring service.
     */
    private OperationServiceSpecificationDefinition serviceSpecification;

    /**
     * Creates an instance of OperationPropertiesDefinition class.
     */
    public OperationPropertiesDefinition() {
    }

    /**
     * Get the serviceSpecification property: The definition of Azure Monitoring service.
     * 
     * @return the serviceSpecification value.
     */
    public OperationServiceSpecificationDefinition serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set the serviceSpecification property: The definition of Azure Monitoring service.
     * 
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the OperationPropertiesDefinition object itself.
     */
    public OperationPropertiesDefinition
        withServiceSpecification(OperationServiceSpecificationDefinition serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceSpecification() != null) {
            serviceSpecification().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("serviceSpecification", this.serviceSpecification);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationPropertiesDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationPropertiesDefinition if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationPropertiesDefinition.
     */
    public static OperationPropertiesDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationPropertiesDefinition deserializedOperationPropertiesDefinition
                = new OperationPropertiesDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serviceSpecification".equals(fieldName)) {
                    deserializedOperationPropertiesDefinition.serviceSpecification
                        = OperationServiceSpecificationDefinition.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationPropertiesDefinition;
        });
    }
}
