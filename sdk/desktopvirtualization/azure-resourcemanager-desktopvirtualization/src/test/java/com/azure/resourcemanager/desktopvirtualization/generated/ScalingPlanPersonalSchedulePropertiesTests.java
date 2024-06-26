// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ScalingPlanPersonalScheduleProperties;
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHandlingOperation;
import com.azure.resourcemanager.desktopvirtualization.models.SetStartVMOnConnect;
import com.azure.resourcemanager.desktopvirtualization.models.StartupBehavior;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScalingPlanPersonalSchedulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScalingPlanPersonalScheduleProperties model =
            BinaryData
                .fromString(
                    "{\"daysOfWeek\":[\"Thursday\",\"Monday\",\"Wednesday\",\"Tuesday\"],\"rampUpStartTime\":{\"hour\":90973381,\"minute\":284689658},\"rampUpAutoStartHosts\":\"All\",\"rampUpStartVMOnConnect\":\"Enable\",\"rampUpActionOnDisconnect\":\"None\",\"rampUpMinutesToWaitOnDisconnect\":1990032205,\"rampUpActionOnLogoff\":\"None\",\"rampUpMinutesToWaitOnLogoff\":1114534772,\"peakStartTime\":{\"hour\":883110642,\"minute\":1247520399},\"peakStartVMOnConnect\":\"Disable\",\"peakActionOnDisconnect\":\"Hibernate\",\"peakMinutesToWaitOnDisconnect\":1114721091,\"peakActionOnLogoff\":\"None\",\"peakMinutesToWaitOnLogoff\":1356840761,\"rampDownStartTime\":{\"hour\":1358257343,\"minute\":2138169830},\"rampDownStartVMOnConnect\":\"Disable\",\"rampDownActionOnDisconnect\":\"Hibernate\",\"rampDownMinutesToWaitOnDisconnect\":919813735,\"rampDownActionOnLogoff\":\"Deallocate\",\"rampDownMinutesToWaitOnLogoff\":159831897,\"offPeakStartTime\":{\"hour\":527212463,\"minute\":1504791861},\"offPeakStartVMOnConnect\":\"Enable\",\"offPeakActionOnDisconnect\":\"Hibernate\",\"offPeakMinutesToWaitOnDisconnect\":529783276,\"offPeakActionOnLogoff\":\"None\",\"offPeakMinutesToWaitOnLogoff\":478088407}")
                .toObject(ScalingPlanPersonalScheduleProperties.class);
        Assertions.assertEquals(DayOfWeek.THURSDAY, model.daysOfWeek().get(0));
        Assertions.assertEquals(90973381, model.rampUpStartTime().hour());
        Assertions.assertEquals(284689658, model.rampUpStartTime().minute());
        Assertions.assertEquals(StartupBehavior.ALL, model.rampUpAutoStartHosts());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.rampUpStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, model.rampUpActionOnDisconnect());
        Assertions.assertEquals(1990032205, model.rampUpMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, model.rampUpActionOnLogoff());
        Assertions.assertEquals(1114534772, model.rampUpMinutesToWaitOnLogoff());
        Assertions.assertEquals(883110642, model.peakStartTime().hour());
        Assertions.assertEquals(1247520399, model.peakStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.DISABLE, model.peakStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.peakActionOnDisconnect());
        Assertions.assertEquals(1114721091, model.peakMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, model.peakActionOnLogoff());
        Assertions.assertEquals(1356840761, model.peakMinutesToWaitOnLogoff());
        Assertions.assertEquals(1358257343, model.rampDownStartTime().hour());
        Assertions.assertEquals(2138169830, model.rampDownStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.DISABLE, model.rampDownStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.rampDownActionOnDisconnect());
        Assertions.assertEquals(919813735, model.rampDownMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.DEALLOCATE, model.rampDownActionOnLogoff());
        Assertions.assertEquals(159831897, model.rampDownMinutesToWaitOnLogoff());
        Assertions.assertEquals(527212463, model.offPeakStartTime().hour());
        Assertions.assertEquals(1504791861, model.offPeakStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.offPeakStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.offPeakActionOnDisconnect());
        Assertions.assertEquals(529783276, model.offPeakMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, model.offPeakActionOnLogoff());
        Assertions.assertEquals(478088407, model.offPeakMinutesToWaitOnLogoff());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScalingPlanPersonalScheduleProperties model =
            new ScalingPlanPersonalScheduleProperties()
                .withDaysOfWeek(
                    Arrays.asList(DayOfWeek.THURSDAY, DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.TUESDAY))
                .withRampUpStartTime(new Time().withHour(90973381).withMinute(284689658))
                .withRampUpAutoStartHosts(StartupBehavior.ALL)
                .withRampUpStartVMOnConnect(SetStartVMOnConnect.ENABLE)
                .withRampUpActionOnDisconnect(SessionHandlingOperation.NONE)
                .withRampUpMinutesToWaitOnDisconnect(1990032205)
                .withRampUpActionOnLogoff(SessionHandlingOperation.NONE)
                .withRampUpMinutesToWaitOnLogoff(1114534772)
                .withPeakStartTime(new Time().withHour(883110642).withMinute(1247520399))
                .withPeakStartVMOnConnect(SetStartVMOnConnect.DISABLE)
                .withPeakActionOnDisconnect(SessionHandlingOperation.HIBERNATE)
                .withPeakMinutesToWaitOnDisconnect(1114721091)
                .withPeakActionOnLogoff(SessionHandlingOperation.NONE)
                .withPeakMinutesToWaitOnLogoff(1356840761)
                .withRampDownStartTime(new Time().withHour(1358257343).withMinute(2138169830))
                .withRampDownStartVMOnConnect(SetStartVMOnConnect.DISABLE)
                .withRampDownActionOnDisconnect(SessionHandlingOperation.HIBERNATE)
                .withRampDownMinutesToWaitOnDisconnect(919813735)
                .withRampDownActionOnLogoff(SessionHandlingOperation.DEALLOCATE)
                .withRampDownMinutesToWaitOnLogoff(159831897)
                .withOffPeakStartTime(new Time().withHour(527212463).withMinute(1504791861))
                .withOffPeakStartVMOnConnect(SetStartVMOnConnect.ENABLE)
                .withOffPeakActionOnDisconnect(SessionHandlingOperation.HIBERNATE)
                .withOffPeakMinutesToWaitOnDisconnect(529783276)
                .withOffPeakActionOnLogoff(SessionHandlingOperation.NONE)
                .withOffPeakMinutesToWaitOnLogoff(478088407);
        model = BinaryData.fromObject(model).toObject(ScalingPlanPersonalScheduleProperties.class);
        Assertions.assertEquals(DayOfWeek.THURSDAY, model.daysOfWeek().get(0));
        Assertions.assertEquals(90973381, model.rampUpStartTime().hour());
        Assertions.assertEquals(284689658, model.rampUpStartTime().minute());
        Assertions.assertEquals(StartupBehavior.ALL, model.rampUpAutoStartHosts());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.rampUpStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, model.rampUpActionOnDisconnect());
        Assertions.assertEquals(1990032205, model.rampUpMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, model.rampUpActionOnLogoff());
        Assertions.assertEquals(1114534772, model.rampUpMinutesToWaitOnLogoff());
        Assertions.assertEquals(883110642, model.peakStartTime().hour());
        Assertions.assertEquals(1247520399, model.peakStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.DISABLE, model.peakStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.peakActionOnDisconnect());
        Assertions.assertEquals(1114721091, model.peakMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, model.peakActionOnLogoff());
        Assertions.assertEquals(1356840761, model.peakMinutesToWaitOnLogoff());
        Assertions.assertEquals(1358257343, model.rampDownStartTime().hour());
        Assertions.assertEquals(2138169830, model.rampDownStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.DISABLE, model.rampDownStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.rampDownActionOnDisconnect());
        Assertions.assertEquals(919813735, model.rampDownMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.DEALLOCATE, model.rampDownActionOnLogoff());
        Assertions.assertEquals(159831897, model.rampDownMinutesToWaitOnLogoff());
        Assertions.assertEquals(527212463, model.offPeakStartTime().hour());
        Assertions.assertEquals(1504791861, model.offPeakStartTime().minute());
        Assertions.assertEquals(SetStartVMOnConnect.ENABLE, model.offPeakStartVMOnConnect());
        Assertions.assertEquals(SessionHandlingOperation.HIBERNATE, model.offPeakActionOnDisconnect());
        Assertions.assertEquals(529783276, model.offPeakMinutesToWaitOnDisconnect());
        Assertions.assertEquals(SessionHandlingOperation.NONE, model.offPeakActionOnLogoff());
        Assertions.assertEquals(478088407, model.offPeakMinutesToWaitOnLogoff());
    }
}
