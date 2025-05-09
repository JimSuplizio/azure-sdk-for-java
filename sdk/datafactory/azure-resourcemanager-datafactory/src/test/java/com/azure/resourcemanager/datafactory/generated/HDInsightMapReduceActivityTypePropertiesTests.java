// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.HDInsightMapReduceActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.HDInsightActivityDebugInfoOption;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HDInsightMapReduceActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HDInsightMapReduceActivityTypeProperties model = BinaryData.fromString(
            "{\"storageLinkedServices\":[{\"referenceName\":\"fjrdcawa\",\"parameters\":{\"xyczzwhwsidnqia\":\"datadakbijcxctni\",\"xoe\":\"dataoyhnollnuhocbbe\",\"fcurn\":\"dataprtz\"}}],\"arguments\":[\"datacun\",\"datauassto\"],\"getDebugInfo\":\"Failure\",\"className\":\"datamyayblmcenjc\",\"jarFilePath\":\"datacxam\",\"jarLinkedService\":{\"referenceName\":\"lxksph\",\"parameters\":{\"t\":\"datab\",\"w\":\"datalfmaj\"}},\"jarLibs\":[\"datas\"],\"defines\":{\"ufnhejualug\":\"datakqzulosl\"}}")
            .toObject(HDInsightMapReduceActivityTypeProperties.class);
        Assertions.assertEquals("fjrdcawa", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.FAILURE, model.getDebugInfo());
        Assertions.assertEquals("lxksph", model.jarLinkedService().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HDInsightMapReduceActivityTypeProperties model
            = new HDInsightMapReduceActivityTypeProperties()
                .withStorageLinkedServices(Arrays.asList(new LinkedServiceReference().withReferenceName("fjrdcawa")
                    .withParameters(mapOf("xyczzwhwsidnqia", "datadakbijcxctni", "xoe", "dataoyhnollnuhocbbe", "fcurn",
                        "dataprtz"))))
                .withArguments(Arrays.asList("datacun", "datauassto"))
                .withGetDebugInfo(HDInsightActivityDebugInfoOption.FAILURE)
                .withClassName("datamyayblmcenjc")
                .withJarFilePath("datacxam")
                .withJarLinkedService(new LinkedServiceReference().withReferenceName("lxksph")
                    .withParameters(mapOf("t", "datab", "w", "datalfmaj")))
                .withJarLibs(Arrays.asList("datas"))
                .withDefines(mapOf("ufnhejualug", "datakqzulosl"));
        model = BinaryData.fromObject(model).toObject(HDInsightMapReduceActivityTypeProperties.class);
        Assertions.assertEquals("fjrdcawa", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.FAILURE, model.getDebugInfo());
        Assertions.assertEquals("lxksph", model.jarLinkedService().referenceName());
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
