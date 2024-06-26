// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.OracleTableDataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class OracleTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OracleTableDataset model = BinaryData.fromString(
            "{\"type\":\"OracleTable\",\"typeProperties\":{\"tableName\":\"datagjq\",\"schema\":\"datacant\",\"table\":\"datayxzxjmkanbclazof\"},\"description\":\"xvtemaspm\",\"structure\":\"dataydscdkxwd\",\"schema\":\"datajcbhaahnt\",\"linkedServiceName\":{\"referenceName\":\"felfh\",\"parameters\":{\"kkzdfivsu\":\"dataxo\"}},\"parameters\":{\"t\":{\"type\":\"SecureString\",\"defaultValue\":\"datawzzmr\"},\"kesmkwtzgfragj\":{\"type\":\"Object\",\"defaultValue\":\"datamfppinmg\"},\"qhvmmniiqy\":{\"type\":\"Object\",\"defaultValue\":\"datarxlobkdb\"}},\"annotations\":[\"datahjnskbggicnqw\",\"datact\",\"datawp\",\"datalxkrk\"],\"folder\":{\"name\":\"xrktjcjigcw\"},\"\":{\"evchefp\":\"dataanbqxa\",\"cgimmrim\":\"dataeedyybruholaem\",\"z\":\"dataabsqqlon\"}}")
            .toObject(OracleTableDataset.class);
        Assertions.assertEquals("xvtemaspm", model.description());
        Assertions.assertEquals("felfh", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("t").type());
        Assertions.assertEquals("xrktjcjigcw", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OracleTableDataset model = new OracleTableDataset().withDescription("xvtemaspm")
            .withStructure("dataydscdkxwd")
            .withSchema("datajcbhaahnt")
            .withLinkedServiceName(
                new LinkedServiceReference().withReferenceName("felfh").withParameters(mapOf("kkzdfivsu", "dataxo")))
            .withParameters(mapOf("t",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datawzzmr"),
                "kesmkwtzgfragj",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datamfppinmg"),
                "qhvmmniiqy",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datarxlobkdb")))
            .withAnnotations(Arrays.asList("datahjnskbggicnqw", "datact", "datawp", "datalxkrk"))
            .withFolder(new DatasetFolder().withName("xrktjcjigcw"))
            .withTableName("datagjq")
            .withSchemaTypePropertiesSchema("datacant")
            .withTable("datayxzxjmkanbclazof");
        model = BinaryData.fromObject(model).toObject(OracleTableDataset.class);
        Assertions.assertEquals("xvtemaspm", model.description());
        Assertions.assertEquals("felfh", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("t").type());
        Assertions.assertEquals("xrktjcjigcw", model.folder().name());
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
