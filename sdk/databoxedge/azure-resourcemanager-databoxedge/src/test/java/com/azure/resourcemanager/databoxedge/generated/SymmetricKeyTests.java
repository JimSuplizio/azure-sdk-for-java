// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.models.AsymmetricEncryptedSecret;
import com.azure.resourcemanager.databoxedge.models.EncryptionAlgorithm;
import com.azure.resourcemanager.databoxedge.models.SymmetricKey;
import org.junit.jupiter.api.Assertions;

public final class SymmetricKeyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SymmetricKey model = BinaryData.fromString(
            "{\"connectionString\":{\"value\":\"srp\",\"encryptionCertThumbprint\":\"ujzra\",\"encryptionAlgorithm\":\"RSAES_PKCS1_v_1_5\"}}")
            .toObject(SymmetricKey.class);
        Assertions.assertEquals("srp", model.connectionString().value());
        Assertions.assertEquals("ujzra", model.connectionString().encryptionCertThumbprint());
        Assertions.assertEquals(EncryptionAlgorithm.RSAES_PKCS1_V_1_5, model.connectionString().encryptionAlgorithm());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SymmetricKey model = new SymmetricKey().withConnectionString(new AsymmetricEncryptedSecret().withValue("srp")
            .withEncryptionCertThumbprint("ujzra")
            .withEncryptionAlgorithm(EncryptionAlgorithm.RSAES_PKCS1_V_1_5));
        model = BinaryData.fromObject(model).toObject(SymmetricKey.class);
        Assertions.assertEquals("srp", model.connectionString().value());
        Assertions.assertEquals("ujzra", model.connectionString().encryptionCertThumbprint());
        Assertions.assertEquals(EncryptionAlgorithm.RSAES_PKCS1_V_1_5, model.connectionString().encryptionAlgorithm());
    }
}
