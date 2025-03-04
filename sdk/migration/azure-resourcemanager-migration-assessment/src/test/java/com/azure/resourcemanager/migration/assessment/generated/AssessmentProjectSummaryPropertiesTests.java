// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.migration.assessment.models.AssessmentProjectSummaryProperties;

public final class AssessmentProjectSummaryPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AssessmentProjectSummaryProperties model = BinaryData.fromString(
            "{\"errorSummaryAffectedEntities\":[{\"assessmentType\":\"WebAppAssessment\",\"count\":880729716}],\"numberOfPrivateEndpointConnections\":1891353200,\"numberOfGroups\":1541050102,\"numberOfMachines\":605317874,\"numberOfImportMachines\":491994414,\"numberOfAssessments\":811449935,\"lastAssessmentTimestamp\":\"2021-03-02T20:18:48Z\"}")
            .toObject(AssessmentProjectSummaryProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AssessmentProjectSummaryProperties model = new AssessmentProjectSummaryProperties();
        model = BinaryData.fromObject(model).toObject(AssessmentProjectSummaryProperties.class);
    }
}
