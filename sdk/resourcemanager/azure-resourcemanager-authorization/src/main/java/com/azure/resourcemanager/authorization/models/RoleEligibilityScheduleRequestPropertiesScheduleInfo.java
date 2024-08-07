// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Schedule info of the role eligibility schedule.
 */
@Fluent
public final class RoleEligibilityScheduleRequestPropertiesScheduleInfo
    implements JsonSerializable<RoleEligibilityScheduleRequestPropertiesScheduleInfo> {
    /*
     * Start DateTime of the role eligibility schedule.
     */
    private OffsetDateTime startDateTime;

    /*
     * Expiration of the role eligibility schedule
     */
    private RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration expiration;

    /**
     * Creates an instance of RoleEligibilityScheduleRequestPropertiesScheduleInfo class.
     */
    public RoleEligibilityScheduleRequestPropertiesScheduleInfo() {
    }

    /**
     * Get the startDateTime property: Start DateTime of the role eligibility schedule.
     * 
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime property: Start DateTime of the role eligibility schedule.
     * 
     * @param startDateTime the startDateTime value to set.
     * @return the RoleEligibilityScheduleRequestPropertiesScheduleInfo object itself.
     */
    public RoleEligibilityScheduleRequestPropertiesScheduleInfo withStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the expiration property: Expiration of the role eligibility schedule.
     * 
     * @return the expiration value.
     */
    public RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration expiration() {
        return this.expiration;
    }

    /**
     * Set the expiration property: Expiration of the role eligibility schedule.
     * 
     * @param expiration the expiration value to set.
     * @return the RoleEligibilityScheduleRequestPropertiesScheduleInfo object itself.
     */
    public RoleEligibilityScheduleRequestPropertiesScheduleInfo
        withExpiration(RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (expiration() != null) {
            expiration().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("startDateTime",
            this.startDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startDateTime));
        jsonWriter.writeJsonField("expiration", this.expiration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoleEligibilityScheduleRequestPropertiesScheduleInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleEligibilityScheduleRequestPropertiesScheduleInfo if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RoleEligibilityScheduleRequestPropertiesScheduleInfo.
     */
    public static RoleEligibilityScheduleRequestPropertiesScheduleInfo fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            RoleEligibilityScheduleRequestPropertiesScheduleInfo deserializedRoleEligibilityScheduleRequestPropertiesScheduleInfo
                = new RoleEligibilityScheduleRequestPropertiesScheduleInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("startDateTime".equals(fieldName)) {
                    deserializedRoleEligibilityScheduleRequestPropertiesScheduleInfo.startDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("expiration".equals(fieldName)) {
                    deserializedRoleEligibilityScheduleRequestPropertiesScheduleInfo.expiration
                        = RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoleEligibilityScheduleRequestPropertiesScheduleInfo;
        });
    }
}
