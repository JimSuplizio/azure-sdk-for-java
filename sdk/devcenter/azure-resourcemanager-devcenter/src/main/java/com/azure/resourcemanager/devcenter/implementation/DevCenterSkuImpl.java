// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.resourcemanager.devcenter.fluent.models.DevCenterSkuInner;
import com.azure.resourcemanager.devcenter.models.Capability;
import com.azure.resourcemanager.devcenter.models.DevCenterSku;
import com.azure.resourcemanager.devcenter.models.SkuTier;
import java.util.Collections;
import java.util.List;

public final class DevCenterSkuImpl implements DevCenterSku {
    private DevCenterSkuInner innerObject;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    DevCenterSkuImpl(DevCenterSkuInner innerObject,
        com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public SkuTier tier() {
        return this.innerModel().tier();
    }

    public String size() {
        return this.innerModel().size();
    }

    public String family() {
        return this.innerModel().family();
    }

    public Integer capacity() {
        return this.innerModel().capacity();
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public List<String> locations() {
        List<String> inner = this.innerModel().locations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Capability> capabilities() {
        List<Capability> inner = this.innerModel().capabilities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DevCenterSkuInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }
}
