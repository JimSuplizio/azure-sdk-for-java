// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.models;

import com.azure.resourcemanager.sphere.fluent.models.SignedCapabilityImageResponseInner;

/** An immutable client-side representation of SignedCapabilityImageResponse. */
public interface SignedCapabilityImageResponse {
    /**
     * Gets the image property: The signed device capability image as a UTF-8 encoded base 64 string.
     *
     * @return the image value.
     */
    String image();

    /**
     * Gets the inner com.azure.resourcemanager.sphere.fluent.models.SignedCapabilityImageResponseInner object.
     *
     * @return the inner object.
     */
    SignedCapabilityImageResponseInner innerModel();
}