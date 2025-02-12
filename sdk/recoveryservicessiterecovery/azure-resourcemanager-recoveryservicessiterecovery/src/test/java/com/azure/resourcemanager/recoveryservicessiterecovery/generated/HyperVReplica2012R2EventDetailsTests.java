// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVReplica2012R2EventDetails;
import org.junit.jupiter.api.Assertions;

public final class HyperVReplica2012R2EventDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HyperVReplica2012R2EventDetails model = BinaryData.fromString(
            "{\"instanceType\":\"HyperVReplica2012R2\",\"containerName\":\"daqotwfh\",\"fabricName\":\"xwgsa\",\"remoteContainerName\":\"c\",\"remoteFabricName\":\"owzafczu\"}")
            .toObject(HyperVReplica2012R2EventDetails.class);
        Assertions.assertEquals("daqotwfh", model.containerName());
        Assertions.assertEquals("xwgsa", model.fabricName());
        Assertions.assertEquals("c", model.remoteContainerName());
        Assertions.assertEquals("owzafczu", model.remoteFabricName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HyperVReplica2012R2EventDetails model = new HyperVReplica2012R2EventDetails().withContainerName("daqotwfh")
            .withFabricName("xwgsa")
            .withRemoteContainerName("c")
            .withRemoteFabricName("owzafczu");
        model = BinaryData.fromObject(model).toObject(HyperVReplica2012R2EventDetails.class);
        Assertions.assertEquals("daqotwfh", model.containerName());
        Assertions.assertEquals("xwgsa", model.fabricName());
        Assertions.assertEquals("c", model.remoteContainerName());
        Assertions.assertEquals("owzafczu", model.remoteFabricName());
    }
}
