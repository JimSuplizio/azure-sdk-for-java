// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.generated;

/**
 * Samples for IotDpsResource GetByResourceGroup.
 */
public final class IotDpsResourceGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/stable/2022-02-05/examples/DPSGet.
     * json
     */
    /**
     * Sample code: DPSGet.
     * 
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSGet(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        manager.iotDpsResources()
            .getByResourceGroupWithResponse("myResourceGroup", "myFirstProvisioningService",
                com.azure.core.util.Context.NONE);
    }
}
