// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateFileValidator;
import org.junit.jupiter.api.Assertions;

public final class ImageTemplateFileValidatorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageTemplateFileValidator model = BinaryData.fromString(
            "{\"type\":\"File\",\"sourceUri\":\"czvyifq\",\"sha256Checksum\":\"kdvjsll\",\"destination\":\"vvdfwatkpnpul\",\"name\":\"xbczwtruwiqz\"}")
            .toObject(ImageTemplateFileValidator.class);
        Assertions.assertEquals("xbczwtruwiqz", model.name());
        Assertions.assertEquals("czvyifq", model.sourceUri());
        Assertions.assertEquals("kdvjsll", model.sha256Checksum());
        Assertions.assertEquals("vvdfwatkpnpul", model.destination());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageTemplateFileValidator model = new ImageTemplateFileValidator().withName("xbczwtruwiqz")
            .withSourceUri("czvyifq")
            .withSha256Checksum("kdvjsll")
            .withDestination("vvdfwatkpnpul");
        model = BinaryData.fromObject(model).toObject(ImageTemplateFileValidator.class);
        Assertions.assertEquals("xbczwtruwiqz", model.name());
        Assertions.assertEquals("czvyifq", model.sourceUri());
        Assertions.assertEquals("kdvjsll", model.sha256Checksum());
        Assertions.assertEquals("vvdfwatkpnpul", model.destination());
    }
}
