// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.apimanagement.ApiManagementManager;
import com.azure.resourcemanager.apimanagement.models.UserContract;
import com.azure.resourcemanager.apimanagement.models.UserState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class WorkspaceGroupUsersListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"firstName\":\"xennzowgu\",\"lastName\":\"hexjpwyhmktp\",\"email\":\"oicpkoamqfd\",\"registrationDate\":\"2021-11-25T14:57:05Z\",\"groups\":[{\"displayName\":\"jaof\",\"description\":\"vhhrgvkuuikr\",\"builtIn\":true,\"type\":\"system\",\"externalId\":\"s\"},{\"displayName\":\"vdxenxjvapdqg\",\"description\":\"ygrfyyknx\",\"builtIn\":true,\"type\":\"external\",\"externalId\":\"ynlcimjmurocryfu\"},{\"displayName\":\"kt\",\"description\":\"zuzvbqbroyrw\",\"builtIn\":true,\"type\":\"custom\",\"externalId\":\"eozkb\"}],\"state\":\"blocked\",\"note\":\"su\",\"identities\":[{\"provider\":\"lzcavodcvfwkp\",\"id\":\"bsg\"},{\"provider\":\"qtxlki\",\"id\":\"iklx\"}]},\"id\":\"gstunsatcistd\",\"name\":\"ehkbuajkodpzqtg\",\"type\":\"azwxdfaask\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ApiManagementManager manager = ApiManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<UserContract> response = manager.workspaceGroupUsers()
            .list("judg", "wrjuiuzlf", "hzihlzljqcmmgsm", "ujunqwkjfmt", "ybdz", 1853872522, 483917170,
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xennzowgu", response.iterator().next().firstName());
        Assertions.assertEquals("hexjpwyhmktp", response.iterator().next().lastName());
        Assertions.assertEquals("oicpkoamqfd", response.iterator().next().email());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-25T14:57:05Z"),
            response.iterator().next().registrationDate());
        Assertions.assertEquals(UserState.BLOCKED, response.iterator().next().state());
        Assertions.assertEquals("su", response.iterator().next().note());
        Assertions.assertEquals("lzcavodcvfwkp", response.iterator().next().identities().get(0).provider());
        Assertions.assertEquals("bsg", response.iterator().next().identities().get(0).id());
    }
}
