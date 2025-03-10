// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cognitiveservices.models.RaiPolicyProperties;
import java.io.IOException;
import java.util.Map;

/**
 * Cognitive Services RaiPolicy.
 */
@Fluent
public final class RaiPolicyInner extends ProxyResource {
    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

    /*
     * Resource Etag.
     */
    private String etag;

    /*
     * Resource tags.
     */
    private Map<String, String> tags;

    /*
     * Properties of Cognitive Services RaiPolicy.
     */
    private RaiPolicyProperties properties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of RaiPolicyInner class.
     */
    public RaiPolicyInner() {
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the etag property: Resource Etag.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the RaiPolicyInner object itself.
     */
    public RaiPolicyInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: Properties of Cognitive Services RaiPolicy.
     * 
     * @return the properties value.
     */
    public RaiPolicyProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of Cognitive Services RaiPolicy.
     * 
     * @param properties the properties value to set.
     * @return the RaiPolicyInner object itself.
     */
    public RaiPolicyInner withProperties(RaiPolicyProperties properties) {
        this.properties = properties;
        return this;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RaiPolicyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RaiPolicyInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RaiPolicyInner.
     */
    public static RaiPolicyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RaiPolicyInner deserializedRaiPolicyInner = new RaiPolicyInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRaiPolicyInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRaiPolicyInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRaiPolicyInner.type = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedRaiPolicyInner.systemData = SystemData.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedRaiPolicyInner.etag = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedRaiPolicyInner.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedRaiPolicyInner.properties = RaiPolicyProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRaiPolicyInner;
        });
    }
}
