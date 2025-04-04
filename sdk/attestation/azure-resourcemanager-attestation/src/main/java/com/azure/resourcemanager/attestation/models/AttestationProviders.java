// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of AttestationProviders.
 */
public interface AttestationProviders {
    /**
     * Get the status of Attestation Provider.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName Name of the attestation provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Attestation Provider along with {@link Response}.
     */
    Response<AttestationProvider> getByResourceGroupWithResponse(String resourceGroupName, String providerName,
        Context context);

    /**
     * Get the status of Attestation Provider.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName Name of the attestation provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Attestation Provider.
     */
    AttestationProvider getByResourceGroup(String resourceGroupName, String providerName);

    /**
     * Delete Attestation Service.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName Name of the attestation service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String providerName, Context context);

    /**
     * Delete Attestation Service.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName Name of the attestation service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String providerName);

    /**
     * Returns a list of attestation providers in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation Providers List along with {@link Response}.
     */
    Response<AttestationProviderListResult> listWithResponse(Context context);

    /**
     * Returns a list of attestation providers in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation Providers List.
     */
    AttestationProviderListResult list();

    /**
     * Returns attestation providers list in a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation Providers List along with {@link Response}.
     */
    Response<AttestationProviderListResult> listByResourceGroupWithResponse(String resourceGroupName, Context context);

    /**
     * Returns attestation providers list in a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return attestation Providers List.
     */
    AttestationProviderListResult listByResourceGroup(String resourceGroupName);

    /**
     * Get the default provider.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default provider along with {@link Response}.
     */
    Response<AttestationProviderListResult> listDefaultWithResponse(Context context);

    /**
     * Get the default provider.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default provider.
     */
    AttestationProviderListResult listDefault();

    /**
     * Get the default provider by location.
     * 
     * @param location The location of the default provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default provider by location along with {@link Response}.
     */
    Response<AttestationProvider> getDefaultByLocationWithResponse(String location, Context context);

    /**
     * Get the default provider by location.
     * 
     * @param location The location of the default provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default provider by location.
     */
    AttestationProvider getDefaultByLocation(String location);

    /**
     * Get the status of Attestation Provider.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Attestation Provider along with {@link Response}.
     */
    AttestationProvider getById(String id);

    /**
     * Get the status of Attestation Provider.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Attestation Provider along with {@link Response}.
     */
    Response<AttestationProvider> getByIdWithResponse(String id, Context context);

    /**
     * Delete Attestation Service.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete Attestation Service.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AttestationProvider resource.
     * 
     * @param name resource name.
     * @return the first stage of the new AttestationProvider definition.
     */
    AttestationProvider.DefinitionStages.Blank define(String name);
}
