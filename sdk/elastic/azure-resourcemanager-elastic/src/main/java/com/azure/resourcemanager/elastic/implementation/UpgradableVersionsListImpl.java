// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.resourcemanager.elastic.fluent.models.UpgradableVersionsListInner;
import com.azure.resourcemanager.elastic.models.UpgradableVersionsList;
import java.util.Collections;
import java.util.List;

public final class UpgradableVersionsListImpl implements UpgradableVersionsList {
    private UpgradableVersionsListInner innerObject;

    private final com.azure.resourcemanager.elastic.ElasticManager serviceManager;

    UpgradableVersionsListImpl(UpgradableVersionsListInner innerObject,
        com.azure.resourcemanager.elastic.ElasticManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String currentVersion() {
        return this.innerModel().currentVersion();
    }

    public List<String> upgradableVersions() {
        List<String> inner = this.innerModel().upgradableVersions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public UpgradableVersionsListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.elastic.ElasticManager manager() {
        return this.serviceManager;
    }
}
