// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** There are two types of migration modes Online and Offline. */
public final class MigrationMode extends ExpandableStringEnum<MigrationMode> {
    /** Static value Offline for MigrationMode. */
    public static final MigrationMode OFFLINE = fromString("Offline");

    /** Static value Online for MigrationMode. */
    public static final MigrationMode ONLINE = fromString("Online");

    /**
     * Creates a new instance of MigrationMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MigrationMode() {
    }

    /**
     * Creates or finds a MigrationMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MigrationMode.
     */
    @JsonCreator
    public static MigrationMode fromString(String name) {
        return fromString(name, MigrationMode.class);
    }

    /**
     * Gets known MigrationMode values.
     *
     * @return known MigrationMode values.
     */
    public static Collection<MigrationMode> values() {
        return values(MigrationMode.class);
    }
}