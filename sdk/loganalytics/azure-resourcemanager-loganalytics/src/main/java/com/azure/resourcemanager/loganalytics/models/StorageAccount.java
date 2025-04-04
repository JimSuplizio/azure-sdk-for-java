// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes a storage account connection.
 */
@Fluent
public final class StorageAccount implements JsonSerializable<StorageAccount> {
    /*
     * The Azure Resource Manager ID of the storage account resource.
     */
    private String id;

    /*
     * The storage account key.
     */
    private String key;

    /**
     * Creates an instance of StorageAccount class.
     */
    public StorageAccount() {
    }

    /**
     * Get the id property: The Azure Resource Manager ID of the storage account resource.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The Azure Resource Manager ID of the storage account resource.
     * 
     * @param id the id value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the key property: The storage account key.
     * 
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: The storage account key.
     * 
     * @param key the key value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property id in model StorageAccount"));
        }
        if (key() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property key in model StorageAccount"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageAccount.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("key", this.key);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageAccount from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageAccount if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StorageAccount.
     */
    public static StorageAccount fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageAccount deserializedStorageAccount = new StorageAccount();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedStorageAccount.id = reader.getString();
                } else if ("key".equals(fieldName)) {
                    deserializedStorageAccount.key = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageAccount;
        });
    }
}
