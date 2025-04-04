// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.signalr.models.ShareablePrivateLinkResourceType;
import java.io.IOException;
import java.util.List;

/**
 * Private link resource.
 */
@Fluent
public final class PrivateLinkResourceInner extends ProxyResource {
    /*
     * Private link resource properties
     */
    private PrivateLinkResourceProperties innerProperties;

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
     * Creates an instance of PrivateLinkResourceInner class.
     */
    public PrivateLinkResourceInner() {
    }

    /**
     * Get the innerProperties property: Private link resource properties.
     * 
     * @return the innerProperties value.
     */
    private PrivateLinkResourceProperties innerProperties() {
        return this.innerProperties;
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
     * Get the groupId property: Group Id of the private link resource.
     * 
     * @return the groupId value.
     */
    public String groupId() {
        return this.innerProperties() == null ? null : this.innerProperties().groupId();
    }

    /**
     * Set the groupId property: Group Id of the private link resource.
     * 
     * @param groupId the groupId value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withGroupId(String groupId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkResourceProperties();
        }
        this.innerProperties().withGroupId(groupId);
        return this;
    }

    /**
     * Get the requiredMembers property: Required members of the private link resource.
     * 
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredMembers();
    }

    /**
     * Set the requiredMembers property: Required members of the private link resource.
     * 
     * @param requiredMembers the requiredMembers value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withRequiredMembers(List<String> requiredMembers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkResourceProperties();
        }
        this.innerProperties().withRequiredMembers(requiredMembers);
        return this;
    }

    /**
     * Get the requiredZoneNames property: Required private DNS zone names.
     * 
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredZoneNames();
    }

    /**
     * Set the requiredZoneNames property: Required private DNS zone names.
     * 
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withRequiredZoneNames(List<String> requiredZoneNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkResourceProperties();
        }
        this.innerProperties().withRequiredZoneNames(requiredZoneNames);
        return this;
    }

    /**
     * Get the shareablePrivateLinkResourceTypes property: The list of resources that are onboarded to private link
     * service.
     * 
     * @return the shareablePrivateLinkResourceTypes value.
     */
    public List<ShareablePrivateLinkResourceType> shareablePrivateLinkResourceTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().shareablePrivateLinkResourceTypes();
    }

    /**
     * Set the shareablePrivateLinkResourceTypes property: The list of resources that are onboarded to private link
     * service.
     * 
     * @param shareablePrivateLinkResourceTypes the shareablePrivateLinkResourceTypes value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withShareablePrivateLinkResourceTypes(
        List<ShareablePrivateLinkResourceType> shareablePrivateLinkResourceTypes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkResourceProperties();
        }
        this.innerProperties().withShareablePrivateLinkResourceTypes(shareablePrivateLinkResourceTypes);
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
     * Reads an instance of PrivateLinkResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkResourceInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PrivateLinkResourceInner.
     */
    public static PrivateLinkResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkResourceInner deserializedPrivateLinkResourceInner = new PrivateLinkResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.innerProperties
                        = PrivateLinkResourceProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkResourceInner;
        });
    }
}
