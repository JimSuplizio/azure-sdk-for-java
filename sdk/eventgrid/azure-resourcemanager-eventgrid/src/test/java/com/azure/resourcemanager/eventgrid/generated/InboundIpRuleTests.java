// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.IpActionType;
import org.junit.jupiter.api.Assertions;

public final class InboundIpRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InboundIpRule model
            = BinaryData.fromString("{\"ipMask\":\"lbbovplw\",\"action\":\"Allow\"}").toObject(InboundIpRule.class);
        Assertions.assertEquals("lbbovplw", model.ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.action());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InboundIpRule model = new InboundIpRule().withIpMask("lbbovplw").withAction(IpActionType.ALLOW);
        model = BinaryData.fromObject(model).toObject(InboundIpRule.class);
        Assertions.assertEquals("lbbovplw", model.ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.action());
    }
}
