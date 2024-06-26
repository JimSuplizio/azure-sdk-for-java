// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.maintenance.fluent.models.UpdateInner;
import com.azure.resourcemanager.maintenance.models.ImpactType;
import com.azure.resourcemanager.maintenance.models.ListUpdatesResult;
import com.azure.resourcemanager.maintenance.models.MaintenanceScope;
import com.azure.resourcemanager.maintenance.models.UpdateStatus;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ListUpdatesResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ListUpdatesResult model = BinaryData.fromString(
            "{\"value\":[{\"maintenanceScope\":\"SQLManagedInstance\",\"impactType\":\"None\",\"status\":\"Pending\",\"impactDurationInSec\":1692678524,\"notBefore\":\"2021-02-13T03:31:18Z\",\"properties\":{\"resourceId\":\"rmcqiby\"}},{\"maintenanceScope\":\"Resource\",\"impactType\":\"None\",\"status\":\"Cancel\",\"impactDurationInSec\":8318309,\"notBefore\":\"2021-10-05T16:59:27Z\",\"properties\":{\"resourceId\":\"zvahapjy\"}},{\"maintenanceScope\":\"SQLDB\",\"impactType\":\"Freeze\",\"status\":\"Cancel\",\"impactDurationInSec\":141640204,\"notBefore\":\"2021-05-15T05:32:47Z\",\"properties\":{\"resourceId\":\"jzlmw\"}},{\"maintenanceScope\":\"Resource\",\"impactType\":\"None\",\"status\":\"Cancelled\",\"impactDurationInSec\":2083539395,\"notBefore\":\"2021-10-31T17:40:20Z\",\"properties\":{\"resourceId\":\"jvzunluthnnp\"}}]}")
            .toObject(ListUpdatesResult.class);
        Assertions.assertEquals(MaintenanceScope.SQLMANAGED_INSTANCE, model.value().get(0).maintenanceScope());
        Assertions.assertEquals(ImpactType.NONE, model.value().get(0).impactType());
        Assertions.assertEquals(UpdateStatus.PENDING, model.value().get(0).status());
        Assertions.assertEquals(1692678524, model.value().get(0).impactDurationInSec());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-13T03:31:18Z"), model.value().get(0).notBefore());
        Assertions.assertEquals("rmcqiby", model.value().get(0).resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ListUpdatesResult model = new ListUpdatesResult().withValue(Arrays.asList(
            new UpdateInner().withMaintenanceScope(MaintenanceScope.SQLMANAGED_INSTANCE)
                .withImpactType(ImpactType.NONE)
                .withStatus(UpdateStatus.PENDING)
                .withImpactDurationInSec(1692678524)
                .withNotBefore(OffsetDateTime.parse("2021-02-13T03:31:18Z"))
                .withResourceId("rmcqiby"),
            new UpdateInner().withMaintenanceScope(MaintenanceScope.RESOURCE)
                .withImpactType(ImpactType.NONE)
                .withStatus(UpdateStatus.CANCEL)
                .withImpactDurationInSec(8318309)
                .withNotBefore(OffsetDateTime.parse("2021-10-05T16:59:27Z"))
                .withResourceId("zvahapjy"),
            new UpdateInner().withMaintenanceScope(MaintenanceScope.SQLDB)
                .withImpactType(ImpactType.FREEZE)
                .withStatus(UpdateStatus.CANCEL)
                .withImpactDurationInSec(141640204)
                .withNotBefore(OffsetDateTime.parse("2021-05-15T05:32:47Z"))
                .withResourceId("jzlmw"),
            new UpdateInner().withMaintenanceScope(MaintenanceScope.RESOURCE)
                .withImpactType(ImpactType.NONE)
                .withStatus(UpdateStatus.CANCELLED)
                .withImpactDurationInSec(2083539395)
                .withNotBefore(OffsetDateTime.parse("2021-10-31T17:40:20Z"))
                .withResourceId("jvzunluthnnp")));
        model = BinaryData.fromObject(model).toObject(ListUpdatesResult.class);
        Assertions.assertEquals(MaintenanceScope.SQLMANAGED_INSTANCE, model.value().get(0).maintenanceScope());
        Assertions.assertEquals(ImpactType.NONE, model.value().get(0).impactType());
        Assertions.assertEquals(UpdateStatus.PENDING, model.value().get(0).status());
        Assertions.assertEquals(1692678524, model.value().get(0).impactDurationInSec());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-13T03:31:18Z"), model.value().get(0).notBefore());
        Assertions.assertEquals("rmcqiby", model.value().get(0).resourceId());
    }
}
