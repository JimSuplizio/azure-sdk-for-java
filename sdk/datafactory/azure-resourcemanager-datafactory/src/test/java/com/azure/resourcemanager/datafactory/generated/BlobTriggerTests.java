// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BlobTrigger;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.azure.resourcemanager.datafactory.models.TriggerPipelineReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BlobTriggerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BlobTrigger model = BinaryData.fromString(
            "{\"type\":\"BlobTrigger\",\"typeProperties\":{\"folderPath\":\"odpm\",\"maxConcurrency\":1219528999,\"linkedService\":{\"referenceName\":\"sggneocqaejle\",\"parameters\":{\"d\":\"datadpqwucprpwsga\",\"fwmqi\":\"datacik\",\"ocepjsfhxhulrekr\":\"datalebctor\",\"dnzrcjokgthy\":\"datay\"}}},\"pipelines\":[{\"pipelineReference\":{\"referenceName\":\"rwlguesoivaoryef\",\"name\":\"ovyceksdatjtgm\"},\"parameters\":{\"cqskrj\":\"dataqvindhixddcocs\"}}],\"description\":\"a\",\"runtimeState\":\"Disabled\",\"annotations\":[\"datadrkcsh\",\"dataoxssf\"],\"\":{\"hzgxkwcqpvrrm\":\"dataxqhyy\",\"roqsdvxddsfyl\":\"datak\",\"swnnsb\":\"dataokbriykrxaevbura\",\"ojyn\":\"datakumxbcn\"}}")
            .toObject(BlobTrigger.class);
        Assertions.assertEquals("a", model.description());
        Assertions.assertEquals("rwlguesoivaoryef", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("ovyceksdatjtgm", model.pipelines().get(0).pipelineReference().name());
        Assertions.assertEquals("odpm", model.folderPath());
        Assertions.assertEquals(1219528999, model.maxConcurrency());
        Assertions.assertEquals("sggneocqaejle", model.linkedService().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BlobTrigger model = new BlobTrigger().withDescription("a")
            .withAnnotations(Arrays.asList("datadrkcsh", "dataoxssf"))
            .withPipelines(Arrays.asList(new TriggerPipelineReference()
                .withPipelineReference(
                    new PipelineReference().withReferenceName("rwlguesoivaoryef").withName("ovyceksdatjtgm"))
                .withParameters(mapOf("cqskrj", "dataqvindhixddcocs"))))
            .withFolderPath("odpm")
            .withMaxConcurrency(1219528999)
            .withLinkedService(new LinkedServiceReference().withReferenceName("sggneocqaejle")
                .withParameters(mapOf("d", "datadpqwucprpwsga", "fwmqi", "datacik", "ocepjsfhxhulrekr", "datalebctor",
                    "dnzrcjokgthy", "datay")));
        model = BinaryData.fromObject(model).toObject(BlobTrigger.class);
        Assertions.assertEquals("a", model.description());
        Assertions.assertEquals("rwlguesoivaoryef", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("ovyceksdatjtgm", model.pipelines().get(0).pipelineReference().name());
        Assertions.assertEquals("odpm", model.folderPath());
        Assertions.assertEquals(1219528999, model.maxConcurrency());
        Assertions.assertEquals("sggneocqaejle", model.linkedService().referenceName());
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
