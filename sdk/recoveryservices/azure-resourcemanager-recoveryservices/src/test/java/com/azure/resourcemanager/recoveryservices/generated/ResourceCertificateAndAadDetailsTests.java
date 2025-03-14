// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.ResourceCertificateAndAadDetails;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ResourceCertificateAndAadDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceCertificateAndAadDetails model = BinaryData.fromString(
            "{\"authType\":\"AzureActiveDirectory\",\"aadAuthority\":\"xqpvfadmw\",\"aadTenantId\":\"rcrgvx\",\"servicePrincipalClientId\":\"vgomz\",\"servicePrincipalObjectId\":\"fmisg\",\"azureManagementEndpointAudience\":\"bnbbeldawkz\",\"serviceResourceId\":\"liourqhak\",\"aadAudience\":\"hashsfwxosow\",\"friendlyName\":\"ugicjooxdjebw\",\"issuer\":\"cwwfvovbvme\",\"resourceId\":1380137712554146124,\"subject\":\"yhz\",\"thumbprint\":\"uojgj\",\"validFrom\":\"2021-01-13T06:34:52Z\",\"validTo\":\"2021-01-11T08:00:10Z\"}")
            .toObject(ResourceCertificateAndAadDetails.class);
        Assertions.assertEquals("ugicjooxdjebw", model.friendlyName());
        Assertions.assertEquals("cwwfvovbvme", model.issuer());
        Assertions.assertEquals(1380137712554146124L, model.resourceId());
        Assertions.assertEquals("yhz", model.subject());
        Assertions.assertEquals("uojgj", model.thumbprint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-13T06:34:52Z"), model.validFrom());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-11T08:00:10Z"), model.validTo());
        Assertions.assertEquals("xqpvfadmw", model.aadAuthority());
        Assertions.assertEquals("rcrgvx", model.aadTenantId());
        Assertions.assertEquals("vgomz", model.servicePrincipalClientId());
        Assertions.assertEquals("fmisg", model.servicePrincipalObjectId());
        Assertions.assertEquals("bnbbeldawkz", model.azureManagementEndpointAudience());
        Assertions.assertEquals("liourqhak", model.serviceResourceId());
        Assertions.assertEquals("hashsfwxosow", model.aadAudience());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceCertificateAndAadDetails model
            = new ResourceCertificateAndAadDetails().withFriendlyName("ugicjooxdjebw")
                .withIssuer("cwwfvovbvme")
                .withResourceId(1380137712554146124L)
                .withSubject("yhz")
                .withThumbprint("uojgj")
                .withValidFrom(OffsetDateTime.parse("2021-01-13T06:34:52Z"))
                .withValidTo(OffsetDateTime.parse("2021-01-11T08:00:10Z"))
                .withAadAuthority("xqpvfadmw")
                .withAadTenantId("rcrgvx")
                .withServicePrincipalClientId("vgomz")
                .withServicePrincipalObjectId("fmisg")
                .withAzureManagementEndpointAudience("bnbbeldawkz")
                .withServiceResourceId("liourqhak")
                .withAadAudience("hashsfwxosow");
        model = BinaryData.fromObject(model).toObject(ResourceCertificateAndAadDetails.class);
        Assertions.assertEquals("ugicjooxdjebw", model.friendlyName());
        Assertions.assertEquals("cwwfvovbvme", model.issuer());
        Assertions.assertEquals(1380137712554146124L, model.resourceId());
        Assertions.assertEquals("yhz", model.subject());
        Assertions.assertEquals("uojgj", model.thumbprint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-13T06:34:52Z"), model.validFrom());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-11T08:00:10Z"), model.validTo());
        Assertions.assertEquals("xqpvfadmw", model.aadAuthority());
        Assertions.assertEquals("rcrgvx", model.aadTenantId());
        Assertions.assertEquals("vgomz", model.servicePrincipalClientId());
        Assertions.assertEquals("fmisg", model.servicePrincipalObjectId());
        Assertions.assertEquals("bnbbeldawkz", model.azureManagementEndpointAudience());
        Assertions.assertEquals("liourqhak", model.serviceResourceId());
        Assertions.assertEquals("hashsfwxosow", model.aadAudience());
    }
}
