// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Usage of provisioned storage, IOPS, bandwidth and number of file shares across all live shares or soft-deleted shares
 * in the account.
 */
@Immutable
public final class AccountUsageElements implements JsonSerializable<AccountUsageElements> {
    /*
     * The total number of file shares.
     */
    private Integer fileShareCount;

    /*
     * The total provisioned storage quota in gibibytes.
     */
    private Integer provisionedStorageGiB;

    /*
     * The total provisioned IOPS.
     */
    private Integer provisionedIops;

    /*
     * The total provisioned bandwidth in mebibytes per second.
     */
    private Integer provisionedBandwidthMiBPerSec;

    /**
     * Creates an instance of AccountUsageElements class.
     */
    public AccountUsageElements() {
    }

    /**
     * Get the fileShareCount property: The total number of file shares.
     * 
     * @return the fileShareCount value.
     */
    public Integer fileShareCount() {
        return this.fileShareCount;
    }

    /**
     * Get the provisionedStorageGiB property: The total provisioned storage quota in gibibytes.
     * 
     * @return the provisionedStorageGiB value.
     */
    public Integer provisionedStorageGiB() {
        return this.provisionedStorageGiB;
    }

    /**
     * Get the provisionedIops property: The total provisioned IOPS.
     * 
     * @return the provisionedIops value.
     */
    public Integer provisionedIops() {
        return this.provisionedIops;
    }

    /**
     * Get the provisionedBandwidthMiBPerSec property: The total provisioned bandwidth in mebibytes per second.
     * 
     * @return the provisionedBandwidthMiBPerSec value.
     */
    public Integer provisionedBandwidthMiBPerSec() {
        return this.provisionedBandwidthMiBPerSec;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AccountUsageElements from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AccountUsageElements if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AccountUsageElements.
     */
    public static AccountUsageElements fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AccountUsageElements deserializedAccountUsageElements = new AccountUsageElements();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("fileShareCount".equals(fieldName)) {
                    deserializedAccountUsageElements.fileShareCount = reader.getNullable(JsonReader::getInt);
                } else if ("provisionedStorageGiB".equals(fieldName)) {
                    deserializedAccountUsageElements.provisionedStorageGiB = reader.getNullable(JsonReader::getInt);
                } else if ("provisionedIOPS".equals(fieldName)) {
                    deserializedAccountUsageElements.provisionedIops = reader.getNullable(JsonReader::getInt);
                } else if ("provisionedBandwidthMiBPerSec".equals(fieldName)) {
                    deserializedAccountUsageElements.provisionedBandwidthMiBPerSec
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAccountUsageElements;
        });
    }
}
