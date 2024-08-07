// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties that define a Network Security Perimeter resource.
 */
@Immutable
public final class NetworkSecurityPerimeter implements JsonSerializable<NetworkSecurityPerimeter> {
    /*
     * Azure resource Id
     */
    private String id;

    /*
     * Guid of the Network Security Perimeter
     */
    private String perimeterGuid;

    /*
     * Regional location of the perimeter
     */
    private String location;

    /**
     * Creates an instance of NetworkSecurityPerimeter class.
     */
    public NetworkSecurityPerimeter() {
    }

    /**
     * Get the id property: Azure resource Id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the perimeterGuid property: Guid of the Network Security Perimeter.
     * 
     * @return the perimeterGuid value.
     */
    public String perimeterGuid() {
        return this.perimeterGuid;
    }

    /**
     * Get the location property: Regional location of the perimeter.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkSecurityPerimeter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkSecurityPerimeter if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkSecurityPerimeter.
     */
    public static NetworkSecurityPerimeter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkSecurityPerimeter deserializedNetworkSecurityPerimeter = new NetworkSecurityPerimeter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeter.id = reader.getString();
                } else if ("perimeterGuid".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeter.perimeterGuid = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeter.location = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkSecurityPerimeter;
        });
    }
}
