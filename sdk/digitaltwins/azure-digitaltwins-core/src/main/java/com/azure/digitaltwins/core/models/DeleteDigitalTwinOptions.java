// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.digitaltwins.core.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Context;
import com.azure.digitaltwins.core.DigitalTwinsAsyncClient;
import com.azure.digitaltwins.core.DigitalTwinsClient;

/**
 * The optional parameters for
 * {@link DigitalTwinsClient#deleteDigitalTwinWithResponse(String, DeleteDigitalTwinOptions, Context)} and
 * {@link DigitalTwinsAsyncClient#deleteDigitalTwinWithResponse(String, DeleteDigitalTwinOptions)}
 */
@Fluent
public final class DeleteDigitalTwinOptions {
    /*
     * Only perform the operation if the entity's etag matches one of the etags provided or * is provided.
     */
    private String ifMatch;

    /**
     * Creates a new instance of {@link DeleteDigitalTwinOptions}.
     */
    public DeleteDigitalTwinOptions() {
    }

    /**
     * Get the ifMatch property: Only perform the operation if the entity's etag matches one of the etags provided or *
     * is provided.
     *
     * @return the ifMatch value.
     */
    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * Set the ifMatch property: Only perform the operation if the entity's etag matches one of the etags provided or *
     * is provided.
     *
     * @param ifMatch the ifMatch value to set.
     * @return the DeleteDigitalTwinOptions object itself.
     */
    public DeleteDigitalTwinOptions setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
}
