// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mobilenetwork.models.Ipv4Route;
import com.azure.resourcemanager.mobilenetwork.models.UserPlaneDataRoutesItem;
import java.io.IOException;
import java.util.List;

/**
 * Routing information.
 */
@Fluent
public final class RoutingInfoModelInner extends ProxyResource {
    /*
     * Routing information properties
     */
    private RoutingInfoPropertiesFormat innerProperties = new RoutingInfoPropertiesFormat();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

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
     * Creates an instance of RoutingInfoModelInner class.
     */
    public RoutingInfoModelInner() {
    }

    /**
     * Get the innerProperties property: Routing information properties.
     * 
     * @return the innerProperties value.
     */
    private RoutingInfoPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Get the controlPlaneAccessRoutes property: A list of IPv4 routes.
     * 
     * @return the controlPlaneAccessRoutes value.
     */
    public List<Ipv4Route> controlPlaneAccessRoutes() {
        return this.innerProperties() == null ? null : this.innerProperties().controlPlaneAccessRoutes();
    }

    /**
     * Set the controlPlaneAccessRoutes property: A list of IPv4 routes.
     * 
     * @param controlPlaneAccessRoutes the controlPlaneAccessRoutes value to set.
     * @return the RoutingInfoModelInner object itself.
     */
    public RoutingInfoModelInner withControlPlaneAccessRoutes(List<Ipv4Route> controlPlaneAccessRoutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoutingInfoPropertiesFormat();
        }
        this.innerProperties().withControlPlaneAccessRoutes(controlPlaneAccessRoutes);
        return this;
    }

    /**
     * Get the userPlaneAccessRoutes property: A list of IPv4 routes.
     * 
     * @return the userPlaneAccessRoutes value.
     */
    public List<Ipv4Route> userPlaneAccessRoutes() {
        return this.innerProperties() == null ? null : this.innerProperties().userPlaneAccessRoutes();
    }

    /**
     * Set the userPlaneAccessRoutes property: A list of IPv4 routes.
     * 
     * @param userPlaneAccessRoutes the userPlaneAccessRoutes value to set.
     * @return the RoutingInfoModelInner object itself.
     */
    public RoutingInfoModelInner withUserPlaneAccessRoutes(List<Ipv4Route> userPlaneAccessRoutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoutingInfoPropertiesFormat();
        }
        this.innerProperties().withUserPlaneAccessRoutes(userPlaneAccessRoutes);
        return this;
    }

    /**
     * Get the userPlaneDataRoutes property: A list of attached data networks and their IPv4 routes.
     * 
     * @return the userPlaneDataRoutes value.
     */
    public List<UserPlaneDataRoutesItem> userPlaneDataRoutes() {
        return this.innerProperties() == null ? null : this.innerProperties().userPlaneDataRoutes();
    }

    /**
     * Set the userPlaneDataRoutes property: A list of attached data networks and their IPv4 routes.
     * 
     * @param userPlaneDataRoutes the userPlaneDataRoutes value to set.
     * @return the RoutingInfoModelInner object itself.
     */
    public RoutingInfoModelInner withUserPlaneDataRoutes(List<UserPlaneDataRoutesItem> userPlaneDataRoutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoutingInfoPropertiesFormat();
        }
        this.innerProperties().withUserPlaneDataRoutes(userPlaneDataRoutes);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model RoutingInfoModelInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RoutingInfoModelInner.class);

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
     * Reads an instance of RoutingInfoModelInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoutingInfoModelInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RoutingInfoModelInner.
     */
    public static RoutingInfoModelInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoutingInfoModelInner deserializedRoutingInfoModelInner = new RoutingInfoModelInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRoutingInfoModelInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRoutingInfoModelInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRoutingInfoModelInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedRoutingInfoModelInner.innerProperties = RoutingInfoPropertiesFormat.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedRoutingInfoModelInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoutingInfoModelInner;
        });
    }
}
