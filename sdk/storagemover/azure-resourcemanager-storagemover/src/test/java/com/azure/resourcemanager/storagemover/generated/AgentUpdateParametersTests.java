// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagemover.models.AgentUpdateParameters;
import com.azure.resourcemanager.storagemover.models.DayOfWeek;
import com.azure.resourcemanager.storagemover.models.Minute;
import com.azure.resourcemanager.storagemover.models.Time;
import com.azure.resourcemanager.storagemover.models.UploadLimitSchedule;
import com.azure.resourcemanager.storagemover.models.UploadLimitWeeklyRecurrence;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AgentUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgentUpdateParameters model = BinaryData.fromString(
            "{\"properties\":{\"description\":\"dgbb\",\"uploadLimitSchedule\":{\"weeklyRecurrences\":[{\"limitInMbps\":763703494,\"days\":[\"Tuesday\",\"Sunday\",\"Wednesday\"],\"startTime\":{\"hour\":432312766,\"minute\":30},\"endTime\":{\"hour\":1777353299,\"minute\":30}}]}}}")
            .toObject(AgentUpdateParameters.class);
        Assertions.assertEquals("dgbb", model.description());
        Assertions.assertEquals(432312766, model.uploadLimitSchedule().weeklyRecurrences().get(0).startTime().hour());
        Assertions.assertEquals(Minute.THREE_ZERO,
            model.uploadLimitSchedule().weeklyRecurrences().get(0).startTime().minute());
        Assertions.assertEquals(1777353299, model.uploadLimitSchedule().weeklyRecurrences().get(0).endTime().hour());
        Assertions.assertEquals(Minute.THREE_ZERO,
            model.uploadLimitSchedule().weeklyRecurrences().get(0).endTime().minute());
        Assertions.assertEquals(DayOfWeek.TUESDAY,
            model.uploadLimitSchedule().weeklyRecurrences().get(0).days().get(0));
        Assertions.assertEquals(763703494, model.uploadLimitSchedule().weeklyRecurrences().get(0).limitInMbps());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgentUpdateParameters model = new AgentUpdateParameters().withDescription("dgbb")
            .withUploadLimitSchedule(
                new UploadLimitSchedule().withWeeklyRecurrences(Arrays.asList(new UploadLimitWeeklyRecurrence()
                    .withStartTime(new Time().withHour(432312766).withMinute(Minute.THREE_ZERO))
                    .withEndTime(new Time().withHour(1777353299).withMinute(Minute.THREE_ZERO))
                    .withDays(Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.SUNDAY, DayOfWeek.WEDNESDAY))
                    .withLimitInMbps(763703494))));
        model = BinaryData.fromObject(model).toObject(AgentUpdateParameters.class);
        Assertions.assertEquals("dgbb", model.description());
        Assertions.assertEquals(432312766, model.uploadLimitSchedule().weeklyRecurrences().get(0).startTime().hour());
        Assertions.assertEquals(Minute.THREE_ZERO,
            model.uploadLimitSchedule().weeklyRecurrences().get(0).startTime().minute());
        Assertions.assertEquals(1777353299, model.uploadLimitSchedule().weeklyRecurrences().get(0).endTime().hour());
        Assertions.assertEquals(Minute.THREE_ZERO,
            model.uploadLimitSchedule().weeklyRecurrences().get(0).endTime().minute());
        Assertions.assertEquals(DayOfWeek.TUESDAY,
            model.uploadLimitSchedule().weeklyRecurrences().get(0).days().get(0));
        Assertions.assertEquals(763703494, model.uploadLimitSchedule().weeklyRecurrences().get(0).limitInMbps());
    }
}
