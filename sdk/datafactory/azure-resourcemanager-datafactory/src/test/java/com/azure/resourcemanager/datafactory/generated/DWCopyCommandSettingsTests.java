// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DWCopyCommandDefaultValue;
import com.azure.resourcemanager.datafactory.models.DWCopyCommandSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DWCopyCommandSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DWCopyCommandSettings model = BinaryData.fromString(
            "{\"defaultValues\":[{\"columnName\":\"dataazuboig\",\"defaultValue\":\"datawpbbjzdvaqoilgkz\"},{\"columnName\":\"datazpvjwego\",\"defaultValue\":\"dataceqyrajdvvs\"},{\"columnName\":\"datatyypercazcchvww\",\"defaultValue\":\"dataazztvotf\"}],\"additionalOptions\":{\"oszcmfmynljigj\":\"yfxkfgxxefzliguw\",\"dmwtiv\":\"nk\"}}")
            .toObject(DWCopyCommandSettings.class);
        Assertions.assertEquals("yfxkfgxxefzliguw", model.additionalOptions().get("oszcmfmynljigj"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DWCopyCommandSettings model
            = new DWCopyCommandSettings()
                .withDefaultValues(Arrays.asList(
                    new DWCopyCommandDefaultValue().withColumnName("dataazuboig")
                        .withDefaultValue("datawpbbjzdvaqoilgkz"),
                    new DWCopyCommandDefaultValue().withColumnName("datazpvjwego").withDefaultValue("dataceqyrajdvvs"),
                    new DWCopyCommandDefaultValue().withColumnName("datatyypercazcchvww")
                        .withDefaultValue("dataazztvotf")))
                .withAdditionalOptions(mapOf("oszcmfmynljigj", "yfxkfgxxefzliguw", "dmwtiv", "nk"));
        model = BinaryData.fromObject(model).toObject(DWCopyCommandSettings.class);
        Assertions.assertEquals("yfxkfgxxefzliguw", model.additionalOptions().get("oszcmfmynljigj"));
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
