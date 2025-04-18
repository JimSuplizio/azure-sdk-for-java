// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.nginx.NginxManager;
import com.azure.resourcemanager.nginx.models.NginxDeploymentApiKeyResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ApiKeysGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"hint\":\"axoruzfgsquy\",\"endDateTime\":\"2021-03-18T06:01:03Z\"},\"id\":\"xxle\",\"name\":\"tramxjez\",\"type\":\"lwnwxuqlcvydyp\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NginxManager manager = NginxManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        NginxDeploymentApiKeyResponse response = manager.apiKeys()
            .getWithResponse("thzvaytdwkqbrqu", "paxh", "xiilivpdtiirqt", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(OffsetDateTime.parse("2021-03-18T06:01:03Z"), response.properties().endDateTime());
    }
}
