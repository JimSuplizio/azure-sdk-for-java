// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for JobTargetGroups Get.
 */
public final class JobTargetGroupsGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/GetJobTargetGroup.json
     */
    /**
     * Sample code: Get a target group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getATargetGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getJobTargetGroups()
            .getWithResponse("group1", "server1", "agent1", "targetGroup1", com.azure.core.util.Context.NONE);
    }
}
