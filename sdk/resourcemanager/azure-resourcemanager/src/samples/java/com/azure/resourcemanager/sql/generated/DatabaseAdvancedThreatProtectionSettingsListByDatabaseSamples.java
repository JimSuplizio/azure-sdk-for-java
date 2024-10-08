// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for DatabaseAdvancedThreatProtectionSettings ListByDatabase.
 */
public final class DatabaseAdvancedThreatProtectionSettingsListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/
     * DatabaseAdvancedThreatProtectionSettingsListByDatabase.json
     */
    /**
     * Sample code: Lists the database's Advanced Threat Protection settings.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listsTheDatabaseSAdvancedThreatProtectionSettings(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getDatabaseAdvancedThreatProtectionSettings()
            .listByDatabase("threatprotection-6852", "threatprotection-2080", "testdb",
                com.azure.core.util.Context.NONE);
    }
}
