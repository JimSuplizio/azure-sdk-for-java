// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.TrunkedNetwork;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class TrunkedNetworksListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"extendedLocation\":{\"name\":\"wp\",\"type\":\"chgjtnhtukfacih\"},\"properties\":{\"associatedResourceIds\":[\"ntumeezbxvq\",\"bnuvwcg\",\"sgomtmjz\",\"xuqgovsxpwwztj\"],\"clusterId\":\"kkhtgfredmlscgrl\",\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"aovjow\",\"hybridAksClustersAssociatedIds\":[\"p\"],\"hybridAksPluginType\":\"SRIOV\",\"interfaceName\":\"o\",\"isolationDomainIds\":[\"yotgkwsxnsrqorc\",\"enmvcebxeetq\"],\"provisioningState\":\"Accepted\",\"virtualMachinesAssociatedIds\":[\"x\"],\"vlans\":[4290239630152162906,2051583075223159829,6085205262559506453,4026918220649555007]},\"location\":\"urcgojmrvvxwj\",\"tags\":{\"kansbvriaqgvt\":\"zsehqqrsilcchskx\",\"rthcfjzh\":\"jrulfucte\"},\"id\":\"lyubqjrostvrjeq\",\"name\":\"tzzbeq\",\"type\":\"ztr\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetworkCloudManager manager = NetworkCloudManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<TrunkedNetwork> response
            = manager.trunkedNetworks().listByResourceGroup("vtooxrpo", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("urcgojmrvvxwj", response.iterator().next().location());
        Assertions.assertEquals("zsehqqrsilcchskx", response.iterator().next().tags().get("kansbvriaqgvt"));
        Assertions.assertEquals("wp", response.iterator().next().extendedLocation().name());
        Assertions.assertEquals("chgjtnhtukfacih", response.iterator().next().extendedLocation().type());
        Assertions.assertEquals(HybridAksPluginType.SRIOV, response.iterator().next().hybridAksPluginType());
        Assertions.assertEquals("o", response.iterator().next().interfaceName());
        Assertions.assertEquals("yotgkwsxnsrqorc", response.iterator().next().isolationDomainIds().get(0));
        Assertions.assertEquals(4290239630152162906L, response.iterator().next().vlans().get(0));
    }
}
