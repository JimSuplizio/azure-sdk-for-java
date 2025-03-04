// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.fluent.models.DimensionProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DimensionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DimensionProperties model = BinaryData.fromString(
            "{\"description\":\"fuojrngif\",\"filterEnabled\":false,\"groupingEnabled\":false,\"data\":[\"cb\",\"uimzdlyjd\",\"qwmkyoquf\",\"vruzslzojhpctfnm\"],\"total\":1889500647,\"category\":\"ngfdgugeyzihgrky\",\"usageStart\":\"2021-10-28T01:16:30Z\",\"usageEnd\":\"2021-02-21T09:37:08Z\",\"nextLink\":\"nmfpp\"}")
            .toObject(DimensionProperties.class);
        Assertions.assertEquals("cb", model.data().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DimensionProperties model
            = new DimensionProperties().withData(Arrays.asList("cb", "uimzdlyjd", "qwmkyoquf", "vruzslzojhpctfnm"));
        model = BinaryData.fromObject(model).toObject(DimensionProperties.class);
        Assertions.assertEquals("cb", model.data().get(0));
    }
}
