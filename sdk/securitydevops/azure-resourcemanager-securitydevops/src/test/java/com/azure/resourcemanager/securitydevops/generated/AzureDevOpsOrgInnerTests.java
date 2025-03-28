// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securitydevops.fluent.models.AzureDevOpsOrgInner;
import com.azure.resourcemanager.securitydevops.models.AutoDiscovery;
import com.azure.resourcemanager.securitydevops.models.AzureDevOpsOrgProperties;
import com.azure.resourcemanager.securitydevops.models.ProvisioningState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureDevOpsOrgInnerTests {
    @Test
    public void testDeserialize() {
        AzureDevOpsOrgInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Canceled\",\"autoDiscovery\":\"Enabled\"},\"id\":\"wrlyxwjkcprb\",\"name\":\"wbxgjvt\",\"type\":\"vpys\"}")
            .toObject(AzureDevOpsOrgInner.class);
        Assertions.assertEquals(ProvisioningState.CANCELED, model.properties().provisioningState());
        Assertions.assertEquals(AutoDiscovery.ENABLED, model.properties().autoDiscovery());
    }

    @Test
    public void testSerialize() {
        AzureDevOpsOrgInner model = new AzureDevOpsOrgInner()
            .withProperties(new AzureDevOpsOrgProperties().withProvisioningState(ProvisioningState.CANCELED)
                .withAutoDiscovery(AutoDiscovery.ENABLED));
        model = BinaryData.fromObject(model).toObject(AzureDevOpsOrgInner.class);
        Assertions.assertEquals(ProvisioningState.CANCELED, model.properties().provisioningState());
        Assertions.assertEquals(AutoDiscovery.ENABLED, model.properties().autoDiscovery());
    }
}
