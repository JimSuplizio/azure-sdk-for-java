// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedIntegrationRuntimeStatusTypeProperties;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Managed integration runtime status.
 */
@Immutable
public final class ManagedIntegrationRuntimeStatus extends IntegrationRuntimeStatus {
    /*
     * Type of integration runtime.
     */
    private IntegrationRuntimeType type = IntegrationRuntimeType.MANAGED;

    /*
     * Managed integration runtime status type properties.
     */
    private ManagedIntegrationRuntimeStatusTypeProperties innerTypeProperties
        = new ManagedIntegrationRuntimeStatusTypeProperties();

    /**
     * Creates an instance of ManagedIntegrationRuntimeStatus class.
     */
    public ManagedIntegrationRuntimeStatus() {
    }

    /**
     * Get the type property: Type of integration runtime.
     * 
     * @return the type value.
     */
    @Override
    public IntegrationRuntimeType type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Managed integration runtime status type properties.
     * 
     * @return the innerTypeProperties value.
     */
    ManagedIntegrationRuntimeStatusTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * Get the createTime property: The time at which the integration runtime was created, in ISO8601 format.
     * 
     * @return the createTime value.
     */
    public OffsetDateTime createTime() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().createTime();
    }

    /**
     * Get the nodes property: The list of nodes for managed integration runtime.
     * 
     * @return the nodes value.
     */
    public List<ManagedIntegrationRuntimeNode> nodes() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().nodes();
    }

    /**
     * Get the otherErrors property: The errors that occurred on this integration runtime.
     * 
     * @return the otherErrors value.
     */
    public List<ManagedIntegrationRuntimeError> otherErrors() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().otherErrors();
    }

    /**
     * Get the lastOperation property: The last operation result that occurred on this integration runtime.
     * 
     * @return the lastOperation value.
     */
    public ManagedIntegrationRuntimeOperationResult lastOperation() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().lastOperation();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model ManagedIntegrationRuntimeStatus"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedIntegrationRuntimeStatus.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedIntegrationRuntimeStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedIntegrationRuntimeStatus if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedIntegrationRuntimeStatus.
     */
    public static ManagedIntegrationRuntimeStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedIntegrationRuntimeStatus deserializedManagedIntegrationRuntimeStatus
                = new ManagedIntegrationRuntimeStatus();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataFactoryName".equals(fieldName)) {
                    deserializedManagedIntegrationRuntimeStatus.withDataFactoryName(reader.getString());
                } else if ("state".equals(fieldName)) {
                    deserializedManagedIntegrationRuntimeStatus
                        .withState(IntegrationRuntimeState.fromString(reader.getString()));
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedManagedIntegrationRuntimeStatus.innerTypeProperties
                        = ManagedIntegrationRuntimeStatusTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedManagedIntegrationRuntimeStatus.type
                        = IntegrationRuntimeType.fromString(reader.getString());
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedManagedIntegrationRuntimeStatus.withAdditionalProperties(additionalProperties);

            return deserializedManagedIntegrationRuntimeStatus;
        });
    }
}
