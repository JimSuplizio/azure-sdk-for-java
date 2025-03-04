// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.ScaleProfile;
import com.azure.resourcemanager.nginx.models.ScaleProfileCapacity;
import org.junit.jupiter.api.Assertions;

public final class ScaleProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScaleProfile model
            = BinaryData.fromString("{\"name\":\"qkrhahvljua\",\"capacity\":{\"min\":1935710102,\"max\":836090349}}")
                .toObject(ScaleProfile.class);
        Assertions.assertEquals("qkrhahvljua", model.name());
        Assertions.assertEquals(1935710102, model.capacity().min());
        Assertions.assertEquals(836090349, model.capacity().max());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScaleProfile model = new ScaleProfile().withName("qkrhahvljua")
            .withCapacity(new ScaleProfileCapacity().withMin(1935710102).withMax(836090349));
        model = BinaryData.fromObject(model).toObject(ScaleProfile.class);
        Assertions.assertEquals("qkrhahvljua", model.name());
        Assertions.assertEquals(1935710102, model.capacity().min());
        Assertions.assertEquals(836090349, model.capacity().max());
    }
}
