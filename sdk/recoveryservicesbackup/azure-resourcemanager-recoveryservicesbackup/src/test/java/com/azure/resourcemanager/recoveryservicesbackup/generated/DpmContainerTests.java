// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmContainer;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmContainerExtendedInfo;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DpmContainerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DpmContainer model = BinaryData.fromString(
            "{\"containerType\":\"DPMContainer\",\"canReRegister\":true,\"containerId\":\"eofiz\",\"protectedItemCount\":2729674054207787435,\"dpmAgentVersion\":\"mjm\",\"dpmServers\":[\"yzgib\",\"kujrllfojui\",\"jpu\"],\"upgradeAvailable\":true,\"protectionStatus\":\"c\",\"extendedInfo\":{\"lastRefreshedAt\":\"2021-10-25T06:21:32Z\"},\"friendlyName\":\"oeo\",\"backupManagementType\":\"AzureStorage\",\"registrationStatus\":\"ejetjklntik\",\"healthStatus\":\"uzk\",\"protectableObjectType\":\"qzolxrzvhqjw\"}")
            .toObject(DpmContainer.class);
        Assertions.assertEquals("oeo", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_STORAGE, model.backupManagementType());
        Assertions.assertEquals("ejetjklntik", model.registrationStatus());
        Assertions.assertEquals("uzk", model.healthStatus());
        Assertions.assertEquals("qzolxrzvhqjw", model.protectableObjectType());
        Assertions.assertEquals(true, model.canReRegister());
        Assertions.assertEquals("eofiz", model.containerId());
        Assertions.assertEquals(2729674054207787435L, model.protectedItemCount());
        Assertions.assertEquals("mjm", model.dpmAgentVersion());
        Assertions.assertEquals("yzgib", model.dpmServers().get(0));
        Assertions.assertEquals(true, model.upgradeAvailable());
        Assertions.assertEquals("c", model.protectionStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-25T06:21:32Z"), model.extendedInfo().lastRefreshedAt());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DpmContainer model = new DpmContainer().withFriendlyName("oeo")
            .withBackupManagementType(BackupManagementType.AZURE_STORAGE)
            .withRegistrationStatus("ejetjklntik")
            .withHealthStatus("uzk")
            .withProtectableObjectType("qzolxrzvhqjw")
            .withCanReRegister(true)
            .withContainerId("eofiz")
            .withProtectedItemCount(2729674054207787435L)
            .withDpmAgentVersion("mjm")
            .withDpmServers(Arrays.asList("yzgib", "kujrllfojui", "jpu"))
            .withUpgradeAvailable(true)
            .withProtectionStatus("c")
            .withExtendedInfo(
                new DpmContainerExtendedInfo().withLastRefreshedAt(OffsetDateTime.parse("2021-10-25T06:21:32Z")));
        model = BinaryData.fromObject(model).toObject(DpmContainer.class);
        Assertions.assertEquals("oeo", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_STORAGE, model.backupManagementType());
        Assertions.assertEquals("ejetjklntik", model.registrationStatus());
        Assertions.assertEquals("uzk", model.healthStatus());
        Assertions.assertEquals("qzolxrzvhqjw", model.protectableObjectType());
        Assertions.assertEquals(true, model.canReRegister());
        Assertions.assertEquals("eofiz", model.containerId());
        Assertions.assertEquals(2729674054207787435L, model.protectedItemCount());
        Assertions.assertEquals("mjm", model.dpmAgentVersion());
        Assertions.assertEquals("yzgib", model.dpmServers().get(0));
        Assertions.assertEquals(true, model.upgradeAvailable());
        Assertions.assertEquals("c", model.protectionStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-25T06:21:32Z"), model.extendedInfo().lastRefreshedAt());
    }
}
