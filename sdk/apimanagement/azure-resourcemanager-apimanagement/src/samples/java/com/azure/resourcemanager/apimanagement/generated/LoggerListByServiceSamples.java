// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for Logger ListByService.
 */
public final class LoggerListByServiceSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementListLoggers.json
     */
    /**
     * Sample code: ApiManagementListLoggers.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListLoggers(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.loggers().listByService("rg1", "apimService1", null, null, null, com.azure.core.util.Context.NONE);
    }
}
