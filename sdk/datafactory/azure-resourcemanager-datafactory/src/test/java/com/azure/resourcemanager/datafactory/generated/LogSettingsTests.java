// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CopyActivityLogSettings;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.LogLocationSettings;
import com.azure.resourcemanager.datafactory.models.LogSettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LogSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogSettings model = BinaryData.fromString(
            "{\"enableCopyActivityLog\":\"datar\",\"copyActivityLogSettings\":{\"logLevel\":\"datapfteklgsnpvqcz\",\"enableReliableLogging\":\"dataooa\"},\"logLocationSettings\":{\"linkedServiceName\":{\"referenceName\":\"lthowcsuebt\",\"parameters\":{\"exar\":\"dataeuimtxmd\",\"ivftl\":\"dataukoir\",\"p\":\"dataskinmxanjguadh\",\"qjnouuujl\":\"datafxstwaaz\"}},\"path\":\"dataicshmqxgjzs\"}}")
            .toObject(LogSettings.class);
        Assertions.assertEquals("lthowcsuebt", model.logLocationSettings().linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogSettings model = new LogSettings().withEnableCopyActivityLog("datar")
            .withCopyActivityLogSettings(
                new CopyActivityLogSettings().withLogLevel("datapfteklgsnpvqcz").withEnableReliableLogging("dataooa"))
            .withLogLocationSettings(
                new LogLocationSettings()
                    .withLinkedServiceName(
                        new LinkedServiceReference()
                            .withReferenceName("lthowcsuebt")
                            .withParameters(mapOf("exar", "dataeuimtxmd", "ivftl", "dataukoir", "p",
                                "dataskinmxanjguadh", "qjnouuujl", "datafxstwaaz")))
                    .withPath("dataicshmqxgjzs"));
        model = BinaryData.fromObject(model).toObject(LogSettings.class);
        Assertions.assertEquals("lthowcsuebt", model.logLocationSettings().linkedServiceName().referenceName());
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
