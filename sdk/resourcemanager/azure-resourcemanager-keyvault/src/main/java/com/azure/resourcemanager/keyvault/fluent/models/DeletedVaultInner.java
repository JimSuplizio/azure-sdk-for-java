// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.keyvault.models.DeletedVaultProperties;
import java.io.IOException;

/**
 * Deleted vault information with extended details.
 */
@Fluent
public final class DeletedVaultInner implements JsonSerializable<DeletedVaultInner> {
    /*
     * The resource ID for the deleted key vault.
     */
    private String id;

    /*
     * The name of the key vault.
     */
    private String name;

    /*
     * The resource type of the key vault.
     */
    private String type;

    /*
     * Properties of the vault
     */
    private DeletedVaultProperties properties;

    /**
     * Creates an instance of DeletedVaultInner class.
     */
    public DeletedVaultInner() {
    }

    /**
     * Get the id property: The resource ID for the deleted key vault.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the key vault.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The resource type of the key vault.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the properties property: Properties of the vault.
     * 
     * @return the properties value.
     */
    public DeletedVaultProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the vault.
     * 
     * @param properties the properties value to set.
     * @return the DeletedVaultInner object itself.
     */
    public DeletedVaultInner withProperties(DeletedVaultProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeletedVaultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeletedVaultInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeletedVaultInner.
     */
    public static DeletedVaultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeletedVaultInner deserializedDeletedVaultInner = new DeletedVaultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDeletedVaultInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDeletedVaultInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDeletedVaultInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedDeletedVaultInner.properties = DeletedVaultProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeletedVaultInner;
        });
    }
}
