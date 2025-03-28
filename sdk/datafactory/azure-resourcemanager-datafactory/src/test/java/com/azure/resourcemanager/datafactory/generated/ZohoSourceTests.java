// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ZohoSource;

public final class ZohoSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ZohoSource model = BinaryData.fromString(
            "{\"type\":\"ZohoSource\",\"query\":\"dataarwtkrbscw\",\"queryTimeout\":\"datawvwmcrhyo\",\"additionalColumns\":\"datatplmy\",\"sourceRetryCount\":\"datahvyj\",\"sourceRetryWait\":\"dataerh\",\"maxConcurrentConnections\":\"datastiawywppq\",\"disableMetricsCollection\":\"datajxbdyczplmljcisx\",\"\":{\"mufdynhqlzanta\":\"dataftytp\"}}")
            .toObject(ZohoSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ZohoSource model = new ZohoSource().withSourceRetryCount("datahvyj")
            .withSourceRetryWait("dataerh")
            .withMaxConcurrentConnections("datastiawywppq")
            .withDisableMetricsCollection("datajxbdyczplmljcisx")
            .withQueryTimeout("datawvwmcrhyo")
            .withAdditionalColumns("datatplmy")
            .withQuery("dataarwtkrbscw");
        model = BinaryData.fromObject(model).toObject(ZohoSource.class);
    }
}
