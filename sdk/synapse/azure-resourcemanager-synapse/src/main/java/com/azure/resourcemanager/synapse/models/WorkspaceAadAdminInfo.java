// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.resourcemanager.synapse.fluent.models.WorkspaceAadAdminInfoInner;

/**
 * An immutable client-side representation of WorkspaceAadAdminInfo.
 */
public interface WorkspaceAadAdminInfo {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the tenantId property: Tenant ID of the workspace active directory administrator.
     * 
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * Gets the login property: Login of the workspace active directory administrator.
     * 
     * @return the login value.
     */
    String login();

    /**
     * Gets the administratorType property: Workspace active directory administrator type.
     * 
     * @return the administratorType value.
     */
    String administratorType();

    /**
     * Gets the sid property: Object ID of the workspace active directory administrator.
     * 
     * @return the sid value.
     */
    String sid();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.WorkspaceAadAdminInfoInner object.
     * 
     * @return the inner object.
     */
    WorkspaceAadAdminInfoInner innerModel();
}
