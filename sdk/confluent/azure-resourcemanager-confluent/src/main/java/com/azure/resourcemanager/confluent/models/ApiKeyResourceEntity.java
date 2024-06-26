// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * API Key Resource details which can be kafka cluster or schema registry cluster.
 */
@Fluent
public final class ApiKeyResourceEntity {
    /*
     * Id of the resource
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The environment of the api key
     */
    @JsonProperty(value = "environment")
    private String environment;

    /*
     * API URL for accessing or modifying the api key resource object
     */
    @JsonProperty(value = "related")
    private String related;

    /*
     * CRN reference to the referred resource
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /*
     * Type of the owner which can be service or user account
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Creates an instance of ApiKeyResourceEntity class.
     */
    public ApiKeyResourceEntity() {
    }

    /**
     * Get the id property: Id of the resource.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Id of the resource.
     * 
     * @param id the id value to set.
     * @return the ApiKeyResourceEntity object itself.
     */
    public ApiKeyResourceEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the environment property: The environment of the api key.
     * 
     * @return the environment value.
     */
    public String environment() {
        return this.environment;
    }

    /**
     * Set the environment property: The environment of the api key.
     * 
     * @param environment the environment value to set.
     * @return the ApiKeyResourceEntity object itself.
     */
    public ApiKeyResourceEntity withEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get the related property: API URL for accessing or modifying the api key resource object.
     * 
     * @return the related value.
     */
    public String related() {
        return this.related;
    }

    /**
     * Set the related property: API URL for accessing or modifying the api key resource object.
     * 
     * @param related the related value to set.
     * @return the ApiKeyResourceEntity object itself.
     */
    public ApiKeyResourceEntity withRelated(String related) {
        this.related = related;
        return this;
    }

    /**
     * Get the resourceName property: CRN reference to the referred resource.
     * 
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: CRN reference to the referred resource.
     * 
     * @param resourceName the resourceName value to set.
     * @return the ApiKeyResourceEntity object itself.
     */
    public ApiKeyResourceEntity withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get the kind property: Type of the owner which can be service or user account.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Type of the owner which can be service or user account.
     * 
     * @param kind the kind value to set.
     * @return the ApiKeyResourceEntity object itself.
     */
    public ApiKeyResourceEntity withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
