// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computeschedule.generated;

import com.azure.resourcemanager.computeschedule.models.CancelOperationsRequest;
import java.util.Arrays;

/**
 * Samples for ScheduledActions VirtualMachinesCancelOperations.
 */
public final class ScheduledActionsVirtualMachinesCancelOperationsSamples {
    /*
     * x-ms-original-file: 2024-10-01/ScheduledActions_VirtualMachinesCancelOperations.json
     */
    /**
     * Sample code: ScheduledActions_VirtualMachinesCancelOperations.
     * 
     * @param manager Entry point to ComputeScheduleManager.
     */
    public static void scheduledActionsVirtualMachinesCancelOperations(
        com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager) {
        manager.scheduledActions()
            .virtualMachinesCancelOperationsWithResponse("eastus2euap",
                new CancelOperationsRequest().withOperationIds(Arrays.asList("23480d2f-1dca-4610-afb4-dd25eec1f34r"))
                    .withCorrelationid("23480d2f-1dca-4610-afb4-gg25eec1f34r"),
                com.azure.core.util.Context.NONE);
    }
}
