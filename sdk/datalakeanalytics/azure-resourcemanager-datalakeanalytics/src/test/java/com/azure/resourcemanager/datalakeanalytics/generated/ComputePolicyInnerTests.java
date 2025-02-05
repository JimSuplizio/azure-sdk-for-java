// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.ComputePolicyInner;
import org.junit.jupiter.api.Assertions;

public final class ComputePolicyInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComputePolicyInner model = BinaryData.fromString(
            "{\"properties\":{\"objectId\":\"231fe99d-e99c-4567-9d96-82468cd73094\",\"objectType\":\"Group\",\"maxDegreeOfParallelismPerJob\":792570944,\"minPriorityPerJob\":1370032032},\"name\":\"h\",\"type\":\"fbowskanyk\",\"id\":\"lcuiywgqywgndr\"}")
            .toObject(ComputePolicyInner.class);
        Assertions.assertEquals("lcuiywgqywgndr", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComputePolicyInner model = new ComputePolicyInner().withId("lcuiywgqywgndr");
        model = BinaryData.fromObject(model).toObject(ComputePolicyInner.class);
        Assertions.assertEquals("lcuiywgqywgndr", model.id());
    }
}
