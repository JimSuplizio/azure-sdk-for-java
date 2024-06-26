// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azureadexternalidentities.generated;

import com.azure.core.util.Context;

/** Samples for B2CTenants Delete. */
public final class B2CTenantsDeleteSamples {
    /*
     * x-ms-original-file: specification/cpim/resource-manager/Microsoft.AzureActiveDirectory/stable/2021-04-01/examples/deleteTenant.json
     */
    /**
     * Sample code: Delete tenant.
     *
     * @param manager Entry point to ExternalIdentitiesConfigurationManager.
     */
    public static void deleteTenant(
        com.azure.resourcemanager.azureadexternalidentities.ExternalIdentitiesConfigurationManager manager) {
        manager.b2CTenants().delete("rg1", "contoso.onmicrosoft.com", Context.NONE);
    }
}
