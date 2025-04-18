// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.migration.assessment.fluent.models.ImportCollectorInner;
import com.azure.resourcemanager.migration.assessment.models.CollectorPropertiesBase;
import com.azure.resourcemanager.migration.assessment.models.ProvisioningState;
import org.junit.jupiter.api.Assertions;

public final class ImportCollectorInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImportCollectorInner model = BinaryData.fromString(
            "{\"properties\":{\"discoverySiteId\":\"qxuwyvca\",\"createdTimestamp\":\"2021-10-26T05:34:42Z\",\"updatedTimestamp\":\"2021-06-20T08:40:01Z\",\"provisioningState\":\"Failed\"},\"id\":\"izus\",\"name\":\"szlbscm\",\"type\":\"lzijiufehgmvflnw\"}")
            .toObject(ImportCollectorInner.class);
        Assertions.assertEquals(ProvisioningState.FAILED, model.properties().provisioningState());
        Assertions.assertEquals("qxuwyvca", model.properties().discoverySiteId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImportCollectorInner model = new ImportCollectorInner()
            .withProperties(new CollectorPropertiesBase().withProvisioningState(ProvisioningState.FAILED)
                .withDiscoverySiteId("qxuwyvca"));
        model = BinaryData.fromObject(model).toObject(ImportCollectorInner.class);
        Assertions.assertEquals(ProvisioningState.FAILED, model.properties().provisioningState());
        Assertions.assertEquals("qxuwyvca", model.properties().discoverySiteId());
    }
}
