// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The override kind.
 */
public final class OverrideKind extends ExpandableStringEnum<OverrideKind> {
    /**
     * Static value policyEffect for OverrideKind.
     */
    public static final OverrideKind POLICY_EFFECT = fromString("policyEffect");

    /**
     * Creates a new instance of OverrideKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OverrideKind() {
    }

    /**
     * Creates or finds a OverrideKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OverrideKind.
     */
    public static OverrideKind fromString(String name) {
        return fromString(name, OverrideKind.class);
    }

    /**
     * Gets known OverrideKind values.
     * 
     * @return known OverrideKind values.
     */
    public static Collection<OverrideKind> values() {
        return values(OverrideKind.class);
    }
}
