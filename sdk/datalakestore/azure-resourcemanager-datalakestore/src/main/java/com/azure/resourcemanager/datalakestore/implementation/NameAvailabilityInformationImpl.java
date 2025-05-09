// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.implementation;

import com.azure.resourcemanager.datalakestore.fluent.models.NameAvailabilityInformationInner;
import com.azure.resourcemanager.datalakestore.models.NameAvailabilityInformation;

public final class NameAvailabilityInformationImpl implements NameAvailabilityInformation {
    private NameAvailabilityInformationInner innerObject;

    private final com.azure.resourcemanager.datalakestore.DataLakeStoreManager serviceManager;

    NameAvailabilityInformationImpl(NameAvailabilityInformationInner innerObject,
        com.azure.resourcemanager.datalakestore.DataLakeStoreManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public NameAvailabilityInformationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datalakestore.DataLakeStoreManager manager() {
        return this.serviceManager;
    }
}
