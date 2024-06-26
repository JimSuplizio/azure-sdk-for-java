// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreDataPlane;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PacketCoreDataPlanesListByPacketCoreControlPlaneMockTests {
    @Test
    public void testListByPacketCoreControlPlane() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"userPlaneAccessInterface\":{\"name\":\"fovwmbjlzqsczpg\",\"ipv4Address\":\"wnapfdq\",\"ipv4Subnet\":\"wf\",\"ipv4Gateway\":\"tnuwjtkschgc\",\"vlanId\":84178465,\"ipv4AddressList\":[\"eseyqr\",\"vyeldot\",\"v\",\"kwiswskukjtas\"],\"bfdIpv4Endpoints\":[\"ispkxkdtx\",\"kndlqvtwknvg\"]},\"userPlaneAccessVirtualIpv4Addresses\":[\"ugtywatmqaqkue\",\"tgroesh\",\"ygzc\"]},\"location\":\"fqxkfaoyteh\",\"tags\":{\"ejnndljdju\":\"vjmvqmtdwckygr\",\"req\":\"kb\"},\"id\":\"n\",\"name\":\"ceysfaqeg\",\"type\":\"lwryshwddkvbxgkq\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MobileNetworkManager manager = MobileNetworkManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PacketCoreDataPlane> response = manager.packetCoreDataPlanes()
            .listByPacketCoreControlPlane("gkzz", "taf", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("fqxkfaoyteh", response.iterator().next().location());
        Assertions.assertEquals("vjmvqmtdwckygr", response.iterator().next().tags().get("ejnndljdju"));
        Assertions.assertEquals("fovwmbjlzqsczpg", response.iterator().next().userPlaneAccessInterface().name());
        Assertions.assertEquals("wnapfdq", response.iterator().next().userPlaneAccessInterface().ipv4Address());
        Assertions.assertEquals("wf", response.iterator().next().userPlaneAccessInterface().ipv4Subnet());
        Assertions.assertEquals("tnuwjtkschgc", response.iterator().next().userPlaneAccessInterface().ipv4Gateway());
        Assertions.assertEquals(84178465, response.iterator().next().userPlaneAccessInterface().vlanId());
        Assertions.assertEquals("eseyqr",
            response.iterator().next().userPlaneAccessInterface().ipv4AddressList().get(0));
        Assertions.assertEquals("ispkxkdtx",
            response.iterator().next().userPlaneAccessInterface().bfdIpv4Endpoints().get(0));
        Assertions.assertEquals("ugtywatmqaqkue",
            response.iterator().next().userPlaneAccessVirtualIpv4Addresses().get(0));
    }
}
