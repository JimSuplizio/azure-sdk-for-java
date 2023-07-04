// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InterfaceStatusInner;
import org.junit.jupiter.api.Assertions;

public final class InterfaceStatusInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InterfaceStatusInner model =
            BinaryData
                .fromString(
                    "{\"administrativeState\":\"Disabled\",\"operationalStatus\":\"t\",\"phyStatus\":\"lahb\",\"transceiverStatus\":\"ctxtgzukxi\",\"connectedTo\":\"m\"}")
                .toObject(InterfaceStatusInner.class);
        Assertions.assertEquals("t", model.operationalStatus());
        Assertions.assertEquals("lahb", model.phyStatus());
        Assertions.assertEquals("ctxtgzukxi", model.transceiverStatus());
        Assertions.assertEquals("m", model.connectedTo());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InterfaceStatusInner model =
            new InterfaceStatusInner()
                .withOperationalStatus("t")
                .withPhyStatus("lahb")
                .withTransceiverStatus("ctxtgzukxi")
                .withConnectedTo("m");
        model = BinaryData.fromObject(model).toObject(InterfaceStatusInner.class);
        Assertions.assertEquals("t", model.operationalStatus());
        Assertions.assertEquals("lahb", model.phyStatus());
        Assertions.assertEquals("ctxtgzukxi", model.transceiverStatus());
        Assertions.assertEquals("m", model.connectedTo());
    }
}