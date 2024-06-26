// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.Replica;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ContainerAppsRevisionReplicasGetReplicaWithResponseMockTests {
    @Test
    public void testGetReplicaWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"createdTime\":\"2021-11-27T21:15:44Z\",\"runningState\":\"NotRunning\",\"runningStateDetails\":\"epdjxqeskoyn\",\"containers\":[{\"name\":\"pckaewse\",\"containerId\":\"eskwxeg\",\"ready\":false,\"started\":false,\"restartCount\":665890978,\"runningState\":\"Terminated\",\"runningStateDetails\":\"tmjtsghp\",\"logStreamEndpoint\":\"bcpzarpzeqacdldt\",\"execEndpoint\":\"pypefcpczshnuq\"},{\"name\":\"aizu\",\"containerId\":\"kh\",\"ready\":false,\"started\":true,\"restartCount\":1048467054,\"runningState\":\"Running\",\"runningStateDetails\":\"vtvegwqiukvzw\",\"logStreamEndpoint\":\"wtthaokgksk\",\"execEndpoint\":\"vb\"},{\"name\":\"hajqfuk\",\"containerId\":\"expgeumilhwu\",\"ready\":false,\"started\":true,\"restartCount\":1014412406,\"runningState\":\"Terminated\",\"runningStateDetails\":\"ofninbdbz\",\"logStreamEndpoint\":\"cw\",\"execEndpoint\":\"rsmpcbbprtuga\"}],\"initContainers\":[{\"name\":\"cyksivmfo\",\"containerId\":\"rt\",\"ready\":true,\"started\":true,\"restartCount\":1811675094,\"runningState\":\"Running\",\"runningStateDetails\":\"cwjjxsgmbawvif\",\"logStreamEndpoint\":\"kecifhocjxwklo\",\"execEndpoint\":\"rvtxvcmufunlc\"},{\"name\":\"xvi\",\"containerId\":\"eyngjg\",\"ready\":false,\"started\":false,\"restartCount\":563018487,\"runningState\":\"Running\",\"runningStateDetails\":\"pmcrdcuelj\",\"logStreamEndpoint\":\"ahxm\",\"execEndpoint\":\"ryarvsxzqb\"}]},\"id\":\"cjkay\",\"name\":\"pth\",\"type\":\"odubtlmjt\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        ContainerAppsApiManager manager = ContainerAppsApiManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        Replica response = manager.containerAppsRevisionReplicas().getReplicaWithResponse("cvumepjpbi", "nzpphepife",
            "leqirccjclykcgxv", "pjlvczuoda", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("pckaewse", response.containers().get(0).name());
        Assertions.assertEquals("eskwxeg", response.containers().get(0).containerId());
        Assertions.assertEquals(false, response.containers().get(0).ready());
        Assertions.assertEquals(false, response.containers().get(0).started());
        Assertions.assertEquals(665890978, response.containers().get(0).restartCount());
        Assertions.assertEquals("cyksivmfo", response.initContainers().get(0).name());
        Assertions.assertEquals("rt", response.initContainers().get(0).containerId());
        Assertions.assertEquals(true, response.initContainers().get(0).ready());
        Assertions.assertEquals(true, response.initContainers().get(0).started());
        Assertions.assertEquals(1811675094, response.initContainers().get(0).restartCount());
    }
}
