// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.PacketCapture;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PacketCapturesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"status\":\"Stopped\",\"reason\":\"srlzknmzlan\",\"captureStartTime\":\"2021-05-03T02:08:16Z\",\"networkInterfaces\":[\"vnphc\",\"zqtpjhmq\"],\"bytesToCapturePerPacket\":623266900390465958,\"totalBytesPerSession\":4724246192491470595,\"timeLimitInSeconds\":574931701,\"outputFiles\":[\"xsmlz\"]},\"id\":\"zdtxetlgyd\",\"name\":\"hqvlnnpxybafiqg\",\"type\":\"aarbgjekg\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MobileNetworkManager manager = MobileNetworkManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PacketCapture response = manager.packetCaptures()
            .define("vhqjwtrhtgvg")
            .withExistingPacketCoreControlPlane("tjklntikyjuzk", "bqzolxr")
            .withNetworkInterfaces(Arrays.asList("yjaf", "tlhguynuchl", "mltx"))
            .withBytesToCapturePerPacket(4026171526314677739L)
            .withTotalBytesPerSession(4255131406127462111L)
            .withTimeLimitInSeconds(1986885457)
            .create();

        Assertions.assertEquals("vnphc", response.networkInterfaces().get(0));
        Assertions.assertEquals(623266900390465958L, response.bytesToCapturePerPacket());
        Assertions.assertEquals(4724246192491470595L, response.totalBytesPerSession());
        Assertions.assertEquals(574931701, response.timeLimitInSeconds());
    }
}
