// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appcontainers.models.ContainerType;
import com.azure.resourcemanager.appcontainers.models.CustomContainerTemplate;
import com.azure.resourcemanager.appcontainers.models.DynamicPoolConfiguration;
import com.azure.resourcemanager.appcontainers.models.PoolManagementType;
import com.azure.resourcemanager.appcontainers.models.ScaleConfiguration;
import com.azure.resourcemanager.appcontainers.models.SessionNetworkConfiguration;
import com.azure.resourcemanager.appcontainers.models.SessionPoolProvisioningState;
import com.azure.resourcemanager.appcontainers.models.SessionPoolSecret;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Container App session pool.
 */
@Fluent
public final class SessionPoolInner extends Resource {
    /*
     * Container App session pool resource specific properties
     */
    private SessionPoolProperties innerProperties;

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
     * Creates an instance of SessionPoolInner class.
     */
    public SessionPoolInner() {
    }

    /**
     * Get the innerProperties property: Container App session pool resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private SessionPoolProperties innerProperties() {
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
     * {@inheritDoc}
     */
    @Override
    public SessionPoolInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionPoolInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the environmentId property: Resource ID of the session pool's environment.
     * 
     * @return the environmentId value.
     */
    public String environmentId() {
        return this.innerProperties() == null ? null : this.innerProperties().environmentId();
    }

    /**
     * Set the environmentId property: Resource ID of the session pool's environment.
     * 
     * @param environmentId the environmentId value to set.
     * @return the SessionPoolInner object itself.
     */
    public SessionPoolInner withEnvironmentId(String environmentId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SessionPoolProperties();
        }
        this.innerProperties().withEnvironmentId(environmentId);
        return this;
    }

    /**
     * Get the containerType property: The container type of the sessions.
     * 
     * @return the containerType value.
     */
    public ContainerType containerType() {
        return this.innerProperties() == null ? null : this.innerProperties().containerType();
    }

    /**
     * Set the containerType property: The container type of the sessions.
     * 
     * @param containerType the containerType value to set.
     * @return the SessionPoolInner object itself.
     */
    public SessionPoolInner withContainerType(ContainerType containerType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SessionPoolProperties();
        }
        this.innerProperties().withContainerType(containerType);
        return this;
    }

    /**
     * Get the poolManagementType property: The pool management type of the session pool.
     * 
     * @return the poolManagementType value.
     */
    public PoolManagementType poolManagementType() {
        return this.innerProperties() == null ? null : this.innerProperties().poolManagementType();
    }

    /**
     * Set the poolManagementType property: The pool management type of the session pool.
     * 
     * @param poolManagementType the poolManagementType value to set.
     * @return the SessionPoolInner object itself.
     */
    public SessionPoolInner withPoolManagementType(PoolManagementType poolManagementType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SessionPoolProperties();
        }
        this.innerProperties().withPoolManagementType(poolManagementType);
        return this;
    }

    /**
     * Get the nodeCount property: The number of nodes the session pool is using.
     * 
     * @return the nodeCount value.
     */
    public Integer nodeCount() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeCount();
    }

    /**
     * Get the scaleConfiguration property: The scale configuration of the session pool.
     * 
     * @return the scaleConfiguration value.
     */
    public ScaleConfiguration scaleConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().scaleConfiguration();
    }

    /**
     * Set the scaleConfiguration property: The scale configuration of the session pool.
     * 
     * @param scaleConfiguration the scaleConfiguration value to set.
     * @return the SessionPoolInner object itself.
     */
    public SessionPoolInner withScaleConfiguration(ScaleConfiguration scaleConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SessionPoolProperties();
        }
        this.innerProperties().withScaleConfiguration(scaleConfiguration);
        return this;
    }

    /**
     * Get the secrets property: The secrets of the session pool.
     * 
     * @return the secrets value.
     */
    public List<SessionPoolSecret> secrets() {
        return this.innerProperties() == null ? null : this.innerProperties().secrets();
    }

    /**
     * Set the secrets property: The secrets of the session pool.
     * 
     * @param secrets the secrets value to set.
     * @return the SessionPoolInner object itself.
     */
    public SessionPoolInner withSecrets(List<SessionPoolSecret> secrets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SessionPoolProperties();
        }
        this.innerProperties().withSecrets(secrets);
        return this;
    }

    /**
     * Get the dynamicPoolConfiguration property: The pool configuration if the poolManagementType is dynamic.
     * 
     * @return the dynamicPoolConfiguration value.
     */
    public DynamicPoolConfiguration dynamicPoolConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().dynamicPoolConfiguration();
    }

    /**
     * Set the dynamicPoolConfiguration property: The pool configuration if the poolManagementType is dynamic.
     * 
     * @param dynamicPoolConfiguration the dynamicPoolConfiguration value to set.
     * @return the SessionPoolInner object itself.
     */
    public SessionPoolInner withDynamicPoolConfiguration(DynamicPoolConfiguration dynamicPoolConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SessionPoolProperties();
        }
        this.innerProperties().withDynamicPoolConfiguration(dynamicPoolConfiguration);
        return this;
    }

    /**
     * Get the customContainerTemplate property: The custom container configuration if the containerType is
     * CustomContainer.
     * 
     * @return the customContainerTemplate value.
     */
    public CustomContainerTemplate customContainerTemplate() {
        return this.innerProperties() == null ? null : this.innerProperties().customContainerTemplate();
    }

    /**
     * Set the customContainerTemplate property: The custom container configuration if the containerType is
     * CustomContainer.
     * 
     * @param customContainerTemplate the customContainerTemplate value to set.
     * @return the SessionPoolInner object itself.
     */
    public SessionPoolInner withCustomContainerTemplate(CustomContainerTemplate customContainerTemplate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SessionPoolProperties();
        }
        this.innerProperties().withCustomContainerTemplate(customContainerTemplate);
        return this;
    }

    /**
     * Get the sessionNetworkConfiguration property: The network configuration of the sessions in the session pool.
     * 
     * @return the sessionNetworkConfiguration value.
     */
    public SessionNetworkConfiguration sessionNetworkConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().sessionNetworkConfiguration();
    }

    /**
     * Set the sessionNetworkConfiguration property: The network configuration of the sessions in the session pool.
     * 
     * @param sessionNetworkConfiguration the sessionNetworkConfiguration value to set.
     * @return the SessionPoolInner object itself.
     */
    public SessionPoolInner withSessionNetworkConfiguration(SessionNetworkConfiguration sessionNetworkConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SessionPoolProperties();
        }
        this.innerProperties().withSessionNetworkConfiguration(sessionNetworkConfiguration);
        return this;
    }

    /**
     * Get the poolManagementEndpoint property: The endpoint to manage the pool.
     * 
     * @return the poolManagementEndpoint value.
     */
    public String poolManagementEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().poolManagementEndpoint();
    }

    /**
     * Get the provisioningState property: Provisioning state of the session pool.
     * 
     * @return the provisioningState value.
     */
    public SessionPoolProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SessionPoolInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SessionPoolInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SessionPoolInner.
     */
    public static SessionPoolInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SessionPoolInner deserializedSessionPoolInner = new SessionPoolInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSessionPoolInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSessionPoolInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSessionPoolInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedSessionPoolInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedSessionPoolInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedSessionPoolInner.innerProperties = SessionPoolProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedSessionPoolInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSessionPoolInner;
        });
    }
}
