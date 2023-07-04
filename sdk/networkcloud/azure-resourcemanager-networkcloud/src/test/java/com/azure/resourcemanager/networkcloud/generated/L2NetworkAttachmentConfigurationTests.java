// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.KubernetesPluginType;
import com.azure.resourcemanager.networkcloud.models.L2NetworkAttachmentConfiguration;
import org.junit.jupiter.api.Assertions;

public final class L2NetworkAttachmentConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        L2NetworkAttachmentConfiguration model =
            BinaryData
                .fromString("{\"networkId\":\"xmhhvhgureo\",\"pluginType\":\"MACVLAN\"}")
                .toObject(L2NetworkAttachmentConfiguration.class);
        Assertions.assertEquals("xmhhvhgureo", model.networkId());
        Assertions.assertEquals(KubernetesPluginType.MACVLAN, model.pluginType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        L2NetworkAttachmentConfiguration model =
            new L2NetworkAttachmentConfiguration()
                .withNetworkId("xmhhvhgureo")
                .withPluginType(KubernetesPluginType.MACVLAN);
        model = BinaryData.fromObject(model).toObject(L2NetworkAttachmentConfiguration.class);
        Assertions.assertEquals("xmhhvhgureo", model.networkId());
        Assertions.assertEquals(KubernetesPluginType.MACVLAN, model.pluginType());
    }
}