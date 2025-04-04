// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.generated;

/**
 * Samples for AssessedSqlMachinesOperations ListBySqlAssessmentV2.
 */
public final class AssessedSqlMachinesOperationsListBySqlAssessmentV2Samples {
    /*
     * x-ms-original-file:
     * specification/migrate/resource-manager/Microsoft.Migrate/AssessmentProjects/stable/2023-03-15/examples/
     * AssessedSqlMachinesOperations_ListBySqlAssessmentV2_MaximumSet_Gen.json
     */
    /**
     * Sample code: AssessedSqlMachinesOperations_ListBySqlAssessmentV2_MaximumSet_Gen.
     * 
     * @param manager Entry point to MigrationAssessmentManager.
     */
    public static void assessedSqlMachinesOperationsListBySqlAssessmentV2MaximumSetGen(
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager) {
        manager.assessedSqlMachinesOperations()
            .listBySqlAssessmentV2("rgmigrate", "fci-test6904project", "test_fci_hadr", "test_swagger_1",
                "(contains(Properties/DisplayName,'SQLHAVM17'))", 23, null, 1, com.azure.core.util.Context.NONE);
    }
}
