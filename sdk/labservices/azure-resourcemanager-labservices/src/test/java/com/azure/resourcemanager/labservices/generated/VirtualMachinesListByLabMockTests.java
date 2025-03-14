// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.labservices.LabServicesManager;
import com.azure.resourcemanager.labservices.models.VirtualMachine;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class VirtualMachinesListByLabMockTests {
    @Test
    public void testListByLab() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Updating\",\"state\":\"ResettingPassword\",\"connectionProfile\":{\"privateIpAddress\":\"xhihfrbbcevqagtl\",\"sshAuthority\":\"hlfkqojpy\",\"sshInBrowserUrl\":\"gtrd\",\"rdpAuthority\":\"ifmzzsd\",\"rdpInBrowserUrl\":\"brn\",\"adminUsername\":\"u\",\"nonAdminUsername\":\"prafwgckhoc\"},\"claimedByUserId\":\"d\",\"vmType\":\"Template\"},\"id\":\"wafqroud\",\"name\":\"spave\",\"type\":\"hrv\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LabServicesManager manager = LabServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<VirtualMachine> response
            = manager.virtualMachines().listByLab("zvhxnk", "mtk", "bo", com.azure.core.util.Context.NONE);

    }
}
