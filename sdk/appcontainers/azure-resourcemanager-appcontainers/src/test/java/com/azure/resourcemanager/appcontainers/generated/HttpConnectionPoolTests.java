// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.HttpConnectionPool;
import org.junit.jupiter.api.Assertions;

public final class HttpConnectionPoolTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpConnectionPool model
            = BinaryData.fromString("{\"http1MaxPendingRequests\":5903092,\"http2MaxRequests\":1154409847}")
                .toObject(HttpConnectionPool.class);
        Assertions.assertEquals(5903092, model.http1MaxPendingRequests());
        Assertions.assertEquals(1154409847, model.http2MaxRequests());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpConnectionPool model
            = new HttpConnectionPool().withHttp1MaxPendingRequests(5903092).withHttp2MaxRequests(1154409847);
        model = BinaryData.fromObject(model).toObject(HttpConnectionPool.class);
        Assertions.assertEquals(5903092, model.http1MaxPendingRequests());
        Assertions.assertEquals(1154409847, model.http2MaxRequests());
    }
}
