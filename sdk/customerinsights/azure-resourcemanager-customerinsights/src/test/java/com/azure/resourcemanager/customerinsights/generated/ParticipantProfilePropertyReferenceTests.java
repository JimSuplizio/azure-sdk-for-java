// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.customerinsights.models.ParticipantProfilePropertyReference;
import org.junit.jupiter.api.Assertions;

public final class ParticipantProfilePropertyReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ParticipantProfilePropertyReference model = BinaryData
            .fromString("{\"interactionPropertyName\":\"cxvdfffwafqrouda\",\"profilePropertyName\":\"pavehhr\"}")
            .toObject(ParticipantProfilePropertyReference.class);
        Assertions.assertEquals("cxvdfffwafqrouda", model.interactionPropertyName());
        Assertions.assertEquals("pavehhr", model.profilePropertyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ParticipantProfilePropertyReference model
            = new ParticipantProfilePropertyReference().withInteractionPropertyName("cxvdfffwafqrouda")
                .withProfilePropertyName("pavehhr");
        model = BinaryData.fromObject(model).toObject(ParticipantProfilePropertyReference.class);
        Assertions.assertEquals("cxvdfffwafqrouda", model.interactionPropertyName());
        Assertions.assertEquals("pavehhr", model.profilePropertyName());
    }
}
