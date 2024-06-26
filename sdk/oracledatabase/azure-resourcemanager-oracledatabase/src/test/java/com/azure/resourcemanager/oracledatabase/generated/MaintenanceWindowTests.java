// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.DayOfWeek;
import com.azure.resourcemanager.oracledatabase.models.DayOfWeekName;
import com.azure.resourcemanager.oracledatabase.models.MaintenanceWindow;
import com.azure.resourcemanager.oracledatabase.models.Month;
import com.azure.resourcemanager.oracledatabase.models.MonthName;
import com.azure.resourcemanager.oracledatabase.models.PatchingMode;
import com.azure.resourcemanager.oracledatabase.models.Preference;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MaintenanceWindowTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MaintenanceWindow model = BinaryData.fromString(
            "{\"preference\":\"NoPreference\",\"months\":[{\"name\":\"September\"},{\"name\":\"July\"},{\"name\":\"January\"},{\"name\":\"October\"}],\"weeksOfMonth\":[447504444,1340074682],\"daysOfWeek\":[{\"name\":\"Sunday\"},{\"name\":\"Wednesday\"},{\"name\":\"Thursday\"}],\"hoursOfDay\":[1039817033,1004577663,1511983432,1769488182],\"leadTimeInWeeks\":2041289920,\"patchingMode\":\"NonRolling\",\"customActionTimeoutInMins\":292038248,\"isCustomActionTimeoutEnabled\":true,\"isMonthlyPatchingEnabled\":false}")
            .toObject(MaintenanceWindow.class);
        Assertions.assertEquals(Preference.NO_PREFERENCE, model.preference());
        Assertions.assertEquals(MonthName.SEPTEMBER, model.months().get(0).name());
        Assertions.assertEquals(447504444, model.weeksOfMonth().get(0));
        Assertions.assertEquals(DayOfWeekName.SUNDAY, model.daysOfWeek().get(0).name());
        Assertions.assertEquals(1039817033, model.hoursOfDay().get(0));
        Assertions.assertEquals(2041289920, model.leadTimeInWeeks());
        Assertions.assertEquals(PatchingMode.NON_ROLLING, model.patchingMode());
        Assertions.assertEquals(292038248, model.customActionTimeoutInMins());
        Assertions.assertEquals(true, model.isCustomActionTimeoutEnabled());
        Assertions.assertEquals(false, model.isMonthlyPatchingEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MaintenanceWindow model = new MaintenanceWindow().withPreference(Preference.NO_PREFERENCE)
            .withMonths(Arrays.asList(new Month().withName(MonthName.SEPTEMBER), new Month().withName(MonthName.JULY),
                new Month().withName(MonthName.JANUARY), new Month().withName(MonthName.OCTOBER)))
            .withWeeksOfMonth(Arrays.asList(447504444, 1340074682))
            .withDaysOfWeek(Arrays.asList(new DayOfWeek().withName(DayOfWeekName.SUNDAY),
                new DayOfWeek().withName(DayOfWeekName.WEDNESDAY), new DayOfWeek().withName(DayOfWeekName.THURSDAY)))
            .withHoursOfDay(Arrays.asList(1039817033, 1004577663, 1511983432, 1769488182))
            .withLeadTimeInWeeks(2041289920)
            .withPatchingMode(PatchingMode.NON_ROLLING)
            .withCustomActionTimeoutInMins(292038248)
            .withIsCustomActionTimeoutEnabled(true)
            .withIsMonthlyPatchingEnabled(false);
        model = BinaryData.fromObject(model).toObject(MaintenanceWindow.class);
        Assertions.assertEquals(Preference.NO_PREFERENCE, model.preference());
        Assertions.assertEquals(MonthName.SEPTEMBER, model.months().get(0).name());
        Assertions.assertEquals(447504444, model.weeksOfMonth().get(0));
        Assertions.assertEquals(DayOfWeekName.SUNDAY, model.daysOfWeek().get(0).name());
        Assertions.assertEquals(1039817033, model.hoursOfDay().get(0));
        Assertions.assertEquals(2041289920, model.leadTimeInWeeks());
        Assertions.assertEquals(PatchingMode.NON_ROLLING, model.patchingMode());
        Assertions.assertEquals(292038248, model.customActionTimeoutInMins());
        Assertions.assertEquals(true, model.isCustomActionTimeoutEnabled());
        Assertions.assertEquals(false, model.isMonthlyPatchingEnabled());
    }
}
