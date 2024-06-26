// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.BusinessIdentity;
import com.azure.resourcemanager.logic.models.EdifactAgreementContent;
import com.azure.resourcemanager.logic.models.EdifactOneWayAgreement;
import com.azure.resourcemanager.logic.models.EdifactProtocolSettings;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EdifactAgreementContentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EdifactAgreementContent model =
            BinaryData
                .fromString(
                    "{\"receiveAgreement\":{\"senderBusinessIdentity\":{\"qualifier\":\"krvq\",\"value\":\"ev\"},\"receiverBusinessIdentity\":{\"qualifier\":\"oepry\",\"value\":\"t\"},\"protocolSettings\":{\"envelopeOverrides\":[],\"messageFilterList\":[],\"schemaReferences\":[],\"validationOverrides\":[],\"edifactDelimiterOverrides\":[]}},\"sendAgreement\":{\"senderBusinessIdentity\":{\"qualifier\":\"zvfvaawz\",\"value\":\"adflgzu\"},\"receiverBusinessIdentity\":{\"qualifier\":\"iglaecx\",\"value\":\"dticokpvzml\"},\"protocolSettings\":{\"envelopeOverrides\":[],\"messageFilterList\":[],\"schemaReferences\":[],\"validationOverrides\":[],\"edifactDelimiterOverrides\":[]}}}")
                .toObject(EdifactAgreementContent.class);
        Assertions.assertEquals("krvq", model.receiveAgreement().senderBusinessIdentity().qualifier());
        Assertions.assertEquals("ev", model.receiveAgreement().senderBusinessIdentity().value());
        Assertions.assertEquals("oepry", model.receiveAgreement().receiverBusinessIdentity().qualifier());
        Assertions.assertEquals("t", model.receiveAgreement().receiverBusinessIdentity().value());
        Assertions.assertEquals("zvfvaawz", model.sendAgreement().senderBusinessIdentity().qualifier());
        Assertions.assertEquals("adflgzu", model.sendAgreement().senderBusinessIdentity().value());
        Assertions.assertEquals("iglaecx", model.sendAgreement().receiverBusinessIdentity().qualifier());
        Assertions.assertEquals("dticokpvzml", model.sendAgreement().receiverBusinessIdentity().value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EdifactAgreementContent model =
            new EdifactAgreementContent()
                .withReceiveAgreement(
                    new EdifactOneWayAgreement()
                        .withSenderBusinessIdentity(new BusinessIdentity().withQualifier("krvq").withValue("ev"))
                        .withReceiverBusinessIdentity(new BusinessIdentity().withQualifier("oepry").withValue("t"))
                        .withProtocolSettings(
                            new EdifactProtocolSettings()
                                .withEnvelopeOverrides(Arrays.asList())
                                .withMessageFilterList(Arrays.asList())
                                .withSchemaReferences(Arrays.asList())
                                .withValidationOverrides(Arrays.asList())
                                .withEdifactDelimiterOverrides(Arrays.asList())))
                .withSendAgreement(
                    new EdifactOneWayAgreement()
                        .withSenderBusinessIdentity(
                            new BusinessIdentity().withQualifier("zvfvaawz").withValue("adflgzu"))
                        .withReceiverBusinessIdentity(
                            new BusinessIdentity().withQualifier("iglaecx").withValue("dticokpvzml"))
                        .withProtocolSettings(
                            new EdifactProtocolSettings()
                                .withEnvelopeOverrides(Arrays.asList())
                                .withMessageFilterList(Arrays.asList())
                                .withSchemaReferences(Arrays.asList())
                                .withValidationOverrides(Arrays.asList())
                                .withEdifactDelimiterOverrides(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(EdifactAgreementContent.class);
        Assertions.assertEquals("krvq", model.receiveAgreement().senderBusinessIdentity().qualifier());
        Assertions.assertEquals("ev", model.receiveAgreement().senderBusinessIdentity().value());
        Assertions.assertEquals("oepry", model.receiveAgreement().receiverBusinessIdentity().qualifier());
        Assertions.assertEquals("t", model.receiveAgreement().receiverBusinessIdentity().value());
        Assertions.assertEquals("zvfvaawz", model.sendAgreement().senderBusinessIdentity().qualifier());
        Assertions.assertEquals("adflgzu", model.sendAgreement().senderBusinessIdentity().value());
        Assertions.assertEquals("iglaecx", model.sendAgreement().receiverBusinessIdentity().qualifier());
        Assertions.assertEquals("dticokpvzml", model.sendAgreement().receiverBusinessIdentity().value());
    }
}
