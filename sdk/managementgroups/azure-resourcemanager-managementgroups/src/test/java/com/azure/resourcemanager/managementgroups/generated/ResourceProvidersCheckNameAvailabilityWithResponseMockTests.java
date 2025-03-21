// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.managementgroups.ManagementGroupsManager;
import com.azure.resourcemanager.managementgroups.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.managementgroups.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.managementgroups.models.Type;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ResourceProvidersCheckNameAvailabilityWithResponseMockTests {
    @Test
    public void testCheckNameAvailabilityWithResponse() throws Exception {
        String responseStr = "{\"nameAvailable\":true,\"reason\":\"AlreadyExists\",\"message\":\"as\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ManagementGroupsManager manager = ManagementGroupsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CheckNameAvailabilityResult response = manager.resourceProviders()
            .checkNameAvailabilityWithResponse(new CheckNameAvailabilityRequest().withName("bqwrvtldgm")
                .withType(Type.MICROSOFT_MANAGEMENT_MANAGEMENT_GROUPS), com.azure.core.util.Context.NONE)
            .getValue();

    }
}
