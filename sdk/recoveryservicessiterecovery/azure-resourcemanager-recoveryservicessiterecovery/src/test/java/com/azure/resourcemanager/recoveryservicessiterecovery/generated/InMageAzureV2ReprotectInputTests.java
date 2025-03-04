// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageAzureV2ReprotectInput;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class InMageAzureV2ReprotectInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageAzureV2ReprotectInput model = BinaryData.fromString(
            "{\"instanceType\":\"InMageAzureV2\",\"masterTargetId\":\"sqsqkpdmioyjpnml\",\"processServerId\":\"qcpszp\",\"storageAccountId\":\"vqdvrdmvxyrxdhg\",\"runAsAccountId\":\"oj\",\"policyId\":\"aotcgbzxmbtp\",\"logStorageAccountId\":\"foioyidoxzn\",\"disksToInclude\":[\"dtmuuvd\",\"wsxmrszb\"]}")
            .toObject(InMageAzureV2ReprotectInput.class);
        Assertions.assertEquals("sqsqkpdmioyjpnml", model.masterTargetId());
        Assertions.assertEquals("qcpszp", model.processServerId());
        Assertions.assertEquals("vqdvrdmvxyrxdhg", model.storageAccountId());
        Assertions.assertEquals("oj", model.runAsAccountId());
        Assertions.assertEquals("aotcgbzxmbtp", model.policyId());
        Assertions.assertEquals("foioyidoxzn", model.logStorageAccountId());
        Assertions.assertEquals("dtmuuvd", model.disksToInclude().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageAzureV2ReprotectInput model = new InMageAzureV2ReprotectInput().withMasterTargetId("sqsqkpdmioyjpnml")
            .withProcessServerId("qcpszp")
            .withStorageAccountId("vqdvrdmvxyrxdhg")
            .withRunAsAccountId("oj")
            .withPolicyId("aotcgbzxmbtp")
            .withLogStorageAccountId("foioyidoxzn")
            .withDisksToInclude(Arrays.asList("dtmuuvd", "wsxmrszb"));
        model = BinaryData.fromObject(model).toObject(InMageAzureV2ReprotectInput.class);
        Assertions.assertEquals("sqsqkpdmioyjpnml", model.masterTargetId());
        Assertions.assertEquals("qcpszp", model.processServerId());
        Assertions.assertEquals("vqdvrdmvxyrxdhg", model.storageAccountId());
        Assertions.assertEquals("oj", model.runAsAccountId());
        Assertions.assertEquals("aotcgbzxmbtp", model.policyId());
        Assertions.assertEquals("foioyidoxzn", model.logStorageAccountId());
        Assertions.assertEquals("dtmuuvd", model.disksToInclude().get(0));
    }
}
