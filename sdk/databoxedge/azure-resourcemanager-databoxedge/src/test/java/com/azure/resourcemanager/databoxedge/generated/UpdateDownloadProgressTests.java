// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.models.UpdateDownloadProgress;

public final class UpdateDownloadProgressTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateDownloadProgress model = BinaryData.fromString(
            "{\"downloadPhase\":\"Downloading\",\"percentComplete\":333094369,\"totalBytesToDownload\":51.71375541406348,\"totalBytesDownloaded\":82.08569552569966,\"numberOfUpdatesToDownload\":1340454664,\"numberOfUpdatesDownloaded\":45967354}")
            .toObject(UpdateDownloadProgress.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateDownloadProgress model = new UpdateDownloadProgress();
        model = BinaryData.fromObject(model).toObject(UpdateDownloadProgress.class);
    }
}
