// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.BenchmarkReference;
import com.azure.resourcemanager.security.models.QueryCheck;
import com.azure.resourcemanager.security.models.RuleSeverity;
import com.azure.resourcemanager.security.models.RuleType;
import com.azure.resourcemanager.security.models.VaRule;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VaRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VaRule model = BinaryData.fromString(
            "{\"ruleId\":\"qfqjbvleorfm\",\"severity\":\"Medium\",\"category\":\"tqzfavyv\",\"ruleType\":\"PositiveList\",\"title\":\"bar\",\"description\":\"uayjkqa\",\"rationale\":\"gzslesjcbhernnti\",\"queryCheck\":{\"query\":\"jcvb\",\"expectedResult\":[[\"behwagohb\"]],\"columnNames\":[\"kmr\"]},\"benchmarkReferences\":[{\"benchmark\":\"vhmxtdrjfu\",\"reference\":\"coebjvewzcj\"},{\"benchmark\":\"m\",\"reference\":\"pmguaadraufac\"},{\"benchmark\":\"ahzovajjziuxxp\",\"reference\":\"neekulfg\"},{\"benchmark\":\"qubkw\",\"reference\":\"enr\"}]}")
            .toObject(VaRule.class);
        Assertions.assertEquals("qfqjbvleorfm", model.ruleId());
        Assertions.assertEquals(RuleSeverity.MEDIUM, model.severity());
        Assertions.assertEquals("tqzfavyv", model.category());
        Assertions.assertEquals(RuleType.POSITIVE_LIST, model.ruleType());
        Assertions.assertEquals("bar", model.title());
        Assertions.assertEquals("uayjkqa", model.description());
        Assertions.assertEquals("gzslesjcbhernnti", model.rationale());
        Assertions.assertEquals("jcvb", model.queryCheck().query());
        Assertions.assertEquals("behwagohb", model.queryCheck().expectedResult().get(0).get(0));
        Assertions.assertEquals("kmr", model.queryCheck().columnNames().get(0));
        Assertions.assertEquals("vhmxtdrjfu", model.benchmarkReferences().get(0).benchmark());
        Assertions.assertEquals("coebjvewzcj", model.benchmarkReferences().get(0).reference());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VaRule model = new VaRule().withRuleId("qfqjbvleorfm")
            .withSeverity(RuleSeverity.MEDIUM)
            .withCategory("tqzfavyv")
            .withRuleType(RuleType.POSITIVE_LIST)
            .withTitle("bar")
            .withDescription("uayjkqa")
            .withRationale("gzslesjcbhernnti")
            .withQueryCheck(new QueryCheck().withQuery("jcvb")
                .withExpectedResult(Arrays.asList(Arrays.asList("behwagohb")))
                .withColumnNames(Arrays.asList("kmr")))
            .withBenchmarkReferences(
                Arrays.asList(new BenchmarkReference().withBenchmark("vhmxtdrjfu").withReference("coebjvewzcj"),
                    new BenchmarkReference().withBenchmark("m").withReference("pmguaadraufac"),
                    new BenchmarkReference().withBenchmark("ahzovajjziuxxp").withReference("neekulfg"),
                    new BenchmarkReference().withBenchmark("qubkw").withReference("enr")));
        model = BinaryData.fromObject(model).toObject(VaRule.class);
        Assertions.assertEquals("qfqjbvleorfm", model.ruleId());
        Assertions.assertEquals(RuleSeverity.MEDIUM, model.severity());
        Assertions.assertEquals("tqzfavyv", model.category());
        Assertions.assertEquals(RuleType.POSITIVE_LIST, model.ruleType());
        Assertions.assertEquals("bar", model.title());
        Assertions.assertEquals("uayjkqa", model.description());
        Assertions.assertEquals("gzslesjcbhernnti", model.rationale());
        Assertions.assertEquals("jcvb", model.queryCheck().query());
        Assertions.assertEquals("behwagohb", model.queryCheck().expectedResult().get(0).get(0));
        Assertions.assertEquals("kmr", model.queryCheck().columnNames().get(0));
        Assertions.assertEquals("vhmxtdrjfu", model.benchmarkReferences().get(0).benchmark());
        Assertions.assertEquals("coebjvewzcj", model.benchmarkReferences().get(0).reference());
    }
}
