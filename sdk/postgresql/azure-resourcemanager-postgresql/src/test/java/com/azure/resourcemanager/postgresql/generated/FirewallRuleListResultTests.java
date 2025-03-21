// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresql.fluent.models.FirewallRuleInner;
import com.azure.resourcemanager.postgresql.models.FirewallRuleListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FirewallRuleListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FirewallRuleListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"startIpAddress\":\"nrosfqpte\",\"endIpAddress\":\"hzzvypyq\"},\"id\":\"i\",\"name\":\"z\",\"type\":\"npvswjdkirso\"},{\"properties\":{\"startIpAddress\":\"dqxhcrmnohjtckwh\",\"endIpAddress\":\"soifiyipjxsqw\"},\"id\":\"gr\",\"name\":\"bznorcjxvsnby\",\"type\":\"qabnmoc\"}]}")
            .toObject(FirewallRuleListResult.class);
        Assertions.assertEquals("nrosfqpte", model.value().get(0).startIpAddress());
        Assertions.assertEquals("hzzvypyq", model.value().get(0).endIpAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FirewallRuleListResult model = new FirewallRuleListResult().withValue(
            Arrays.asList(new FirewallRuleInner().withStartIpAddress("nrosfqpte").withEndIpAddress("hzzvypyq"),
                new FirewallRuleInner().withStartIpAddress("dqxhcrmnohjtckwh").withEndIpAddress("soifiyipjxsqw")));
        model = BinaryData.fromObject(model).toObject(FirewallRuleListResult.class);
        Assertions.assertEquals("nrosfqpte", model.value().get(0).startIpAddress());
        Assertions.assertEquals("hzzvypyq", model.value().get(0).endIpAddress());
    }
}
