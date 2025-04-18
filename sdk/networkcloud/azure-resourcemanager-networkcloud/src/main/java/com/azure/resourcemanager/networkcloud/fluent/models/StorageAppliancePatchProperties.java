// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * StorageAppliancePatchProperties represents the properties of the storage appliance that can be patched.
 */
@Fluent
public final class StorageAppliancePatchProperties implements JsonSerializable<StorageAppliancePatchProperties> {
    /*
     * The serial number for the storage appliance.
     */
    private String serialNumber;

    /**
     * Creates an instance of StorageAppliancePatchProperties class.
     */
    public StorageAppliancePatchProperties() {
    }

    /**
     * Get the serialNumber property: The serial number for the storage appliance.
     * 
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Set the serialNumber property: The serial number for the storage appliance.
     * 
     * @param serialNumber the serialNumber value to set.
     * @return the StorageAppliancePatchProperties object itself.
     */
    public StorageAppliancePatchProperties withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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
        jsonWriter.writeStringField("serialNumber", this.serialNumber);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageAppliancePatchProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageAppliancePatchProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StorageAppliancePatchProperties.
     */
    public static StorageAppliancePatchProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageAppliancePatchProperties deserializedStorageAppliancePatchProperties
                = new StorageAppliancePatchProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serialNumber".equals(fieldName)) {
                    deserializedStorageAppliancePatchProperties.serialNumber = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageAppliancePatchProperties;
        });
    }
}
