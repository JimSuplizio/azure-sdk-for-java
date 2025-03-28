// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The event type for which this notification is enabled (i.e. AutoShutdown, Cost).
 */
public final class NotificationChannelEventType extends ExpandableStringEnum<NotificationChannelEventType> {
    /**
     * Static value AutoShutdown for NotificationChannelEventType.
     */
    public static final NotificationChannelEventType AUTO_SHUTDOWN = fromString("AutoShutdown");

    /**
     * Static value Cost for NotificationChannelEventType.
     */
    public static final NotificationChannelEventType COST = fromString("Cost");

    /**
     * Creates a new instance of NotificationChannelEventType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NotificationChannelEventType() {
    }

    /**
     * Creates or finds a NotificationChannelEventType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NotificationChannelEventType.
     */
    public static NotificationChannelEventType fromString(String name) {
        return fromString(name, NotificationChannelEventType.class);
    }

    /**
     * Gets known NotificationChannelEventType values.
     * 
     * @return known NotificationChannelEventType values.
     */
    public static Collection<NotificationChannelEventType> values() {
        return values(NotificationChannelEventType.class);
    }
}
