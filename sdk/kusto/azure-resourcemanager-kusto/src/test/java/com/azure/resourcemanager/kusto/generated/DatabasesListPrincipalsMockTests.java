// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.models.DatabasePrincipal;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalRole;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DatabasesListPrincipalsMockTests {
    @Test
    public void testListPrincipals() throws Exception {
        String responseStr
            = "{\"value\":[{\"role\":\"Ingestor\",\"name\":\"erngbtcjuahokqto\",\"type\":\"App\",\"fqn\":\"uxofshfphwpnulai\",\"email\":\"zejywhslw\",\"appId\":\"jpllndnpdwrpq\",\"tenantName\":\"gfugsnnfhyet\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        KustoManager manager = KustoManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DatabasePrincipal> response = manager.databases()
            .listPrincipals("hsycxhxzgaz", "taboidvmf", "hppubowsepdfgkmt", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(DatabasePrincipalRole.INGESTOR, response.iterator().next().role());
        Assertions.assertEquals("erngbtcjuahokqto", response.iterator().next().name());
        Assertions.assertEquals(DatabasePrincipalType.APP, response.iterator().next().type());
        Assertions.assertEquals("uxofshfphwpnulai", response.iterator().next().fqn());
        Assertions.assertEquals("zejywhslw", response.iterator().next().email());
        Assertions.assertEquals("jpllndnpdwrpq", response.iterator().next().appId());
    }
}
