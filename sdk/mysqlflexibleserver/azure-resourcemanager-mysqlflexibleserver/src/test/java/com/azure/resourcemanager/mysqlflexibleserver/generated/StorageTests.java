// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.models.EnableStatusEnum;
import com.azure.resourcemanager.mysqlflexibleserver.models.Storage;
import org.junit.jupiter.api.Assertions;

public final class StorageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Storage model = BinaryData.fromString(
            "{\"storageSizeGB\":847580815,\"iops\":1376492737,\"autoGrow\":\"Disabled\",\"logOnDisk\":\"Disabled\",\"storageSku\":\"al\",\"autoIoScaling\":\"Disabled\"}")
            .toObject(Storage.class);
        Assertions.assertEquals(847580815, model.storageSizeGB());
        Assertions.assertEquals(1376492737, model.iops());
        Assertions.assertEquals(EnableStatusEnum.DISABLED, model.autoGrow());
        Assertions.assertEquals(EnableStatusEnum.DISABLED, model.logOnDisk());
        Assertions.assertEquals(EnableStatusEnum.DISABLED, model.autoIoScaling());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Storage model = new Storage().withStorageSizeGB(847580815)
            .withIops(1376492737)
            .withAutoGrow(EnableStatusEnum.DISABLED)
            .withLogOnDisk(EnableStatusEnum.DISABLED)
            .withAutoIoScaling(EnableStatusEnum.DISABLED);
        model = BinaryData.fromObject(model).toObject(Storage.class);
        Assertions.assertEquals(847580815, model.storageSizeGB());
        Assertions.assertEquals(1376492737, model.iops());
        Assertions.assertEquals(EnableStatusEnum.DISABLED, model.autoGrow());
        Assertions.assertEquals(EnableStatusEnum.DISABLED, model.logOnDisk());
        Assertions.assertEquals(EnableStatusEnum.DISABLED, model.autoIoScaling());
    }
}
