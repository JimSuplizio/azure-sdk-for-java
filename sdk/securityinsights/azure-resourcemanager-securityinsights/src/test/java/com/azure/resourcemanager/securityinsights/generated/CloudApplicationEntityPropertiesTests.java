// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.CloudApplicationEntityProperties;

public final class CloudApplicationEntityPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudApplicationEntityProperties model = BinaryData.fromString(
            "{\"appId\":1918015991,\"appName\":\"hkfkimrtixokf\",\"instanceName\":\"yinljqe\",\"additionalData\":{\"monstshiyxgve\":\"datahi\",\"wcobie\":\"datafclduccbirdsv\",\"gshejjtbxqmulux\":\"datastmninwjizcilng\"},\"friendlyName\":\"qzvnersbycucr\"}")
            .toObject(CloudApplicationEntityProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudApplicationEntityProperties model = new CloudApplicationEntityProperties();
        model = BinaryData.fromObject(model).toObject(CloudApplicationEntityProperties.class);
    }
}
