// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Spark job definition resource type.
 */
@Fluent
public final class SparkJobDefinitionResource extends SubResource {
    /*
     * Properties of spark job definition.
     */
    private SparkJobDefinition properties;

    /**
     * Creates an instance of SparkJobDefinitionResource class.
     */
    public SparkJobDefinitionResource() {
    }

    /**
     * Get the properties property: Properties of spark job definition.
     * 
     * @return the properties value.
     */
    public SparkJobDefinition getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of spark job definition.
     * 
     * @param properties the properties value to set.
     * @return the SparkJobDefinitionResource object itself.
     */
    public SparkJobDefinitionResource setProperties(SparkJobDefinition properties) {
        this.properties = properties;
        return this;
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
     * Reads an instance of SparkJobDefinitionResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SparkJobDefinitionResource if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SparkJobDefinitionResource.
     */
    public static SparkJobDefinitionResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SparkJobDefinitionResource deserializedSparkJobDefinitionResource = new SparkJobDefinitionResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSparkJobDefinitionResource.setId(reader.getString());
                } else if ("name".equals(fieldName)) {
                    deserializedSparkJobDefinitionResource.setName(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedSparkJobDefinitionResource.setType(reader.getString());
                } else if ("etag".equals(fieldName)) {
                    deserializedSparkJobDefinitionResource.setEtag(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedSparkJobDefinitionResource.properties = SparkJobDefinition.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSparkJobDefinitionResource;
        });
    }
}
