// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.IpExtendedCommunityIdList;
import com.azure.resourcemanager.managednetworkfabric.models.IpExtendedCommunitySetOperationProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IpExtendedCommunitySetOperationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpExtendedCommunitySetOperationProperties model = BinaryData.fromString(
            "{\"set\":{\"ipExtendedCommunityIds\":[\"jzhdtrsyfezf\",\"my\",\"jdzyyrwnmwtq\",\"ljknnkynkstdtfwh\"]}}")
            .toObject(IpExtendedCommunitySetOperationProperties.class);
        Assertions.assertEquals("jzhdtrsyfezf", model.set().ipExtendedCommunityIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpExtendedCommunitySetOperationProperties model
            = new IpExtendedCommunitySetOperationProperties().withSet(new IpExtendedCommunityIdList()
                .withIpExtendedCommunityIds(Arrays.asList("jzhdtrsyfezf", "my", "jdzyyrwnmwtq", "ljknnkynkstdtfwh")));
        model = BinaryData.fromObject(model).toObject(IpExtendedCommunitySetOperationProperties.class);
        Assertions.assertEquals("jzhdtrsyfezf", model.set().ipExtendedCommunityIds().get(0));
    }
}
