// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.BaseResourceProperties;
import com.azure.resourcemanager.dataprotection.models.Datasource;
import org.junit.jupiter.api.Assertions;

public final class DatasourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Datasource model = BinaryData.fromString(
            "{\"datasourceType\":\"vnchrkcci\",\"objectType\":\"zjuqkhrsaj\",\"resourceID\":\"wkuofoskghsauu\",\"resourceLocation\":\"jmvxie\",\"resourceName\":\"ugidyjrr\",\"resourceType\":\"y\",\"resourceUri\":\"svexcsonpclhoco\",\"resourceProperties\":{\"objectType\":\"BaseResourceProperties\"}}")
            .toObject(Datasource.class);
        Assertions.assertEquals("vnchrkcci", model.datasourceType());
        Assertions.assertEquals("zjuqkhrsaj", model.objectType());
        Assertions.assertEquals("wkuofoskghsauu", model.resourceId());
        Assertions.assertEquals("jmvxie", model.resourceLocation());
        Assertions.assertEquals("ugidyjrr", model.resourceName());
        Assertions.assertEquals("y", model.resourceType());
        Assertions.assertEquals("svexcsonpclhoco", model.resourceUri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Datasource model = new Datasource().withDatasourceType("vnchrkcci")
            .withObjectType("zjuqkhrsaj")
            .withResourceId("wkuofoskghsauu")
            .withResourceLocation("jmvxie")
            .withResourceName("ugidyjrr")
            .withResourceType("y")
            .withResourceUri("svexcsonpclhoco")
            .withResourceProperties(new BaseResourceProperties());
        model = BinaryData.fromObject(model).toObject(Datasource.class);
        Assertions.assertEquals("vnchrkcci", model.datasourceType());
        Assertions.assertEquals("zjuqkhrsaj", model.objectType());
        Assertions.assertEquals("wkuofoskghsauu", model.resourceId());
        Assertions.assertEquals("jmvxie", model.resourceLocation());
        Assertions.assertEquals("ugidyjrr", model.resourceName());
        Assertions.assertEquals("y", model.resourceType());
        Assertions.assertEquals("svexcsonpclhoco", model.resourceUri());
    }
}
