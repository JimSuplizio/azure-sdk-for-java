// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ManagedHsmLifetimeAction model.
 */
@Fluent
public final class ManagedHsmLifetimeAction implements JsonSerializable<ManagedHsmLifetimeAction> {
    /*
     * The trigger of key rotation policy lifetimeAction.
     */
    private ManagedHsmTrigger trigger;

    /*
     * The action of key rotation policy lifetimeAction.
     */
    private ManagedHsmAction action;

    /**
     * Creates an instance of ManagedHsmLifetimeAction class.
     */
    public ManagedHsmLifetimeAction() {
    }

    /**
     * Get the trigger property: The trigger of key rotation policy lifetimeAction.
     * 
     * @return the trigger value.
     */
    public ManagedHsmTrigger trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: The trigger of key rotation policy lifetimeAction.
     * 
     * @param trigger the trigger value to set.
     * @return the ManagedHsmLifetimeAction object itself.
     */
    public ManagedHsmLifetimeAction withTrigger(ManagedHsmTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Get the action property: The action of key rotation policy lifetimeAction.
     * 
     * @return the action value.
     */
    public ManagedHsmAction action() {
        return this.action;
    }

    /**
     * Set the action property: The action of key rotation policy lifetimeAction.
     * 
     * @param action the action value to set.
     * @return the ManagedHsmLifetimeAction object itself.
     */
    public ManagedHsmLifetimeAction withAction(ManagedHsmAction action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (trigger() != null) {
            trigger().validate();
        }
        if (action() != null) {
            action().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("trigger", this.trigger);
        jsonWriter.writeJsonField("action", this.action);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedHsmLifetimeAction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedHsmLifetimeAction if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedHsmLifetimeAction.
     */
    public static ManagedHsmLifetimeAction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedHsmLifetimeAction deserializedManagedHsmLifetimeAction = new ManagedHsmLifetimeAction();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("trigger".equals(fieldName)) {
                    deserializedManagedHsmLifetimeAction.trigger = ManagedHsmTrigger.fromJson(reader);
                } else if ("action".equals(fieldName)) {
                    deserializedManagedHsmLifetimeAction.action = ManagedHsmAction.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedHsmLifetimeAction;
        });
    }
}
