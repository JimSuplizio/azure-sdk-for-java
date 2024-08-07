// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ServiceEndpoint;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServiceEndpointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceEndpoint model = BinaryData.fromString(
            "{\"service\":\"dd\",\"locations\":[\"bcuejrjxgci\",\"ibrhosxsdqr\",\"zoymibmrqyibahw\",\"luszdtmhrkwof\"]}")
            .toObject(ServiceEndpoint.class);
        Assertions.assertEquals("dd", model.service());
        Assertions.assertEquals("bcuejrjxgci", model.locations().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceEndpoint model = new ServiceEndpoint().withService("dd")
            .withLocations(Arrays.asList("bcuejrjxgci", "ibrhosxsdqr", "zoymibmrqyibahw", "luszdtmhrkwof"));
        model = BinaryData.fromObject(model).toObject(ServiceEndpoint.class);
        Assertions.assertEquals("dd", model.service());
        Assertions.assertEquals("bcuejrjxgci", model.locations().get(0));
    }
}
