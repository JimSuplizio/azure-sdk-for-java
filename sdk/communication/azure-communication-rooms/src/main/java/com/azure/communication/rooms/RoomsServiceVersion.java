// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.rooms;

import com.azure.core.util.ServiceVersion;

/**
 * The versions of Communication Rooms Service supported by this client library.
 */
public enum RoomsServiceVersion implements ServiceVersion {
    /**
     * Service version {@code 2023-06-14}
     */
    V2023_06_14("2023-06-14"),

    /**
     * Service version {@code 2024-04-15}
     */
    V2024_04_15("2024-04-15"),

    /**
     * Service version {@code 2025-03-13}
     */
    V2025_03_13("2025-03-13");

    private final String version;

    RoomsServiceVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library
     *
     * @return the latest {@link RoomsServiceVersion}
     */
    public static RoomsServiceVersion getLatest() {
        return V2025_03_13;
    }
}
