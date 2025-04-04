// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.OperationInfo;
import org.junit.jupiter.api.Assertions;

public final class OperationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInfo model = BinaryData.fromString(
            "{\"provider\":\"wzf\",\"resource\":\"sttktlahbqa\",\"operation\":\"xtgzukxitmmqtgqq\",\"description\":\"hrnxrxc\"}")
            .toObject(OperationInfo.class);
        Assertions.assertEquals("wzf", model.provider());
        Assertions.assertEquals("sttktlahbqa", model.resource());
        Assertions.assertEquals("xtgzukxitmmqtgqq", model.operation());
        Assertions.assertEquals("hrnxrxc", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInfo model = new OperationInfo().withProvider("wzf")
            .withResource("sttktlahbqa")
            .withOperation("xtgzukxitmmqtgqq")
            .withDescription("hrnxrxc");
        model = BinaryData.fromObject(model).toObject(OperationInfo.class);
        Assertions.assertEquals("wzf", model.provider());
        Assertions.assertEquals("sttktlahbqa", model.resource());
        Assertions.assertEquals("xtgzukxitmmqtgqq", model.operation());
        Assertions.assertEquals("hrnxrxc", model.description());
    }
}
