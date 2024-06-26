// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.LoadBalancingSettingsModel;
import org.junit.jupiter.api.Assertions;

public final class LoadBalancingSettingsModelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LoadBalancingSettingsModel model = BinaryData.fromString(
            "{\"properties\":{\"resourceState\":\"Disabled\",\"sampleSize\":1069475083,\"successfulSamplesRequired\":886228140,\"additionalLatencyMilliseconds\":825702732},\"name\":\"iw\",\"type\":\"jgcyztsfmznba\",\"id\":\"ph\"}")
            .toObject(LoadBalancingSettingsModel.class);
        Assertions.assertEquals("ph", model.id());
        Assertions.assertEquals("iw", model.name());
        Assertions.assertEquals(1069475083, model.sampleSize());
        Assertions.assertEquals(886228140, model.successfulSamplesRequired());
        Assertions.assertEquals(825702732, model.additionalLatencyMilliseconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LoadBalancingSettingsModel model = new LoadBalancingSettingsModel().withId("ph")
            .withName("iw")
            .withSampleSize(1069475083)
            .withSuccessfulSamplesRequired(886228140)
            .withAdditionalLatencyMilliseconds(825702732);
        model = BinaryData.fromObject(model).toObject(LoadBalancingSettingsModel.class);
        Assertions.assertEquals("ph", model.id());
        Assertions.assertEquals("iw", model.name());
        Assertions.assertEquals(1069475083, model.sampleSize());
        Assertions.assertEquals(886228140, model.successfulSamplesRequired());
        Assertions.assertEquals(825702732, model.additionalLatencyMilliseconds());
    }
}
