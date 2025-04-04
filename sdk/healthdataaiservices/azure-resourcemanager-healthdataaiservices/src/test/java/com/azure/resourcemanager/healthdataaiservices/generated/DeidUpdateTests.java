// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.healthdataaiservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthdataaiservices.models.DeidPropertiesUpdate;
import com.azure.resourcemanager.healthdataaiservices.models.DeidUpdate;
import com.azure.resourcemanager.healthdataaiservices.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.healthdataaiservices.models.ManagedServiceIdentityUpdate;
import com.azure.resourcemanager.healthdataaiservices.models.PublicNetworkAccess;
import com.azure.resourcemanager.healthdataaiservices.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DeidUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeidUpdate model = BinaryData.fromString(
            "{\"tags\":{\"jtjaodxobnbdxkq\":\"erhhbcsglumm\",\"ajionpimexgstxg\":\"xo\",\"gmaajrm\":\"po\",\"clwhijcoejctbz\":\"djwzrlov\"},\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"axcfjpgddtocjjx\":{\"clientId\":\"bkbfkgukdkex\",\"principalId\":\"pofm\"}}},\"properties\":{\"publicNetworkAccess\":\"Disabled\"}}")
            .toObject(DeidUpdate.class);
        Assertions.assertEquals("erhhbcsglumm", model.tags().get("jtjaodxobnbdxkq"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.properties().publicNetworkAccess());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeidUpdate model = new DeidUpdate()
            .withTags(mapOf("jtjaodxobnbdxkq", "erhhbcsglumm", "ajionpimexgstxg", "xo", "gmaajrm", "po",
                "clwhijcoejctbz", "djwzrlov"))
            .withIdentity(new ManagedServiceIdentityUpdate().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf("axcfjpgddtocjjx", new UserAssignedIdentity())))
            .withProperties(new DeidPropertiesUpdate().withPublicNetworkAccess(PublicNetworkAccess.DISABLED));
        model = BinaryData.fromObject(model).toObject(DeidUpdate.class);
        Assertions.assertEquals("erhhbcsglumm", model.tags().get("jtjaodxobnbdxkq"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.properties().publicNetworkAccess());
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
