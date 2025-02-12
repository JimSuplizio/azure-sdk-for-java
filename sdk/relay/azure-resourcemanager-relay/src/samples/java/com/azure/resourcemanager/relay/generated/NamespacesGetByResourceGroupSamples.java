// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated;

/**
 * Samples for Namespaces GetByResourceGroup.
 */
public final class NamespacesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/relay/resource-manager/Microsoft.Relay/stable/2017-04-01/examples/NameSpaces/RelayNameSpaceGet.json
     */
    /**
     * Sample code: RelayNameSpaceGet.
     * 
     * @param manager Entry point to RelayManager.
     */
    public static void relayNameSpaceGet(com.azure.resourcemanager.relay.RelayManager manager) {
        manager.namespaces()
            .getByResourceGroupWithResponse("resourcegroup", "example-RelayNamespace-01",
                com.azure.core.util.Context.NONE);
    }
}
