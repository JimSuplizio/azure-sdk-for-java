// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devopsinfrastructure.fluent.models.PoolInner;
import com.azure.resourcemanager.devopsinfrastructure.models.AgentProfile;
import com.azure.resourcemanager.devopsinfrastructure.models.FabricProfile;
import com.azure.resourcemanager.devopsinfrastructure.models.ManagedServiceIdentity;
import com.azure.resourcemanager.devopsinfrastructure.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.devopsinfrastructure.models.OrganizationProfile;
import com.azure.resourcemanager.devopsinfrastructure.models.PoolProperties;
import com.azure.resourcemanager.devopsinfrastructure.models.ProvisioningState;
import com.azure.resourcemanager.devopsinfrastructure.models.ResourcePredictionsProfile;
import com.azure.resourcemanager.devopsinfrastructure.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PoolInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PoolInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"maximumConcurrency\":1475071070,\"organizationProfile\":{\"kind\":\"OrganizationProfile\"},\"agentProfile\":{\"kind\":\"AgentProfile\",\"resourcePredictions\":\"datazvgnwzs\",\"resourcePredictionsProfile\":{\"kind\":\"ResourcePredictionsProfile\"}},\"fabricProfile\":{\"kind\":\"FabricProfile\"},\"devCenterProjectResourceId\":\"glzufc\"},\"identity\":{\"principalId\":\"ohdbihanufh\",\"tenantId\":\"bj\",\"type\":\"None\",\"userAssignedIdentities\":{\"fpikxwczb\":{\"principalId\":\"th\",\"clientId\":\"hab\"}}},\"location\":\"cnpqxuhivyqniwby\",\"tags\":{\"mjgr\":\"xvd\"},\"id\":\"fwvuk\",\"name\":\"gaudcc\",\"type\":\"nhsjcnyej\"}")
            .toObject(PoolInner.class);
        Assertions.assertEquals("cnpqxuhivyqniwby", model.location());
        Assertions.assertEquals("xvd", model.tags().get("mjgr"));
        Assertions.assertEquals(ProvisioningState.SUCCEEDED, model.properties().provisioningState());
        Assertions.assertEquals(1475071070, model.properties().maximumConcurrency());
        Assertions.assertEquals("glzufc", model.properties().devCenterProjectResourceId());
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PoolInner model = new PoolInner().withLocation("cnpqxuhivyqniwby")
            .withTags(mapOf("mjgr", "xvd"))
            .withProperties(new PoolProperties().withProvisioningState(ProvisioningState.SUCCEEDED)
                .withMaximumConcurrency(1475071070)
                .withOrganizationProfile(new OrganizationProfile())
                .withAgentProfile(new AgentProfile().withResourcePredictions("datazvgnwzs")
                    .withResourcePredictionsProfile(new ResourcePredictionsProfile()))
                .withFabricProfile(new FabricProfile())
                .withDevCenterProjectResourceId("glzufc"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.NONE)
                .withUserAssignedIdentities(mapOf("fpikxwczb", new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(PoolInner.class);
        Assertions.assertEquals("cnpqxuhivyqniwby", model.location());
        Assertions.assertEquals("xvd", model.tags().get("mjgr"));
        Assertions.assertEquals(ProvisioningState.SUCCEEDED, model.properties().provisioningState());
        Assertions.assertEquals(1475071070, model.properties().maximumConcurrency());
        Assertions.assertEquals("glzufc", model.properties().devCenterProjectResourceId());
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.identity().type());
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
