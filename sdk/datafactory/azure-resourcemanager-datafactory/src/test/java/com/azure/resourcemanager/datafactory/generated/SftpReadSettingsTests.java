// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SftpReadSettings;

public final class SftpReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SftpReadSettings model = BinaryData.fromString(
            "{\"type\":\"SftpReadSettings\",\"recursive\":\"datambzfx\",\"wildcardFolderPath\":\"datahaqfueqfniagzm\",\"wildcardFileName\":\"datasoxqarjtu\",\"enablePartitionDiscovery\":\"datallmtiyguuhylz\",\"partitionRootPath\":\"dataim\",\"fileListPath\":\"dataohjxfqyyu\",\"deleteFilesAfterCompletion\":\"datailxzn\",\"modifiedDatetimeStart\":\"databttk\",\"modifiedDatetimeEnd\":\"datacxjxueilixzjvkqj\",\"disableChunking\":\"datablhcmxx\",\"maxConcurrentConnections\":\"datankxcljnkmsfsqux\",\"disableMetricsCollection\":\"datacimnchvk\",\"\":{\"dgt\":\"dataivagcsmrtepsy\",\"jdcokbpbpqelmszo\":\"dataozys\",\"rd\":\"datatneltnbyvb\",\"bia\":\"dataumududwecds\"}}")
            .toObject(SftpReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SftpReadSettings model = new SftpReadSettings().withMaxConcurrentConnections("datankxcljnkmsfsqux")
            .withDisableMetricsCollection("datacimnchvk")
            .withRecursive("datambzfx")
            .withWildcardFolderPath("datahaqfueqfniagzm")
            .withWildcardFileName("datasoxqarjtu")
            .withEnablePartitionDiscovery("datallmtiyguuhylz")
            .withPartitionRootPath("dataim")
            .withFileListPath("dataohjxfqyyu")
            .withDeleteFilesAfterCompletion("datailxzn")
            .withModifiedDatetimeStart("databttk")
            .withModifiedDatetimeEnd("datacxjxueilixzjvkqj")
            .withDisableChunking("datablhcmxx");
        model = BinaryData.fromObject(model).toObject(SftpReadSettings.class);
    }
}
