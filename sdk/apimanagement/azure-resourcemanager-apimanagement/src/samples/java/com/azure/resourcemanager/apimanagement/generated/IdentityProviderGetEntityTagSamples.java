// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.resourcemanager.apimanagement.models.IdentityProviderType;

/**
 * Samples for IdentityProvider GetEntityTag.
 */
public final class IdentityProviderGetEntityTagSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementHeadIdentityProvider.json
     */
    /**
     * Sample code: ApiManagementHeadIdentityProvider.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementHeadIdentityProvider(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.identityProviders()
            .getEntityTagWithResponse("rg1", "apimService1", IdentityProviderType.AAD_B2C,
                com.azure.core.util.Context.NONE);
    }
}
