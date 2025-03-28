// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.providerhub.models.DefaultRolloutSpecificationCanary;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DefaultRolloutSpecificationCanaryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefaultRolloutSpecificationCanary model
            = BinaryData.fromString("{\"skipRegions\":[\"iobyu\"],\"regions\":[\"pqlpq\",\"cciuqgbdbutau\"]}")
                .toObject(DefaultRolloutSpecificationCanary.class);
        Assertions.assertEquals("iobyu", model.skipRegions().get(0));
        Assertions.assertEquals("pqlpq", model.regions().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefaultRolloutSpecificationCanary model
            = new DefaultRolloutSpecificationCanary().withSkipRegions(Arrays.asList("iobyu"))
                .withRegions(Arrays.asList("pqlpq", "cciuqgbdbutau"));
        model = BinaryData.fromObject(model).toObject(DefaultRolloutSpecificationCanary.class);
        Assertions.assertEquals("iobyu", model.skipRegions().get(0));
        Assertions.assertEquals("pqlpq", model.regions().get(0));
    }
}
