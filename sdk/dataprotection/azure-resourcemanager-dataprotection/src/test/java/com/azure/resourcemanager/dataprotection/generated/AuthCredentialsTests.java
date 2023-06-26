// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AuthCredentials;

public final class AuthCredentialsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AuthCredentials model =
            BinaryData.fromString("{\"objectType\":\"AuthCredentials\"}").toObject(AuthCredentials.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AuthCredentials model = new AuthCredentials();
        model = BinaryData.fromObject(model).toObject(AuthCredentials.class);
    }
}