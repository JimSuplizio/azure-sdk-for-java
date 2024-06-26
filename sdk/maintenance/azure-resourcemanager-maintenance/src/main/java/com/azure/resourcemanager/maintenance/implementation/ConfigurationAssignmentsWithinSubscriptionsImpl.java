// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.maintenance.fluent.ConfigurationAssignmentsWithinSubscriptionsClient;
import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignment;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignmentsWithinSubscriptions;

public final class ConfigurationAssignmentsWithinSubscriptionsImpl
    implements ConfigurationAssignmentsWithinSubscriptions {
    private static final ClientLogger LOGGER = new ClientLogger(ConfigurationAssignmentsWithinSubscriptionsImpl.class);

    private final ConfigurationAssignmentsWithinSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager;

    public ConfigurationAssignmentsWithinSubscriptionsImpl(
        ConfigurationAssignmentsWithinSubscriptionsClient innerClient,
        com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ConfigurationAssignment> list() {
        PagedIterable<ConfigurationAssignmentInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ConfigurationAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<ConfigurationAssignment> list(Context context) {
        PagedIterable<ConfigurationAssignmentInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ConfigurationAssignmentImpl(inner1, this.manager()));
    }

    private ConfigurationAssignmentsWithinSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.maintenance.MaintenanceManager manager() {
        return this.serviceManager;
    }
}
