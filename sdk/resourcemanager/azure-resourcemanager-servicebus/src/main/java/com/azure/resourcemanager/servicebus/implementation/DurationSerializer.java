// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.servicebus.implementation;

import java.time.Duration;

/**
 * Custom serializer for serializing {@link Duration} object into ISO8601 formats, with precision to nanoseconds.
 */
public final class DurationSerializer {
    /**
     * Convert to provided Duration to an ISO 8601 String with a days component, with precision to nanoseconds.
     * @param duration The Duration to convert.
     * @return The String representation of the provided Duration.
     */
    public static String serialize(Duration duration) {
        String result = null;
        if (duration != null) {
            if (duration.isZero()) {
                result = "PT0S";
            } else {
                final StringBuilder builder = new StringBuilder();

                builder.append('P');

                final long days = duration.toDays();
                if (days > 0) {
                    builder.append(days);
                    builder.append('D');
                    duration = duration.minusDays(days);
                }

                final long hours = duration.toHours();
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

                long nanoseconds = duration.getNano();
                if (nanoseconds > 0) {
                    if (hours == 0 && minutes == 0 && seconds == 0) {
                        builder.append("T");
                    }

                    if (seconds == 0) {
                        builder.append("0");
                    }

                    builder.append('.');

                    long nanoMax = 100000000L;
                    while (nanoseconds < nanoMax) {
                        builder.append('0');
                        nanoMax = nanoMax / 10;
                    }

                    // Remove trailing zeros.
                    while (nanoseconds % 10 == 0) {
                        nanoseconds /= 10;
                    }
                    builder.append(nanoseconds);
                }

                if (seconds > 0 || nanoseconds > 0) {
                    builder.append('S');
                }

                result = builder.toString();
            }
        }
        return result;
    }
}
