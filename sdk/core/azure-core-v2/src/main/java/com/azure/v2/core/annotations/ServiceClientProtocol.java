// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.core.annotations;

/**
 * Enumeration of protocols available for setting the {@link ServiceClientBuilder#protocol() protocol} property of
 * {@link ServiceClientBuilder} annotation.
 */
public enum ServiceClientProtocol {
    /**
     * HTTP protocol.
     */
    HTTP,

    /**
     * AMQP protocol.
     */
    AMQP
}
