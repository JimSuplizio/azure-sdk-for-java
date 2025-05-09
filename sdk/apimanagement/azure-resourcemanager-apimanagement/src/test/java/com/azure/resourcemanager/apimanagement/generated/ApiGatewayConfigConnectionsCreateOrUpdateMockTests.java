// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.apimanagement.ApiManagementManager;
import com.azure.resourcemanager.apimanagement.models.ApiManagementGatewayConfigConnectionResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ApiGatewayConfigConnectionsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"sourceId\":\"p\",\"defaultHostname\":\"mfcfsuiwex\",\"hostnames\":[\"ckpgbmlyxbwslxgc\",\"xtoejtqvq\",\"tmlidk\",\"zxoluzntbpca\"]},\"etag\":\"pxq\",\"id\":\"xipe\",\"name\":\"rplf\",\"type\":\"fvmjjfzizxlbiqq\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ApiManagementManager manager = ApiManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        ApiManagementGatewayConfigConnectionResource response = manager.apiGatewayConfigConnections()
            .define("wos")
            .withExistingGateway("dgfquywmwtacrscf", "ncrvjcullmfwfpoe")
            .withSourceId("fxvchmubyguqh")
            .withHostnames(Arrays.asList("jxjrbvy", "kbuatxkznlwl"))
            .create();

        Assertions.assertEquals("p", response.sourceId());
        Assertions.assertEquals("ckpgbmlyxbwslxgc", response.hostnames().get(0));
    }
}
