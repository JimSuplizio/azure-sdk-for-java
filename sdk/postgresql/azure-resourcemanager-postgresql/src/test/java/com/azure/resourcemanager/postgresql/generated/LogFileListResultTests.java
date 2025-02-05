// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresql.fluent.models.LogFileInner;
import com.azure.resourcemanager.postgresql.models.LogFileListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LogFileListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogFileListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"sizeInKB\":8963352586461588270,\"createdTime\":\"2021-06-17T06:36:49Z\",\"lastModifiedTime\":\"2021-02-11T00:33:58Z\",\"type\":\"yifqrvkdvjsllrmv\",\"url\":\"f\"},\"id\":\"atkpnp\",\"name\":\"lexxbczwtru\",\"type\":\"iqzbq\"},{\"properties\":{\"sizeInKB\":2872380603368123057,\"createdTime\":\"2021-03-01T06:44:22Z\",\"lastModifiedTime\":\"2020-12-31T07:20:30Z\",\"type\":\"cspkwlhzdobpxjmf\",\"url\":\"vvnchrkcc\"},\"id\":\"wwzjuqkhrsajiwku\",\"name\":\"foskghsauuimj\",\"type\":\"vxieduugidyj\"},{\"properties\":{\"sizeInKB\":3682891038702940178,\"createdTime\":\"2021-09-15T05:38:02Z\",\"lastModifiedTime\":\"2021-06-21T06:23:36Z\",\"type\":\"xc\",\"url\":\"npc\"},\"id\":\"hocohslkev\",\"name\":\"eggzfb\",\"type\":\"hfmvfaxkffe\"},{\"properties\":{\"sizeInKB\":1624318397315279611,\"createdTime\":\"2021-01-03T07:04:49Z\",\"lastModifiedTime\":\"2021-04-12T11:49:32Z\",\"type\":\"v\",\"url\":\"xmzsbbzogg\"},\"id\":\"grxwbu\",\"name\":\"vjxxjnsp\",\"type\":\"dptkoenkouk\"}]}")
            .toObject(LogFileListResult.class);
        Assertions.assertEquals(8963352586461588270L, model.value().get(0).sizeInKB());
        Assertions.assertEquals("yifqrvkdvjsllrmv", model.value().get(0).typePropertiesType());
        Assertions.assertEquals("f", model.value().get(0).url());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogFileListResult model = new LogFileListResult().withValue(Arrays.asList(
            new LogFileInner().withSizeInKB(8963352586461588270L)
                .withTypePropertiesType("yifqrvkdvjsllrmv")
                .withUrl("f"),
            new LogFileInner().withSizeInKB(2872380603368123057L)
                .withTypePropertiesType("cspkwlhzdobpxjmf")
                .withUrl("vvnchrkcc"),
            new LogFileInner().withSizeInKB(3682891038702940178L).withTypePropertiesType("xc").withUrl("npc"),
            new LogFileInner().withSizeInKB(1624318397315279611L).withTypePropertiesType("v").withUrl("xmzsbbzogg")));
        model = BinaryData.fromObject(model).toObject(LogFileListResult.class);
        Assertions.assertEquals(8963352586461588270L, model.value().get(0).sizeInKB());
        Assertions.assertEquals("yifqrvkdvjsllrmv", model.value().get(0).typePropertiesType());
        Assertions.assertEquals("f", model.value().get(0).url());
    }
}
