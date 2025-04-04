// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ConfigurationDataType;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ProvisioningState;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ServerRoleGroupConfiguration;
import java.io.IOException;
import java.util.List;

/**
 * The properties of configuration.
 */
@Fluent
public final class ConfigurationProperties implements JsonSerializable<ConfigurationProperties> {
    /*
     * Description of the configuration.
     */
    private String description;

    /*
     * Data type of the configuration.
     */
    private ConfigurationDataType dataType;

    /*
     * Allowed values of the configuration.
     */
    private String allowedValues;

    /*
     * If configuration change requires restart.
     */
    private Boolean requiresRestart;

    /*
     * The list of server role group configuration values.
     */
    private List<ServerRoleGroupConfiguration> serverRoleGroupConfigurations;

    /*
     * Provisioning state of the configuration
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of ConfigurationProperties class.
     */
    public ConfigurationProperties() {
    }

    /**
     * Get the description property: Description of the configuration.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the dataType property: Data type of the configuration.
     * 
     * @return the dataType value.
     */
    public ConfigurationDataType dataType() {
        return this.dataType;
    }

    /**
     * Get the allowedValues property: Allowed values of the configuration.
     * 
     * @return the allowedValues value.
     */
    public String allowedValues() {
        return this.allowedValues;
    }

    /**
     * Get the requiresRestart property: If configuration change requires restart.
     * 
     * @return the requiresRestart value.
     */
    public Boolean requiresRestart() {
        return this.requiresRestart;
    }

    /**
     * Set the requiresRestart property: If configuration change requires restart.
     * 
     * @param requiresRestart the requiresRestart value to set.
     * @return the ConfigurationProperties object itself.
     */
    public ConfigurationProperties withRequiresRestart(Boolean requiresRestart) {
        this.requiresRestart = requiresRestart;
        return this;
    }

    /**
     * Get the serverRoleGroupConfigurations property: The list of server role group configuration values.
     * 
     * @return the serverRoleGroupConfigurations value.
     */
    public List<ServerRoleGroupConfiguration> serverRoleGroupConfigurations() {
        return this.serverRoleGroupConfigurations;
    }

    /**
     * Set the serverRoleGroupConfigurations property: The list of server role group configuration values.
     * 
     * @param serverRoleGroupConfigurations the serverRoleGroupConfigurations value to set.
     * @return the ConfigurationProperties object itself.
     */
    public ConfigurationProperties
        withServerRoleGroupConfigurations(List<ServerRoleGroupConfiguration> serverRoleGroupConfigurations) {
        this.serverRoleGroupConfigurations = serverRoleGroupConfigurations;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the configuration.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serverRoleGroupConfigurations() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property serverRoleGroupConfigurations in model ConfigurationProperties"));
        } else {
            serverRoleGroupConfigurations().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConfigurationProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("serverRoleGroupConfigurations", this.serverRoleGroupConfigurations,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("requiresRestart", this.requiresRestart);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConfigurationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConfigurationProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ConfigurationProperties.
     */
    public static ConfigurationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConfigurationProperties deserializedConfigurationProperties = new ConfigurationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("serverRoleGroupConfigurations".equals(fieldName)) {
                    List<ServerRoleGroupConfiguration> serverRoleGroupConfigurations
                        = reader.readArray(reader1 -> ServerRoleGroupConfiguration.fromJson(reader1));
                    deserializedConfigurationProperties.serverRoleGroupConfigurations = serverRoleGroupConfigurations;
                } else if ("description".equals(fieldName)) {
                    deserializedConfigurationProperties.description = reader.getString();
                } else if ("dataType".equals(fieldName)) {
                    deserializedConfigurationProperties.dataType = ConfigurationDataType.fromString(reader.getString());
                } else if ("allowedValues".equals(fieldName)) {
                    deserializedConfigurationProperties.allowedValues = reader.getString();
                } else if ("requiresRestart".equals(fieldName)) {
                    deserializedConfigurationProperties.requiresRestart = reader.getNullable(JsonReader::getBoolean);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedConfigurationProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConfigurationProperties;
        });
    }
}
