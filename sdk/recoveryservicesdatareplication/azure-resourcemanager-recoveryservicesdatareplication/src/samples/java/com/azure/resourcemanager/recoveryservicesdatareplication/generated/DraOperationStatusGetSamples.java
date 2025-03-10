// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

/**
 * Samples for DraOperationStatus Get.
 */
public final class DraOperationStatusGetSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesdatareplication/resource-manager/Microsoft.DataReplication/preview/2021-02-16-
     * preview/examples/DraOperationStatus_Get.json
     */
    /**
     * Sample code: DraOperationStatus_Get.
     * 
     * @param manager Entry point to RecoveryServicesDataReplicationManager.
     */
    public static void draOperationStatusGet(
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager manager) {
        manager.draOperationStatus()
            .getWithResponse("rgrecoveryservicesdatareplication", "wPR", "M", "dadsqwcq",
                com.azure.core.util.Context.NONE);
    }
}
