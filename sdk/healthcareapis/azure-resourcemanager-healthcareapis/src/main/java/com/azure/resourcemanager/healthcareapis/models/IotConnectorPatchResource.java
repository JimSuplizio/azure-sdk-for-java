// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Iot Connector patch properties.
 */
@Fluent
public final class IotConnectorPatchResource extends ResourceTags {
    /*
     * Setting indicating whether the service has a managed identity associated with it.
     */
    private ServiceManagedIdentityIdentity identity;

    /**
     * Creates an instance of IotConnectorPatchResource class.
     */
    public IotConnectorPatchResource() {
    }

    /**
     * Get the identity property: Setting indicating whether the service has a managed identity associated with it.
     * 
     * @return the identity value.
     */
    public ServiceManagedIdentityIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Setting indicating whether the service has a managed identity associated with it.
     * 
     * @param identity the identity value to set.
     * @return the IotConnectorPatchResource object itself.
     */
    public IotConnectorPatchResource withIdentity(ServiceManagedIdentityIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IotConnectorPatchResource withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IotConnectorPatchResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IotConnectorPatchResource if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IotConnectorPatchResource.
     */
    public static IotConnectorPatchResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IotConnectorPatchResource deserializedIotConnectorPatchResource = new IotConnectorPatchResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedIotConnectorPatchResource.withTags(tags);
                } else if ("identity".equals(fieldName)) {
                    deserializedIotConnectorPatchResource.identity = ServiceManagedIdentityIdentity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIotConnectorPatchResource;
        });
    }
}
