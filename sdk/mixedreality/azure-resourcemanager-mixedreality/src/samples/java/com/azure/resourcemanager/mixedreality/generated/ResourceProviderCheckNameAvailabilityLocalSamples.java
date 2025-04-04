// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.generated;

import com.azure.resourcemanager.mixedreality.models.CheckNameAvailabilityRequest;

/**
 * Samples for ResourceProvider CheckNameAvailabilityLocal.
 */
public final class ResourceProviderCheckNameAvailabilityLocalSamples {
    /*
     * x-ms-original-file:
     * specification/mixedreality/resource-manager/Microsoft.MixedReality/stable/2021-01-01/examples/proxy/
     * CheckNameAvailabilityForLocalUniqueness.json
     */
    /**
     * Sample code: CheckLocalNameAvailability.
     * 
     * @param manager Entry point to MixedRealityManager.
     */
    public static void checkLocalNameAvailability(com.azure.resourcemanager.mixedreality.MixedRealityManager manager) {
        manager.resourceProviders()
            .checkNameAvailabilityLocalWithResponse("eastus2euap",
                new CheckNameAvailabilityRequest().withName("MyAccount")
                    .withType("Microsoft.MixedReality/spatialAnchorsAccounts"),
                com.azure.core.util.Context.NONE);
    }
}
