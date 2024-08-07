// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

/**
 * Samples for CloudExadataInfrastructures ListByResourceGroup.
 */
public final class CloudExadataInfrastructuresListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/oracle/resource-manager/Oracle.Database/stable/2023-09-01/examples/exaInfra_listByResourceGroup.
     * json
     */
    /**
     * Sample code: List Exadata Infrastructure by resource group.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void listExadataInfrastructureByResourceGroup(
        com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.cloudExadataInfrastructures().listByResourceGroup("rg000", com.azure.core.util.Context.NONE);
    }
}
