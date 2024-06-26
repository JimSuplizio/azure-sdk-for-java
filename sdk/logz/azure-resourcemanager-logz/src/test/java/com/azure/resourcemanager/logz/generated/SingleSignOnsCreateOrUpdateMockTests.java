// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.logz.LogzManager;
import com.azure.resourcemanager.logz.models.LogzSingleSignOnProperties;
import com.azure.resourcemanager.logz.models.LogzSingleSignOnResource;
import com.azure.resourcemanager.logz.models.SingleSignOnStates;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SingleSignOnsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"singleSignOnState\":\"Existing\",\"enterpriseAppId\":\"ojvknmefqsgzvaha\",\"singleSignOnUrl\":\"y\",\"provisioningState\":\"Succeeded\"},\"id\":\"vgqzcjrvxd\",\"name\":\"zlmwlxkvugfhz\",\"type\":\"vawjvzunlu\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        LogzManager manager =
            LogzManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        LogzSingleSignOnResource response =
            manager
                .singleSignOns()
                .define("iebwwaloayqcgwrt")
                .withExistingMonitor("wxzvlvqhjkb", "gibtnm")
                .withProperties(
                    new LogzSingleSignOnProperties()
                        .withSingleSignOnState(SingleSignOnStates.ENABLE)
                        .withEnterpriseAppId("yzm")
                        .withSingleSignOnUrl("xongmtsavjcbpwxq"))
                .create();

        Assertions.assertEquals(SingleSignOnStates.EXISTING, response.properties().singleSignOnState());
        Assertions.assertEquals("ojvknmefqsgzvaha", response.properties().enterpriseAppId());
        Assertions.assertEquals("y", response.properties().singleSignOnUrl());
    }
}
