// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InternalNetworkProperties;
import com.azure.resourcemanager.managednetworkfabric.models.AllowASOverride;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.BgpConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.ConnectedSubnet;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborAddress;
import com.azure.resourcemanager.managednetworkfabric.models.StaticRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.StaticRouteProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class InternalNetworkPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InternalNetworkProperties model =
            BinaryData
                .fromString(
                    "{\"disabledOnResources\":[\"gpfqbuace\",\"pzfqrhhuaoppp\"],\"administrativeState\":\"Enabled\",\"bgpDisabledOnResources\":[\"ol\",\"dahzxctobg\",\"kdmoi\"],\"bfdDisabledOnResources\":[\"stmgrcfbunrmfqjh\",\"kxbpvj\"],\"bfdForStaticRoutesDisabledOnResources\":[\"hx\",\"j\"],\"provisioningState\":\"Canceled\",\"vlanId\":8533369,\"mtu\":1804869047,\"connectedIPv4Subnets\":[{\"prefix\":\"tswb\",\"annotation\":\"zvszj\"},{\"prefix\":\"uvjfdxxive\",\"annotation\":\"t\"},{\"prefix\":\"aqtdoqmcbx\",\"annotation\":\"vxysl\"}],\"connectedIPv6Subnets\":[{\"prefix\":\"fxoblytkb\",\"annotation\":\"pe\"},{\"prefix\":\"wfbkrvrns\",\"annotation\":\"hqjohxcrsbfova\"},{\"prefix\":\"ruvw\",\"annotation\":\"sqfsubcgjbirxb\"}],\"staticRouteConfiguration\":{\"bfdConfiguration\":{\"administrativeState\":\"Enabled\",\"interval\":716024879,\"multiplier\":520672043},\"ipv4Routes\":[{\"prefix\":\"w\",\"nextHop\":[]}],\"ipv6Routes\":[{\"prefix\":\"t\",\"nextHop\":[]},{\"prefix\":\"tpvjzbexilzznfqq\",\"nextHop\":[]},{\"prefix\":\"vwpm\",\"nextHop\":[]},{\"prefix\":\"taruoujmkcj\",\"nextHop\":[]}]},\"bgpConfiguration\":{\"bfdConfiguration\":{\"administrativeState\":\"Disabled\",\"interval\":75465955,\"multiplier\":778428037},\"defaultRouteOriginate\":\"True\",\"allowAS\":524895743,\"allowASOverride\":\"Disable\",\"fabricASN\":1130044611,\"peerASN\":1074784162,\"ipv4ListenRangePrefixes\":[\"vnaenqpehindoyg\",\"ifthnz\",\"ndslgnayqigynduh\"],\"ipv6ListenRangePrefixes\":[\"qlkth\",\"maqolbgycduie\",\"tgccymvaolpss\"],\"ipv4NeighborAddress\":[{\"address\":\"mmdnbbglzps\",\"operationalState\":\"ydmcwyhzdxssa\"},{\"address\":\"zmnvdfznudaod\",\"operationalState\":\"zbn\"},{\"address\":\"lylpstdb\",\"operationalState\":\"xsrz\"},{\"address\":\"ucerscdntnevfi\",\"operationalState\":\"mygtdssls\"}],\"ipv6NeighborAddress\":[{\"address\":\"eriofzpyqs\",\"operationalState\":\"wab\"},{\"address\":\"tshhszhedp\",\"operationalState\":\"wiwubm\"},{\"address\":\"besldnkwwtppjflc\",\"operationalState\":\"gaokonzmnsikv\"}],\"annotation\":\"qzeqqkdltfzxm\"},\"importRoutePolicyId\":\"v\",\"exportRoutePolicyId\":\"ur\",\"annotation\":\"dkwobdagx\"}")
                .toObject(InternalNetworkProperties.class);
        Assertions.assertEquals("dkwobdagx", model.annotation());
        Assertions.assertEquals(8533369, model.vlanId());
        Assertions.assertEquals(1804869047, model.mtu());
        Assertions.assertEquals("zvszj", model.connectedIPv4Subnets().get(0).annotation());
        Assertions.assertEquals("tswb", model.connectedIPv4Subnets().get(0).prefix());
        Assertions.assertEquals("pe", model.connectedIPv6Subnets().get(0).annotation());
        Assertions.assertEquals("fxoblytkb", model.connectedIPv6Subnets().get(0).prefix());
        Assertions.assertEquals("w", model.staticRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions.assertEquals("t", model.staticRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals("qzeqqkdltfzxm", model.bgpConfiguration().annotation());
        Assertions.assertEquals(BooleanEnumProperty.TRUE, model.bgpConfiguration().defaultRouteOriginate());
        Assertions.assertEquals(524895743, model.bgpConfiguration().allowAS());
        Assertions.assertEquals(AllowASOverride.DISABLE, model.bgpConfiguration().allowASOverride());
        Assertions.assertEquals(1074784162, model.bgpConfiguration().peerAsn());
        Assertions.assertEquals("vnaenqpehindoyg", model.bgpConfiguration().ipv4ListenRangePrefixes().get(0));
        Assertions.assertEquals("qlkth", model.bgpConfiguration().ipv6ListenRangePrefixes().get(0));
        Assertions.assertEquals("mmdnbbglzps", model.bgpConfiguration().ipv4NeighborAddress().get(0).address());
        Assertions.assertEquals("eriofzpyqs", model.bgpConfiguration().ipv6NeighborAddress().get(0).address());
        Assertions.assertEquals("v", model.importRoutePolicyId());
        Assertions.assertEquals("ur", model.exportRoutePolicyId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InternalNetworkProperties model =
            new InternalNetworkProperties()
                .withAnnotation("dkwobdagx")
                .withVlanId(8533369)
                .withMtu(1804869047)
                .withConnectedIPv4Subnets(
                    Arrays
                        .asList(
                            new ConnectedSubnet().withAnnotation("zvszj").withPrefix("tswb"),
                            new ConnectedSubnet().withAnnotation("t").withPrefix("uvjfdxxive"),
                            new ConnectedSubnet().withAnnotation("vxysl").withPrefix("aqtdoqmcbx")))
                .withConnectedIPv6Subnets(
                    Arrays
                        .asList(
                            new ConnectedSubnet().withAnnotation("pe").withPrefix("fxoblytkb"),
                            new ConnectedSubnet().withAnnotation("hqjohxcrsbfova").withPrefix("wfbkrvrns"),
                            new ConnectedSubnet().withAnnotation("sqfsubcgjbirxb").withPrefix("ruvw")))
                .withStaticRouteConfiguration(
                    new StaticRouteConfiguration()
                        .withBfdConfiguration(new BfdConfiguration())
                        .withIpv4Routes(
                            Arrays.asList(new StaticRouteProperties().withPrefix("w").withNextHop(Arrays.asList())))
                        .withIpv6Routes(
                            Arrays
                                .asList(
                                    new StaticRouteProperties().withPrefix("t").withNextHop(Arrays.asList()),
                                    new StaticRouteProperties()
                                        .withPrefix("tpvjzbexilzznfqq")
                                        .withNextHop(Arrays.asList()),
                                    new StaticRouteProperties().withPrefix("vwpm").withNextHop(Arrays.asList()),
                                    new StaticRouteProperties()
                                        .withPrefix("taruoujmkcj")
                                        .withNextHop(Arrays.asList()))))
                .withBgpConfiguration(
                    new BgpConfiguration()
                        .withAnnotation("qzeqqkdltfzxm")
                        .withBfdConfiguration(new BfdConfiguration())
                        .withDefaultRouteOriginate(BooleanEnumProperty.TRUE)
                        .withAllowAS(524895743)
                        .withAllowASOverride(AllowASOverride.DISABLE)
                        .withPeerAsn(1074784162)
                        .withIpv4ListenRangePrefixes(Arrays.asList("vnaenqpehindoyg", "ifthnz", "ndslgnayqigynduh"))
                        .withIpv6ListenRangePrefixes(Arrays.asList("qlkth", "maqolbgycduie", "tgccymvaolpss"))
                        .withIpv4NeighborAddress(
                            Arrays
                                .asList(
                                    new NeighborAddress().withAddress("mmdnbbglzps"),
                                    new NeighborAddress().withAddress("zmnvdfznudaod"),
                                    new NeighborAddress().withAddress("lylpstdb"),
                                    new NeighborAddress().withAddress("ucerscdntnevfi")))
                        .withIpv6NeighborAddress(
                            Arrays
                                .asList(
                                    new NeighborAddress().withAddress("eriofzpyqs"),
                                    new NeighborAddress().withAddress("tshhszhedp"),
                                    new NeighborAddress().withAddress("besldnkwwtppjflc"))))
                .withImportRoutePolicyId("v")
                .withExportRoutePolicyId("ur");
        model = BinaryData.fromObject(model).toObject(InternalNetworkProperties.class);
        Assertions.assertEquals("dkwobdagx", model.annotation());
        Assertions.assertEquals(8533369, model.vlanId());
        Assertions.assertEquals(1804869047, model.mtu());
        Assertions.assertEquals("zvszj", model.connectedIPv4Subnets().get(0).annotation());
        Assertions.assertEquals("tswb", model.connectedIPv4Subnets().get(0).prefix());
        Assertions.assertEquals("pe", model.connectedIPv6Subnets().get(0).annotation());
        Assertions.assertEquals("fxoblytkb", model.connectedIPv6Subnets().get(0).prefix());
        Assertions.assertEquals("w", model.staticRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions.assertEquals("t", model.staticRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals("qzeqqkdltfzxm", model.bgpConfiguration().annotation());
        Assertions.assertEquals(BooleanEnumProperty.TRUE, model.bgpConfiguration().defaultRouteOriginate());
        Assertions.assertEquals(524895743, model.bgpConfiguration().allowAS());
        Assertions.assertEquals(AllowASOverride.DISABLE, model.bgpConfiguration().allowASOverride());
        Assertions.assertEquals(1074784162, model.bgpConfiguration().peerAsn());
        Assertions.assertEquals("vnaenqpehindoyg", model.bgpConfiguration().ipv4ListenRangePrefixes().get(0));
        Assertions.assertEquals("qlkth", model.bgpConfiguration().ipv6ListenRangePrefixes().get(0));
        Assertions.assertEquals("mmdnbbglzps", model.bgpConfiguration().ipv4NeighborAddress().get(0).address());
        Assertions.assertEquals("eriofzpyqs", model.bgpConfiguration().ipv6NeighborAddress().get(0).address());
        Assertions.assertEquals("v", model.importRoutePolicyId());
        Assertions.assertEquals("ur", model.exportRoutePolicyId());
    }
}