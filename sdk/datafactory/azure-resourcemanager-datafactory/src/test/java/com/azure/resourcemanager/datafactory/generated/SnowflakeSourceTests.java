// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SnowflakeExportCopyCommand;
import com.azure.resourcemanager.datafactory.models.SnowflakeSource;
import java.util.HashMap;
import java.util.Map;

public final class SnowflakeSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnowflakeSource model = BinaryData.fromString(
            "{\"type\":\"SnowflakeSource\",\"query\":\"dataumuuqwcka\",\"exportSettings\":{\"type\":\"SnowflakeExportCopyCommand\",\"additionalCopyOptions\":{\"ipdqo\":\"datatdfzjwjefclihana\"},\"additionalFormatOptions\":{\"q\":\"datalqzopvhwmtdbfrj\",\"ps\":\"datauv\",\"scntdw\":\"datafeagordbs\"},\"storageIntegration\":\"datax\",\"\":{\"n\":\"datatowdwiffagfe\",\"ltthsuzxyl\":\"databpgc\",\"scobhhblj\":\"dataiflzsrk\",\"us\":\"datavpokvhobygffuzh\"}},\"sourceRetryCount\":\"dataff\",\"sourceRetryWait\":\"dataoovfwzysvnvrfjg\",\"maxConcurrentConnections\":\"dataup\",\"disableMetricsCollection\":\"datag\",\"\":{\"rowrmesziubkyvc\":\"datavwuje\",\"wdjbyaav\":\"datakoufwkaomytlx\",\"xyhuetztorhu\":\"datamsxamncuhxznma\"}}")
            .toObject(SnowflakeSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnowflakeSource model = new SnowflakeSource().withSourceRetryCount("dataff")
            .withSourceRetryWait("dataoovfwzysvnvrfjg")
            .withMaxConcurrentConnections("dataup")
            .withDisableMetricsCollection("datag")
            .withQuery("dataumuuqwcka")
            .withExportSettings(
                new SnowflakeExportCopyCommand().withAdditionalCopyOptions(mapOf("ipdqo", "datatdfzjwjefclihana"))
                    .withAdditionalFormatOptions(
                        mapOf("q", "datalqzopvhwmtdbfrj", "ps", "datauv", "scntdw", "datafeagordbs"))
                    .withStorageIntegration("datax"));
        model = BinaryData.fromObject(model).toObject(SnowflakeSource.class);
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
