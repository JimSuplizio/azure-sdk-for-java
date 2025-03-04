// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.graphservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.graphservices.models.AccountResourceProperties;
import org.junit.jupiter.api.Assertions;

public final class AccountResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccountResourceProperties model = BinaryData
            .fromString("{\"provisioningState\":\"Failed\",\"appId\":\"expa\",\"billingPlanId\":\"akhmsbzjhcrz\"}")
            .toObject(AccountResourceProperties.class);
        Assertions.assertEquals("expa", model.appId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccountResourceProperties model = new AccountResourceProperties().withAppId("expa");
        model = BinaryData.fromObject(model).toObject(AccountResourceProperties.class);
        Assertions.assertEquals("expa", model.appId());
    }
}
