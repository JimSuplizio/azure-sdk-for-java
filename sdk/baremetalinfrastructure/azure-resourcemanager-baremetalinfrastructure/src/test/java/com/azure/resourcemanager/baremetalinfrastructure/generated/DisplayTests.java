// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.baremetalinfrastructure.models.Display;

public final class DisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Display model = BinaryData.fromString(
            "{\"provider\":\"iheogna\",\"resource\":\"zxtheotusivyevcc\",\"operation\":\"ihnhun\",\"description\":\"wjzrnfygxgisp\"}")
            .toObject(Display.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Display model = new Display();
        model = BinaryData.fromObject(model).toObject(Display.class);
    }
}
