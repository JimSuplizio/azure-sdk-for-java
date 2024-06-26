// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.fluent.models.ArtifactManifestUpdateStateInner;
import com.azure.resourcemanager.hybridnetwork.models.ArtifactManifestState;
import org.junit.jupiter.api.Assertions;

public final class ArtifactManifestUpdateStateInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArtifactManifestUpdateStateInner model = BinaryData.fromString("{\"artifactManifestState\":\"Succeeded\"}")
            .toObject(ArtifactManifestUpdateStateInner.class);
        Assertions.assertEquals(ArtifactManifestState.SUCCEEDED, model.artifactManifestState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArtifactManifestUpdateStateInner model
            = new ArtifactManifestUpdateStateInner().withArtifactManifestState(ArtifactManifestState.SUCCEEDED);
        model = BinaryData.fromObject(model).toObject(ArtifactManifestUpdateStateInner.class);
        Assertions.assertEquals(ArtifactManifestState.SUCCEEDED, model.artifactManifestState());
    }
}
