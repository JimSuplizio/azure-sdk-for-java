// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.quantum.fluent.models.QuantumWorkspaceInner;
import com.azure.resourcemanager.quantum.models.Provider;
import com.azure.resourcemanager.quantum.models.ProvisioningStatus;
import com.azure.resourcemanager.quantum.models.QuantumWorkspace;
import com.azure.resourcemanager.quantum.models.QuantumWorkspaceIdentity;
import com.azure.resourcemanager.quantum.models.TagsObject;
import com.azure.resourcemanager.quantum.models.UsableStatus;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class QuantumWorkspaceImpl
    implements QuantumWorkspace, QuantumWorkspace.Definition, QuantumWorkspace.Update {
    private QuantumWorkspaceInner innerObject;

    private final com.azure.resourcemanager.quantum.AzureQuantumManager serviceManager;

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

    public QuantumWorkspaceIdentity identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<Provider> providers() {
        List<Provider> inner = this.innerModel().providers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public UsableStatus usable() {
        return this.innerModel().usable();
    }

    public ProvisioningStatus provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String storageAccount() {
        return this.innerModel().storageAccount();
    }

    public String endpointUri() {
        return this.innerModel().endpointUri();
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

    public QuantumWorkspaceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.quantum.AzureQuantumManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private TagsObject updateWorkspaceTags;

    public QuantumWorkspaceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public QuantumWorkspace create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createOrUpdate(resourceGroupName, workspaceName, this.innerModel(), Context.NONE);
        return this;
    }

    public QuantumWorkspace create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createOrUpdate(resourceGroupName, workspaceName, this.innerModel(), context);
        return this;
    }

    QuantumWorkspaceImpl(String name, com.azure.resourcemanager.quantum.AzureQuantumManager serviceManager) {
        this.innerObject = new QuantumWorkspaceInner();
        this.serviceManager = serviceManager;
        this.workspaceName = name;
    }

    public QuantumWorkspaceImpl update() {
        this.updateWorkspaceTags = new TagsObject();
        return this;
    }

    public QuantumWorkspace apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .updateTagsWithResponse(resourceGroupName, workspaceName, updateWorkspaceTags, Context.NONE)
                .getValue();
        return this;
    }

    public QuantumWorkspace apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .updateTagsWithResponse(resourceGroupName, workspaceName, updateWorkspaceTags, context)
                .getValue();
        return this;
    }

    QuantumWorkspaceImpl(
        QuantumWorkspaceInner innerObject, com.azure.resourcemanager.quantum.AzureQuantumManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
    }

    public QuantumWorkspace refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .getByResourceGroupWithResponse(resourceGroupName, workspaceName, Context.NONE)
                .getValue();
        return this;
    }

    public QuantumWorkspace refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .getByResourceGroupWithResponse(resourceGroupName, workspaceName, context)
                .getValue();
        return this;
    }

    public QuantumWorkspaceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public QuantumWorkspaceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public QuantumWorkspaceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateWorkspaceTags.withTags(tags);
            return this;
        }
    }

    public QuantumWorkspaceImpl withIdentity(QuantumWorkspaceIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public QuantumWorkspaceImpl withProviders(List<Provider> providers) {
        this.innerModel().withProviders(providers);
        return this;
    }

    public QuantumWorkspaceImpl withStorageAccount(String storageAccount) {
        this.innerModel().withStorageAccount(storageAccount);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}