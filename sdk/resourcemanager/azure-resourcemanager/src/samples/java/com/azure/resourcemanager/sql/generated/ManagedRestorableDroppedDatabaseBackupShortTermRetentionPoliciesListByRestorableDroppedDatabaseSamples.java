// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies ListByRestorableDroppedDatabase.
 */
public final class ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesListByRestorableDroppedDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/
     * GetListManagedShortTermRetentionPolicyRestorableDropped.json
     */
    /**
     * Sample code: Get the short term retention policy list for the database.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getTheShortTermRetentionPolicyListForTheDatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies()
            .listByRestorableDroppedDatabase("Default-SQL-SouthEastAsia", "testsvr", "testdb,131403269876900000",
                com.azure.core.util.Context.NONE);
    }
}
