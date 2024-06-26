// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AvroSink;
import com.azure.resourcemanager.datafactory.models.AvroWriteSettings;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import com.azure.resourcemanager.datafactory.models.StoreWriteSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AvroSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvroSink model = BinaryData.fromString(
            "{\"type\":\"AvroSink\",\"storeSettings\":{\"type\":\"StoreWriteSettings\",\"maxConcurrentConnections\":\"datahuab\",\"disableMetricsCollection\":\"datafh\",\"copyBehavior\":\"dataoxnpuap\",\"metadata\":[{\"name\":\"dataekiqlscmtcl\",\"value\":\"datapivt\"},{\"name\":\"datavcfch\",\"value\":\"datakcjjnqxjj\"},{\"name\":\"datayajdf\",\"value\":\"dataxjm\"},{\"name\":\"datagfbzbxeqzvokfr\",\"value\":\"dataaf\"}],\"\":{\"vuefsrxqsc\":\"datajucmuaxdu\",\"ksgeqpaillf\":\"databbwejr\"}},\"formatSettings\":{\"type\":\"AvroWriteSettings\",\"recordName\":\"sfmeotvnetee\",\"recordNamespace\":\"dfpflffd\",\"maxRowsPerFile\":\"datanaoehkgpks\",\"fileNamePrefix\":\"databwkwxdgcf\",\"\":{\"jwxhslrbwwk\":\"datayy\"}},\"writeBatchSize\":\"datawodhsodofsxjiky\",\"writeBatchTimeout\":\"dataquhuixqwoggw\",\"sinkRetryCount\":\"datadmxhuw\",\"sinkRetryWait\":\"dataf\",\"maxConcurrentConnections\":\"datakyft\",\"disableMetricsCollection\":\"datakbgsgopyckmncru\",\"\":{\"qkgixfnrneyav\":\"datadjmda\",\"iizbwfjumulhf\":\"datadovpwrqcfzokplz\",\"qcapbkfvowzbk\":\"datadgnchahldnrpt\"}}")
            .toObject(AvroSink.class);
        Assertions.assertEquals("sfmeotvnetee", model.formatSettings().recordName());
        Assertions.assertEquals("dfpflffd", model.formatSettings().recordNamespace());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvroSink model = new AvroSink().withWriteBatchSize("datawodhsodofsxjiky")
            .withWriteBatchTimeout("dataquhuixqwoggw")
            .withSinkRetryCount("datadmxhuw")
            .withSinkRetryWait("dataf")
            .withMaxConcurrentConnections("datakyft")
            .withDisableMetricsCollection("datakbgsgopyckmncru")
            .withStoreSettings(new StoreWriteSettings().withMaxConcurrentConnections("datahuab")
                .withDisableMetricsCollection("datafh")
                .withCopyBehavior("dataoxnpuap")
                .withMetadata(Arrays.asList(new MetadataItem().withName("dataekiqlscmtcl").withValue("datapivt"),
                    new MetadataItem().withName("datavcfch").withValue("datakcjjnqxjj"),
                    new MetadataItem().withName("datayajdf").withValue("dataxjm"),
                    new MetadataItem().withName("datagfbzbxeqzvokfr").withValue("dataaf")))
                .withAdditionalProperties(mapOf("type", "StoreWriteSettings")))
            .withFormatSettings(new AvroWriteSettings().withRecordName("sfmeotvnetee")
                .withRecordNamespace("dfpflffd")
                .withMaxRowsPerFile("datanaoehkgpks")
                .withFileNamePrefix("databwkwxdgcf"));
        model = BinaryData.fromObject(model).toObject(AvroSink.class);
        Assertions.assertEquals("sfmeotvnetee", model.formatSettings().recordName());
        Assertions.assertEquals("dfpflffd", model.formatSettings().recordNamespace());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
