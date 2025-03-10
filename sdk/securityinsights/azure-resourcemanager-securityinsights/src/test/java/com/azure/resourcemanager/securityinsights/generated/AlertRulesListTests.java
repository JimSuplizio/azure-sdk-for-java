// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.AlertRuleInner;
import com.azure.resourcemanager.securityinsights.models.AlertRulesList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AlertRulesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AlertRulesList model = BinaryData.fromString(
            "{\"nextLink\":\"mhquvgjxp\",\"value\":[{\"kind\":\"AlertRule\",\"etag\":\"zm\",\"id\":\"mtz\",\"name\":\"pbsphrupidgs\",\"type\":\"bb\"},{\"kind\":\"AlertRule\",\"etag\":\"hphoycm\",\"id\":\"ao\",\"name\":\"hdxbmtqio\",\"type\":\"jzehtb\"}]}")
            .toObject(AlertRulesList.class);
        Assertions.assertEquals("zm", model.value().get(0).etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AlertRulesList model = new AlertRulesList()
            .withValue(Arrays.asList(new AlertRuleInner().withEtag("zm"), new AlertRuleInner().withEtag("hphoycm")));
        model = BinaryData.fromObject(model).toObject(AlertRulesList.class);
        Assertions.assertEquals("zm", model.value().get(0).etag());
    }
}
