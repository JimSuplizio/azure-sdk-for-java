// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.graphservices.generated;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/graphservicesprod/resource-manager/Microsoft.GraphServices/stable/2023-04-13/examples/Operations_List.json
     */
    /**
     * Sample code: Get list of operations.
     *
     * @param manager Entry point to GraphServicesManager.
     */
    public static void getListOfOperations(com.azure.resourcemanager.graphservices.GraphServicesManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}