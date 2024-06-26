// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.NetworkProfileInner;
import com.azure.resourcemanager.hybridcompute.models.IpAddress;
import com.azure.resourcemanager.hybridcompute.models.NetworkInterface;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkProfileInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkProfileInner model = BinaryData.fromString(
            "{\"networkInterfaces\":[{\"ipAddresses\":[{\"address\":\"knvudwtiukb\",\"ipAddressVersion\":\"ngkpocipazy\",\"subnet\":{\"addressPrefix\":\"gukgjnpiucgygevq\"}}]},{\"ipAddresses\":[{\"address\":\"pmr\",\"ipAddressVersion\":\"izcdrqjsd\",\"subnet\":{\"addressPrefix\":\"nfyhx\"}},{\"address\":\"oejzi\",\"ipAddressVersion\":\"ifsjttgzfbishcb\",\"subnet\":{\"addressPrefix\":\"jdeyeamdpha\"}},{\"address\":\"lpbuxwgipwhonowk\",\"ipAddressVersion\":\"hwankixzbinjepu\",\"subnet\":{\"addressPrefix\":\"rywn\"}},{\"address\":\"oqftiyqzrnkcq\",\"ipAddressVersion\":\"xlwhzlsicoh\",\"subnet\":{\"addressPrefix\":\"nwvlryavwhheunmm\"}}]}]}")
            .toObject(NetworkProfileInner.class);
        Assertions.assertEquals("knvudwtiukb", model.networkInterfaces().get(0).ipAddresses().get(0).address());
        Assertions.assertEquals("ngkpocipazy",
            model.networkInterfaces().get(0).ipAddresses().get(0).ipAddressVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkProfileInner model = new NetworkProfileInner().withNetworkInterfaces(Arrays.asList(
            new NetworkInterface().withIpAddresses(
                Arrays.asList(new IpAddress().withAddress("knvudwtiukb").withIpAddressVersion("ngkpocipazy"))),
            new NetworkInterface()
                .withIpAddresses(Arrays.asList(new IpAddress().withAddress("pmr").withIpAddressVersion("izcdrqjsd"),
                    new IpAddress().withAddress("oejzi").withIpAddressVersion("ifsjttgzfbishcb"),
                    new IpAddress().withAddress("lpbuxwgipwhonowk").withIpAddressVersion("hwankixzbinjepu"),
                    new IpAddress().withAddress("oqftiyqzrnkcq").withIpAddressVersion("xlwhzlsicoh")))));
        model = BinaryData.fromObject(model).toObject(NetworkProfileInner.class);
        Assertions.assertEquals("knvudwtiukb", model.networkInterfaces().get(0).ipAddresses().get(0).address());
        Assertions.assertEquals("ngkpocipazy",
            model.networkInterfaces().get(0).ipAddresses().get(0).ipAddressVersion());
    }
}
