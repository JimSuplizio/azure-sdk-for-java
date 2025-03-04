// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of NetworkDeviceSkus.
 */
public interface NetworkDeviceSkus {
    /**
     * Gets a Network Device Sku.
     * 
     * Get a Network Device SKU details.
     * 
     * @param networkDeviceSkuName Name of the Network Device SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Network Device SKU details along with {@link Response}.
     */
    Response<NetworkDeviceSku> getWithResponse(String networkDeviceSkuName, Context context);

    /**
     * Gets a Network Device Sku.
     * 
     * Get a Network Device SKU details.
     * 
     * @param networkDeviceSkuName Name of the Network Device SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Network Device SKU details.
     */
    NetworkDeviceSku get(String networkDeviceSkuName);

    /**
     * List Network Device SKUs by subscription.
     * 
     * List Network Device SKUs for the given subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Network Device SKUs as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkDeviceSku> list();

    /**
     * List Network Device SKUs by subscription.
     * 
     * List Network Device SKUs for the given subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Network Device SKUs as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkDeviceSku> list(Context context);
}
