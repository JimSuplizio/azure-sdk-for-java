// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.CapacityPoolPatch;
import com.azure.resourcemanager.netapp.models.QosType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CapacityPoolPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapacityPoolPatch model = BinaryData.fromString(
            "{\"properties\":{\"size\":7703908538660559056,\"qosType\":\"Auto\",\"coolAccess\":true},\"location\":\"znelixhnrztfolh\",\"tags\":{\"dtpnapnyiropuhp\":\"knalaulppg\",\"gqgitxmedjvcsl\":\"gvpgy\",\"wwncwzzhxgk\":\"n\"},\"id\":\"rmgucnap\",\"name\":\"t\",\"type\":\"oellwp\"}")
            .toObject(CapacityPoolPatch.class);
        Assertions.assertEquals("znelixhnrztfolh", model.location());
        Assertions.assertEquals("knalaulppg", model.tags().get("dtpnapnyiropuhp"));
        Assertions.assertEquals(7703908538660559056L, model.size());
        Assertions.assertEquals(QosType.AUTO, model.qosType());
        Assertions.assertEquals(true, model.coolAccess());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapacityPoolPatch model = new CapacityPoolPatch().withLocation("znelixhnrztfolh")
            .withTags(mapOf("dtpnapnyiropuhp", "knalaulppg", "gqgitxmedjvcsl", "gvpgy", "wwncwzzhxgk", "n"))
            .withSize(7703908538660559056L)
            .withQosType(QosType.AUTO)
            .withCoolAccess(true);
        model = BinaryData.fromObject(model).toObject(CapacityPoolPatch.class);
        Assertions.assertEquals("znelixhnrztfolh", model.location());
        Assertions.assertEquals("knalaulppg", model.tags().get("dtpnapnyiropuhp"));
        Assertions.assertEquals(7703908538660559056L, model.size());
        Assertions.assertEquals(QosType.AUTO, model.qosType());
        Assertions.assertEquals(true, model.coolAccess());
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
