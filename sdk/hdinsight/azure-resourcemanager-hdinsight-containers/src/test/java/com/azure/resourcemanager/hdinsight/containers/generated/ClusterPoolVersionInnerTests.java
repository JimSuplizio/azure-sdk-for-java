// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterPoolVersionInner;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolVersionProperties;
import org.junit.jupiter.api.Assertions;

public final class ClusterPoolVersionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPoolVersionInner model = BinaryData.fromString(
            "{\"properties\":{\"clusterPoolVersion\":\"guufzd\",\"aksVersion\":\"yqtfihwh\",\"isPreview\":true},\"id\":\"ingamvp\",\"name\":\"ho\",\"type\":\"zqzudph\"}")
            .toObject(ClusterPoolVersionInner.class);
        Assertions.assertEquals("guufzd", model.properties().clusterPoolVersion());
        Assertions.assertEquals("yqtfihwh", model.properties().aksVersion());
        Assertions.assertEquals(true, model.properties().isPreview());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPoolVersionInner model = new ClusterPoolVersionInner().withProperties(new ClusterPoolVersionProperties()
            .withClusterPoolVersion("guufzd").withAksVersion("yqtfihwh").withIsPreview(true));
        model = BinaryData.fromObject(model).toObject(ClusterPoolVersionInner.class);
        Assertions.assertEquals("guufzd", model.properties().clusterPoolVersion());
        Assertions.assertEquals("yqtfihwh", model.properties().aksVersion());
        Assertions.assertEquals(true, model.properties().isPreview());
    }
}
