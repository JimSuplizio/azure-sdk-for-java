// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.resourcemanager.managednetworkfabric.fluent.models.SupportPackagePropertiesInner;
import com.azure.resourcemanager.managednetworkfabric.models.SupportPackageProperties;

public final class SupportPackagePropertiesImpl implements SupportPackageProperties {
    private SupportPackagePropertiesInner innerObject;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    SupportPackagePropertiesImpl(
        SupportPackagePropertiesInner innerObject,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String supportPackageUrl() {
        return this.innerModel().supportPackageUrl();
    }

    public SupportPackagePropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }
}