// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Unit of time that delay is expressed in.
 */
public final class PauseDelayTimeUnit extends ExpandableStringEnum<PauseDelayTimeUnit> {
    /**
     * Static value Minutes for PauseDelayTimeUnit.
     */
    public static final PauseDelayTimeUnit MINUTES = fromString("Minutes");

    /**
     * Creates a new instance of PauseDelayTimeUnit value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PauseDelayTimeUnit() {
    }

    /**
     * Creates or finds a PauseDelayTimeUnit from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PauseDelayTimeUnit.
     */
    public static PauseDelayTimeUnit fromString(String name) {
        return fromString(name, PauseDelayTimeUnit.class);
    }

    /**
     * Gets known PauseDelayTimeUnit values.
     * 
     * @return known PauseDelayTimeUnit values.
     */
    public static Collection<PauseDelayTimeUnit> values() {
        return values(PauseDelayTimeUnit.class);
    }
}
