// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.models.ElasticTrafficFilter;
import com.azure.resourcemanager.elastic.models.ElasticTrafficFilterRule;
import com.azure.resourcemanager.elastic.models.Type;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ElasticTrafficFilterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ElasticTrafficFilter model =
            BinaryData
                .fromString(
                    "{\"id\":\"z\",\"name\":\"vvtpgvdfgio\",\"description\":\"ftutqxlngxlefgu\",\"region\":\"xkrxdqmi\",\"type\":\"ip\",\"includeByDefault\":false,\"rules\":[{\"source\":\"drabhjybige\",\"description\":\"qfbow\",\"azureEndpointGuid\":\"anyktzlcuiywg\",\"azureEndpointName\":\"wgndrvynhzgpp\",\"id\":\"cgyncocpecf\"},{\"source\":\"mcoo\",\"description\":\"xlzevgbmqjqabcy\",\"azureEndpointGuid\":\"ivkwlzuvccfwnfnb\",\"azureEndpointName\":\"fionl\",\"id\":\"x\"}]}")
                .toObject(ElasticTrafficFilter.class);
        Assertions.assertEquals("z", model.id());
        Assertions.assertEquals("vvtpgvdfgio", model.name());
        Assertions.assertEquals("ftutqxlngxlefgu", model.description());
        Assertions.assertEquals("xkrxdqmi", model.region());
        Assertions.assertEquals(Type.IP, model.type());
        Assertions.assertEquals(false, model.includeByDefault());
        Assertions.assertEquals("drabhjybige", model.rules().get(0).source());
        Assertions.assertEquals("qfbow", model.rules().get(0).description());
        Assertions.assertEquals("anyktzlcuiywg", model.rules().get(0).azureEndpointGuid());
        Assertions.assertEquals("wgndrvynhzgpp", model.rules().get(0).azureEndpointName());
        Assertions.assertEquals("cgyncocpecf", model.rules().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ElasticTrafficFilter model =
            new ElasticTrafficFilter()
                .withId("z")
                .withName("vvtpgvdfgio")
                .withDescription("ftutqxlngxlefgu")
                .withRegion("xkrxdqmi")
                .withType(Type.IP)
                .withIncludeByDefault(false)
                .withRules(
                    Arrays
                        .asList(
                            new ElasticTrafficFilterRule()
                                .withSource("drabhjybige")
                                .withDescription("qfbow")
                                .withAzureEndpointGuid("anyktzlcuiywg")
                                .withAzureEndpointName("wgndrvynhzgpp")
                                .withId("cgyncocpecf"),
                            new ElasticTrafficFilterRule()
                                .withSource("mcoo")
                                .withDescription("xlzevgbmqjqabcy")
                                .withAzureEndpointGuid("ivkwlzuvccfwnfnb")
                                .withAzureEndpointName("fionl")
                                .withId("x")));
        model = BinaryData.fromObject(model).toObject(ElasticTrafficFilter.class);
        Assertions.assertEquals("z", model.id());
        Assertions.assertEquals("vvtpgvdfgio", model.name());
        Assertions.assertEquals("ftutqxlngxlefgu", model.description());
        Assertions.assertEquals("xkrxdqmi", model.region());
        Assertions.assertEquals(Type.IP, model.type());
        Assertions.assertEquals(false, model.includeByDefault());
        Assertions.assertEquals("drabhjybige", model.rules().get(0).source());
        Assertions.assertEquals("qfbow", model.rules().get(0).description());
        Assertions.assertEquals("anyktzlcuiywg", model.rules().get(0).azureEndpointGuid());
        Assertions.assertEquals("wgndrvynhzgpp", model.rules().get(0).azureEndpointName());
        Assertions.assertEquals("cgyncocpecf", model.rules().get(0).id());
    }
}
