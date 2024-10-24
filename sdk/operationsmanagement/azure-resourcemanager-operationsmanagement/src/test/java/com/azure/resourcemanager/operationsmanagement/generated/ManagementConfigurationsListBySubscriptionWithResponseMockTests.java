// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.operationsmanagement.OperationsManagementManager;
import com.azure.resourcemanager.operationsmanagement.models.ManagementConfigurationPropertiesList;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ManagementConfigurationsListBySubscriptionWithResponseMockTests {
    @Test
    public void testListBySubscriptionWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"location\":\"b\",\"properties\":{\"applicationId\":\"e\",\"parentResourceType\":\"jzzvdud\",\"parameters\":[{},{},{}],\"provisioningState\":\"slfhotwm\",\"template\":\"dataynpwlbj\"},\"id\":\"pgacftadehxnlty\",\"name\":\"sop\",\"type\":\"usue\"},{\"location\":\"zwdejbavor\",\"properties\":{\"applicationId\":\"mohctb\",\"parentResourceType\":\"vudwx\",\"parameters\":[{},{}],\"provisioningState\":\"nvowgujju\",\"template\":\"datawdkcglhsl\"},\"id\":\"zj\",\"name\":\"yggdtjixh\",\"type\":\"kuofqweykhme\"},{\"location\":\"vfyexfw\",\"properties\":{\"applicationId\":\"cibvyvdcsitynn\",\"parentResourceType\":\"amdecte\",\"parameters\":[{}],\"provisioningState\":\"qsc\",\"template\":\"dataeypvhezrkg\"},\"id\":\"hcjrefovgmk\",\"name\":\"sle\",\"type\":\"yvxyqjp\"},{\"location\":\"attpngjcrcczsq\",\"properties\":{\"applicationId\":\"vmdajvnysou\",\"parentResourceType\":\"q\",\"parameters\":[{},{},{}],\"provisioningState\":\"noae\",\"template\":\"datapfhyhl\"},\"id\":\"rpmopjmc\",\"name\":\"atuokthfuiu\",\"type\":\"odsfcpkvxodpuozm\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        OperationsManagementManager manager = OperationsManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ManagementConfigurationPropertiesList response = manager.managementConfigurations()
            .listBySubscriptionWithResponse(com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("b", response.value().get(0).location());
        Assertions.assertEquals("e", response.value().get(0).properties().applicationId());
        Assertions.assertEquals("jzzvdud", response.value().get(0).properties().parentResourceType());
    }
}
