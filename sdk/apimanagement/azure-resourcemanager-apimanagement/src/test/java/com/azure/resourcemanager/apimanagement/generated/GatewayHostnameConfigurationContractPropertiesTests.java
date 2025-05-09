// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayHostnameConfigurationContractProperties;
import org.junit.jupiter.api.Assertions;

public final class GatewayHostnameConfigurationContractPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GatewayHostnameConfigurationContractProperties model = BinaryData.fromString(
            "{\"hostname\":\"qrshzzbgullcxiq\",\"certificateId\":\"jkoxdupna\",\"negotiateClientCertificate\":true,\"tls10Enabled\":true,\"tls11Enabled\":false,\"http2Enabled\":false}")
            .toObject(GatewayHostnameConfigurationContractProperties.class);
        Assertions.assertEquals("qrshzzbgullcxiq", model.hostname());
        Assertions.assertEquals("jkoxdupna", model.certificateId());
        Assertions.assertTrue(model.negotiateClientCertificate());
        Assertions.assertTrue(model.tls10Enabled());
        Assertions.assertFalse(model.tls11Enabled());
        Assertions.assertFalse(model.http2Enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GatewayHostnameConfigurationContractProperties model
            = new GatewayHostnameConfigurationContractProperties().withHostname("qrshzzbgullcxiq")
                .withCertificateId("jkoxdupna")
                .withNegotiateClientCertificate(true)
                .withTls10Enabled(true)
                .withTls11Enabled(false)
                .withHttp2Enabled(false);
        model = BinaryData.fromObject(model).toObject(GatewayHostnameConfigurationContractProperties.class);
        Assertions.assertEquals("qrshzzbgullcxiq", model.hostname());
        Assertions.assertEquals("jkoxdupna", model.certificateId());
        Assertions.assertTrue(model.negotiateClientCertificate());
        Assertions.assertTrue(model.tls10Enabled());
        Assertions.assertFalse(model.tls11Enabled());
        Assertions.assertFalse(model.http2Enabled());
    }
}
