// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quota.fluent.models.SubscriptionQuotaAllocationsInner;
import com.azure.resourcemanager.quota.models.SubscriptionQuotaDetails;
import org.junit.jupiter.api.Assertions;

public final class SubscriptionQuotaAllocationsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubscriptionQuotaAllocationsInner model = BinaryData.fromString(
            "{\"properties\":{\"region\":\"m\",\"limit\":1354331063436305404,\"shareableQuota\":3154425840860812324,\"name\":{\"value\":\"evgbmqjq\",\"localizedValue\":\"c\"}},\"id\":\"mivkwlzuvcc\",\"name\":\"wnfnbacf\",\"type\":\"onlebxetqgtzxdpn\"}")
            .toObject(SubscriptionQuotaAllocationsInner.class);
        Assertions.assertEquals("m", model.properties().region());
        Assertions.assertEquals(1354331063436305404L, model.properties().limit());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubscriptionQuotaAllocationsInner model = new SubscriptionQuotaAllocationsInner()
            .withProperties(new SubscriptionQuotaDetails().withRegion("m").withLimit(1354331063436305404L));
        model = BinaryData.fromObject(model).toObject(SubscriptionQuotaAllocationsInner.class);
        Assertions.assertEquals("m", model.properties().region());
        Assertions.assertEquals(1354331063436305404L, model.properties().limit());
    }
}
