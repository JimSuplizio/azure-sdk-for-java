// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elastic.fluent.VMHostsClient;
import com.azure.resourcemanager.elastic.fluent.models.VMResourcesInner;
import com.azure.resourcemanager.elastic.models.VMHosts;
import com.azure.resourcemanager.elastic.models.VMResources;

public final class VMHostsImpl implements VMHosts {
    private static final ClientLogger LOGGER = new ClientLogger(VMHostsImpl.class);

    private final VMHostsClient innerClient;

    private final com.azure.resourcemanager.elastic.ElasticManager serviceManager;

    public VMHostsImpl(VMHostsClient innerClient, com.azure.resourcemanager.elastic.ElasticManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<VMResources> list(String resourceGroupName, String monitorName) {
        PagedIterable<VMResourcesInner> inner = this.serviceClient().list(resourceGroupName, monitorName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VMResourcesImpl(inner1, this.manager()));
    }

    public PagedIterable<VMResources> list(String resourceGroupName, String monitorName, Context context) {
        PagedIterable<VMResourcesInner> inner = this.serviceClient().list(resourceGroupName, monitorName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VMResourcesImpl(inner1, this.manager()));
    }

    private VMHostsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.elastic.ElasticManager manager() {
        return this.serviceManager;
    }
}
