// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated;

import com.azure.resourcemanager.search.models.CheckNameAvailabilityInput;

/**
 * Samples for Services CheckNameAvailability.
 */
public final class ServicesCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/search/resource-manager/Microsoft.Search/stable/2023-11-01/examples/SearchCheckNameAvailability.
     * json
     */
    /**
     * Sample code: SearchCheckNameAvailability.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void searchCheckNameAvailability(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.searchServices()
            .manager()
            .serviceClient()
            .getServices()
            .checkNameAvailabilityWithResponse(new CheckNameAvailabilityInput().withName("mysearchservice"), null,
                com.azure.core.util.Context.NONE);
    }
}
