// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridnetwork.fluent.models.SiteNetworkServiceInner;
import com.azure.resourcemanager.hybridnetwork.models.ManagedServiceIdentity;
import com.azure.resourcemanager.hybridnetwork.models.SiteNetworkService;
import com.azure.resourcemanager.hybridnetwork.models.SiteNetworkServicePropertiesFormat;
import com.azure.resourcemanager.hybridnetwork.models.Sku;
import com.azure.resourcemanager.hybridnetwork.models.TagsObject;
import java.util.Collections;
import java.util.Map;

public final class SiteNetworkServiceImpl
    implements SiteNetworkService, SiteNetworkService.Definition, SiteNetworkService.Update {
    private SiteNetworkServiceInner innerObject;

    private final com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager;

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

    public SiteNetworkServicePropertiesFormat properties() {
        return this.innerModel().properties();
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public Sku sku() {
        return this.innerModel().sku();
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

    public SiteNetworkServiceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String siteNetworkServiceName;

    private TagsObject updateParameters;

    public SiteNetworkServiceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public SiteNetworkService create() {
        this.innerObject = serviceManager.serviceClient()
            .getSiteNetworkServices()
            .createOrUpdate(resourceGroupName, siteNetworkServiceName, this.innerModel(), Context.NONE);
        return this;
    }

    public SiteNetworkService create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getSiteNetworkServices()
            .createOrUpdate(resourceGroupName, siteNetworkServiceName, this.innerModel(), context);
        return this;
    }

    SiteNetworkServiceImpl(String name, com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerObject = new SiteNetworkServiceInner();
        this.serviceManager = serviceManager;
        this.siteNetworkServiceName = name;
    }

    public SiteNetworkServiceImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public SiteNetworkService apply() {
        this.innerObject = serviceManager.serviceClient()
            .getSiteNetworkServices()
            .updateTagsWithResponse(resourceGroupName, siteNetworkServiceName, updateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public SiteNetworkService apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getSiteNetworkServices()
            .updateTagsWithResponse(resourceGroupName, siteNetworkServiceName, updateParameters, context)
            .getValue();
        return this;
    }

    SiteNetworkServiceImpl(SiteNetworkServiceInner innerObject,
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.siteNetworkServiceName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "siteNetworkServices");
    }

    public SiteNetworkService refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getSiteNetworkServices()
            .getByResourceGroupWithResponse(resourceGroupName, siteNetworkServiceName, Context.NONE)
            .getValue();
        return this;
    }

    public SiteNetworkService refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getSiteNetworkServices()
            .getByResourceGroupWithResponse(resourceGroupName, siteNetworkServiceName, context)
            .getValue();
        return this;
    }

    public SiteNetworkServiceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SiteNetworkServiceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SiteNetworkServiceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public SiteNetworkServiceImpl withProperties(SiteNetworkServicePropertiesFormat properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public SiteNetworkServiceImpl withIdentity(ManagedServiceIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public SiteNetworkServiceImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
