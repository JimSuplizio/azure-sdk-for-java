// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BlobSink;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import java.util.Arrays;

public final class BlobSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BlobSink model = BinaryData.fromString(
            "{\"type\":\"BlobSink\",\"blobWriterOverwriteFiles\":\"dataow\",\"blobWriterDateTimeFormat\":\"datadefmebpalzpy\",\"blobWriterAddHeader\":\"datagwmrzrhcf\",\"copyBehavior\":\"datavmptnrzilvc\",\"metadata\":[{\"name\":\"datazwtlgoravo\",\"value\":\"datapnxpufvg\"}],\"writeBatchSize\":\"datafgmezfyelfxlbkbh\",\"writeBatchTimeout\":\"datakqfjzgy\",\"sinkRetryCount\":\"datat\",\"sinkRetryWait\":\"datakhgatynkih\",\"maxConcurrentConnections\":\"dataixyb\",\"disableMetricsCollection\":\"datawjzo\",\"\":{\"unvwvaolfg\":\"dataaenlzjxztgdu\",\"zht\":\"datatczzv\",\"chsrp\":\"dataeuiptud\",\"iokdrjdeyfnq\":\"datajkqfabjuaktshwup\"}}")
            .toObject(BlobSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BlobSink model = new BlobSink().withWriteBatchSize("datafgmezfyelfxlbkbh")
            .withWriteBatchTimeout("datakqfjzgy")
            .withSinkRetryCount("datat")
            .withSinkRetryWait("datakhgatynkih")
            .withMaxConcurrentConnections("dataixyb")
            .withDisableMetricsCollection("datawjzo")
            .withBlobWriterOverwriteFiles("dataow")
            .withBlobWriterDateTimeFormat("datadefmebpalzpy")
            .withBlobWriterAddHeader("datagwmrzrhcf")
            .withCopyBehavior("datavmptnrzilvc")
            .withMetadata(Arrays.asList(new MetadataItem().withName("datazwtlgoravo").withValue("datapnxpufvg")));
        model = BinaryData.fromObject(model).toObject(BlobSink.class);
    }
}
