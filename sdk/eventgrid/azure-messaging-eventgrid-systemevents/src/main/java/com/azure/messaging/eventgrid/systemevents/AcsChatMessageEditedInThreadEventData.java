// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.Communication.ChatMessageEditedInThread event.
 */
@Immutable
public final class AcsChatMessageEditedInThreadEventData extends AcsChatMessageEventInThreadBaseProperties {
    /*
     * The body of the chat message
     */
    @Generated
    private String messageBody;

    /*
     * The chat message metadata
     */
    @Generated
    private final Map<String, String> metadata;

    /*
     * The time at which the message was edited
     */
    @Generated
    private final OffsetDateTime editTime;

    /*
     * The version of the message
     */
    @Generated
    private Long version;

    /*
     * The type of the message
     */
    @Generated
    private String type;

    /*
     * The display name of the sender
     */
    @Generated
    private String senderDisplayName;

    /*
     * The chat message id
     */
    @Generated
    private String messageId;

    /*
     * The chat thread id
     */
    @Generated
    private String threadId;

    /*
     * The transaction id will be used as co-relation vector
     */
    @Generated
    private String transactionId;

    /**
     * Creates an instance of AcsChatMessageEditedInThreadEventData class.
     * 
     * @param senderCommunicationIdentifier the senderCommunicationIdentifier value to set.
     * @param composeTime the composeTime value to set.
     * @param metadata the metadata value to set.
     * @param editTime the editTime value to set.
     */
    @Generated
    private AcsChatMessageEditedInThreadEventData(CommunicationIdentifierModel senderCommunicationIdentifier,
        OffsetDateTime composeTime, Map<String, String> metadata, OffsetDateTime editTime) {
        super(senderCommunicationIdentifier, composeTime);
        this.metadata = metadata;
        this.editTime = editTime;
    }

    /**
     * Get the messageBody property: The body of the chat message.
     * 
     * @return the messageBody value.
     */
    @Generated
    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * Get the metadata property: The chat message metadata.
     * 
     * @return the metadata value.
     */
    @Generated
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Get the editTime property: The time at which the message was edited.
     * 
     * @return the editTime value.
     */
    @Generated
    public OffsetDateTime getEditTime() {
        return this.editTime;
    }

    /**
     * Get the version property: The version of the message.
     * 
     * @return the version value.
     */
    @Generated
    @Override
    public Long getVersion() {
        return this.version;
    }

    /**
     * Get the type property: The type of the message.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the senderDisplayName property: The display name of the sender.
     * 
     * @return the senderDisplayName value.
     */
    @Generated
    @Override
    public String getSenderDisplayName() {
        return this.senderDisplayName;
    }

    /**
     * Get the messageId property: The chat message id.
     * 
     * @return the messageId value.
     */
    @Generated
    @Override
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Get the threadId property: The chat thread id.
     * 
     * @return the threadId value.
     */
    @Generated
    @Override
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * Get the transactionId property: The transaction id will be used as co-relation vector.
     * 
     * @return the transactionId value.
     */
    @Generated
    @Override
    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("senderCommunicationIdentifier", getSenderCommunicationIdentifier());
        jsonWriter.writeStringField("composeTime",
            getComposeTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getComposeTime()));
        jsonWriter.writeStringField("transactionId", getTransactionId());
        jsonWriter.writeStringField("threadId", getThreadId());
        jsonWriter.writeStringField("messageId", getMessageId());
        jsonWriter.writeStringField("senderDisplayName", getSenderDisplayName());
        jsonWriter.writeStringField("type", getType());
        jsonWriter.writeNumberField("version", getVersion());
        jsonWriter.writeMapField("metadata", this.metadata, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("editTime",
            this.editTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.editTime));
        jsonWriter.writeStringField("messageBody", this.messageBody);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsChatMessageEditedInThreadEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsChatMessageEditedInThreadEventData if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AcsChatMessageEditedInThreadEventData.
     */
    @Generated
    public static AcsChatMessageEditedInThreadEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommunicationIdentifierModel senderCommunicationIdentifier = null;
            OffsetDateTime composeTime = null;
            String transactionId = null;
            String threadId = null;
            String messageId = null;
            String senderDisplayName = null;
            String type = null;
            Long version = null;
            Map<String, String> metadata = null;
            OffsetDateTime editTime = null;
            String messageBody = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("senderCommunicationIdentifier".equals(fieldName)) {
                    senderCommunicationIdentifier = CommunicationIdentifierModel.fromJson(reader);
                } else if ("composeTime".equals(fieldName)) {
                    composeTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("transactionId".equals(fieldName)) {
                    transactionId = reader.getString();
                } else if ("threadId".equals(fieldName)) {
                    threadId = reader.getString();
                } else if ("messageId".equals(fieldName)) {
                    messageId = reader.getString();
                } else if ("senderDisplayName".equals(fieldName)) {
                    senderDisplayName = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else if ("version".equals(fieldName)) {
                    version = reader.getNullable(JsonReader::getLong);
                } else if ("metadata".equals(fieldName)) {
                    metadata = reader.readMap(reader1 -> reader1.getString());
                } else if ("editTime".equals(fieldName)) {
                    editTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("messageBody".equals(fieldName)) {
                    messageBody = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            AcsChatMessageEditedInThreadEventData deserializedAcsChatMessageEditedInThreadEventData
                = new AcsChatMessageEditedInThreadEventData(senderCommunicationIdentifier, composeTime, metadata,
                    editTime);
            deserializedAcsChatMessageEditedInThreadEventData.transactionId = transactionId;
            deserializedAcsChatMessageEditedInThreadEventData.threadId = threadId;
            deserializedAcsChatMessageEditedInThreadEventData.messageId = messageId;
            deserializedAcsChatMessageEditedInThreadEventData.senderDisplayName = senderDisplayName;
            deserializedAcsChatMessageEditedInThreadEventData.type = type;
            deserializedAcsChatMessageEditedInThreadEventData.version = version;
            deserializedAcsChatMessageEditedInThreadEventData.messageBody = messageBody;

            return deserializedAcsChatMessageEditedInThreadEventData;
        });
    }
}
