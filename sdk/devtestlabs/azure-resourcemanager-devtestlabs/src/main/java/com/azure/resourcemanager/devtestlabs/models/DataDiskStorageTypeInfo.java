// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Storage information about the data disks present in the custom image.
 */
@Fluent
public final class DataDiskStorageTypeInfo implements JsonSerializable<DataDiskStorageTypeInfo> {
    /*
     * Disk Lun
     */
    private String lun;

    /*
     * Disk Storage Type
     */
    private StorageType storageType;

    /**
     * Creates an instance of DataDiskStorageTypeInfo class.
     */
    public DataDiskStorageTypeInfo() {
    }

    /**
     * Get the lun property: Disk Lun.
     * 
     * @return the lun value.
     */
    public String lun() {
        return this.lun;
    }

    /**
     * Set the lun property: Disk Lun.
     * 
     * @param lun the lun value to set.
     * @return the DataDiskStorageTypeInfo object itself.
     */
    public DataDiskStorageTypeInfo withLun(String lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Get the storageType property: Disk Storage Type.
     * 
     * @return the storageType value.
     */
    public StorageType storageType() {
        return this.storageType;
    }

    /**
     * Set the storageType property: Disk Storage Type.
     * 
     * @param storageType the storageType value to set.
     * @return the DataDiskStorageTypeInfo object itself.
     */
    public DataDiskStorageTypeInfo withStorageType(StorageType storageType) {
        this.storageType = storageType;
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
        jsonWriter.writeStringField("lun", this.lun);
        jsonWriter.writeStringField("storageType", this.storageType == null ? null : this.storageType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataDiskStorageTypeInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataDiskStorageTypeInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataDiskStorageTypeInfo.
     */
    public static DataDiskStorageTypeInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataDiskStorageTypeInfo deserializedDataDiskStorageTypeInfo = new DataDiskStorageTypeInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("lun".equals(fieldName)) {
                    deserializedDataDiskStorageTypeInfo.lun = reader.getString();
                } else if ("storageType".equals(fieldName)) {
                    deserializedDataDiskStorageTypeInfo.storageType = StorageType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataDiskStorageTypeInfo;
        });
    }
}
