// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerorchestratorruntime.generated;

import com.azure.resourcemanager.containerorchestratorruntime.models.StorageClassPropertiesUpdate;
import com.azure.resourcemanager.containerorchestratorruntime.models.StorageClassResource;
import com.azure.resourcemanager.containerorchestratorruntime.models.StorageClassTypePropertiesUpdate;

/**
 * Samples for StorageClass Update.
 */
public final class StorageClassUpdateSamples {
    /*
     * x-ms-original-file: 2024-03-01/StorageClass_Update.json
     */
    /**
     * Sample code: StorageClass_Update_0.
     * 
     * @param manager Entry point to ContainerOrchestratorRuntimeManager.
     */
    public static void storageClassUpdate0(
        com.azure.resourcemanager.containerorchestratorruntime.ContainerOrchestratorRuntimeManager manager) {
        StorageClassResource resource = manager.storageClass()
            .getWithResponse(
                "subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/example/providers/Microsoft.Kubernetes/connectedClusters/cluster1",
                "testrwx", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new StorageClassPropertiesUpdate()
                .withTypeProperties(new StorageClassTypePropertiesUpdate().withBackingStorageClassName("default")))
            .apply();
    }
}
