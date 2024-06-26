// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.models.Cluster;
import com.azure.resourcemanager.avs.models.SkuTier;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ClustersGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"clusterSize\":754106802,\"provisioningState\":\"Failed\",\"clusterId\":1484369172,\"hosts\":[\"ohu\"],\"vsanDatastoreName\":\"wtwko\"},\"sku\":{\"name\":\"zwculkbawpfajnj\",\"tier\":\"Premium\",\"size\":\"wtjjguktalhsnv\",\"family\":\"dmxzr\",\"capacity\":596889388},\"id\":\"mlnwiaaomylweazu\",\"name\":\"cse\",\"type\":\"hwwn\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AvsManager manager = AvsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Cluster response = manager.clusters()
            .getWithResponse("beitpkx", "tmo", "bklftidgfcwqmpim", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("zwculkbawpfajnj", response.sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, response.sku().tier());
        Assertions.assertEquals("wtjjguktalhsnv", response.sku().size());
        Assertions.assertEquals("dmxzr", response.sku().family());
        Assertions.assertEquals(596889388, response.sku().capacity());
        Assertions.assertEquals(754106802, response.clusterSize());
        Assertions.assertEquals("ohu", response.hosts().get(0));
        Assertions.assertEquals("wtwko", response.vsanDatastoreName());
    }
}
