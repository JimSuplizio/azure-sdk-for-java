// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

/**
 * Samples for PolicyAssignments List.
 */
public final class PolicyAssignmentsListSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Authorization/stable/2023-04-01/examples/listPolicyAssignments
     * .json
     */
    /**
     * Sample code: List policy assignments that apply to a subscription.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listPolicyAssignmentsThatApplyToASubscription(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources()
            .manager()
            .policyClient()
            .getPolicyAssignments()
            .list("atScope()", "LatestDefinitionVersion, EffectiveDefinitionVersion", null,
                com.azure.core.util.Context.NONE);
    }
}
