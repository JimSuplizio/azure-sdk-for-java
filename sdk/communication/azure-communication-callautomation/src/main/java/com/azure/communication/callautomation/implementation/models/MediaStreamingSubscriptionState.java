// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Media streaming subscription state.
 */
public final class MediaStreamingSubscriptionState extends ExpandableStringEnum<MediaStreamingSubscriptionState> {
    /**
     * Static value disabled for MediaStreamingSubscriptionState.
     */
    public static final MediaStreamingSubscriptionState DISABLED = fromString("disabled");

    /**
     * Static value inactive for MediaStreamingSubscriptionState.
     */
    public static final MediaStreamingSubscriptionState INACTIVE = fromString("inactive");

    /**
     * Static value active for MediaStreamingSubscriptionState.
     */
    public static final MediaStreamingSubscriptionState ACTIVE = fromString("active");

    /**
     * Creates a new instance of MediaStreamingSubscriptionState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MediaStreamingSubscriptionState() {
    }

    /**
     * Creates or finds a MediaStreamingSubscriptionState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MediaStreamingSubscriptionState.
     */
    public static MediaStreamingSubscriptionState fromString(String name) {
        return fromString(name, MediaStreamingSubscriptionState.class);
    }

    /**
     * Gets known MediaStreamingSubscriptionState values.
     * 
     * @return known MediaStreamingSubscriptionState values.
     */
    public static Collection<MediaStreamingSubscriptionState> values() {
        return values(MediaStreamingSubscriptionState.class);
    }
}
