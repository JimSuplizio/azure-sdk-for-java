// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

import com.azure.resourcemanager.notificationhubs.models.CheckAvailabilityParameters;

/**
 * Samples for Namespaces CheckAvailability.
 */
public final class NamespacesCheckAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/notificationhubs/resource-manager/Microsoft.NotificationHubs/stable/2017-04-01/examples/Namespaces/
     * NHNameSpaceCheckNameAvailability.json
     */
    /**
     * Sample code: NameSpaceCheckNameAvailability.
     * 
     * @param manager Entry point to NotificationHubsManager.
     */
    public static void
        nameSpaceCheckNameAvailability(com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager) {
        manager.namespaces()
            .checkAvailabilityWithResponse(new CheckAvailabilityParameters().withName("sdk-Namespace-2924"),
                com.azure.core.util.Context.NONE);
    }
}
