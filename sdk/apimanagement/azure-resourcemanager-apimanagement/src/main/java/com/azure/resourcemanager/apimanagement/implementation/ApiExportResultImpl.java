// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.ApiExportResultInner;
import com.azure.resourcemanager.apimanagement.models.ApiExportResult;
import com.azure.resourcemanager.apimanagement.models.ApiExportResultValue;
import com.azure.resourcemanager.apimanagement.models.ExportResultFormat;

public final class ApiExportResultImpl implements ApiExportResult {
    private ApiExportResultInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    ApiExportResultImpl(ApiExportResultInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public ExportResultFormat exportResultFormat() {
        return this.innerModel().exportResultFormat();
    }

    public ApiExportResultValue value() {
        return this.innerModel().value();
    }

    public ApiExportResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
