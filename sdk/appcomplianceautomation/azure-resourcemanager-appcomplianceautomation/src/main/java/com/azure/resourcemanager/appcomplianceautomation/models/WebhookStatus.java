// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Webhook status.
 */
public final class WebhookStatus extends ExpandableStringEnum<WebhookStatus> {
    /**
     * Static value Enabled for WebhookStatus.
     */
    public static final WebhookStatus ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for WebhookStatus.
     */
    public static final WebhookStatus DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of WebhookStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WebhookStatus() {
    }

    /**
     * Creates or finds a WebhookStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding WebhookStatus.
     */
    public static WebhookStatus fromString(String name) {
        return fromString(name, WebhookStatus.class);
    }

    /**
     * Gets known WebhookStatus values.
     * 
     * @return known WebhookStatus values.
     */
    public static Collection<WebhookStatus> values() {
        return values(WebhookStatus.class);
    }
}
