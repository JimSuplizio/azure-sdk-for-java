// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.sphere.AzureSphereManager;
import com.azure.resourcemanager.sphere.models.Image;
import com.azure.resourcemanager.sphere.models.RegionalDataBoundary;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ImagesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"image\":\"lkfg\",\"imageId\":\"dneu\",\"imageName\":\"fphsdyhtozfikdow\",\"regionalDataBoundary\":\"None\",\"uri\":\"v\",\"description\":\"xclvit\",\"componentId\":\"qzonosggbhcohf\",\"imageType\":\"OneBl\",\"provisioningState\":\"Accepted\"},\"id\":\"aljutiiswac\",\"name\":\"fgdkzzew\",\"type\":\"fvhqc\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AzureSphereManager manager = AzureSphereManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Image response = manager.images()
            .getWithResponse("mpgcjefuzmuvpbt", "d", "morppxebmnzbtbh", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("lkfg", response.properties().image());
        Assertions.assertEquals("dneu", response.properties().imageId());
        Assertions.assertEquals(RegionalDataBoundary.NONE, response.properties().regionalDataBoundary());
    }
}
