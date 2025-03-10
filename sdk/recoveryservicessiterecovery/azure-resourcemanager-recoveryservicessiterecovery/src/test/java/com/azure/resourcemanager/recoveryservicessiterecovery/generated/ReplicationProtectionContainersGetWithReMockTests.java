// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectionContainer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ReplicationProtectionContainersGetWithReMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"fabricFriendlyName\":\"rwxohl\",\"friendlyName\":\"snj\",\"fabricType\":\"chiypbfhm\",\"protectedItemCount\":1155099338,\"pairingStatus\":\"tqozewbrsrjzgkbr\",\"role\":\"xboufqnnqbjx\",\"fabricSpecificDetails\":{\"instanceType\":\"srerukbuudriz\"}},\"location\":\"wkjxlaaced\",\"id\":\"kq\",\"name\":\"lssybzbev\",\"type\":\"bnrommkiqhypwtm\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SiteRecoveryManager manager = SiteRecoveryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ProtectionContainer response = manager.replicationProtectionContainers()
            .getWithResponse("mwdz", "zlhcu", "x", "qpwwvmbjecfwlbgh", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("rwxohl", response.properties().fabricFriendlyName());
        Assertions.assertEquals("snj", response.properties().friendlyName());
        Assertions.assertEquals("chiypbfhm", response.properties().fabricType());
        Assertions.assertEquals(1155099338, response.properties().protectedItemCount());
        Assertions.assertEquals("tqozewbrsrjzgkbr", response.properties().pairingStatus());
        Assertions.assertEquals("xboufqnnqbjx", response.properties().role());
        Assertions.assertEquals("wkjxlaaced", response.location());
    }
}
