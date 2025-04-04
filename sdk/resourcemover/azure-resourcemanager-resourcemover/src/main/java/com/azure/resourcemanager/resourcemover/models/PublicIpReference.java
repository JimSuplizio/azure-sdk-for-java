// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines reference to a public IP.
 */
@Fluent
public final class PublicIpReference extends AzureResourceReference {
    /**
     * Creates an instance of PublicIpReference class.
     */
    public PublicIpReference() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PublicIpReference withSourceArmResourceId(String sourceArmResourceId) {
        super.withSourceArmResourceId(sourceArmResourceId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (sourceArmResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sourceArmResourceId in model PublicIpReference"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PublicIpReference.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sourceArmResourceId", sourceArmResourceId());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PublicIpReference from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PublicIpReference if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PublicIpReference.
     */
    public static PublicIpReference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PublicIpReference deserializedPublicIpReference = new PublicIpReference();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceArmResourceId".equals(fieldName)) {
                    deserializedPublicIpReference.withSourceArmResourceId(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPublicIpReference;
        });
    }
}
