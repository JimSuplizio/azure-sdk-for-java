// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.HybridConnectionEventSubscriptionDestinationProperties;
import com.azure.resourcemanager.eventgrid.models.DeliveryAttributeMapping;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class HybridConnectionEventSubscriptionDestinationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HybridConnectionEventSubscriptionDestinationProperties model = BinaryData.fromString(
            "{\"resourceId\":\"tqqvy\",\"deliveryAttributeMappings\":[{\"type\":\"DeliveryAttributeMapping\",\"name\":\"rfwb\"},{\"type\":\"DeliveryAttributeMapping\",\"name\":\"qvogfuyz\"},{\"type\":\"DeliveryAttributeMapping\",\"name\":\"bhli\"}]}")
            .toObject(HybridConnectionEventSubscriptionDestinationProperties.class);
        Assertions.assertEquals("tqqvy", model.resourceId());
        Assertions.assertEquals("rfwb", model.deliveryAttributeMappings().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HybridConnectionEventSubscriptionDestinationProperties model
            = new HybridConnectionEventSubscriptionDestinationProperties().withResourceId("tqqvy")
                .withDeliveryAttributeMappings(Arrays.asList(new DeliveryAttributeMapping().withName("rfwb"),
                    new DeliveryAttributeMapping().withName("qvogfuyz"),
                    new DeliveryAttributeMapping().withName("bhli")));
        model = BinaryData.fromObject(model).toObject(HybridConnectionEventSubscriptionDestinationProperties.class);
        Assertions.assertEquals("tqqvy", model.resourceId());
        Assertions.assertEquals("rfwb", model.deliveryAttributeMappings().get(0).name());
    }
}
