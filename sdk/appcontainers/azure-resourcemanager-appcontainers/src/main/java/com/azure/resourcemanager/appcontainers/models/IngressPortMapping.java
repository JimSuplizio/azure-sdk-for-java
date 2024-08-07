// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Port mappings of container app ingress.
 */
@Fluent
public final class IngressPortMapping implements JsonSerializable<IngressPortMapping> {
    /*
     * Specifies whether the app port is accessible outside of the environment
     */
    private boolean external;

    /*
     * Specifies the port user's container listens on
     */
    private int targetPort;

    /*
     * Specifies the exposed port for the target port. If not specified, it defaults to target port
     */
    private Integer exposedPort;

    /**
     * Creates an instance of IngressPortMapping class.
     */
    public IngressPortMapping() {
    }

    /**
     * Get the external property: Specifies whether the app port is accessible outside of the environment.
     * 
     * @return the external value.
     */
    public boolean external() {
        return this.external;
    }

    /**
     * Set the external property: Specifies whether the app port is accessible outside of the environment.
     * 
     * @param external the external value to set.
     * @return the IngressPortMapping object itself.
     */
    public IngressPortMapping withExternal(boolean external) {
        this.external = external;
        return this;
    }

    /**
     * Get the targetPort property: Specifies the port user's container listens on.
     * 
     * @return the targetPort value.
     */
    public int targetPort() {
        return this.targetPort;
    }

    /**
     * Set the targetPort property: Specifies the port user's container listens on.
     * 
     * @param targetPort the targetPort value to set.
     * @return the IngressPortMapping object itself.
     */
    public IngressPortMapping withTargetPort(int targetPort) {
        this.targetPort = targetPort;
        return this;
    }

    /**
     * Get the exposedPort property: Specifies the exposed port for the target port. If not specified, it defaults to
     * target port.
     * 
     * @return the exposedPort value.
     */
    public Integer exposedPort() {
        return this.exposedPort;
    }

    /**
     * Set the exposedPort property: Specifies the exposed port for the target port. If not specified, it defaults to
     * target port.
     * 
     * @param exposedPort the exposedPort value to set.
     * @return the IngressPortMapping object itself.
     */
    public IngressPortMapping withExposedPort(Integer exposedPort) {
        this.exposedPort = exposedPort;
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
        jsonWriter.writeBooleanField("external", this.external);
        jsonWriter.writeIntField("targetPort", this.targetPort);
        jsonWriter.writeNumberField("exposedPort", this.exposedPort);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IngressPortMapping from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IngressPortMapping if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IngressPortMapping.
     */
    public static IngressPortMapping fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IngressPortMapping deserializedIngressPortMapping = new IngressPortMapping();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("external".equals(fieldName)) {
                    deserializedIngressPortMapping.external = reader.getBoolean();
                } else if ("targetPort".equals(fieldName)) {
                    deserializedIngressPortMapping.targetPort = reader.getInt();
                } else if ("exposedPort".equals(fieldName)) {
                    deserializedIngressPortMapping.exposedPort = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIngressPortMapping;
        });
    }
}
