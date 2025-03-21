// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.Extension;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetworkPropertiesStaticRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.StaticRouteProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class InternalNetworkPropertiesStaticRouteConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InternalNetworkPropertiesStaticRouteConfiguration model = BinaryData.fromString(
            "{\"extension\":\"NoExtension\",\"bfdConfiguration\":{\"administrativeState\":\"MAT\",\"intervalInMilliSeconds\":211674107,\"multiplier\":1331398488},\"ipv4Routes\":[{\"prefix\":\"qao\",\"nextHop\":[\"jrkc\",\"amgglvlmfejdoq\",\"ykglt\"]}],\"ipv6Routes\":[{\"prefix\":\"hqfgqkayejsx\",\"nextHop\":[\"gflwfgziiucijj\",\"eatlijjjrtvamcas\"]}]}")
            .toObject(InternalNetworkPropertiesStaticRouteConfiguration.class);
        Assertions.assertEquals(211674107, model.bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1331398488, model.bfdConfiguration().multiplier());
        Assertions.assertEquals("qao", model.ipv4Routes().get(0).prefix());
        Assertions.assertEquals("jrkc", model.ipv4Routes().get(0).nextHop().get(0));
        Assertions.assertEquals("hqfgqkayejsx", model.ipv6Routes().get(0).prefix());
        Assertions.assertEquals("gflwfgziiucijj", model.ipv6Routes().get(0).nextHop().get(0));
        Assertions.assertEquals(Extension.NO_EXTENSION, model.extension());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InternalNetworkPropertiesStaticRouteConfiguration model
            = new InternalNetworkPropertiesStaticRouteConfiguration()
                .withBfdConfiguration(
                    new BfdConfiguration().withIntervalInMilliSeconds(211674107).withMultiplier(1331398488))
                .withIpv4Routes(Arrays.asList(new StaticRouteProperties().withPrefix("qao")
                    .withNextHop(Arrays.asList("jrkc", "amgglvlmfejdoq", "ykglt"))))
                .withIpv6Routes(Arrays.asList(new StaticRouteProperties().withPrefix("hqfgqkayejsx")
                    .withNextHop(Arrays.asList("gflwfgziiucijj", "eatlijjjrtvamcas"))))
                .withExtension(Extension.NO_EXTENSION);
        model = BinaryData.fromObject(model).toObject(InternalNetworkPropertiesStaticRouteConfiguration.class);
        Assertions.assertEquals(211674107, model.bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1331398488, model.bfdConfiguration().multiplier());
        Assertions.assertEquals("qao", model.ipv4Routes().get(0).prefix());
        Assertions.assertEquals("jrkc", model.ipv4Routes().get(0).nextHop().get(0));
        Assertions.assertEquals("hqfgqkayejsx", model.ipv6Routes().get(0).prefix());
        Assertions.assertEquals("gflwfgziiucijj", model.ipv6Routes().get(0).nextHop().get(0));
        Assertions.assertEquals(Extension.NO_EXTENSION, model.extension());
    }
}
