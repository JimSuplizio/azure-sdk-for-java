// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

/**
 * Samples for CustomizationPolicies Get.
 */
public final class CustomizationPoliciesGetSamples {
    /*
     * x-ms-original-file:
     * specification/vmwarecloudsimple/resource-manager/Microsoft.VMwareCloudSimple/stable/2019-04-01/examples/
     * GetCustomizationPolicy.json
     */
    /**
     * Sample code: GetCustomizationPolicy.
     * 
     * @param manager Entry point to VMwareCloudSimpleManager.
     */
    public static void
        getCustomizationPolicy(com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager manager) {
        manager.customizationPolicies()
            .getWithResponse("myResourceGroup", "myPrivateCloud", "Linux1", com.azure.core.util.Context.NONE);
    }
}
