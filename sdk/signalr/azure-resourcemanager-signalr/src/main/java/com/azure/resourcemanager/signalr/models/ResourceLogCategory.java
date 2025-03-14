// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Resource log category configuration of a Microsoft.SignalRService resource.
 */
@Fluent
public final class ResourceLogCategory implements JsonSerializable<ResourceLogCategory> {
    /*
     * Gets or sets the resource log category's name.
     * Available values: ConnectivityLogs, MessagingLogs.
     * Case insensitive.
     */
    private String name;

    /*
     * Indicates whether or the resource log category is enabled.
     * Available values: true, false.
     * Case insensitive.
     */
    private String enabled;

    /**
     * Creates an instance of ResourceLogCategory class.
     */
    public ResourceLogCategory() {
    }

    /**
     * Get the name property: Gets or sets the resource log category's name.
     * Available values: ConnectivityLogs, MessagingLogs.
     * Case insensitive.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the resource log category's name.
     * Available values: ConnectivityLogs, MessagingLogs.
     * Case insensitive.
     * 
     * @param name the name value to set.
     * @return the ResourceLogCategory object itself.
     */
    public ResourceLogCategory withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether or the resource log category is enabled.
     * Available values: true, false.
     * Case insensitive.
     * 
     * @return the enabled value.
     */
    public String enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether or the resource log category is enabled.
     * Available values: true, false.
     * Case insensitive.
     * 
     * @param enabled the enabled value to set.
     * @return the ResourceLogCategory object itself.
     */
    public ResourceLogCategory withEnabled(String enabled) {
        this.enabled = enabled;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("enabled", this.enabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceLogCategory from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceLogCategory if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceLogCategory.
     */
    public static ResourceLogCategory fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceLogCategory deserializedResourceLogCategory = new ResourceLogCategory();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedResourceLogCategory.name = reader.getString();
                } else if ("enabled".equals(fieldName)) {
                    deserializedResourceLogCategory.enabled = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceLogCategory;
        });
    }
}
