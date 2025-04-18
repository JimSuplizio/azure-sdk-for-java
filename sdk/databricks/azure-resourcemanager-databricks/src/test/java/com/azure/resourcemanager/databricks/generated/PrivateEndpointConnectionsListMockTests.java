// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.databricks.AzureDatabricksManager;
import com.azure.resourcemanager.databricks.models.PrivateEndpointConnection;
import com.azure.resourcemanager.databricks.models.PrivateLinkServiceConnectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"privateEndpoint\":{\"id\":\"ouwaboekqvkeln\"},\"groupIds\":[\"bxwyjsflhhcaa\",\"n\",\"ixisxyawjoy\"],\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"slyjpkiid\",\"actionsRequired\":\"exznelixhnr\"},\"provisioningState\":\"Creating\"},\"id\":\"o\",\"name\":\"hb\",\"type\":\"xknalaulppg\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AzureDatabricksManager manager = AzureDatabricksManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PrivateEndpointConnection> response
            = manager.privateEndpointConnections().list("fpbsjyofdxl", "us", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("bxwyjsflhhcaa", response.iterator().next().properties().groupIds().get(0));
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.REJECTED,
            response.iterator().next().properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("slyjpkiid",
            response.iterator().next().properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("exznelixhnr",
            response.iterator().next().properties().privateLinkServiceConnectionState().actionsRequired());
    }
}
