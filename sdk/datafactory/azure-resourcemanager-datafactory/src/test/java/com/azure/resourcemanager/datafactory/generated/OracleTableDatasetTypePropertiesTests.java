// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.OracleTableDatasetTypeProperties;

public final class OracleTableDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OracleTableDatasetTypeProperties model = BinaryData
            .fromString(
                "{\"tableName\":\"datawcahdkmbjsmihr\",\"schema\":\"dataezbfsjwf\",\"table\":\"dataglkvbgukbsv\"}")
            .toObject(OracleTableDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OracleTableDatasetTypeProperties model
            = new OracleTableDatasetTypeProperties().withTableName("datawcahdkmbjsmihr")
                .withSchema("dataezbfsjwf")
                .withTable("dataglkvbgukbsv");
        model = BinaryData.fromObject(model).toObject(OracleTableDatasetTypeProperties.class);
    }
}
