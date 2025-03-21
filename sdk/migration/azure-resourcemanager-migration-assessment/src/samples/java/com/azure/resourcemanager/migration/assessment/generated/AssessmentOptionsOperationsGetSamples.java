// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.generated;

/**
 * Samples for AssessmentOptionsOperations Get.
 */
public final class AssessmentOptionsOperationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/migrate/resource-manager/Microsoft.Migrate/AssessmentProjects/stable/2023-03-15/examples/
     * AssessmentOptionsOperations_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: AssessmentOptionsOperations_Get_MaximumSet_Gen.
     * 
     * @param manager Entry point to MigrationAssessmentManager.
     */
    public static void assessmentOptionsOperationsGetMaximumSetGen(
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager) {
        manager.assessmentOptionsOperations()
            .getWithResponse("ayagrawrg", "app18700project", "default", com.azure.core.util.Context.NONE);
    }
}
