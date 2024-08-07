// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.dataprotection.fluent.models.ResourceGuardResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * List of ResourceGuard resources.
 */
@Fluent
public final class ResourceGuardResourceList extends DppTrackedResourceList {
    /*
     * List of resources.
     */
    private List<ResourceGuardResourceInner> value;

    /**
     * Creates an instance of ResourceGuardResourceList class.
     */
    public ResourceGuardResourceList() {
    }

    /**
     * Get the value property: List of resources.
     * 
     * @return the value value.
     */
    public List<ResourceGuardResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of resources.
     * 
     * @param value the value value to set.
     * @return the ResourceGuardResourceList object itself.
     */
    public ResourceGuardResourceList withValue(List<ResourceGuardResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceGuardResourceList withNextLink(String nextLink) {
        super.withNextLink(nextLink);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
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
        jsonWriter.writeStringField("nextLink", nextLink());
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceGuardResourceList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceGuardResourceList if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceGuardResourceList.
     */
    public static ResourceGuardResourceList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceGuardResourceList deserializedResourceGuardResourceList = new ResourceGuardResourceList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nextLink".equals(fieldName)) {
                    deserializedResourceGuardResourceList.withNextLink(reader.getString());
                } else if ("value".equals(fieldName)) {
                    List<ResourceGuardResourceInner> value
                        = reader.readArray(reader1 -> ResourceGuardResourceInner.fromJson(reader1));
                    deserializedResourceGuardResourceList.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceGuardResourceList;
        });
    }
}
