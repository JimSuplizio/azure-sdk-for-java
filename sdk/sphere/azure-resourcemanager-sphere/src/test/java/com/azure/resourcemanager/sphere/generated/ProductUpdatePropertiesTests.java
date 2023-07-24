// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.fluent.models.ProductUpdateProperties;
import org.junit.jupiter.api.Assertions;

public final class ProductUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProductUpdateProperties model =
            BinaryData.fromString("{\"description\":\"zfcl\"}").toObject(ProductUpdateProperties.class);
        Assertions.assertEquals("zfcl", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProductUpdateProperties model = new ProductUpdateProperties().withDescription("zfcl");
        model = BinaryData.fromObject(model).toObject(ProductUpdateProperties.class);
        Assertions.assertEquals("zfcl", model.description());
    }
}