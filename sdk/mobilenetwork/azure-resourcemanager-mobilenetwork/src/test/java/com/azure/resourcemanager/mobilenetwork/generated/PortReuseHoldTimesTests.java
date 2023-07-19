// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.PortReuseHoldTimes;
import org.junit.jupiter.api.Assertions;

public final class PortReuseHoldTimesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PortReuseHoldTimes model =
            BinaryData.fromString("{\"tcp\":464271708,\"udp\":48641393}").toObject(PortReuseHoldTimes.class);
        Assertions.assertEquals(464271708, model.tcp());
        Assertions.assertEquals(48641393, model.udp());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PortReuseHoldTimes model = new PortReuseHoldTimes().withTcp(464271708).withUdp(48641393);
        model = BinaryData.fromObject(model).toObject(PortReuseHoldTimes.class);
        Assertions.assertEquals(464271708, model.tcp());
        Assertions.assertEquals(48641393, model.udp());
    }
}