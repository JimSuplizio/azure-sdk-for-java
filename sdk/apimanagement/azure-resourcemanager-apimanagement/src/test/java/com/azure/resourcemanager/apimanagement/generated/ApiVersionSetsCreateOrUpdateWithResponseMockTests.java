// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.apimanagement.ApiManagementManager;
import com.azure.resourcemanager.apimanagement.models.ApiVersionSetContract;
import com.azure.resourcemanager.apimanagement.models.VersioningScheme;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ApiVersionSetsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"displayName\":\"fjczgohvpsuwi\",\"versioningScheme\":\"Header\",\"description\":\"xczbyfkoc\",\"versionQueryName\":\"zdct\",\"versionHeaderName\":\"lwscrngtwgxrol\"},\"id\":\"vplksdksutac\",\"name\":\"ctihavishbv\",\"type\":\"hxvpmqququxlp\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ApiManagementManager manager = ApiManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ApiVersionSetContract response = manager.apiVersionSets()
            .define("oduomtxjbrixym")
            .withExistingService("lmxoz", "sn")
            .withDisplayName("ikkqyvurhwishyfm")
            .withVersioningScheme(VersioningScheme.HEADER)
            .withDescription("qfev")
            .withVersionQueryName("yakcktehognsd")
            .withVersionHeaderName("kkdede")
            .withIfMatch("umtcqxmyvkxixypa")
            .create();

        Assertions.assertEquals("fjczgohvpsuwi", response.displayName());
        Assertions.assertEquals(VersioningScheme.HEADER, response.versioningScheme());
        Assertions.assertEquals("xczbyfkoc", response.description());
        Assertions.assertEquals("zdct", response.versionQueryName());
        Assertions.assertEquals("lwscrngtwgxrol", response.versionHeaderName());
    }
}
