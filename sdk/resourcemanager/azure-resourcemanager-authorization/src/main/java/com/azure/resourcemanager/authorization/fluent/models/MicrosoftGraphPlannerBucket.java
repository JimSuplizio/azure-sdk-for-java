// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * plannerBucket.
 */
@Fluent
public final class MicrosoftGraphPlannerBucket extends MicrosoftGraphEntity {
    /*
     * Name of the bucket.
     */
    private String name;

    /*
     * Hint used to order items of this type in a list view. The format is defined as outlined here.
     */
    private String orderHint;

    /*
     * Plan ID to which the bucket belongs.
     */
    private String planId;

    /*
     * Read-only. Nullable. The collection of tasks in the bucket.
     */
    private List<MicrosoftGraphPlannerTask> tasks;

    /*
     * plannerBucket
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphPlannerBucket class.
     */
    public MicrosoftGraphPlannerBucket() {
    }

    /**
     * Get the name property: Name of the bucket.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the bucket.
     * 
     * @param name the name value to set.
     * @return the MicrosoftGraphPlannerBucket object itself.
     */
    public MicrosoftGraphPlannerBucket withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the orderHint property: Hint used to order items of this type in a list view. The format is defined as
     * outlined here.
     * 
     * @return the orderHint value.
     */
    public String orderHint() {
        return this.orderHint;
    }

    /**
     * Set the orderHint property: Hint used to order items of this type in a list view. The format is defined as
     * outlined here.
     * 
     * @param orderHint the orderHint value to set.
     * @return the MicrosoftGraphPlannerBucket object itself.
     */
    public MicrosoftGraphPlannerBucket withOrderHint(String orderHint) {
        this.orderHint = orderHint;
        return this;
    }

    /**
     * Get the planId property: Plan ID to which the bucket belongs.
     * 
     * @return the planId value.
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Set the planId property: Plan ID to which the bucket belongs.
     * 
     * @param planId the planId value to set.
     * @return the MicrosoftGraphPlannerBucket object itself.
     */
    public MicrosoftGraphPlannerBucket withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get the tasks property: Read-only. Nullable. The collection of tasks in the bucket.
     * 
     * @return the tasks value.
     */
    public List<MicrosoftGraphPlannerTask> tasks() {
        return this.tasks;
    }

    /**
     * Set the tasks property: Read-only. Nullable. The collection of tasks in the bucket.
     * 
     * @param tasks the tasks value to set.
     * @return the MicrosoftGraphPlannerBucket object itself.
     */
    public MicrosoftGraphPlannerBucket withTasks(List<MicrosoftGraphPlannerTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    /**
     * Get the additionalProperties property: plannerBucket.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: plannerBucket.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPlannerBucket object itself.
     */
    public MicrosoftGraphPlannerBucket withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphPlannerBucket withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (tasks() != null) {
            tasks().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("orderHint", this.orderHint);
        jsonWriter.writeStringField("planId", this.planId);
        jsonWriter.writeArrayField("tasks", this.tasks, (writer, element) -> writer.writeJson(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphPlannerBucket from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphPlannerBucket if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphPlannerBucket.
     */
    public static MicrosoftGraphPlannerBucket fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphPlannerBucket deserializedMicrosoftGraphPlannerBucket = new MicrosoftGraphPlannerBucket();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphPlannerBucket.withId(reader.getString());
                } else if ("name".equals(fieldName)) {
                    deserializedMicrosoftGraphPlannerBucket.name = reader.getString();
                } else if ("orderHint".equals(fieldName)) {
                    deserializedMicrosoftGraphPlannerBucket.orderHint = reader.getString();
                } else if ("planId".equals(fieldName)) {
                    deserializedMicrosoftGraphPlannerBucket.planId = reader.getString();
                } else if ("tasks".equals(fieldName)) {
                    List<MicrosoftGraphPlannerTask> tasks
                        = reader.readArray(reader1 -> MicrosoftGraphPlannerTask.fromJson(reader1));
                    deserializedMicrosoftGraphPlannerBucket.tasks = tasks;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphPlannerBucket.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphPlannerBucket;
        });
    }
}
