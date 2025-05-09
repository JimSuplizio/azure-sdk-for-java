// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ImpalaSource;

public final class ImpalaSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImpalaSource model = BinaryData.fromString(
            "{\"type\":\"ImpalaSource\",\"query\":\"datamckzeaia\",\"queryTimeout\":\"dataau\",\"additionalColumns\":\"datafsctjqp\",\"sourceRetryCount\":\"dataivfgemvu\",\"sourceRetryWait\":\"dataxwuyry\",\"maxConcurrentConnections\":\"datav\",\"disableMetricsCollection\":\"dataucgwfljjatjmndb\",\"\":{\"sskvzvkdd\":\"dataumkqhatckomdyf\"}}")
            .toObject(ImpalaSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImpalaSource model = new ImpalaSource().withSourceRetryCount("dataivfgemvu")
            .withSourceRetryWait("dataxwuyry")
            .withMaxConcurrentConnections("datav")
            .withDisableMetricsCollection("dataucgwfljjatjmndb")
            .withQueryTimeout("dataau")
            .withAdditionalColumns("datafsctjqp")
            .withQuery("datamckzeaia");
        model = BinaryData.fromObject(model).toObject(ImpalaSource.class);
    }
}
