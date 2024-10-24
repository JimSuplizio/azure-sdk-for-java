// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.automation.AutomationManager;
import com.azure.resourcemanager.automation.models.Certificate;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CertificatesListByAutomationAccountMockTests {
    @Test
    public void testListByAutomationAccount() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"thumbprint\":\"gfyvrtpqpe\",\"expiryTime\":\"2021-11-28T01:20:49Z\",\"isExportable\":true,\"creationTime\":\"2021-04-18T23:29:20Z\",\"lastModifiedTime\":\"2021-06-02T22:19:26Z\",\"description\":\"qhqyhwqwemvx\"},\"id\":\"abckmzeoxinhgre\",\"name\":\"h\",\"type\":\"whlpuzjpceezn\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AutomationManager manager = AutomationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Certificate> response
            = manager.certificates().listByAutomationAccount("ztfwfqchvcz", "vjnn", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("qhqyhwqwemvx", response.iterator().next().description());
    }
}
