// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.PoolProperties;
import com.azure.resourcemanager.netapp.models.EncryptionType;
import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import org.junit.jupiter.api.Assertions;

public final class PoolPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PoolProperties model = BinaryData.fromString(
            "{\"poolId\":\"ro\",\"size\":4284842638181152780,\"serviceLevel\":\"StandardZRS\",\"provisioningState\":\"rmcqiby\",\"totalThroughputMibps\":97.50943,\"utilizedThroughputMibps\":0.45861602,\"qosType\":\"Manual\",\"coolAccess\":false,\"encryptionType\":\"Double\"}")
            .toObject(PoolProperties.class);
        Assertions.assertEquals(4284842638181152780L, model.size());
        Assertions.assertEquals(ServiceLevel.STANDARD_ZRS, model.serviceLevel());
        Assertions.assertEquals(QosType.MANUAL, model.qosType());
        Assertions.assertEquals(false, model.coolAccess());
        Assertions.assertEquals(EncryptionType.DOUBLE, model.encryptionType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PoolProperties model = new PoolProperties().withSize(4284842638181152780L)
            .withServiceLevel(ServiceLevel.STANDARD_ZRS)
            .withQosType(QosType.MANUAL)
            .withCoolAccess(false)
            .withEncryptionType(EncryptionType.DOUBLE);
        model = BinaryData.fromObject(model).toObject(PoolProperties.class);
        Assertions.assertEquals(4284842638181152780L, model.size());
        Assertions.assertEquals(ServiceLevel.STANDARD_ZRS, model.serviceLevel());
        Assertions.assertEquals(QosType.MANUAL, model.qosType());
        Assertions.assertEquals(false, model.coolAccess());
        Assertions.assertEquals(EncryptionType.DOUBLE, model.encryptionType());
    }
}
