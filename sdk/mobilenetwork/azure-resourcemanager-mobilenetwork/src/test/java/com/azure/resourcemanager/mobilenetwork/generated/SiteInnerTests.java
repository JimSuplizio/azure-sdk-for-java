// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SiteInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SiteInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SiteInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Deleted\",\"networkFunctions\":[{\"id\":\"rdve\"}]},\"location\":\"wsdtutnwl\",\"tags\":{\"dxukuqgsjjxundxg\":\"cvuzhyrmewipmve\",\"hhzjhfj\":\"etw\",\"qsxvmhf\":\"hvvmuvgpmun\",\"yue\":\"uzjyihsasbhudypo\"},\"id\":\"slynsqyrpfoo\",\"name\":\"rlttymsjnygqdnfw\",\"type\":\"zdzgtilaxhnfhqly\"}")
            .toObject(SiteInner.class);
        Assertions.assertEquals("wsdtutnwl", model.location());
        Assertions.assertEquals("cvuzhyrmewipmve", model.tags().get("dxukuqgsjjxundxg"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SiteInner model = new SiteInner().withLocation("wsdtutnwl")
            .withTags(mapOf("dxukuqgsjjxundxg", "cvuzhyrmewipmve", "hhzjhfj", "etw", "qsxvmhf", "hvvmuvgpmun", "yue",
                "uzjyihsasbhudypo"));
        model = BinaryData.fromObject(model).toObject(SiteInner.class);
        Assertions.assertEquals("wsdtutnwl", model.location());
        Assertions.assertEquals("cvuzhyrmewipmve", model.tags().get("dxukuqgsjjxundxg"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
