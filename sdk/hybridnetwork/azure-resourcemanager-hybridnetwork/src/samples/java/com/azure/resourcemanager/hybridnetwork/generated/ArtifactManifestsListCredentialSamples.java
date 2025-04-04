// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

/**
 * Samples for ArtifactManifests ListCredential.
 */
public final class ArtifactManifestsListCredentialSamples {
    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * ArtifactManifestListCredential.json
     */
    /**
     * Sample code: List a credential for artifact manifest.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void
        listACredentialForArtifactManifest(com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.artifactManifests()
            .listCredentialWithResponse("rg", "TestPublisher", "TestArtifactStore", "TestArtifactManifestName",
                com.azure.core.util.Context.NONE);
    }
}
