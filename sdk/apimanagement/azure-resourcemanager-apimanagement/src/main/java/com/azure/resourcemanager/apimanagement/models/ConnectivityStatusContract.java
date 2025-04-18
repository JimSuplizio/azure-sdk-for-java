// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Details about connectivity to a resource.
 */
@Fluent
public final class ConnectivityStatusContract implements JsonSerializable<ConnectivityStatusContract> {
    /*
     * The hostname of the resource which the service depends on. This can be the database, storage or any other azure
     * resource on which the service depends upon.
     */
    private String name;

    /*
     * Resource Connectivity Status Type identifier.
     */
    private ConnectivityStatusType status;

    /*
     * Error details of the connectivity to the resource.
     */
    private String error;

    /*
     * The date when the resource connectivity status was last updated. This status should be updated every 15 minutes.
     * If this status has not been updated, then it means that the service has lost network connectivity to the
     * resource, from inside the Virtual Network.The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as
     * specified by the ISO 8601 standard.
     */
    private OffsetDateTime lastUpdated;

    /*
     * The date when the resource connectivity status last Changed from success to failure or vice-versa. The date
     * conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     */
    private OffsetDateTime lastStatusChange;

    /*
     * Resource Type.
     */
    private String resourceType;

    /*
     * Whether this is optional.
     */
    private boolean isOptional;

    /**
     * Creates an instance of ConnectivityStatusContract class.
     */
    public ConnectivityStatusContract() {
    }

    /**
     * Get the name property: The hostname of the resource which the service depends on. This can be the database,
     * storage or any other azure resource on which the service depends upon.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The hostname of the resource which the service depends on. This can be the database,
     * storage or any other azure resource on which the service depends upon.
     * 
     * @param name the name value to set.
     * @return the ConnectivityStatusContract object itself.
     */
    public ConnectivityStatusContract withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the status property: Resource Connectivity Status Type identifier.
     * 
     * @return the status value.
     */
    public ConnectivityStatusType status() {
        return this.status;
    }

    /**
     * Set the status property: Resource Connectivity Status Type identifier.
     * 
     * @param status the status value to set.
     * @return the ConnectivityStatusContract object itself.
     */
    public ConnectivityStatusContract withStatus(ConnectivityStatusType status) {
        this.status = status;
        return this;
    }

    /**
     * Get the error property: Error details of the connectivity to the resource.
     * 
     * @return the error value.
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the error property: Error details of the connectivity to the resource.
     * 
     * @param error the error value to set.
     * @return the ConnectivityStatusContract object itself.
     */
    public ConnectivityStatusContract withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get the lastUpdated property: The date when the resource connectivity status was last updated. This status should
     * be updated every 15 minutes. If this status has not been updated, then it means that the service has lost network
     * connectivity to the resource, from inside the Virtual Network.The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     * @return the lastUpdated value.
     */
    public OffsetDateTime lastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Set the lastUpdated property: The date when the resource connectivity status was last updated. This status should
     * be updated every 15 minutes. If this status has not been updated, then it means that the service has lost network
     * connectivity to the resource, from inside the Virtual Network.The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     * @param lastUpdated the lastUpdated value to set.
     * @return the ConnectivityStatusContract object itself.
     */
    public ConnectivityStatusContract withLastUpdated(OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * Get the lastStatusChange property: The date when the resource connectivity status last Changed from success to
     * failure or vice-versa. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO
     * 8601 standard.
     * 
     * @return the lastStatusChange value.
     */
    public OffsetDateTime lastStatusChange() {
        return this.lastStatusChange;
    }

    /**
     * Set the lastStatusChange property: The date when the resource connectivity status last Changed from success to
     * failure or vice-versa. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO
     * 8601 standard.
     * 
     * @param lastStatusChange the lastStatusChange value to set.
     * @return the ConnectivityStatusContract object itself.
     */
    public ConnectivityStatusContract withLastStatusChange(OffsetDateTime lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
        return this;
    }

    /**
     * Get the resourceType property: Resource Type.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Resource Type.
     * 
     * @param resourceType the resourceType value to set.
     * @return the ConnectivityStatusContract object itself.
     */
    public ConnectivityStatusContract withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the isOptional property: Whether this is optional.
     * 
     * @return the isOptional value.
     */
    public boolean isOptional() {
        return this.isOptional;
    }

    /**
     * Set the isOptional property: Whether this is optional.
     * 
     * @param isOptional the isOptional value to set.
     * @return the ConnectivityStatusContract object itself.
     */
    public ConnectivityStatusContract withIsOptional(boolean isOptional) {
        this.isOptional = isOptional;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property name in model ConnectivityStatusContract"));
        }
        if (status() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property status in model ConnectivityStatusContract"));
        }
        if (lastUpdated() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property lastUpdated in model ConnectivityStatusContract"));
        }
        if (lastStatusChange() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property lastStatusChange in model ConnectivityStatusContract"));
        }
        if (resourceType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property resourceType in model ConnectivityStatusContract"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConnectivityStatusContract.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("lastUpdated",
            this.lastUpdated == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastUpdated));
        jsonWriter.writeStringField("lastStatusChange",
            this.lastStatusChange == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastStatusChange));
        jsonWriter.writeStringField("resourceType", this.resourceType);
        jsonWriter.writeBooleanField("isOptional", this.isOptional);
        jsonWriter.writeStringField("error", this.error);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectivityStatusContract from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectivityStatusContract if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ConnectivityStatusContract.
     */
    public static ConnectivityStatusContract fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectivityStatusContract deserializedConnectivityStatusContract = new ConnectivityStatusContract();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedConnectivityStatusContract.name = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedConnectivityStatusContract.status
                        = ConnectivityStatusType.fromString(reader.getString());
                } else if ("lastUpdated".equals(fieldName)) {
                    deserializedConnectivityStatusContract.lastUpdated = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastStatusChange".equals(fieldName)) {
                    deserializedConnectivityStatusContract.lastStatusChange = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("resourceType".equals(fieldName)) {
                    deserializedConnectivityStatusContract.resourceType = reader.getString();
                } else if ("isOptional".equals(fieldName)) {
                    deserializedConnectivityStatusContract.isOptional = reader.getBoolean();
                } else if ("error".equals(fieldName)) {
                    deserializedConnectivityStatusContract.error = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectivityStatusContract;
        });
    }
}
