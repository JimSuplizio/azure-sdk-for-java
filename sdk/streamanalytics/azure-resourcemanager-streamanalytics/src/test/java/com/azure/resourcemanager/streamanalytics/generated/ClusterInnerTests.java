// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.fluent.models.ClusterInner;
import com.azure.resourcemanager.streamanalytics.models.ClusterSku;
import com.azure.resourcemanager.streamanalytics.models.ClusterSkuName;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterInner model = BinaryData.fromString(
            "{\"sku\":{\"name\":\"Default\",\"capacity\":202688177},\"etag\":\"ujjugwdkcglh\",\"properties\":{\"createdDate\":\"2021-06-29T07:35:32Z\",\"clusterId\":\"dyggdtjixhbku\",\"provisioningState\":\"Canceled\",\"capacityAllocated\":194127225,\"capacityAssigned\":363488888},\"location\":\"hmenevfyexfwhybc\",\"tags\":{\"dectehfiqsc\":\"yvdcsitynnaa\",\"hcjrefovgmk\":\"eypvhezrkg\"},\"id\":\"sle\",\"name\":\"yvxyqjp\",\"type\":\"cattpngjcrcczsq\"}")
            .toObject(ClusterInner.class);
        Assertions.assertEquals("hmenevfyexfwhybc", model.location());
        Assertions.assertEquals("yvdcsitynnaa", model.tags().get("dectehfiqsc"));
        Assertions.assertEquals(ClusterSkuName.DEFAULT, model.sku().name());
        Assertions.assertEquals(202688177, model.sku().capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterInner model = new ClusterInner().withLocation("hmenevfyexfwhybc")
            .withTags(mapOf("dectehfiqsc", "yvdcsitynnaa", "hcjrefovgmk", "eypvhezrkg"))
            .withSku(new ClusterSku().withName(ClusterSkuName.DEFAULT).withCapacity(202688177));
        model = BinaryData.fromObject(model).toObject(ClusterInner.class);
        Assertions.assertEquals("hmenevfyexfwhybc", model.location());
        Assertions.assertEquals("yvdcsitynnaa", model.tags().get("dectehfiqsc"));
        Assertions.assertEquals(ClusterSkuName.DEFAULT, model.sku().name());
        Assertions.assertEquals(202688177, model.sku().capacity());
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
