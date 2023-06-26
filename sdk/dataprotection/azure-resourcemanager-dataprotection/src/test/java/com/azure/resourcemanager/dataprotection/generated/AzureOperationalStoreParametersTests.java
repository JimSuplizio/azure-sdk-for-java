// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureOperationalStoreParameters;
import com.azure.resourcemanager.dataprotection.models.DataStoreTypes;
import org.junit.jupiter.api.Assertions;

public final class AzureOperationalStoreParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureOperationalStoreParameters model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureOperationalStoreParameters\",\"resourceGroupId\":\"yylhalnswhccsp\",\"dataStoreType\":\"ArchiveStore\"}")
                .toObject(AzureOperationalStoreParameters.class);
        Assertions.assertEquals(DataStoreTypes.ARCHIVE_STORE, model.dataStoreType());
        Assertions.assertEquals("yylhalnswhccsp", model.resourceGroupId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureOperationalStoreParameters model =
            new AzureOperationalStoreParameters()
                .withDataStoreType(DataStoreTypes.ARCHIVE_STORE)
                .withResourceGroupId("yylhalnswhccsp");
        model = BinaryData.fromObject(model).toObject(AzureOperationalStoreParameters.class);
        Assertions.assertEquals(DataStoreTypes.ARCHIVE_STORE, model.dataStoreType());
        Assertions.assertEquals("yylhalnswhccsp", model.resourceGroupId());
    }
}