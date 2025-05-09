// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.models.UpdateFirewallRuleParameters;
import org.junit.jupiter.api.Assertions;

public final class UpdateFirewallRuleParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateFirewallRuleParameters model = BinaryData
            .fromString("{\"properties\":{\"startIpAddress\":\"zywbiex\",\"endIpAddress\":\"eyueaxibxujwb\"}}")
            .toObject(UpdateFirewallRuleParameters.class);
        Assertions.assertEquals("zywbiex", model.startIpAddress());
        Assertions.assertEquals("eyueaxibxujwb", model.endIpAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateFirewallRuleParameters model
            = new UpdateFirewallRuleParameters().withStartIpAddress("zywbiex").withEndIpAddress("eyueaxibxujwb");
        model = BinaryData.fromObject(model).toObject(UpdateFirewallRuleParameters.class);
        Assertions.assertEquals("zywbiex", model.startIpAddress());
        Assertions.assertEquals("eyueaxibxujwb", model.endIpAddress());
    }
}
