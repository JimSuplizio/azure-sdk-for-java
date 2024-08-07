// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated;

/**
 * Samples for Queues ListByNamespace.
 */
public final class QueuesListByNamespaceSamples {
    /*
     * x-ms-original-file:
     * specification/servicebus/resource-manager/Microsoft.ServiceBus/stable/2021-11-01/examples/Queues/
     * SBQueueListByNameSpace.json
     */
    /**
     * Sample code: QueueListByNameSpace.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void queueListByNameSpace(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.serviceBusNamespaces()
            .manager()
            .serviceClient()
            .getQueues()
            .listByNamespace("ArunMonocle", "sdk-Namespace-3174", null, null, com.azure.core.util.Context.NONE);
    }
}
