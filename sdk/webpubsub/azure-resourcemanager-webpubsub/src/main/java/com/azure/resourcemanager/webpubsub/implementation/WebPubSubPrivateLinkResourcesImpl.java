// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.webpubsub.fluent.WebPubSubPrivateLinkResourcesClient;
import com.azure.resourcemanager.webpubsub.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkResource;
import com.azure.resourcemanager.webpubsub.models.WebPubSubPrivateLinkResources;

public final class WebPubSubPrivateLinkResourcesImpl implements WebPubSubPrivateLinkResources {
    private static final ClientLogger LOGGER = new ClientLogger(WebPubSubPrivateLinkResourcesImpl.class);

    private final WebPubSubPrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager;

    public WebPubSubPrivateLinkResourcesImpl(WebPubSubPrivateLinkResourcesClient innerClient,
        com.azure.resourcemanager.webpubsub.WebPubSubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateLinkResource> list(String resourceGroupName, String resourceName) {
        PagedIterable<PrivateLinkResourceInner> inner = this.serviceClient().list(resourceGroupName, resourceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkResource> list(String resourceGroupName, String resourceName, Context context) {
        PagedIterable<PrivateLinkResourceInner> inner
            = this.serviceClient().list(resourceGroupName, resourceName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    private WebPubSubPrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.webpubsub.WebPubSubManager manager() {
        return this.serviceManager;
    }
}
