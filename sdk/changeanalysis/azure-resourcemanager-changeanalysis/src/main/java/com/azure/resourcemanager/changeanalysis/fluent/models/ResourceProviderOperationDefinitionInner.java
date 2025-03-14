// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.changeanalysis.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.changeanalysis.models.ResourceProviderOperationDisplay;
import java.io.IOException;

/**
 * The resource provider operation definition.
 */
@Fluent
public final class ResourceProviderOperationDefinitionInner
    implements JsonSerializable<ResourceProviderOperationDefinitionInner> {
    /*
     * The resource provider operation name.
     */
    private String name;

    /*
     * The resource provider operation details.
     */
    private ResourceProviderOperationDisplay display;

    /**
     * Creates an instance of ResourceProviderOperationDefinitionInner class.
     */
    public ResourceProviderOperationDefinitionInner() {
    }

    /**
     * Get the name property: The resource provider operation name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The resource provider operation name.
     * 
     * @param name the name value to set.
     * @return the ResourceProviderOperationDefinitionInner object itself.
     */
    public ResourceProviderOperationDefinitionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The resource provider operation details.
     * 
     * @return the display value.
     */
    public ResourceProviderOperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: The resource provider operation details.
     * 
     * @param display the display value to set.
     * @return the ResourceProviderOperationDefinitionInner object itself.
     */
    public ResourceProviderOperationDefinitionInner withDisplay(ResourceProviderOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("display", this.display);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceProviderOperationDefinitionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceProviderOperationDefinitionInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceProviderOperationDefinitionInner.
     */
    public static ResourceProviderOperationDefinitionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceProviderOperationDefinitionInner deserializedResourceProviderOperationDefinitionInner
                = new ResourceProviderOperationDefinitionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedResourceProviderOperationDefinitionInner.name = reader.getString();
                } else if ("display".equals(fieldName)) {
                    deserializedResourceProviderOperationDefinitionInner.display
                        = ResourceProviderOperationDisplay.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceProviderOperationDefinitionInner;
        });
    }
}
