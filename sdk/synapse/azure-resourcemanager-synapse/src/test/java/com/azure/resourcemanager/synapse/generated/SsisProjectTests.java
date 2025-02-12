// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.SsisEnvironmentReference;
import com.azure.resourcemanager.synapse.models.SsisParameter;
import com.azure.resourcemanager.synapse.models.SsisProject;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SsisProjectTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SsisProject model = BinaryData.fromString(
            "{\"type\":\"Project\",\"folderId\":6835409342308647438,\"version\":1177146418590007172,\"environmentRefs\":[{\"id\":8080220027377198790,\"environmentFolderName\":\"jttbstv\",\"environmentName\":\"aqnrmvvfkoxmlg\",\"referenceType\":\"tuidvrmazlpd\"},{\"id\":8735716523166265297,\"environmentFolderName\":\"mzvlazipbh\",\"environmentName\":\"vqs\",\"referenceType\":\"yy\"},{\"id\":5528301359583556891,\"environmentFolderName\":\"ens\",\"environmentName\":\"meyyvpkpatlb\",\"referenceType\":\"pzgsk\"},{\"id\":4251232617023680058,\"environmentFolderName\":\"v\",\"environmentName\":\"mknbnxwcdommpv\",\"referenceType\":\"awz\"}],\"parameters\":[{\"id\":7285486993195955494,\"name\":\"iac\",\"description\":\"iexhajl\",\"dataType\":\"t\",\"required\":false,\"sensitive\":true,\"designDefaultValue\":\"t\",\"defaultValue\":\"iygbpvn\",\"sensitiveDefaultValue\":\"wmtxkyctwwgz\",\"valueType\":\"jlmec\",\"valueSet\":false,\"variable\":\"gzyvnee\"},{\"id\":3613374493627536729,\"name\":\"htmoqqtlffhzbkr\",\"description\":\"jjavfq\",\"dataType\":\"hnqoewdo\",\"required\":false,\"sensitive\":true,\"designDefaultValue\":\"sypvidbztjhqtfb\",\"defaultValue\":\"nynkbwet\",\"sensitiveDefaultValue\":\"uhpsprkzyaupia\",\"valueType\":\"xnafbw\",\"valueSet\":true,\"variable\":\"htuov\"},{\"id\":6160359867810551901,\"name\":\"rjtumghih\",\"description\":\"ecmslclbl\",\"dataType\":\"xltbsjuscvsf\",\"required\":true,\"sensitive\":true,\"designDefaultValue\":\"gxuupbezqccydrtc\",\"defaultValue\":\"kdqkkyihzt\",\"sensitiveDefaultValue\":\"qm\",\"valueType\":\"zgwldoychillcec\",\"valueSet\":true,\"variable\":\"waoaguhi\"}],\"id\":4879267275298407418,\"name\":\"zstacsjvhrweft\",\"description\":\"qejpmvssehaepwa\"}")
            .toObject(SsisProject.class);
        Assertions.assertEquals(4879267275298407418L, model.id());
        Assertions.assertEquals("zstacsjvhrweft", model.name());
        Assertions.assertEquals("qejpmvssehaepwa", model.description());
        Assertions.assertEquals(6835409342308647438L, model.folderId());
        Assertions.assertEquals(1177146418590007172L, model.version());
        Assertions.assertEquals(8080220027377198790L, model.environmentRefs().get(0).id());
        Assertions.assertEquals("jttbstv", model.environmentRefs().get(0).environmentFolderName());
        Assertions.assertEquals("aqnrmvvfkoxmlg", model.environmentRefs().get(0).environmentName());
        Assertions.assertEquals("tuidvrmazlpd", model.environmentRefs().get(0).referenceType());
        Assertions.assertEquals(7285486993195955494L, model.parameters().get(0).id());
        Assertions.assertEquals("iac", model.parameters().get(0).name());
        Assertions.assertEquals("iexhajl", model.parameters().get(0).description());
        Assertions.assertEquals("t", model.parameters().get(0).dataType());
        Assertions.assertEquals(false, model.parameters().get(0).required());
        Assertions.assertEquals(true, model.parameters().get(0).sensitive());
        Assertions.assertEquals("t", model.parameters().get(0).designDefaultValue());
        Assertions.assertEquals("iygbpvn", model.parameters().get(0).defaultValue());
        Assertions.assertEquals("wmtxkyctwwgz", model.parameters().get(0).sensitiveDefaultValue());
        Assertions.assertEquals("jlmec", model.parameters().get(0).valueType());
        Assertions.assertEquals(false, model.parameters().get(0).valueSet());
        Assertions.assertEquals("gzyvnee", model.parameters().get(0).variable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SsisProject model = new SsisProject().withId(4879267275298407418L)
            .withName("zstacsjvhrweft")
            .withDescription("qejpmvssehaepwa")
            .withFolderId(6835409342308647438L)
            .withVersion(1177146418590007172L)
            .withEnvironmentRefs(Arrays.asList(
                new SsisEnvironmentReference().withId(8080220027377198790L)
                    .withEnvironmentFolderName("jttbstv")
                    .withEnvironmentName("aqnrmvvfkoxmlg")
                    .withReferenceType("tuidvrmazlpd"),
                new SsisEnvironmentReference().withId(8735716523166265297L)
                    .withEnvironmentFolderName("mzvlazipbh")
                    .withEnvironmentName("vqs")
                    .withReferenceType("yy"),
                new SsisEnvironmentReference().withId(5528301359583556891L)
                    .withEnvironmentFolderName("ens")
                    .withEnvironmentName("meyyvpkpatlb")
                    .withReferenceType("pzgsk"),
                new SsisEnvironmentReference().withId(4251232617023680058L)
                    .withEnvironmentFolderName("v")
                    .withEnvironmentName("mknbnxwcdommpv")
                    .withReferenceType("awz")))
            .withParameters(Arrays.asList(
                new SsisParameter().withId(7285486993195955494L)
                    .withName("iac")
                    .withDescription("iexhajl")
                    .withDataType("t")
                    .withRequired(false)
                    .withSensitive(true)
                    .withDesignDefaultValue("t")
                    .withDefaultValue("iygbpvn")
                    .withSensitiveDefaultValue("wmtxkyctwwgz")
                    .withValueType("jlmec")
                    .withValueSet(false)
                    .withVariable("gzyvnee"),
                new SsisParameter().withId(3613374493627536729L)
                    .withName("htmoqqtlffhzbkr")
                    .withDescription("jjavfq")
                    .withDataType("hnqoewdo")
                    .withRequired(false)
                    .withSensitive(true)
                    .withDesignDefaultValue("sypvidbztjhqtfb")
                    .withDefaultValue("nynkbwet")
                    .withSensitiveDefaultValue("uhpsprkzyaupia")
                    .withValueType("xnafbw")
                    .withValueSet(true)
                    .withVariable("htuov"),
                new SsisParameter().withId(6160359867810551901L)
                    .withName("rjtumghih")
                    .withDescription("ecmslclbl")
                    .withDataType("xltbsjuscvsf")
                    .withRequired(true)
                    .withSensitive(true)
                    .withDesignDefaultValue("gxuupbezqccydrtc")
                    .withDefaultValue("kdqkkyihzt")
                    .withSensitiveDefaultValue("qm")
                    .withValueType("zgwldoychillcec")
                    .withValueSet(true)
                    .withVariable("waoaguhi")));
        model = BinaryData.fromObject(model).toObject(SsisProject.class);
        Assertions.assertEquals(4879267275298407418L, model.id());
        Assertions.assertEquals("zstacsjvhrweft", model.name());
        Assertions.assertEquals("qejpmvssehaepwa", model.description());
        Assertions.assertEquals(6835409342308647438L, model.folderId());
        Assertions.assertEquals(1177146418590007172L, model.version());
        Assertions.assertEquals(8080220027377198790L, model.environmentRefs().get(0).id());
        Assertions.assertEquals("jttbstv", model.environmentRefs().get(0).environmentFolderName());
        Assertions.assertEquals("aqnrmvvfkoxmlg", model.environmentRefs().get(0).environmentName());
        Assertions.assertEquals("tuidvrmazlpd", model.environmentRefs().get(0).referenceType());
        Assertions.assertEquals(7285486993195955494L, model.parameters().get(0).id());
        Assertions.assertEquals("iac", model.parameters().get(0).name());
        Assertions.assertEquals("iexhajl", model.parameters().get(0).description());
        Assertions.assertEquals("t", model.parameters().get(0).dataType());
        Assertions.assertEquals(false, model.parameters().get(0).required());
        Assertions.assertEquals(true, model.parameters().get(0).sensitive());
        Assertions.assertEquals("t", model.parameters().get(0).designDefaultValue());
        Assertions.assertEquals("iygbpvn", model.parameters().get(0).defaultValue());
        Assertions.assertEquals("wmtxkyctwwgz", model.parameters().get(0).sensitiveDefaultValue());
        Assertions.assertEquals("jlmec", model.parameters().get(0).valueType());
        Assertions.assertEquals(false, model.parameters().get(0).valueSet());
        Assertions.assertEquals("gzyvnee", model.parameters().get(0).variable());
    }
}
