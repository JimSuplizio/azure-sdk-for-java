// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.powerbidedicated.fluent.models.AutoScaleVCoreInner;
import com.azure.resourcemanager.powerbidedicated.models.AutoScaleVCoreUpdateParameters;

/**
 * An instance of this class provides access to all the operations defined in AutoScaleVCoresClient.
 */
public interface AutoScaleVCoresClient {
    /**
     * Gets details about the specified auto scale v-core.
     * 
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     * This name must be at least 1 character in length, and no more than 90.
     * @param vcoreName The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified auto scale v-core along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AutoScaleVCoreInner> getByResourceGroupWithResponse(String resourceGroupName, String vcoreName,
        Context context);

    /**
     * Gets details about the specified auto scale v-core.
     * 
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     * This name must be at least 1 character in length, and no more than 90.
     * @param vcoreName The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified auto scale v-core.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutoScaleVCoreInner getByResourceGroup(String resourceGroupName, String vcoreName);

    /**
     * Provisions the specified auto scale v-core based on the configuration specified in the request.
     * 
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     * This name must be at least 1 character in length, and no more than 90.
     * @param vcoreName The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * @param vCoreParameters Contains the information used to provision the auto scale v-core.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an instance of an auto scale v-core resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AutoScaleVCoreInner> createWithResponse(String resourceGroupName, String vcoreName,
        AutoScaleVCoreInner vCoreParameters, Context context);

    /**
     * Provisions the specified auto scale v-core based on the configuration specified in the request.
     * 
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     * This name must be at least 1 character in length, and no more than 90.
     * @param vcoreName The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * @param vCoreParameters Contains the information used to provision the auto scale v-core.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an instance of an auto scale v-core resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutoScaleVCoreInner create(String resourceGroupName, String vcoreName, AutoScaleVCoreInner vCoreParameters);

    /**
     * Deletes the specified auto scale v-core.
     * 
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     * This name must be at least 1 character in length, and no more than 90.
     * @param vcoreName The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String vcoreName, Context context);

    /**
     * Deletes the specified auto scale v-core.
     * 
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     * This name must be at least 1 character in length, and no more than 90.
     * @param vcoreName The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vcoreName);

    /**
     * Updates the current state of the specified auto scale v-core.
     * 
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     * This name must be at least 1 character in length, and no more than 90.
     * @param vcoreName The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * @param vCoreUpdateParameters Request object that contains the updated information for the auto scale v-core.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an instance of an auto scale v-core resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AutoScaleVCoreInner> updateWithResponse(String resourceGroupName, String vcoreName,
        AutoScaleVCoreUpdateParameters vCoreUpdateParameters, Context context);

    /**
     * Updates the current state of the specified auto scale v-core.
     * 
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     * This name must be at least 1 character in length, and no more than 90.
     * @param vcoreName The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * @param vCoreUpdateParameters Request object that contains the updated information for the auto scale v-core.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an instance of an auto scale v-core resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutoScaleVCoreInner update(String resourceGroupName, String vcoreName,
        AutoScaleVCoreUpdateParameters vCoreUpdateParameters);

    /**
     * Gets all the auto scale v-cores for the given resource group.
     * 
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     * This name must be at least 1 character in length, and no more than 90.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the auto scale v-cores for the given resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutoScaleVCoreInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the auto scale v-cores for the given resource group.
     * 
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     * This name must be at least 1 character in length, and no more than 90.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the auto scale v-cores for the given resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutoScaleVCoreInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the auto scale v-cores for the given subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of auto scale v-core resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutoScaleVCoreInner> list();

    /**
     * Lists all the auto scale v-cores for the given subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of auto scale v-core resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutoScaleVCoreInner> list(Context context);
}
