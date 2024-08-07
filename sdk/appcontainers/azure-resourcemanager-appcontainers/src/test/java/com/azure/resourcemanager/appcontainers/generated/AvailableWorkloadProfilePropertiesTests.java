// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.Applicability;
import com.azure.resourcemanager.appcontainers.models.AvailableWorkloadProfileProperties;
import org.junit.jupiter.api.Assertions;

public final class AvailableWorkloadProfilePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableWorkloadProfileProperties model = BinaryData.fromString(
            "{\"category\":\"hm\",\"applicability\":\"LocationDefault\",\"cores\":54099605,\"memoryGiB\":46444609,\"gpus\":1338226566,\"displayName\":\"ayvvtpgvdf\"}")
            .toObject(AvailableWorkloadProfileProperties.class);
        Assertions.assertEquals("hm", model.category());
        Assertions.assertEquals(Applicability.LOCATION_DEFAULT, model.applicability());
        Assertions.assertEquals(54099605, model.cores());
        Assertions.assertEquals(46444609, model.memoryGiB());
        Assertions.assertEquals(1338226566, model.gpus());
        Assertions.assertEquals("ayvvtpgvdf", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableWorkloadProfileProperties model = new AvailableWorkloadProfileProperties().withCategory("hm")
            .withApplicability(Applicability.LOCATION_DEFAULT)
            .withCores(54099605)
            .withMemoryGiB(46444609)
            .withGpus(1338226566)
            .withDisplayName("ayvvtpgvdf");
        model = BinaryData.fromObject(model).toObject(AvailableWorkloadProfileProperties.class);
        Assertions.assertEquals("hm", model.category());
        Assertions.assertEquals(Applicability.LOCATION_DEFAULT, model.applicability());
        Assertions.assertEquals(54099605, model.cores());
        Assertions.assertEquals(46444609, model.memoryGiB());
        Assertions.assertEquals(1338226566, model.gpus());
        Assertions.assertEquals("ayvvtpgvdf", model.displayName());
    }
}
