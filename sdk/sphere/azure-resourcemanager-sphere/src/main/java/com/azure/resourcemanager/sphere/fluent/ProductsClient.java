// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sphere.fluent.models.CountDeviceResponseInner;
import com.azure.resourcemanager.sphere.fluent.models.DeviceGroupInner;
import com.azure.resourcemanager.sphere.fluent.models.ProductInner;
import com.azure.resourcemanager.sphere.models.ProductUpdate;

/** An instance of this class provides access to all the operations defined in ProductsClient. */
public interface ProductsClient {
    /**
     * List Product resources by Catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Product list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProductInner> listByCatalog(String resourceGroupName, String catalogName);

    /**
     * List Product resources by Catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Product list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProductInner> listByCatalog(String resourceGroupName, String catalogName, Context context);

    /**
     * Get a Product. '.default' and '.unassigned' are system defined values and cannot be used for product name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Product along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProductInner> getWithResponse(
        String resourceGroupName, String catalogName, String productName, Context context);

    /**
     * Get a Product. '.default' and '.unassigned' are system defined values and cannot be used for product name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Product.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner get(String resourceGroupName, String catalogName, String productName);

    /**
     * Create a Product. '.default' and '.unassigned' are system defined values and cannot be used for product name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an product resource belonging to a catalog resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProductInner>, ProductInner> beginCreateOrUpdate(
        String resourceGroupName, String catalogName, String productName, ProductInner resource);

    /**
     * Create a Product. '.default' and '.unassigned' are system defined values and cannot be used for product name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an product resource belonging to a catalog resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProductInner>, ProductInner> beginCreateOrUpdate(
        String resourceGroupName, String catalogName, String productName, ProductInner resource, Context context);

    /**
     * Create a Product. '.default' and '.unassigned' are system defined values and cannot be used for product name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an product resource belonging to a catalog resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner createOrUpdate(
        String resourceGroupName, String catalogName, String productName, ProductInner resource);

    /**
     * Create a Product. '.default' and '.unassigned' are system defined values and cannot be used for product name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an product resource belonging to a catalog resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner createOrUpdate(
        String resourceGroupName, String catalogName, String productName, ProductInner resource, Context context);

    /**
     * Update a Product. '.default' and '.unassigned' are system defined values and cannot be used for product name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an product resource belonging to a catalog resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProductInner>, ProductInner> beginUpdate(
        String resourceGroupName, String catalogName, String productName, ProductUpdate properties);

    /**
     * Update a Product. '.default' and '.unassigned' are system defined values and cannot be used for product name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an product resource belonging to a catalog resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProductInner>, ProductInner> beginUpdate(
        String resourceGroupName, String catalogName, String productName, ProductUpdate properties, Context context);

    /**
     * Update a Product. '.default' and '.unassigned' are system defined values and cannot be used for product name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an product resource belonging to a catalog resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner update(String resourceGroupName, String catalogName, String productName, ProductUpdate properties);

    /**
     * Update a Product. '.default' and '.unassigned' are system defined values and cannot be used for product name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an product resource belonging to a catalog resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner update(
        String resourceGroupName, String catalogName, String productName, ProductUpdate properties, Context context);

    /**
     * Delete a Product. '.default' and '.unassigned' are system defined values and cannot be used for product name'.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String catalogName, String productName);

    /**
     * Delete a Product. '.default' and '.unassigned' are system defined values and cannot be used for product name'.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String catalogName, String productName, Context context);

    /**
     * Delete a Product. '.default' and '.unassigned' are system defined values and cannot be used for product name'.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String catalogName, String productName);

    /**
     * Delete a Product. '.default' and '.unassigned' are system defined values and cannot be used for product name'.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String catalogName, String productName, Context context);

    /**
     * Counts devices in product. '.default' and '.unassigned' are system defined values and cannot be used for product
     * name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to the action call for count devices in a catalog along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CountDeviceResponseInner> countDevicesWithResponse(
        String resourceGroupName, String catalogName, String productName, Context context);

    /**
     * Counts devices in product. '.default' and '.unassigned' are system defined values and cannot be used for product
     * name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to the action call for count devices in a catalog.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CountDeviceResponseInner countDevices(String resourceGroupName, String catalogName, String productName);

    /**
     * Generates default device groups for the product. '.default' and '.unassigned' are system defined values and
     * cannot be used for product name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DeviceGroup list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeviceGroupInner> generateDefaultDeviceGroups(
        String resourceGroupName, String catalogName, String productName);

    /**
     * Generates default device groups for the product. '.default' and '.unassigned' are system defined values and
     * cannot be used for product name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param catalogName Name of catalog.
     * @param productName Name of product.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DeviceGroup list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeviceGroupInner> generateDefaultDeviceGroups(
        String resourceGroupName, String catalogName, String productName, Context context);
}