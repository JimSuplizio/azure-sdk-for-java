// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.fluent.models.DeviceInner;
import com.azure.resourcemanager.sphere.models.DeviceProperties;
import org.junit.jupiter.api.Assertions;

public final class DeviceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeviceInner model = BinaryData.fromString(
            "{\"properties\":{\"deviceId\":\"kpikadrgvt\",\"chipSku\":\"gnbuy\",\"lastAvailableOsVersion\":\"ijggmebfsiar\",\"lastInstalledOsVersion\":\"trcvpnazzmh\",\"lastOsUpdateUtc\":\"2021-11-09T20:12:13Z\",\"lastUpdateRequestUtc\":\"2021-02-24T15:52:09Z\",\"provisioningState\":\"Provisioning\"},\"id\":\"tdbhrbnla\",\"name\":\"kx\",\"type\":\"yskpbhen\"}")
            .toObject(DeviceInner.class);
        Assertions.assertEquals("kpikadrgvt", model.properties().deviceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeviceInner model = new DeviceInner().withProperties(new DeviceProperties().withDeviceId("kpikadrgvt"));
        model = BinaryData.fromObject(model).toObject(DeviceInner.class);
        Assertions.assertEquals("kpikadrgvt", model.properties().deviceId());
    }
}
