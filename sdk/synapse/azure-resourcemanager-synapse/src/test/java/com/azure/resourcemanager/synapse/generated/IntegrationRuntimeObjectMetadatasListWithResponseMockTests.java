// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.models.GetSsisObjectMetadataRequest;
import com.azure.resourcemanager.synapse.models.SsisObjectMetadataListResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimeObjectMetadatasListWithResponseMockTests {
    @Test
    public void testListWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"type\":\"SsisObjectMetadata\",\"id\":617729007391101899,\"name\":\"kl\",\"description\":\"l\"},{\"type\":\"SsisObjectMetadata\",\"id\":2463823139091327595,\"name\":\"h\",\"description\":\"zyqu\"},{\"type\":\"SsisObjectMetadata\",\"id\":5858060139563890420,\"name\":\"utrpbr\",\"description\":\"yuuatvlmbjwcolbm\"},{\"type\":\"SsisObjectMetadata\",\"id\":1108556269139033179,\"name\":\"tpc\",\"description\":\"hprzrvxhmtfho\"}],\"nextLink\":\"xzcmjhngxno\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SynapseManager manager = SynapseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SsisObjectMetadataListResponse response = manager.integrationRuntimeObjectMetadatas()
            .listWithResponse("ukecpx", "azvdhctmmkosz", "dblnsntrp",
                new GetSsisObjectMetadataRequest().withMetadataPath("qkio"), com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(617729007391101899L, response.value().get(0).id());
        Assertions.assertEquals("kl", response.value().get(0).name());
        Assertions.assertEquals("l", response.value().get(0).description());
        Assertions.assertEquals("xzcmjhngxno", response.nextLink());
    }
}
