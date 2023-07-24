// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quantum.fluent.models.CheckNameAvailabilityResultInner;
import org.junit.jupiter.api.Assertions;

public final class CheckNameAvailabilityResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityResultInner model =
            BinaryData
                .fromString("{\"nameAvailable\":false,\"reason\":\"sxsdqrhzoymibm\",\"message\":\"yiba\"}")
                .toObject(CheckNameAvailabilityResultInner.class);
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals("sxsdqrhzoymibm", model.reason());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityResultInner model =
            new CheckNameAvailabilityResultInner().withNameAvailable(false).withReason("sxsdqrhzoymibm");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityResultInner.class);
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals("sxsdqrhzoymibm", model.reason());
    }
}