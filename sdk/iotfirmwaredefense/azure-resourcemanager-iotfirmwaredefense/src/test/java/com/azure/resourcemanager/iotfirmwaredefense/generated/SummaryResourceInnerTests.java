// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotfirmwaredefense.fluent.models.SummaryResourceInner;

public final class SummaryResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SummaryResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"summaryType\":\"SummaryResourceProperties\"},\"id\":\"ebb\",\"name\":\"umnyqu\",\"type\":\"edeojnabc\"}")
            .toObject(SummaryResourceInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SummaryResourceInner model = new SummaryResourceInner();
        model = BinaryData.fromObject(model).toObject(SummaryResourceInner.class);
    }
}
