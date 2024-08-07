// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.models;

import com.azure.resourcemanager.informaticadatamanagement.fluent.models.CheckDependenciesResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of CheckDependenciesResponse.
 */
public interface CheckDependenciesResponse {
    /**
     * Gets the count property: Count of dependencies.
     * 
     * @return the count value.
     */
    int count();

    /**
     * Gets the id property: id of resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the references property: List of dependencies.
     * 
     * @return the references value.
     */
    List<ServerlessRuntimeDependency> references();

    /**
     * Gets the inner com.azure.resourcemanager.informaticadatamanagement.fluent.models.CheckDependenciesResponseInner
     * object.
     * 
     * @return the inner object.
     */
    CheckDependenciesResponseInner innerModel();
}
