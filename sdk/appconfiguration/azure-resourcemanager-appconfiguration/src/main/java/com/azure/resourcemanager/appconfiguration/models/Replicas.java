// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Replicas.
 */
public interface Replicas {
    /**
     * Lists the replicas for a given configuration store.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list replicas as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Replica> listByConfigurationStore(String resourceGroupName, String configStoreName);

    /**
     * Lists the replicas for a given configuration store.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result.
     * If a previous response contains a nextLink element, the value of the nextLink element will include a skipToken
     * parameter that specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list replicas as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Replica> listByConfigurationStore(String resourceGroupName, String configStoreName, String skipToken,
        Context context);

    /**
     * Gets the properties of the specified replica.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param replicaName The name of the replica.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified replica along with {@link Response}.
     */
    Response<Replica> getWithResponse(String resourceGroupName, String configStoreName, String replicaName,
        Context context);

    /**
     * Gets the properties of the specified replica.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param replicaName The name of the replica.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified replica.
     */
    Replica get(String resourceGroupName, String configStoreName, String replicaName);

    /**
     * Deletes a replica.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param replicaName The name of the replica.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String configStoreName, String replicaName);

    /**
     * Deletes a replica.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param replicaName The name of the replica.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String configStoreName, String replicaName, Context context);

    /**
     * Gets the properties of the specified replica.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified replica along with {@link Response}.
     */
    Replica getById(String id);

    /**
     * Gets the properties of the specified replica.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified replica along with {@link Response}.
     */
    Response<Replica> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a replica.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a replica.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Replica resource.
     * 
     * @param name resource name.
     * @return the first stage of the new Replica definition.
     */
    Replica.DefinitionStages.Blank define(String name);
}
