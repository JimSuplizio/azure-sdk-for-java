// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotoperations.models.OperationalMode;
import com.azure.resourcemanager.iotoperations.models.TlsProperties;
import org.junit.jupiter.api.Assertions;

public final class TlsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TlsProperties model
            = BinaryData.fromString("{\"mode\":\"Enabled\",\"trustedCaCertificateConfigMapRef\":\"mewzsyyc\"}")
                .toObject(TlsProperties.class);
        Assertions.assertEquals(OperationalMode.ENABLED, model.mode());
        Assertions.assertEquals("mewzsyyc", model.trustedCaCertificateConfigMapRef());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TlsProperties model
            = new TlsProperties().withMode(OperationalMode.ENABLED).withTrustedCaCertificateConfigMapRef("mewzsyyc");
        model = BinaryData.fromObject(model).toObject(TlsProperties.class);
        Assertions.assertEquals(OperationalMode.ENABLED, model.mode());
        Assertions.assertEquals("mewzsyyc", model.trustedCaCertificateConfigMapRef());
    }
}
