// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.AggregateRoute;
import org.junit.jupiter.api.Assertions;

public final class AggregateRouteTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AggregateRoute model =
            BinaryData.fromString("{\"prefix\":\"xywpmueefjzwfqkq\"}").toObject(AggregateRoute.class);
        Assertions.assertEquals("xywpmueefjzwfqkq", model.prefix());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AggregateRoute model = new AggregateRoute().withPrefix("xywpmueefjzwfqkq");
        model = BinaryData.fromObject(model).toObject(AggregateRoute.class);
        Assertions.assertEquals("xywpmueefjzwfqkq", model.prefix());
    }
}