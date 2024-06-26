// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreDataPlaneInner;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreDataPlaneListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PacketCoreDataPlaneListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PacketCoreDataPlaneListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Unknown\",\"userPlaneAccessInterface\":{\"name\":\"r\",\"ipv4Address\":\"iagxsdszuempsbz\",\"ipv4Subnet\":\"z\",\"ipv4Gateway\":\"yvpnqicvinvkjj\",\"vlanId\":602936654,\"ipv4AddressList\":[\"uukzclewyhmlw\",\"aztz\",\"ofncckwyfzqwhxxb\",\"yq\"],\"bfdIpv4Endpoints\":[\"feqztppriol\",\"or\",\"altol\"]},\"userPlaneAccessVirtualIpv4Addresses\":[\"wsobqwcsdbn\",\"dcfhucqdpf\",\"vglsbjjca\"]},\"location\":\"xbvtvudu\",\"tags\":{\"kgjubgdknnqvsazn\":\"ormrlxqtvcofudfl\",\"orudsgsa\":\"n\"},\"id\":\"mkycgra\",\"name\":\"wjue\",\"type\":\"aeburuvdmo\"}],\"nextLink\":\"mz\"}")
            .toObject(PacketCoreDataPlaneListResult.class);
        Assertions.assertEquals("xbvtvudu", model.value().get(0).location());
        Assertions.assertEquals("ormrlxqtvcofudfl", model.value().get(0).tags().get("kgjubgdknnqvsazn"));
        Assertions.assertEquals("r", model.value().get(0).userPlaneAccessInterface().name());
        Assertions.assertEquals("iagxsdszuempsbz", model.value().get(0).userPlaneAccessInterface().ipv4Address());
        Assertions.assertEquals("z", model.value().get(0).userPlaneAccessInterface().ipv4Subnet());
        Assertions.assertEquals("yvpnqicvinvkjj", model.value().get(0).userPlaneAccessInterface().ipv4Gateway());
        Assertions.assertEquals(602936654, model.value().get(0).userPlaneAccessInterface().vlanId());
        Assertions.assertEquals("uukzclewyhmlw",
            model.value().get(0).userPlaneAccessInterface().ipv4AddressList().get(0));
        Assertions.assertEquals("feqztppriol",
            model.value().get(0).userPlaneAccessInterface().bfdIpv4Endpoints().get(0));
        Assertions.assertEquals("wsobqwcsdbn", model.value().get(0).userPlaneAccessVirtualIpv4Addresses().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PacketCoreDataPlaneListResult model = new PacketCoreDataPlaneListResult()
            .withValue(Arrays.asList(new PacketCoreDataPlaneInner().withLocation("xbvtvudu")
                .withTags(mapOf("kgjubgdknnqvsazn", "ormrlxqtvcofudfl", "orudsgsa", "n"))
                .withUserPlaneAccessInterface(new InterfaceProperties().withName("r")
                    .withIpv4Address("iagxsdszuempsbz")
                    .withIpv4Subnet("z")
                    .withIpv4Gateway("yvpnqicvinvkjj")
                    .withVlanId(602936654)
                    .withIpv4AddressList(Arrays.asList("uukzclewyhmlw", "aztz", "ofncckwyfzqwhxxb", "yq"))
                    .withBfdIpv4Endpoints(Arrays.asList("feqztppriol", "or", "altol")))
                .withUserPlaneAccessVirtualIpv4Addresses(Arrays.asList("wsobqwcsdbn", "dcfhucqdpf", "vglsbjjca"))));
        model = BinaryData.fromObject(model).toObject(PacketCoreDataPlaneListResult.class);
        Assertions.assertEquals("xbvtvudu", model.value().get(0).location());
        Assertions.assertEquals("ormrlxqtvcofudfl", model.value().get(0).tags().get("kgjubgdknnqvsazn"));
        Assertions.assertEquals("r", model.value().get(0).userPlaneAccessInterface().name());
        Assertions.assertEquals("iagxsdszuempsbz", model.value().get(0).userPlaneAccessInterface().ipv4Address());
        Assertions.assertEquals("z", model.value().get(0).userPlaneAccessInterface().ipv4Subnet());
        Assertions.assertEquals("yvpnqicvinvkjj", model.value().get(0).userPlaneAccessInterface().ipv4Gateway());
        Assertions.assertEquals(602936654, model.value().get(0).userPlaneAccessInterface().vlanId());
        Assertions.assertEquals("uukzclewyhmlw",
            model.value().get(0).userPlaneAccessInterface().ipv4AddressList().get(0));
        Assertions.assertEquals("feqztppriol",
            model.value().get(0).userPlaneAccessInterface().bfdIpv4Endpoints().get(0));
        Assertions.assertEquals("wsobqwcsdbn", model.value().get(0).userPlaneAccessVirtualIpv4Addresses().get(0));
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
