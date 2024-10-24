// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.OfficePowerBICheckRequirementsProperties;
import org.junit.jupiter.api.Assertions;

public final class OfficePowerBICheckRequirementsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OfficePowerBICheckRequirementsProperties model
            = BinaryData.fromString("{\"tenantId\":\"qsdb\"}").toObject(OfficePowerBICheckRequirementsProperties.class);
        Assertions.assertEquals("qsdb", model.tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OfficePowerBICheckRequirementsProperties model
            = new OfficePowerBICheckRequirementsProperties().withTenantId("qsdb");
        model = BinaryData.fromObject(model).toObject(OfficePowerBICheckRequirementsProperties.class);
        Assertions.assertEquals("qsdb", model.tenantId());
    }
}
