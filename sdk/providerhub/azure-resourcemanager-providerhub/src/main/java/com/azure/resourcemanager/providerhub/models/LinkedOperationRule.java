// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The LinkedOperationRule model.
 */
@Fluent
public final class LinkedOperationRule implements JsonSerializable<LinkedOperationRule> {
    /*
     * The linkedOperation property.
     */
    private LinkedOperation linkedOperation;

    /*
     * The linkedAction property.
     */
    private LinkedAction linkedAction;

    /**
     * Creates an instance of LinkedOperationRule class.
     */
    public LinkedOperationRule() {
    }

    /**
     * Get the linkedOperation property: The linkedOperation property.
     * 
     * @return the linkedOperation value.
     */
    public LinkedOperation linkedOperation() {
        return this.linkedOperation;
    }

    /**
     * Set the linkedOperation property: The linkedOperation property.
     * 
     * @param linkedOperation the linkedOperation value to set.
     * @return the LinkedOperationRule object itself.
     */
    public LinkedOperationRule withLinkedOperation(LinkedOperation linkedOperation) {
        this.linkedOperation = linkedOperation;
        return this;
    }

    /**
     * Get the linkedAction property: The linkedAction property.
     * 
     * @return the linkedAction value.
     */
    public LinkedAction linkedAction() {
        return this.linkedAction;
    }

    /**
     * Set the linkedAction property: The linkedAction property.
     * 
     * @param linkedAction the linkedAction value to set.
     * @return the LinkedOperationRule object itself.
     */
    public LinkedOperationRule withLinkedAction(LinkedAction linkedAction) {
        this.linkedAction = linkedAction;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (linkedOperation() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property linkedOperation in model LinkedOperationRule"));
        }
        if (linkedAction() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property linkedAction in model LinkedOperationRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LinkedOperationRule.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("linkedOperation",
            this.linkedOperation == null ? null : this.linkedOperation.toString());
        jsonWriter.writeStringField("linkedAction", this.linkedAction == null ? null : this.linkedAction.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LinkedOperationRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LinkedOperationRule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LinkedOperationRule.
     */
    public static LinkedOperationRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LinkedOperationRule deserializedLinkedOperationRule = new LinkedOperationRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedOperation".equals(fieldName)) {
                    deserializedLinkedOperationRule.linkedOperation = LinkedOperation.fromString(reader.getString());
                } else if ("linkedAction".equals(fieldName)) {
                    deserializedLinkedOperationRule.linkedAction = LinkedAction.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLinkedOperationRule;
        });
    }
}
