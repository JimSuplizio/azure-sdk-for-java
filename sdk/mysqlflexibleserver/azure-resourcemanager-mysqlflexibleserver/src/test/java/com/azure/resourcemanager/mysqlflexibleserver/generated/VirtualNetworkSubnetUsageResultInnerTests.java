// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.VirtualNetworkSubnetUsageResultInner;

public final class VirtualNetworkSubnetUsageResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworkSubnetUsageResultInner model = BinaryData.fromString(
            "{\"location\":\"fyexfwhy\",\"subscriptionId\":\"i\",\"delegatedSubnetsUsage\":[{\"subnetName\":\"dcsi\",\"usage\":8188348657353643150},{\"subnetName\":\"amdecte\",\"usage\":485478669807006997},{\"subnetName\":\"cj\",\"usage\":5437486908155623563}]}")
            .toObject(VirtualNetworkSubnetUsageResultInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworkSubnetUsageResultInner model = new VirtualNetworkSubnetUsageResultInner();
        model = BinaryData.fromObject(model).toObject(VirtualNetworkSubnetUsageResultInner.class);
    }
}
