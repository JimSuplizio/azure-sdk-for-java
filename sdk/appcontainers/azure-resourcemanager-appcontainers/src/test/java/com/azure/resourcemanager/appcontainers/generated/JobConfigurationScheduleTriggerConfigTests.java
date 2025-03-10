// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.JobConfigurationScheduleTriggerConfig;
import org.junit.jupiter.api.Assertions;

public final class JobConfigurationScheduleTriggerConfigTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobConfigurationScheduleTriggerConfig model = BinaryData
            .fromString(
                "{\"replicaCompletionCount\":718100150,\"cronExpression\":\"mlwywaeeczg\",\"parallelism\":2069370787}")
            .toObject(JobConfigurationScheduleTriggerConfig.class);
        Assertions.assertEquals(718100150, model.replicaCompletionCount());
        Assertions.assertEquals("mlwywaeeczg", model.cronExpression());
        Assertions.assertEquals(2069370787, model.parallelism());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobConfigurationScheduleTriggerConfig model
            = new JobConfigurationScheduleTriggerConfig().withReplicaCompletionCount(718100150)
                .withCronExpression("mlwywaeeczg")
                .withParallelism(2069370787);
        model = BinaryData.fromObject(model).toObject(JobConfigurationScheduleTriggerConfig.class);
        Assertions.assertEquals(718100150, model.replicaCompletionCount());
        Assertions.assertEquals("mlwywaeeczg", model.cronExpression());
        Assertions.assertEquals(2069370787, model.parallelism());
    }
}
