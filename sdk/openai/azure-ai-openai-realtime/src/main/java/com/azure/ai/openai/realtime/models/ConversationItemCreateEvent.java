// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.realtime.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Send this event when adding an item to the conversation.
 */
@Fluent
public final class ConversationItemCreateEvent extends RealtimeClientEvent {

    /*
     * The type property.
     */
    @Generated
    private RealtimeClientEventType type = RealtimeClientEventType.CONVERSATION_ITEM_CREATE;

    /*
     * The ID of the preceding item after which the new item will be inserted.
     */
    @Generated
    private String previousItemId;

    /*
     * The item to add to the conversation.
     */
    @Generated
    private final RealtimeRequestItem item;

    /**
     * Creates an instance of ConversationItemCreateEvent class.
     *
     * @param item the item value to set.
     */
    @Generated
    public ConversationItemCreateEvent(RealtimeRequestItem item) {
        this.item = item;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public RealtimeClientEventType getType() {
        return this.type;
    }

    /**
     * Get the previousItemId property: The ID of the preceding item after which the new item will be inserted.
     *
     * @return the previousItemId value.
     */
    @Generated
    public String getPreviousItemId() {
        return this.previousItemId;
    }

    /**
     * Set the previousItemId property: The ID of the preceding item after which the new item will be inserted.
     *
     * @param previousItemId the previousItemId value to set.
     * @return the ConversationItemCreateEvent object itself.
     */
    @Generated
    public ConversationItemCreateEvent setPreviousItemId(String previousItemId) {
        this.previousItemId = previousItemId;
        return this;
    }

    /**
     * Get the item property: The item to add to the conversation.
     *
     * @return the item value.
     */
    @Generated
    public RealtimeRequestItem getItem() {
        return this.item;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public ConversationItemCreateEvent setEventId(String eventId) {
        super.setEventId(eventId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("event_id", getEventId());
        jsonWriter.writeJsonField("item", this.item);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("previous_item_id", this.previousItemId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConversationItemCreateEvent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConversationItemCreateEvent if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ConversationItemCreateEvent.
     */
    @Generated
    public static ConversationItemCreateEvent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String eventId = null;
            RealtimeRequestItem item = null;
            RealtimeClientEventType type = RealtimeClientEventType.CONVERSATION_ITEM_CREATE;
            String previousItemId = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("event_id".equals(fieldName)) {
                    eventId = reader.getString();
                } else if ("item".equals(fieldName)) {
                    item = RealtimeRequestItem.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = RealtimeClientEventType.fromString(reader.getString());
                } else if ("previous_item_id".equals(fieldName)) {
                    previousItemId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            ConversationItemCreateEvent deserializedConversationItemCreateEvent = new ConversationItemCreateEvent(item);
            deserializedConversationItemCreateEvent.setEventId(eventId);
            deserializedConversationItemCreateEvent.type = type;
            deserializedConversationItemCreateEvent.previousItemId = previousItemId;
            return deserializedConversationItemCreateEvent;
        });
    }
}
