// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.scvmm.models.AllocationMethod;
import com.azure.resourcemanager.scvmm.models.NetworkInterface;
import com.azure.resourcemanager.scvmm.models.NetworkProfile;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkProfile model = BinaryData.fromString(
            "{\"networkInterfaces\":[{\"name\":\"zwuxzd\",\"displayName\":\"a\",\"ipv4Addresses\":[\"hmwhfpmrqo\",\"mt\",\"kknryrtihf\",\"tijbpzvgnwzsymgl\"],\"ipv6Addresses\":[\"cyzkohdbihanuf\",\"fcbjysagithxqha\",\"ifpikxwczby\",\"cnpqxuhivyqniwby\"],\"macAddress\":\"k\",\"virtualNetworkId\":\"dumjgrtfwvuk\",\"networkName\":\"audccsnhs\",\"ipv4AddressType\":\"Static\",\"ipv6AddressType\":\"Dynamic\",\"macAddressType\":\"Dynamic\",\"nicId\":\"ryhtnapczwlokjy\"},{\"name\":\"kkvnipjox\",\"displayName\":\"nchgej\",\"ipv4Addresses\":[\"dmailzydehojw\",\"ahuxinpm\",\"njaqwixjspro\"],\"ipv6Addresses\":[\"putegjvwmfd\",\"t\",\"cmdv\",\"jhulsuuvmkjo\"],\"macAddress\":\"rwfndiod\",\"virtualNetworkId\":\"slwejdpvw\",\"networkName\":\"oqpsoa\",\"ipv4AddressType\":\"Dynamic\",\"ipv6AddressType\":\"Static\",\"macAddressType\":\"Dynamic\",\"nicId\":\"j\"},{\"name\":\"hbcryffdfdosyge\",\"displayName\":\"aojakhmsbzjhcrz\",\"ipv4Addresses\":[\"phlxa\",\"lthqtrgqjbp\",\"zfsinzgvf\"],\"ipv6Addresses\":[\"wzo\",\"xjtfelluwfzit\",\"np\",\"qfpjk\"],\"macAddress\":\"xofpdvhpfxxypi\",\"virtualNetworkId\":\"nmayhuybb\",\"networkName\":\"odepoogin\",\"ipv4AddressType\":\"Static\",\"ipv6AddressType\":\"Dynamic\",\"macAddressType\":\"Static\",\"nicId\":\"gnarxzxtheo\"}]}")
            .toObject(NetworkProfile.class);
        Assertions.assertEquals("zwuxzd", model.networkInterfaces().get(0).name());
        Assertions.assertEquals("k", model.networkInterfaces().get(0).macAddress());
        Assertions.assertEquals("dumjgrtfwvuk", model.networkInterfaces().get(0).virtualNetworkId());
        Assertions.assertEquals(AllocationMethod.STATIC, model.networkInterfaces().get(0).ipv4AddressType());
        Assertions.assertEquals(AllocationMethod.DYNAMIC, model.networkInterfaces().get(0).ipv6AddressType());
        Assertions.assertEquals(AllocationMethod.DYNAMIC, model.networkInterfaces().get(0).macAddressType());
        Assertions.assertEquals("ryhtnapczwlokjy", model.networkInterfaces().get(0).nicId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkProfile model = new NetworkProfile().withNetworkInterfaces(Arrays.asList(
            new NetworkInterface().withName("zwuxzd")
                .withMacAddress("k")
                .withVirtualNetworkId("dumjgrtfwvuk")
                .withIpv4AddressType(AllocationMethod.STATIC)
                .withIpv6AddressType(AllocationMethod.DYNAMIC)
                .withMacAddressType(AllocationMethod.DYNAMIC)
                .withNicId("ryhtnapczwlokjy"),
            new NetworkInterface().withName("kkvnipjox")
                .withMacAddress("rwfndiod")
                .withVirtualNetworkId("slwejdpvw")
                .withIpv4AddressType(AllocationMethod.DYNAMIC)
                .withIpv6AddressType(AllocationMethod.STATIC)
                .withMacAddressType(AllocationMethod.DYNAMIC)
                .withNicId("j"),
            new NetworkInterface().withName("hbcryffdfdosyge")
                .withMacAddress("xofpdvhpfxxypi")
                .withVirtualNetworkId("nmayhuybb")
                .withIpv4AddressType(AllocationMethod.STATIC)
                .withIpv6AddressType(AllocationMethod.DYNAMIC)
                .withMacAddressType(AllocationMethod.STATIC)
                .withNicId("gnarxzxtheo")));
        model = BinaryData.fromObject(model).toObject(NetworkProfile.class);
        Assertions.assertEquals("zwuxzd", model.networkInterfaces().get(0).name());
        Assertions.assertEquals("k", model.networkInterfaces().get(0).macAddress());
        Assertions.assertEquals("dumjgrtfwvuk", model.networkInterfaces().get(0).virtualNetworkId());
        Assertions.assertEquals(AllocationMethod.STATIC, model.networkInterfaces().get(0).ipv4AddressType());
        Assertions.assertEquals(AllocationMethod.DYNAMIC, model.networkInterfaces().get(0).ipv6AddressType());
        Assertions.assertEquals(AllocationMethod.DYNAMIC, model.networkInterfaces().get(0).macAddressType());
        Assertions.assertEquals("ryhtnapczwlokjy", model.networkInterfaces().get(0).nicId());
    }
}
