// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Azure resource identifier.
 */
@Immutable
public final class AzureResourceIdentifier extends ResourceIdentifier {
    /*
     * There can be multiple identifiers of different type per alert, this field specify the identifier type.
     */
    private ResourceIdentifierType type = ResourceIdentifierType.AZURE_RESOURCE;

    /*
     * ARM resource identifier for the cloud resource being alerted on
     */
    private String azureResourceId;

    /**
     * Creates an instance of AzureResourceIdentifier class.
     */
    public AzureResourceIdentifier() {
    }

    /**
     * Get the type property: There can be multiple identifiers of different type per alert, this field specify the
     * identifier type.
     * 
     * @return the type value.
     */
    @Override
    public ResourceIdentifierType type() {
        return this.type;
    }

    /**
     * Get the azureResourceId property: ARM resource identifier for the cloud resource being alerted on.
     * 
     * @return the azureResourceId value.
     */
    public String azureResourceId() {
        return this.azureResourceId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureResourceIdentifier from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureResourceIdentifier if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureResourceIdentifier.
     */
    public static AzureResourceIdentifier fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureResourceIdentifier deserializedAzureResourceIdentifier = new AzureResourceIdentifier();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedAzureResourceIdentifier.type = ResourceIdentifierType.fromString(reader.getString());
                } else if ("azureResourceId".equals(fieldName)) {
                    deserializedAzureResourceIdentifier.azureResourceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureResourceIdentifier;
        });
    }
}
