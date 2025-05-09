// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The parameters to provide for the Microsoft Teams channel.
 */
@Fluent
public final class SkypeChannelProperties implements JsonSerializable<SkypeChannelProperties> {
    /*
     * Enable messaging for Skype channel
     */
    private Boolean enableMessaging;

    /*
     * Enable media cards for Skype channel
     */
    private Boolean enableMediaCards;

    /*
     * Enable video for Skype channel
     */
    private Boolean enableVideo;

    /*
     * Enable calling for Skype channel
     */
    private Boolean enableCalling;

    /*
     * Enable screen sharing for Skype channel
     */
    private Boolean enableScreenSharing;

    /*
     * Enable groups for Skype channel
     */
    private Boolean enableGroups;

    /*
     * Group mode for Skype channel
     */
    private String groupsMode;

    /*
     * Calling web hook for Skype channel
     */
    private String callingWebhook;

    /*
     * Incoming call route for Skype channel
     */
    private String incomingCallRoute;

    /*
     * Whether this channel is enabled for the bot
     */
    private boolean isEnabled;

    /**
     * Creates an instance of SkypeChannelProperties class.
     */
    public SkypeChannelProperties() {
    }

    /**
     * Get the enableMessaging property: Enable messaging for Skype channel.
     * 
     * @return the enableMessaging value.
     */
    public Boolean enableMessaging() {
        return this.enableMessaging;
    }

    /**
     * Set the enableMessaging property: Enable messaging for Skype channel.
     * 
     * @param enableMessaging the enableMessaging value to set.
     * @return the SkypeChannelProperties object itself.
     */
    public SkypeChannelProperties withEnableMessaging(Boolean enableMessaging) {
        this.enableMessaging = enableMessaging;
        return this;
    }

    /**
     * Get the enableMediaCards property: Enable media cards for Skype channel.
     * 
     * @return the enableMediaCards value.
     */
    public Boolean enableMediaCards() {
        return this.enableMediaCards;
    }

    /**
     * Set the enableMediaCards property: Enable media cards for Skype channel.
     * 
     * @param enableMediaCards the enableMediaCards value to set.
     * @return the SkypeChannelProperties object itself.
     */
    public SkypeChannelProperties withEnableMediaCards(Boolean enableMediaCards) {
        this.enableMediaCards = enableMediaCards;
        return this;
    }

    /**
     * Get the enableVideo property: Enable video for Skype channel.
     * 
     * @return the enableVideo value.
     */
    public Boolean enableVideo() {
        return this.enableVideo;
    }

    /**
     * Set the enableVideo property: Enable video for Skype channel.
     * 
     * @param enableVideo the enableVideo value to set.
     * @return the SkypeChannelProperties object itself.
     */
    public SkypeChannelProperties withEnableVideo(Boolean enableVideo) {
        this.enableVideo = enableVideo;
        return this;
    }

    /**
     * Get the enableCalling property: Enable calling for Skype channel.
     * 
     * @return the enableCalling value.
     */
    public Boolean enableCalling() {
        return this.enableCalling;
    }

    /**
     * Set the enableCalling property: Enable calling for Skype channel.
     * 
     * @param enableCalling the enableCalling value to set.
     * @return the SkypeChannelProperties object itself.
     */
    public SkypeChannelProperties withEnableCalling(Boolean enableCalling) {
        this.enableCalling = enableCalling;
        return this;
    }

    /**
     * Get the enableScreenSharing property: Enable screen sharing for Skype channel.
     * 
     * @return the enableScreenSharing value.
     */
    public Boolean enableScreenSharing() {
        return this.enableScreenSharing;
    }

    /**
     * Set the enableScreenSharing property: Enable screen sharing for Skype channel.
     * 
     * @param enableScreenSharing the enableScreenSharing value to set.
     * @return the SkypeChannelProperties object itself.
     */
    public SkypeChannelProperties withEnableScreenSharing(Boolean enableScreenSharing) {
        this.enableScreenSharing = enableScreenSharing;
        return this;
    }

    /**
     * Get the enableGroups property: Enable groups for Skype channel.
     * 
     * @return the enableGroups value.
     */
    public Boolean enableGroups() {
        return this.enableGroups;
    }

    /**
     * Set the enableGroups property: Enable groups for Skype channel.
     * 
     * @param enableGroups the enableGroups value to set.
     * @return the SkypeChannelProperties object itself.
     */
    public SkypeChannelProperties withEnableGroups(Boolean enableGroups) {
        this.enableGroups = enableGroups;
        return this;
    }

    /**
     * Get the groupsMode property: Group mode for Skype channel.
     * 
     * @return the groupsMode value.
     */
    public String groupsMode() {
        return this.groupsMode;
    }

    /**
     * Set the groupsMode property: Group mode for Skype channel.
     * 
     * @param groupsMode the groupsMode value to set.
     * @return the SkypeChannelProperties object itself.
     */
    public SkypeChannelProperties withGroupsMode(String groupsMode) {
        this.groupsMode = groupsMode;
        return this;
    }

    /**
     * Get the callingWebhook property: Calling web hook for Skype channel.
     * 
     * @return the callingWebhook value.
     */
    public String callingWebhook() {
        return this.callingWebhook;
    }

    /**
     * Set the callingWebhook property: Calling web hook for Skype channel.
     * 
     * @param callingWebhook the callingWebhook value to set.
     * @return the SkypeChannelProperties object itself.
     */
    public SkypeChannelProperties withCallingWebhook(String callingWebhook) {
        this.callingWebhook = callingWebhook;
        return this;
    }

    /**
     * Get the incomingCallRoute property: Incoming call route for Skype channel.
     * 
     * @return the incomingCallRoute value.
     */
    public String incomingCallRoute() {
        return this.incomingCallRoute;
    }

    /**
     * Set the incomingCallRoute property: Incoming call route for Skype channel.
     * 
     * @param incomingCallRoute the incomingCallRoute value to set.
     * @return the SkypeChannelProperties object itself.
     */
    public SkypeChannelProperties withIncomingCallRoute(String incomingCallRoute) {
        this.incomingCallRoute = incomingCallRoute;
        return this;
    }

    /**
     * Get the isEnabled property: Whether this channel is enabled for the bot.
     * 
     * @return the isEnabled value.
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Whether this channel is enabled for the bot.
     * 
     * @param isEnabled the isEnabled value to set.
     * @return the SkypeChannelProperties object itself.
     */
    public SkypeChannelProperties withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
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
        jsonWriter.writeBooleanField("isEnabled", this.isEnabled);
        jsonWriter.writeBooleanField("enableMessaging", this.enableMessaging);
        jsonWriter.writeBooleanField("enableMediaCards", this.enableMediaCards);
        jsonWriter.writeBooleanField("enableVideo", this.enableVideo);
        jsonWriter.writeBooleanField("enableCalling", this.enableCalling);
        jsonWriter.writeBooleanField("enableScreenSharing", this.enableScreenSharing);
        jsonWriter.writeBooleanField("enableGroups", this.enableGroups);
        jsonWriter.writeStringField("groupsMode", this.groupsMode);
        jsonWriter.writeStringField("callingWebHook", this.callingWebhook);
        jsonWriter.writeStringField("incomingCallRoute", this.incomingCallRoute);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SkypeChannelProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SkypeChannelProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SkypeChannelProperties.
     */
    public static SkypeChannelProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SkypeChannelProperties deserializedSkypeChannelProperties = new SkypeChannelProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("isEnabled".equals(fieldName)) {
                    deserializedSkypeChannelProperties.isEnabled = reader.getBoolean();
                } else if ("enableMessaging".equals(fieldName)) {
                    deserializedSkypeChannelProperties.enableMessaging = reader.getNullable(JsonReader::getBoolean);
                } else if ("enableMediaCards".equals(fieldName)) {
                    deserializedSkypeChannelProperties.enableMediaCards = reader.getNullable(JsonReader::getBoolean);
                } else if ("enableVideo".equals(fieldName)) {
                    deserializedSkypeChannelProperties.enableVideo = reader.getNullable(JsonReader::getBoolean);
                } else if ("enableCalling".equals(fieldName)) {
                    deserializedSkypeChannelProperties.enableCalling = reader.getNullable(JsonReader::getBoolean);
                } else if ("enableScreenSharing".equals(fieldName)) {
                    deserializedSkypeChannelProperties.enableScreenSharing = reader.getNullable(JsonReader::getBoolean);
                } else if ("enableGroups".equals(fieldName)) {
                    deserializedSkypeChannelProperties.enableGroups = reader.getNullable(JsonReader::getBoolean);
                } else if ("groupsMode".equals(fieldName)) {
                    deserializedSkypeChannelProperties.groupsMode = reader.getString();
                } else if ("callingWebHook".equals(fieldName)) {
                    deserializedSkypeChannelProperties.callingWebhook = reader.getString();
                } else if ("incomingCallRoute".equals(fieldName)) {
                    deserializedSkypeChannelProperties.incomingCallRoute = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSkypeChannelProperties;
        });
    }
}
