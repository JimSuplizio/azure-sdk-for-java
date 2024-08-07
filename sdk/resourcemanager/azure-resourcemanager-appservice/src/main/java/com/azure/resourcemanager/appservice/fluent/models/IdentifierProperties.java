// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Identifier resource specific properties.
 */
@Fluent
public final class IdentifierProperties implements JsonSerializable<IdentifierProperties> {
    /*
     * String representation of the identity.
     */
    private String value;

    /**
     * Creates an instance of IdentifierProperties class.
     */
    public IdentifierProperties() {
    }

    /**
     * Get the value property: String representation of the identity.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: String representation of the identity.
     * 
     * @param value the value value to set.
     * @return the IdentifierProperties object itself.
     */
    public IdentifierProperties withValue(String value) {
        this.value = value;
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
        jsonWriter.writeStringField("id", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IdentifierProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IdentifierProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IdentifierProperties.
     */
    public static IdentifierProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IdentifierProperties deserializedIdentifierProperties = new IdentifierProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedIdentifierProperties.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIdentifierProperties;
        });
    }
}
