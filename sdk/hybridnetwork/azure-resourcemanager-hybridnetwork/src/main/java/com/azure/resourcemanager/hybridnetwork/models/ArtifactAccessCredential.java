// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.resourcemanager.hybridnetwork.fluent.models.ArtifactAccessCredentialInner;

/**
 * An immutable client-side representation of ArtifactAccessCredential.
 */
public interface ArtifactAccessCredential {
    /**
     * Gets the credentialType property: The credential type.
     * 
     * @return the credentialType value.
     */
    CredentialType credentialType();

    /**
     * Gets the inner com.azure.resourcemanager.hybridnetwork.fluent.models.ArtifactAccessCredentialInner object.
     * 
     * @return the inner object.
     */
    ArtifactAccessCredentialInner innerModel();
}
