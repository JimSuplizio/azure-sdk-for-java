// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.automanage.fluent.models.ConfigurationProfileInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of the list configuration profile operation.
 */
@Fluent
public final class ConfigurationProfileList implements JsonSerializable<ConfigurationProfileList> {
    /*
     * Result of the list ConfigurationProfile operation.
     */
    private List<ConfigurationProfileInner> value;

    /**
     * Creates an instance of ConfigurationProfileList class.
     */
    public ConfigurationProfileList() {
    }

    /**
     * Get the value property: Result of the list ConfigurationProfile operation.
     * 
     * @return the value value.
     */
    public List<ConfigurationProfileInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the list ConfigurationProfile operation.
     * 
     * @param value the value value to set.
     * @return the ConfigurationProfileList object itself.
     */
    public ConfigurationProfileList withValue(List<ConfigurationProfileInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConfigurationProfileList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConfigurationProfileList if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConfigurationProfileList.
     */
    public static ConfigurationProfileList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConfigurationProfileList deserializedConfigurationProfileList = new ConfigurationProfileList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ConfigurationProfileInner> value
                        = reader.readArray(reader1 -> ConfigurationProfileInner.fromJson(reader1));
                    deserializedConfigurationProfileList.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConfigurationProfileList;
        });
    }
}
