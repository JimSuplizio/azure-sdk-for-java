// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.maintenance.MaintenanceManager;
import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignment;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignmentFilterProperties;
import com.azure.resourcemanager.maintenance.models.TagOperators;
import com.azure.resourcemanager.maintenance.models.TagSettingsProperties;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ConfigurationAssignmentsForResourceGroupsUpdateWithResponseMockTests {
    @Test
    public void testUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"location\":\"r\",\"properties\":{\"maintenanceConfigurationId\":\"riypoqeyhlqhyk\",\"resourceId\":\"lpyznuciqdsmexi\",\"filter\":{\"resourceTypes\":[\"uxtyasiibmi\",\"bnn\",\"stgnl\",\"hnmgixhcm\"],\"resourceGroups\":[\"qfoudorhcgyy\",\"rotwypundmbxhugc\",\"jkavl\"],\"osTypes\":[\"bmftpmdt\"],\"locations\":[\"ltfvnz\",\"yj\",\"otp\",\"opv\"],\"tagSettings\":{\"tags\":{\"ibcysihsgqc\":[\"qgqqihedsvqwthmk\"],\"zinkfkbgbzbowxeq\":[\"hohsd\",\"mcdzsufcohdxbz\",\"mcmuapc\",\"hdbevwqqxeyskon\"]},\"filterOperator\":\"Any\"}}},\"id\":\"mygvkzqkj\",\"name\":\"eokbze\",\"type\":\"ezrxcczurtleipqx\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MaintenanceManager manager = MaintenanceManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ConfigurationAssignment response = manager.configurationAssignmentsForResourceGroups()
            .updateWithResponse("qbnj", "rcgegydcwboxjum",
                new ConfigurationAssignmentInner().withLocation("qoli")
                    .withMaintenanceConfigurationId("aiouaubrjt")
                    .withResourceId("qxfuojrngif")
                    .withFilter(new ConfigurationAssignmentFilterProperties()
                        .withResourceTypes(Arrays.asList("asccbiui", "zdlyjdfqw"))
                        .withResourceGroups(Arrays.asList("oq", "fdvruz", "lzo"))
                        .withOsTypes(Arrays.asList("ctfnmdxotng"))
                        .withLocations(Arrays.asList("ugeyzihgrkyuiza", "snmfpphojeevy"))
                        .withTagSettings(new TagSettingsProperties()
                            .withTags(mapOf("mfg", Arrays.asList("zfczbg"), "qqxlajr",
                                Arrays.asList("glqgleoh", "betnluankrrfxee", "btijvacvbm", "z")))
                            .withFilterOperator(TagOperators.ALL))),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("r", response.location());
        Assertions.assertEquals("riypoqeyhlqhyk", response.maintenanceConfigurationId());
        Assertions.assertEquals("lpyznuciqdsmexi", response.resourceId());
        Assertions.assertEquals("uxtyasiibmi", response.filter().resourceTypes().get(0));
        Assertions.assertEquals("qfoudorhcgyy", response.filter().resourceGroups().get(0));
        Assertions.assertEquals("bmftpmdt", response.filter().osTypes().get(0));
        Assertions.assertEquals("ltfvnz", response.filter().locations().get(0));
        Assertions.assertEquals("qgqqihedsvqwthmk", response.filter().tagSettings().tags().get("ibcysihsgqc").get(0));
        Assertions.assertEquals(TagOperators.ANY, response.filter().tagSettings().filterOperator());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
