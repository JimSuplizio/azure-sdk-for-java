// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureSqlTableDatasetTypeProperties;

public final class AzureSqlTableDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureSqlTableDatasetTypeProperties model = BinaryData
            .fromString("{\"tableName\":\"dataeegvyieztkutnj\",\"schema\":\"datal\",\"table\":\"datakrehyhtmj\"}")
            .toObject(AzureSqlTableDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureSqlTableDatasetTypeProperties model
            = new AzureSqlTableDatasetTypeProperties().withTableName("dataeegvyieztkutnj")
                .withSchema("datal")
                .withTable("datakrehyhtmj");
        model = BinaryData.fromObject(model).toObject(AzureSqlTableDatasetTypeProperties.class);
    }
}
