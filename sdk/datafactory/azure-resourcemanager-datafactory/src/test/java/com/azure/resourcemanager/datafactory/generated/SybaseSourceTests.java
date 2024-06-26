// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SybaseSource;

public final class SybaseSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SybaseSource model = BinaryData.fromString(
            "{\"type\":\"SybaseSource\",\"query\":\"datar\",\"queryTimeout\":\"datah\",\"additionalColumns\":\"dataqfl\",\"sourceRetryCount\":\"dataqcxyiqppa\",\"sourceRetryWait\":\"dataiqrlla\",\"maxConcurrentConnections\":\"datalbtkx\",\"disableMetricsCollection\":\"datajzgnla\",\"\":{\"wbobawlntenhnq\":\"datatexaugojvgjez\",\"qor\":\"datavxghbehheho\",\"yugzlvgjirjkkrs\":\"datavwlceoj\"}}")
            .toObject(SybaseSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SybaseSource model = new SybaseSource().withSourceRetryCount("dataqcxyiqppa")
            .withSourceRetryWait("dataiqrlla")
            .withMaxConcurrentConnections("datalbtkx")
            .withDisableMetricsCollection("datajzgnla")
            .withQueryTimeout("datah")
            .withAdditionalColumns("dataqfl")
            .withQuery("datar");
        model = BinaryData.fromObject(model).toObject(SybaseSource.class);
    }
}
