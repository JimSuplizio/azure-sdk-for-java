// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.PortalSettingValidationKeyContractInner;
import com.azure.resourcemanager.apimanagement.models.PortalSettingValidationKeyContract;

public final class PortalSettingValidationKeyContractImpl implements PortalSettingValidationKeyContract {
    private PortalSettingValidationKeyContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    PortalSettingValidationKeyContractImpl(PortalSettingValidationKeyContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String validationKey() {
        return this.innerModel().validationKey();
    }

    public PortalSettingValidationKeyContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
