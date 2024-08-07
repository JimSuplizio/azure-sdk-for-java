// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Status of the database.
 */
public final class ManagedDatabaseStatus extends ExpandableStringEnum<ManagedDatabaseStatus> {
    /**
     * Static value Online for ManagedDatabaseStatus.
     */
    public static final ManagedDatabaseStatus ONLINE = fromString("Online");

    /**
     * Static value Offline for ManagedDatabaseStatus.
     */
    public static final ManagedDatabaseStatus OFFLINE = fromString("Offline");

    /**
     * Static value Shutdown for ManagedDatabaseStatus.
     */
    public static final ManagedDatabaseStatus SHUTDOWN = fromString("Shutdown");

    /**
     * Static value Creating for ManagedDatabaseStatus.
     */
    public static final ManagedDatabaseStatus CREATING = fromString("Creating");

    /**
     * Static value Inaccessible for ManagedDatabaseStatus.
     */
    public static final ManagedDatabaseStatus INACCESSIBLE = fromString("Inaccessible");

    /**
     * Static value Restoring for ManagedDatabaseStatus.
     */
    public static final ManagedDatabaseStatus RESTORING = fromString("Restoring");

    /**
     * Static value Updating for ManagedDatabaseStatus.
     */
    public static final ManagedDatabaseStatus UPDATING = fromString("Updating");

    /**
     * Creates a new instance of ManagedDatabaseStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ManagedDatabaseStatus() {
    }

    /**
     * Creates or finds a ManagedDatabaseStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ManagedDatabaseStatus.
     */
    public static ManagedDatabaseStatus fromString(String name) {
        return fromString(name, ManagedDatabaseStatus.class);
    }

    /**
     * Gets known ManagedDatabaseStatus values.
     * 
     * @return known ManagedDatabaseStatus values.
     */
    public static Collection<ManagedDatabaseStatus> values() {
        return values(ManagedDatabaseStatus.class);
    }
}
