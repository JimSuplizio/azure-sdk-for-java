// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointConnection;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointServiceConnectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"privateEndpoint\":{\"id\":\"eakxcptsoqfyi\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"chkrttzr\",\"actionsRequired\":\"isgykiuemvanbwz\"},\"provisioningState\":\"Deleting\",\"groupIds\":[\"xxbsojklinhmd\"]},\"location\":\"sprqsgnzxojpslsv\",\"etag\":\"pli\",\"id\":\"fiqwoy\",\"name\":\"qvapcohhoucq\",\"type\":\"q\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CognitiveServicesManager manager = CognitiveServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response = manager.privateEndpointConnections()
            .getWithResponse("laqacigele", "hdbvqvwzkjop", "beonrlkwzdq", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.REJECTED,
            response.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("chkrttzr", response.properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("isgykiuemvanbwz",
            response.properties().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("xxbsojklinhmd", response.properties().groupIds().get(0));
        Assertions.assertEquals("sprqsgnzxojpslsv", response.location());
    }
}
