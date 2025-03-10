// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mediaservices.MediaServicesManager;
import com.azure.resourcemanager.mediaservices.models.EncryptionScheme;
import com.azure.resourcemanager.mediaservices.models.ListPathsResponse;
import com.azure.resourcemanager.mediaservices.models.StreamingPolicyStreamingProtocol;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class StreamingLocatorsListPathsWithResponseMockTests {
    @Test
    public void testListPathsWithResponse() throws Exception {
        String responseStr
            = "{\"streamingPaths\":[{\"streamingProtocol\":\"Dash\",\"encryptionScheme\":\"CommonEncryptionCenc\",\"paths\":[\"pibkephuu\"]}],\"downloadPaths\":[\"ctatoyintqpbrlcy\",\"duczkgof\"]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MediaServicesManager manager = MediaServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ListPathsResponse response = manager.streamingLocators()
            .listPathsWithResponse("seksgbux", "ntuygdhgaqipir", "iwrqofulopmjnl", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(StreamingPolicyStreamingProtocol.DASH,
            response.streamingPaths().get(0).streamingProtocol());
        Assertions.assertEquals(EncryptionScheme.COMMON_ENCRYPTION_CENC,
            response.streamingPaths().get(0).encryptionScheme());
        Assertions.assertEquals("pibkephuu", response.streamingPaths().get(0).paths().get(0));
        Assertions.assertEquals("ctatoyintqpbrlcy", response.downloadPaths().get(0));
    }
}
