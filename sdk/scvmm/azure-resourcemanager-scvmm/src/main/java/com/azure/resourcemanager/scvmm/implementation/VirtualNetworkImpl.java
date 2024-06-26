// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.scvmm.fluent.models.VirtualNetworkInner;
import com.azure.resourcemanager.scvmm.models.ExtendedLocation;
import com.azure.resourcemanager.scvmm.models.VirtualNetwork;
import com.azure.resourcemanager.scvmm.models.VirtualNetworkProperties;
import com.azure.resourcemanager.scvmm.models.VirtualNetworkTagsUpdate;
import java.util.Collections;
import java.util.Map;

public final class VirtualNetworkImpl implements VirtualNetwork, VirtualNetwork.Definition, VirtualNetwork.Update {
    private VirtualNetworkInner innerObject;

    private final com.azure.resourcemanager.scvmm.ScvmmManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public VirtualNetworkProperties properties() {
        return this.innerModel().properties();
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public VirtualNetworkInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.scvmm.ScvmmManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualNetworkName;

    private VirtualNetworkTagsUpdate updateProperties;

    public VirtualNetworkImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualNetwork create() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualNetworks()
            .createOrUpdate(resourceGroupName, virtualNetworkName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualNetwork create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualNetworks()
            .createOrUpdate(resourceGroupName, virtualNetworkName, this.innerModel(), context);
        return this;
    }

    VirtualNetworkImpl(String name, com.azure.resourcemanager.scvmm.ScvmmManager serviceManager) {
        this.innerObject = new VirtualNetworkInner();
        this.serviceManager = serviceManager;
        this.virtualNetworkName = name;
    }

    public VirtualNetworkImpl update() {
        this.updateProperties = new VirtualNetworkTagsUpdate();
        return this;
    }

    public VirtualNetwork apply() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualNetworks()
            .update(resourceGroupName, virtualNetworkName, updateProperties, Context.NONE);
        return this;
    }

    public VirtualNetwork apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualNetworks()
            .update(resourceGroupName, virtualNetworkName, updateProperties, context);
        return this;
    }

    VirtualNetworkImpl(VirtualNetworkInner innerObject, com.azure.resourcemanager.scvmm.ScvmmManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualNetworkName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "virtualNetworks");
    }

    public VirtualNetwork refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualNetworks()
            .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkName, Context.NONE)
            .getValue();
        return this;
    }

    public VirtualNetwork refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualNetworks()
            .getByResourceGroupWithResponse(resourceGroupName, virtualNetworkName, context)
            .getValue();
        return this;
    }

    public VirtualNetworkImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualNetworkImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualNetworkImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public VirtualNetworkImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateProperties.withTags(tags);
            return this;
        }
    }

    public VirtualNetworkImpl withProperties(VirtualNetworkProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
