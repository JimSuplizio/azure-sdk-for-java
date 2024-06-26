// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.models.PerformanceTierServiceLevelObjectives;
import org.junit.jupiter.api.Assertions;

public final class PerformanceTierServiceLevelObjectivesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PerformanceTierServiceLevelObjectives model =
            BinaryData
                .fromString(
                    "{\"id\":\"kacspkw\",\"edition\":\"zdobpxjmflbvvnch\",\"vCore\":812677705,\"hardwareGeneration\":\"iwwzjuqk\",\"maxBackupRetentionDays\":330822059,\"minBackupRetentionDays\":1877680716,\"maxStorageMB\":1410521625,\"minStorageMB\":481973669}")
                .toObject(PerformanceTierServiceLevelObjectives.class);
        Assertions.assertEquals("kacspkw", model.id());
        Assertions.assertEquals("zdobpxjmflbvvnch", model.edition());
        Assertions.assertEquals(812677705, model.vCore());
        Assertions.assertEquals("iwwzjuqk", model.hardwareGeneration());
        Assertions.assertEquals(330822059, model.maxBackupRetentionDays());
        Assertions.assertEquals(1877680716, model.minBackupRetentionDays());
        Assertions.assertEquals(1410521625, model.maxStorageMB());
        Assertions.assertEquals(481973669, model.minStorageMB());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PerformanceTierServiceLevelObjectives model =
            new PerformanceTierServiceLevelObjectives()
                .withId("kacspkw")
                .withEdition("zdobpxjmflbvvnch")
                .withVCore(812677705)
                .withHardwareGeneration("iwwzjuqk")
                .withMaxBackupRetentionDays(330822059)
                .withMinBackupRetentionDays(1877680716)
                .withMaxStorageMB(1410521625)
                .withMinStorageMB(481973669);
        model = BinaryData.fromObject(model).toObject(PerformanceTierServiceLevelObjectives.class);
        Assertions.assertEquals("kacspkw", model.id());
        Assertions.assertEquals("zdobpxjmflbvvnch", model.edition());
        Assertions.assertEquals(812677705, model.vCore());
        Assertions.assertEquals("iwwzjuqk", model.hardwareGeneration());
        Assertions.assertEquals(330822059, model.maxBackupRetentionDays());
        Assertions.assertEquals(1877680716, model.minBackupRetentionDays());
        Assertions.assertEquals(1410521625, model.maxStorageMB());
        Assertions.assertEquals(481973669, model.minStorageMB());
    }
}
