// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.IotDpsSkuDefinitionInner;
import com.azure.resourcemanager.deviceprovisioningservices.models.IotDpsSku;
import org.junit.jupiter.api.Assertions;

public final class IotDpsSkuDefinitionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IotDpsSkuDefinitionInner model
            = BinaryData.fromString("{\"name\":\"S1\"}").toObject(IotDpsSkuDefinitionInner.class);
        Assertions.assertEquals(IotDpsSku.S1, model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IotDpsSkuDefinitionInner model = new IotDpsSkuDefinitionInner().withName(IotDpsSku.S1);
        model = BinaryData.fromObject(model).toObject(IotDpsSkuDefinitionInner.class);
        Assertions.assertEquals(IotDpsSku.S1, model.name());
    }
}
