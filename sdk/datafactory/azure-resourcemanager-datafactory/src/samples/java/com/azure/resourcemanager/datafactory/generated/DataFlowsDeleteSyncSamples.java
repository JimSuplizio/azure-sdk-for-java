// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/**
 * Samples for DataFlows DeleteSync.
 */
public final class DataFlowsDeleteSyncSamples {
    /*
     * x-ms-original-file:
     * specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/DataFlows_Delete.json
     */
    /**
     * Sample code: DataFlows_Delete.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void dataFlowsDelete(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.dataFlows()
            .deleteWithResponse("exampleResourceGroup", "exampleFactoryName", "exampleDataFlow",
                com.azure.core.util.Context.NONE);
    }
}
