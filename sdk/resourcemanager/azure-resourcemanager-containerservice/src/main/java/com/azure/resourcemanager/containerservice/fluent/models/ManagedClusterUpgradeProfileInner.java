// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerservice.models.ManagedClusterPoolUpgradeProfile;
import java.io.IOException;
import java.util.List;

/**
 * The list of available upgrades for compute pools.
 */
@Fluent
public final class ManagedClusterUpgradeProfileInner implements JsonSerializable<ManagedClusterUpgradeProfileInner> {
    /*
     * The ID of the upgrade profile.
     */
    private String id;

    /*
     * The name of the upgrade profile.
     */
    private String name;

    /*
     * The type of the upgrade profile.
     */
    private String type;

    /*
     * The properties of the upgrade profile.
     */
    private ManagedClusterUpgradeProfileProperties innerProperties = new ManagedClusterUpgradeProfileProperties();

    /**
     * Creates an instance of ManagedClusterUpgradeProfileInner class.
     */
    public ManagedClusterUpgradeProfileInner() {
    }

    /**
     * Get the id property: The ID of the upgrade profile.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the upgrade profile.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the upgrade profile.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: The properties of the upgrade profile.
     * 
     * @return the innerProperties value.
     */
    private ManagedClusterUpgradeProfileProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the controlPlaneProfile property: The list of available upgrade versions for the control plane.
     * 
     * @return the controlPlaneProfile value.
     */
    public ManagedClusterPoolUpgradeProfile controlPlaneProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().controlPlaneProfile();
    }

    /**
     * Set the controlPlaneProfile property: The list of available upgrade versions for the control plane.
     * 
     * @param controlPlaneProfile the controlPlaneProfile value to set.
     * @return the ManagedClusterUpgradeProfileInner object itself.
     */
    public ManagedClusterUpgradeProfileInner
        withControlPlaneProfile(ManagedClusterPoolUpgradeProfile controlPlaneProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterUpgradeProfileProperties();
        }
        this.innerProperties().withControlPlaneProfile(controlPlaneProfile);
        return this;
    }

    /**
     * Get the agentPoolProfiles property: The list of available upgrade versions for agent pools.
     * 
     * @return the agentPoolProfiles value.
     */
    public List<ManagedClusterPoolUpgradeProfile> agentPoolProfiles() {
        return this.innerProperties() == null ? null : this.innerProperties().agentPoolProfiles();
    }

    /**
     * Set the agentPoolProfiles property: The list of available upgrade versions for agent pools.
     * 
     * @param agentPoolProfiles the agentPoolProfiles value to set.
     * @return the ManagedClusterUpgradeProfileInner object itself.
     */
    public ManagedClusterUpgradeProfileInner
        withAgentPoolProfiles(List<ManagedClusterPoolUpgradeProfile> agentPoolProfiles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedClusterUpgradeProfileProperties();
        }
        this.innerProperties().withAgentPoolProfiles(agentPoolProfiles);
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
                    "Missing required property innerProperties in model ManagedClusterUpgradeProfileInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedClusterUpgradeProfileInner.class);

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
     * Reads an instance of ManagedClusterUpgradeProfileInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedClusterUpgradeProfileInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedClusterUpgradeProfileInner.
     */
    public static ManagedClusterUpgradeProfileInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedClusterUpgradeProfileInner deserializedManagedClusterUpgradeProfileInner
                = new ManagedClusterUpgradeProfileInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedManagedClusterUpgradeProfileInner.innerProperties
                        = ManagedClusterUpgradeProfileProperties.fromJson(reader);
                } else if ("id".equals(fieldName)) {
                    deserializedManagedClusterUpgradeProfileInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedManagedClusterUpgradeProfileInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedManagedClusterUpgradeProfileInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedClusterUpgradeProfileInner;
        });
    }
}
