// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.selfhelp.models.SolutionMetadataProperties;
import java.io.IOException;
import java.util.List;

/**
 * Metadata resource.
 */
@Fluent
public final class SolutionMetadataResourceInner extends ProxyResource {
    /*
     * Solution metadata Resource properties.
     */
    private Solutions innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of SolutionMetadataResourceInner class.
     */
    public SolutionMetadataResourceInner() {
    }

    /**
     * Get the innerProperties property: Solution metadata Resource properties.
     * 
     * @return the innerProperties value.
     */
    private Solutions innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the solutions property: List of metadata.
     * 
     * @return the solutions value.
     */
    public List<SolutionMetadataProperties> solutions() {
        return this.innerProperties() == null ? null : this.innerProperties().solutions();
    }

    /**
     * Set the solutions property: List of metadata.
     * 
     * @param solutions the solutions value to set.
     * @return the SolutionMetadataResourceInner object itself.
     */
    public SolutionMetadataResourceInner withSolutions(List<SolutionMetadataProperties> solutions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new Solutions();
        }
        this.innerProperties().withSolutions(solutions);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SolutionMetadataResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SolutionMetadataResourceInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SolutionMetadataResourceInner.
     */
    public static SolutionMetadataResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SolutionMetadataResourceInner deserializedSolutionMetadataResourceInner
                = new SolutionMetadataResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSolutionMetadataResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSolutionMetadataResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSolutionMetadataResourceInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedSolutionMetadataResourceInner.innerProperties = Solutions.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedSolutionMetadataResourceInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSolutionMetadataResourceInner;
        });
    }
}
