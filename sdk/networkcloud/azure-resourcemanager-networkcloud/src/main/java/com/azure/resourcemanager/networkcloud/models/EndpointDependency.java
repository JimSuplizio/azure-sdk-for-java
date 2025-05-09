// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * EndpointDependency represents the definition of an endpoint, including the domain and details.
 */
@Fluent
public final class EndpointDependency implements JsonSerializable<EndpointDependency> {
    /*
     * The domain name of the dependency.
     */
    private String domainName;

    /*
     * The port of this endpoint.
     */
    private Long port;

    /**
     * Creates an instance of EndpointDependency class.
     */
    public EndpointDependency() {
    }

    /**
     * Get the domainName property: The domain name of the dependency.
     * 
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Set the domainName property: The domain name of the dependency.
     * 
     * @param domainName the domainName value to set.
     * @return the EndpointDependency object itself.
     */
    public EndpointDependency withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Get the port property: The port of this endpoint.
     * 
     * @return the port value.
     */
    public Long port() {
        return this.port;
    }

    /**
     * Set the port property: The port of this endpoint.
     * 
     * @param port the port value to set.
     * @return the EndpointDependency object itself.
     */
    public EndpointDependency withPort(Long port) {
        this.port = port;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (domainName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property domainName in model EndpointDependency"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EndpointDependency.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("domainName", this.domainName);
        jsonWriter.writeNumberField("port", this.port);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EndpointDependency from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EndpointDependency if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EndpointDependency.
     */
    public static EndpointDependency fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EndpointDependency deserializedEndpointDependency = new EndpointDependency();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("domainName".equals(fieldName)) {
                    deserializedEndpointDependency.domainName = reader.getString();
                } else if ("port".equals(fieldName)) {
                    deserializedEndpointDependency.port = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEndpointDependency;
        });
    }
}
