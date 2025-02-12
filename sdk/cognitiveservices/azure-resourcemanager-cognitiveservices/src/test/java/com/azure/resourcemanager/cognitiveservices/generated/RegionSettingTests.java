// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.RegionSetting;
import org.junit.jupiter.api.Assertions;

public final class RegionSettingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegionSetting model
            = BinaryData.fromString("{\"name\":\"jgzjaoyfhrtx\",\"value\":5.565733,\"customsubdomain\":\"rkujy\"}")
                .toObject(RegionSetting.class);
        Assertions.assertEquals("jgzjaoyfhrtx", model.name());
        Assertions.assertEquals(5.565733F, model.value());
        Assertions.assertEquals("rkujy", model.customsubdomain());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegionSetting model
            = new RegionSetting().withName("jgzjaoyfhrtx").withValue(5.565733F).withCustomsubdomain("rkujy");
        model = BinaryData.fromObject(model).toObject(RegionSetting.class);
        Assertions.assertEquals("jgzjaoyfhrtx", model.name());
        Assertions.assertEquals(5.565733F, model.value());
        Assertions.assertEquals("rkujy", model.customsubdomain());
    }
}
