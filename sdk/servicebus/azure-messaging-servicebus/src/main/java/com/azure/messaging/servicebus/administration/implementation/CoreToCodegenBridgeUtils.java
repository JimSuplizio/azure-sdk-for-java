// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.servicebus.administration.implementation;

import java.time.Duration;

/**
 * Utility class that handles functionality not yet available in azure-core that generated code requires.
 */
public final class CoreToCodegenBridgeUtils {

    /**
     * Converts a {@link Duration} to a string in ISO-8601 format with support for a day component.
     *
     * @param duration The {@link Duration} to convert.
     * @return The {@link Duration} as a string in ISO-8601 format with support for a day component, or null if the
     * provided {@link Duration} was null.
     */
    public static String durationToStringWithDays(Duration duration) {
        if (duration == null) {
            return null;
        }
        if (duration.isZero()) {
            return "PT0S";
        }
        StringBuilder builder = new StringBuilder();
        if (duration.isNegative()) {
            builder.append("-P");
            duration = duration.negated();
        } else {
            builder.append('P');
        }
        long days = duration.toDays();
        if (days > 0) {
            builder.append(days);
            builder.append('D');
            duration = duration.minusDays(days);
        }
        long hours = duration.toHours();
        if (hours > 0) {
            builder.append('T');
            builder.append(hours);
            builder.append('H');
            duration = duration.minusHours(hours);
        }
        final long minutes = duration.toMinutes();
        if (minutes > 0) {
            if (hours == 0) {
                builder.append('T');
            }
            builder.append(minutes);
            builder.append('M');
            duration = duration.minusMinutes(minutes);
        }
        final long seconds = duration.getSeconds();
        if (seconds > 0) {
            if (hours == 0 && minutes == 0) {
                builder.append('T');
            }
            builder.append(seconds);
            duration = duration.minusSeconds(seconds);
        }
        long milliseconds = duration.toMillis();
        if (milliseconds > 0) {
            if (hours == 0 && minutes == 0 && seconds == 0) {
                builder.append("T");
            }
            if (seconds == 0) {
                builder.append("0");
            }
            builder.append('.');
            if (milliseconds <= 99) {
                builder.append('0');
                if (milliseconds <= 9) {
                    builder.append('0');
                }
            }
            // Remove trailing zeros.
            while (milliseconds % 10 == 0) {
                milliseconds /= 10;
            }
            builder.append(milliseconds);
        }
        if (seconds > 0 || milliseconds > 0) {
            builder.append('S');
        }
        return builder.toString();
    }
}
