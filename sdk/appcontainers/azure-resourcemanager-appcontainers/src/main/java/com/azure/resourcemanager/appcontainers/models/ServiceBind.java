// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Configuration to bind a ContainerApp to a dev ContainerApp Service.
 */
@Fluent
public final class ServiceBind {
    /*
     * Resource id of the target service
     */
    @JsonProperty(value = "serviceId")
    private String serviceId;

    /*
     * Name of the service bind
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Type of the client to be used to connect to the service
     */
    @JsonProperty(value = "clientType")
    private String clientType;

    /*
     * Customized keys for customizing injected values to the app
     */
    @JsonProperty(value = "customizedKeys")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> customizedKeys;

    /**
     * Creates an instance of ServiceBind class.
     */
    public ServiceBind() {
    }

    /**
     * Get the serviceId property: Resource id of the target service.
     * 
     * @return the serviceId value.
     */
    public String serviceId() {
        return this.serviceId;
    }

    /**
     * Set the serviceId property: Resource id of the target service.
     * 
     * @param serviceId the serviceId value to set.
     * @return the ServiceBind object itself.
     */
    public ServiceBind withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Get the name property: Name of the service bind.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the service bind.
     * 
     * @param name the name value to set.
     * @return the ServiceBind object itself.
     */
    public ServiceBind withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the clientType property: Type of the client to be used to connect to the service.
     * 
     * @return the clientType value.
     */
    public String clientType() {
        return this.clientType;
    }

    /**
     * Set the clientType property: Type of the client to be used to connect to the service.
     * 
     * @param clientType the clientType value to set.
     * @return the ServiceBind object itself.
     */
    public ServiceBind withClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }

    /**
     * Get the customizedKeys property: Customized keys for customizing injected values to the app.
     * 
     * @return the customizedKeys value.
     */
    public Map<String, String> customizedKeys() {
        return this.customizedKeys;
    }

    /**
     * Set the customizedKeys property: Customized keys for customizing injected values to the app.
     * 
     * @param customizedKeys the customizedKeys value to set.
     * @return the ServiceBind object itself.
     */
    public ServiceBind withCustomizedKeys(Map<String, String> customizedKeys) {
        this.customizedKeys = customizedKeys;
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
