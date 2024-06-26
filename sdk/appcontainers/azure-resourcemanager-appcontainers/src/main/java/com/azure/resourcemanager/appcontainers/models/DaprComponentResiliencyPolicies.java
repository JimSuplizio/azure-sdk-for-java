// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of DaprComponentResiliencyPolicies.
 */
public interface DaprComponentResiliencyPolicies {
    /**
     * Get the resiliency policies for a Dapr component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param componentName Name of the Dapr Component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resiliency policies for a Dapr component as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DaprComponentResiliencyPolicy> list(String resourceGroupName, String environmentName,
        String componentName);

    /**
     * Get the resiliency policies for a Dapr component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param componentName Name of the Dapr Component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resiliency policies for a Dapr component as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DaprComponentResiliencyPolicy> list(String resourceGroupName, String environmentName,
        String componentName, Context context);

    /**
     * Get a Dapr component resiliency policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param componentName Name of the Dapr Component.
     * @param name Name of the Dapr Component Resiliency Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Dapr component resiliency policy along with {@link Response}.
     */
    Response<DaprComponentResiliencyPolicy> getWithResponse(String resourceGroupName, String environmentName,
        String componentName, String name, Context context);

    /**
     * Get a Dapr component resiliency policy.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param componentName Name of the Dapr Component.
     * @param name Name of the Dapr Component Resiliency Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Dapr component resiliency policy.
     */
    DaprComponentResiliencyPolicy get(String resourceGroupName, String environmentName, String componentName,
        String name);

    /**
     * Delete a Dapr component resiliency policy.
     * 
     * Delete a resiliency policy for a Dapr component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param componentName Name of the Dapr Component.
     * @param name Name of the Dapr Component Resiliency Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String environmentName, String componentName,
        String name, Context context);

    /**
     * Delete a Dapr component resiliency policy.
     * 
     * Delete a resiliency policy for a Dapr component.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param componentName Name of the Dapr Component.
     * @param name Name of the Dapr Component Resiliency Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String environmentName, String componentName, String name);

    /**
     * Get a Dapr component resiliency policy.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Dapr component resiliency policy along with {@link Response}.
     */
    DaprComponentResiliencyPolicy getById(String id);

    /**
     * Get a Dapr component resiliency policy.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Dapr component resiliency policy along with {@link Response}.
     */
    Response<DaprComponentResiliencyPolicy> getByIdWithResponse(String id, Context context);

    /**
     * Delete a Dapr component resiliency policy.
     * 
     * Delete a resiliency policy for a Dapr component.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a Dapr component resiliency policy.
     * 
     * Delete a resiliency policy for a Dapr component.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DaprComponentResiliencyPolicy resource.
     * 
     * @param name resource name.
     * @return the first stage of the new DaprComponentResiliencyPolicy definition.
     */
    DaprComponentResiliencyPolicy.DefinitionStages.Blank define(String name);
}
