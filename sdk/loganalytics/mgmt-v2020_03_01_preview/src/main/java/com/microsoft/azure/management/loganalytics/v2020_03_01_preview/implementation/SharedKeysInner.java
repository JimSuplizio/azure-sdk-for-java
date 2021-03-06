/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The shared keys for a workspace.
 */
public class SharedKeysInner {
    /**
     * The primary shared key of a workspace.
     */
    @JsonProperty(value = "primarySharedKey")
    private String primarySharedKey;

    /**
     * The secondary shared key of a workspace.
     */
    @JsonProperty(value = "secondarySharedKey")
    private String secondarySharedKey;

    /**
     * Get the primary shared key of a workspace.
     *
     * @return the primarySharedKey value
     */
    public String primarySharedKey() {
        return this.primarySharedKey;
    }

    /**
     * Set the primary shared key of a workspace.
     *
     * @param primarySharedKey the primarySharedKey value to set
     * @return the SharedKeysInner object itself.
     */
    public SharedKeysInner withPrimarySharedKey(String primarySharedKey) {
        this.primarySharedKey = primarySharedKey;
        return this;
    }

    /**
     * Get the secondary shared key of a workspace.
     *
     * @return the secondarySharedKey value
     */
    public String secondarySharedKey() {
        return this.secondarySharedKey;
    }

    /**
     * Set the secondary shared key of a workspace.
     *
     * @param secondarySharedKey the secondarySharedKey value to set
     * @return the SharedKeysInner object itself.
     */
    public SharedKeysInner withSecondarySharedKey(String secondarySharedKey) {
        this.secondarySharedKey = secondarySharedKey;
        return this;
    }

}
