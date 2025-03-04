// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purview.fluent.models.AccessKeysInner;
import org.junit.jupiter.api.Assertions;

public final class AccessKeysInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccessKeysInner model = BinaryData
            .fromString("{\"atlasKafkaPrimaryEndpoint\":\"fsnkymuctq\",\"atlasKafkaSecondaryEndpoint\":\"fbebrjcxer\"}")
            .toObject(AccessKeysInner.class);
        Assertions.assertEquals("fsnkymuctq", model.atlasKafkaPrimaryEndpoint());
        Assertions.assertEquals("fbebrjcxer", model.atlasKafkaSecondaryEndpoint());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccessKeysInner model = new AccessKeysInner().withAtlasKafkaPrimaryEndpoint("fsnkymuctq")
            .withAtlasKafkaSecondaryEndpoint("fbebrjcxer");
        model = BinaryData.fromObject(model).toObject(AccessKeysInner.class);
        Assertions.assertEquals("fsnkymuctq", model.atlasKafkaPrimaryEndpoint());
        Assertions.assertEquals("fbebrjcxer", model.atlasKafkaSecondaryEndpoint());
    }
}
