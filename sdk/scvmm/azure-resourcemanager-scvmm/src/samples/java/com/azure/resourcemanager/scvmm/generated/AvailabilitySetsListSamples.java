// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

/**
 * Samples for AvailabilitySets List.
 */
public final class AvailabilitySetsListSamples {
    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/stable/2023-10-07/examples/
     * AvailabilitySets_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: AvailabilitySets_ListBySubscription_MinimumSet.
     * 
     * @param manager Entry point to ScvmmManager.
     */
    public static void
        availabilitySetsListBySubscriptionMinimumSet(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.availabilitySets().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/stable/2023-10-07/examples/
     * AvailabilitySets_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: AvailabilitySets_ListBySubscription_MaximumSet.
     * 
     * @param manager Entry point to ScvmmManager.
     */
    public static void
        availabilitySetsListBySubscriptionMaximumSet(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.availabilitySets().list(com.azure.core.util.Context.NONE);
    }
}
