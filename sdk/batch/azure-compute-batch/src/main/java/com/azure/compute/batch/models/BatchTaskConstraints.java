// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * Execution constraints to apply to a Task.
 */
@Fluent
public final class BatchTaskConstraints implements JsonSerializable<BatchTaskConstraints> {

    /*
     * The maximum elapsed time that the Task may run, measured from the time the Task starts. If the Task does not
     * complete within the time limit, the Batch service terminates it. If this is not specified, there is no time limit
     * on how long the Task may run.
     */
    @Generated
    private Duration maxWallClockTime;

    /*
     * The minimum time to retain the Task directory on the Compute Node where it ran, from the time it completes
     * execution. After this time, the Batch service may delete the Task directory and all its contents. The default is
     * 7 days, i.e. the Task directory will be retained for 7 days unless the Compute Node is removed or the Job is
     * deleted.
     */
    @Generated
    private Duration retentionTime;

    /*
     * The maximum number of times the Task may be retried. The Batch service retries a Task if its exit code is
     * nonzero. Note that this value specifically controls the number of retries for the Task executable due to a
     * nonzero exit code. The Batch service will try the Task once, and may then retry up to this limit. For example, if
     * the maximum retry count is 3, Batch tries the Task up to 4 times (one initial try and 3 retries). If the maximum
     * retry count is 0, the Batch service does not retry the Task after the first attempt. If the maximum retry count
     * is -1, the Batch service retries the Task without limit, however this is not recommended for a start task or any
     * task. The default value is 0 (no retries).
     */
    @Generated
    private Integer maxTaskRetryCount;

    /**
     * Creates an instance of BatchTaskConstraints class.
     */
    @Generated
    public BatchTaskConstraints() {
    }

    /**
     * Get the maxWallClockTime property: The maximum elapsed time that the Task may run, measured from the time the
     * Task starts. If the Task does not complete within the time limit, the Batch service terminates it. If this is not
     * specified, there is no time limit on how long the Task may run.
     *
     * @return the maxWallClockTime value.
     */
    @Generated
    public Duration getMaxWallClockTime() {
        return this.maxWallClockTime;
    }

    /**
     * Set the maxWallClockTime property: The maximum elapsed time that the Task may run, measured from the time the
     * Task starts. If the Task does not complete within the time limit, the Batch service terminates it. If this is not
     * specified, there is no time limit on how long the Task may run.
     *
     * @param maxWallClockTime the maxWallClockTime value to set.
     * @return the BatchTaskConstraints object itself.
     */
    @Generated
    public BatchTaskConstraints setMaxWallClockTime(Duration maxWallClockTime) {
        this.maxWallClockTime = maxWallClockTime;
        return this;
    }

    /**
     * Get the retentionTime property: The minimum time to retain the Task directory on the Compute Node where it ran,
     * from the time it completes execution. After this time, the Batch service may delete the Task directory and all
     * its contents. The default is 7 days, i.e. the Task directory will be retained for 7 days unless the Compute Node
     * is removed or the Job is deleted.
     *
     * @return the retentionTime value.
     */
    @Generated
    public Duration getRetentionTime() {
        return this.retentionTime;
    }

    /**
     * Set the retentionTime property: The minimum time to retain the Task directory on the Compute Node where it ran,
     * from the time it completes execution. After this time, the Batch service may delete the Task directory and all
     * its contents. The default is 7 days, i.e. the Task directory will be retained for 7 days unless the Compute Node
     * is removed or the Job is deleted.
     *
     * @param retentionTime the retentionTime value to set.
     * @return the BatchTaskConstraints object itself.
     */
    @Generated
    public BatchTaskConstraints setRetentionTime(Duration retentionTime) {
        this.retentionTime = retentionTime;
        return this;
    }

    /**
     * Get the maxTaskRetryCount property: The maximum number of times the Task may be retried. The Batch service
     * retries a Task if its exit code is nonzero. Note that this value specifically controls the number of retries for
     * the Task executable due to a nonzero exit code. The Batch service will try the Task once, and may then retry up
     * to this limit. For example, if the maximum retry count is 3, Batch tries the Task up to 4 times (one initial try
     * and 3 retries). If the maximum retry count is 0, the Batch service does not retry the Task after the first
     * attempt. If the maximum retry count is -1, the Batch service retries the Task without limit, however this is not
     * recommended for a start task or any task. The default value is 0 (no retries).
     *
     * @return the maxTaskRetryCount value.
     */
    @Generated
    public Integer getMaxTaskRetryCount() {
        return this.maxTaskRetryCount;
    }

    /**
     * Set the maxTaskRetryCount property: The maximum number of times the Task may be retried. The Batch service
     * retries a Task if its exit code is nonzero. Note that this value specifically controls the number of retries for
     * the Task executable due to a nonzero exit code. The Batch service will try the Task once, and may then retry up
     * to this limit. For example, if the maximum retry count is 3, Batch tries the Task up to 4 times (one initial try
     * and 3 retries). If the maximum retry count is 0, the Batch service does not retry the Task after the first
     * attempt. If the maximum retry count is -1, the Batch service retries the Task without limit, however this is not
     * recommended for a start task or any task. The default value is 0 (no retries).
     *
     * @param maxTaskRetryCount the maxTaskRetryCount value to set.
     * @return the BatchTaskConstraints object itself.
     */
    @Generated
    public BatchTaskConstraints setMaxTaskRetryCount(Integer maxTaskRetryCount) {
        this.maxTaskRetryCount = maxTaskRetryCount;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("maxWallClockTime", CoreUtils.durationToStringWithDays(this.maxWallClockTime));
        jsonWriter.writeStringField("retentionTime", CoreUtils.durationToStringWithDays(this.retentionTime));
        jsonWriter.writeNumberField("maxTaskRetryCount", this.maxTaskRetryCount);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchTaskConstraints from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchTaskConstraints if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BatchTaskConstraints.
     */
    @Generated
    public static BatchTaskConstraints fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchTaskConstraints deserializedBatchTaskConstraints = new BatchTaskConstraints();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("maxWallClockTime".equals(fieldName)) {
                    deserializedBatchTaskConstraints.maxWallClockTime
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("retentionTime".equals(fieldName)) {
                    deserializedBatchTaskConstraints.retentionTime
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("maxTaskRetryCount".equals(fieldName)) {
                    deserializedBatchTaskConstraints.maxTaskRetryCount = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedBatchTaskConstraints;
        });
    }
}
