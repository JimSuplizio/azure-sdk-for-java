// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

/** Samples for Rollouts Restart. */
public final class RolloutsRestartSamples {
    /*
     * x-ms-original-file: specification/deploymentmanager/resource-manager/Microsoft.DeploymentManager/preview/2019-11-01-preview/examples/rollout_post_restart.json
     */
    /**
     * Sample code: Restart rollout.
     *
     * @param manager Entry point to DeploymentManager.
     */
    public static void restartRollout(com.azure.resourcemanager.deploymentmanager.DeploymentManager manager) {
        manager.rollouts().restartWithResponse("myResourceGroup", "myRollout", true, com.azure.core.util.Context.NONE);
    }
}
