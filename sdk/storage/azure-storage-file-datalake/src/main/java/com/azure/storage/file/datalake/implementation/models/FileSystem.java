// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The FileSystem model.
 */
@Fluent
public final class FileSystem implements JsonSerializable<FileSystem> {
    /*
     * The name property.
     */
    private String name;

    /*
     * The lastModified property.
     */
    private String lastModified;

    /*
     * The eTag property.
     */
    private String eTag;

    /**
     * Creates an instance of FileSystem class.
     */
    public FileSystem() {
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the FileSystem object itself.
     */
    public FileSystem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the lastModified property: The lastModified property.
     * 
     * @return the lastModified value.
     */
    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * Set the lastModified property: The lastModified property.
     * 
     * @param lastModified the lastModified value to set.
     * @return the FileSystem object itself.
     */
    public FileSystem setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the eTag property: The eTag property.
     * 
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The eTag property.
     * 
     * @param eTag the eTag value to set.
     * @return the FileSystem object itself.
     */
    public FileSystem setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("lastModified", this.lastModified);
        jsonWriter.writeStringField("eTag", this.eTag);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FileSystem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FileSystem if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the FileSystem.
     */
    public static FileSystem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FileSystem deserializedFileSystem = new FileSystem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedFileSystem.name = reader.getString();
                } else if ("lastModified".equals(fieldName)) {
                    deserializedFileSystem.lastModified = reader.getString();
                } else if ("eTag".equals(fieldName)) {
                    deserializedFileSystem.eTag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFileSystem;
        });
    }
}
