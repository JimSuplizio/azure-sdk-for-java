// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicenetworking.models.SecurityPolicyConfigurations;
import com.azure.resourcemanager.servicenetworking.models.TrafficControllerUpdate;
import com.azure.resourcemanager.servicenetworking.models.TrafficControllerUpdateProperties;
import com.azure.resourcemanager.servicenetworking.models.WafSecurityPolicy;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TrafficControllerUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TrafficControllerUpdate model = BinaryData.fromString(
            "{\"tags\":{\"t\":\"ddglm\"},\"properties\":{\"securityPolicyConfigurations\":{\"wafSecurityPolicy\":{\"id\":\"wpyeicxmqciwqvh\"}}}}")
            .toObject(TrafficControllerUpdate.class);
        Assertions.assertEquals("ddglm", model.tags().get("t"));
        Assertions.assertEquals("wpyeicxmqciwqvh",
            model.properties().securityPolicyConfigurations().wafSecurityPolicy().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TrafficControllerUpdate model = new TrafficControllerUpdate().withTags(mapOf("t", "ddglm"))
            .withProperties(new TrafficControllerUpdateProperties()
                .withSecurityPolicyConfigurations(new SecurityPolicyConfigurations()
                    .withWafSecurityPolicy(new WafSecurityPolicy().withId("wpyeicxmqciwqvh"))));
        model = BinaryData.fromObject(model).toObject(TrafficControllerUpdate.class);
        Assertions.assertEquals("ddglm", model.tags().get("t"));
        Assertions.assertEquals("wpyeicxmqciwqvh",
            model.properties().securityPolicyConfigurations().wafSecurityPolicy().id());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
