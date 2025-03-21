// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for SecuritySolutionsReferenceData ListByHomeRegion.
 */
public final class SecuritySolutionsReferenceDataListByHomeRegionSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/
     * SecuritySolutionsReferenceData/GetSecuritySolutionsReferenceDataSubscriptionLocation_example.json
     */
    /**
     * Sample code: Get security solutions from a security data location.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        getSecuritySolutionsFromASecurityDataLocation(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.securitySolutionsReferenceDatas()
            .listByHomeRegionWithResponse("westcentralus", com.azure.core.util.Context.NONE);
    }
}
