// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.Schedule;
import com.azure.resourcemanager.hdinsight.containers.models.ScheduleDay;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Schedule model = BinaryData.fromString(
            "{\"startTime\":\"lqidyby\",\"endTime\":\"czfc\",\"count\":751467546,\"days\":[\"Monday\",\"Thursday\",\"Tuesday\",\"Wednesday\"]}")
            .toObject(Schedule.class);
        Assertions.assertEquals("lqidyby", model.startTime());
        Assertions.assertEquals("czfc", model.endTime());
        Assertions.assertEquals(751467546, model.count());
        Assertions.assertEquals(ScheduleDay.MONDAY, model.days().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Schedule model = new Schedule().withStartTime("lqidyby").withEndTime("czfc").withCount(751467546).withDays(
            Arrays.asList(ScheduleDay.MONDAY, ScheduleDay.THURSDAY, ScheduleDay.TUESDAY, ScheduleDay.WEDNESDAY));
        model = BinaryData.fromObject(model).toObject(Schedule.class);
        Assertions.assertEquals("lqidyby", model.startTime());
        Assertions.assertEquals("czfc", model.endTime());
        Assertions.assertEquals(751467546, model.count());
        Assertions.assertEquals(ScheduleDay.MONDAY, model.days().get(0));
    }
}
