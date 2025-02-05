// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.RestorePointProperties;

public final class RestorePointPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestorePointProperties model = BinaryData.fromString(
            "{\"restorePointType\":\"DISCRETE\",\"earliestRestoreDate\":\"2021-05-29T05:18:31Z\",\"restorePointCreationDate\":\"2021-10-06T22:19:27Z\",\"restorePointLabel\":\"isavok\"}")
            .toObject(RestorePointProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestorePointProperties model = new RestorePointProperties();
        model = BinaryData.fromObject(model).toObject(RestorePointProperties.class);
    }
}
