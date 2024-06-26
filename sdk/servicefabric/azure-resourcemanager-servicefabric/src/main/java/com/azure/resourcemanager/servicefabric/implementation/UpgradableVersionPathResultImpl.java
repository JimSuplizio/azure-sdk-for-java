// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

import com.azure.resourcemanager.servicefabric.fluent.models.UpgradableVersionPathResultInner;
import com.azure.resourcemanager.servicefabric.models.UpgradableVersionPathResult;
import java.util.Collections;
import java.util.List;

public final class UpgradableVersionPathResultImpl implements UpgradableVersionPathResult {
    private UpgradableVersionPathResultInner innerObject;

    private final com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager;

    UpgradableVersionPathResultImpl(UpgradableVersionPathResultInner innerObject,
        com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<String> supportedPath() {
        List<String> inner = this.innerModel().supportedPath();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public UpgradableVersionPathResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicefabric.ServiceFabricManager manager() {
        return this.serviceManager;
    }
}
