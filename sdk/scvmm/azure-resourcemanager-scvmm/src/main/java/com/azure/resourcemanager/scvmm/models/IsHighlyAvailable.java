// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Highly available.
 */
public final class IsHighlyAvailable extends ExpandableStringEnum<IsHighlyAvailable> {
    /**
     * Static value true for IsHighlyAvailable.
     */
    public static final IsHighlyAvailable TRUE = fromString("true");

    /**
     * Static value false for IsHighlyAvailable.
     */
    public static final IsHighlyAvailable FALSE = fromString("false");

    /**
     * Creates a new instance of IsHighlyAvailable value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IsHighlyAvailable() {
    }

    /**
     * Creates or finds a IsHighlyAvailable from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IsHighlyAvailable.
     */
    public static IsHighlyAvailable fromString(String name) {
        return fromString(name, IsHighlyAvailable.class);
    }

    /**
     * Gets known IsHighlyAvailable values.
     * 
     * @return known IsHighlyAvailable values.
     */
    public static Collection<IsHighlyAvailable> values() {
        return values(IsHighlyAvailable.class);
    }
}
