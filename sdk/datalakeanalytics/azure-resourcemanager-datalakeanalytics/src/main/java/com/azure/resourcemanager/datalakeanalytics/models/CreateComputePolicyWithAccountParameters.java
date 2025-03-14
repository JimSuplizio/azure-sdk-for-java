// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.CreateOrUpdateComputePolicyProperties;
import java.io.IOException;
import java.util.UUID;

/**
 * The parameters used to create a new compute policy while creating a new Data Lake Analytics account.
 */
@Fluent
public final class CreateComputePolicyWithAccountParameters
    implements JsonSerializable<CreateComputePolicyWithAccountParameters> {
    /*
     * The unique name of the compute policy to create.
     */
    private String name;

    /*
     * The compute policy properties to use when creating a new compute policy.
     */
    private CreateOrUpdateComputePolicyProperties innerProperties = new CreateOrUpdateComputePolicyProperties();

    /**
     * Creates an instance of CreateComputePolicyWithAccountParameters class.
     */
    public CreateComputePolicyWithAccountParameters() {
    }

    /**
     * Get the name property: The unique name of the compute policy to create.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The unique name of the compute policy to create.
     * 
     * @param name the name value to set.
     * @return the CreateComputePolicyWithAccountParameters object itself.
     */
    public CreateComputePolicyWithAccountParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: The compute policy properties to use when creating a new compute policy.
     * 
     * @return the innerProperties value.
     */
    private CreateOrUpdateComputePolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the objectId property: The AAD object identifier for the entity to create a policy for.
     * 
     * @return the objectId value.
     */
    public UUID objectId() {
        return this.innerProperties() == null ? null : this.innerProperties().objectId();
    }

    /**
     * Set the objectId property: The AAD object identifier for the entity to create a policy for.
     * 
     * @param objectId the objectId value to set.
     * @return the CreateComputePolicyWithAccountParameters object itself.
     */
    public CreateComputePolicyWithAccountParameters withObjectId(UUID objectId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateOrUpdateComputePolicyProperties();
        }
        this.innerProperties().withObjectId(objectId);
        return this;
    }

    /**
     * Get the objectType property: The type of AAD object the object identifier refers to.
     * 
     * @return the objectType value.
     */
    public AadObjectType objectType() {
        return this.innerProperties() == null ? null : this.innerProperties().objectType();
    }

    /**
     * Set the objectType property: The type of AAD object the object identifier refers to.
     * 
     * @param objectType the objectType value to set.
     * @return the CreateComputePolicyWithAccountParameters object itself.
     */
    public CreateComputePolicyWithAccountParameters withObjectType(AadObjectType objectType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateOrUpdateComputePolicyProperties();
        }
        this.innerProperties().withObjectType(objectType);
        return this;
    }

    /**
     * Get the maxDegreeOfParallelismPerJob property: The maximum degree of parallelism per job this user can use to
     * submit jobs. This property, the min priority per job property, or both must be passed.
     * 
     * @return the maxDegreeOfParallelismPerJob value.
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.innerProperties() == null ? null : this.innerProperties().maxDegreeOfParallelismPerJob();
    }

    /**
     * Set the maxDegreeOfParallelismPerJob property: The maximum degree of parallelism per job this user can use to
     * submit jobs. This property, the min priority per job property, or both must be passed.
     * 
     * @param maxDegreeOfParallelismPerJob the maxDegreeOfParallelismPerJob value to set.
     * @return the CreateComputePolicyWithAccountParameters object itself.
     */
    public CreateComputePolicyWithAccountParameters
        withMaxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateOrUpdateComputePolicyProperties();
        }
        this.innerProperties().withMaxDegreeOfParallelismPerJob(maxDegreeOfParallelismPerJob);
        return this;
    }

    /**
     * Get the minPriorityPerJob property: The minimum priority per job this user can use to submit jobs. This property,
     * the max degree of parallelism per job property, or both must be passed.
     * 
     * @return the minPriorityPerJob value.
     */
    public Integer minPriorityPerJob() {
        return this.innerProperties() == null ? null : this.innerProperties().minPriorityPerJob();
    }

    /**
     * Set the minPriorityPerJob property: The minimum priority per job this user can use to submit jobs. This property,
     * the max degree of parallelism per job property, or both must be passed.
     * 
     * @param minPriorityPerJob the minPriorityPerJob value to set.
     * @return the CreateComputePolicyWithAccountParameters object itself.
     */
    public CreateComputePolicyWithAccountParameters withMinPriorityPerJob(Integer minPriorityPerJob) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateOrUpdateComputePolicyProperties();
        }
        this.innerProperties().withMinPriorityPerJob(minPriorityPerJob);
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
                .log(new IllegalArgumentException(
                    "Missing required property name in model CreateComputePolicyWithAccountParameters"));
        }
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model CreateComputePolicyWithAccountParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CreateComputePolicyWithAccountParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateComputePolicyWithAccountParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateComputePolicyWithAccountParameters if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateComputePolicyWithAccountParameters.
     */
    public static CreateComputePolicyWithAccountParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateComputePolicyWithAccountParameters deserializedCreateComputePolicyWithAccountParameters
                = new CreateComputePolicyWithAccountParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedCreateComputePolicyWithAccountParameters.name = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedCreateComputePolicyWithAccountParameters.innerProperties
                        = CreateOrUpdateComputePolicyProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCreateComputePolicyWithAccountParameters;
        });
    }
}
