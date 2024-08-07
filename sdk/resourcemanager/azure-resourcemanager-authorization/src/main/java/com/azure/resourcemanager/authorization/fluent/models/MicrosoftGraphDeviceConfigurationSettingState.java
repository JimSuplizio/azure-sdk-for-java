// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * deviceConfigurationSettingState
 * 
 * Device Configuration Setting State for a given device.
 */
@Fluent
public final class MicrosoftGraphDeviceConfigurationSettingState
    implements JsonSerializable<MicrosoftGraphDeviceConfigurationSettingState> {
    /*
     * Current value of setting on device
     */
    private String currentValue;

    /*
     * Error code for the setting
     */
    private Long errorCode;

    /*
     * Error description
     */
    private String errorDescription;

    /*
     * Name of setting instance that is being reported.
     */
    private String instanceDisplayName;

    /*
     * The setting that is being reported
     */
    private String setting;

    /*
     * Localized/user friendly setting name that is being reported
     */
    private String settingName;

    /*
     * Contributing policies
     */
    private List<MicrosoftGraphSettingSource> sources;

    /*
     * complianceStatus
     */
    private MicrosoftGraphComplianceStatus state;

    /*
     * UserEmail
     */
    private String userEmail;

    /*
     * UserId
     */
    private String userId;

    /*
     * UserName
     */
    private String username;

    /*
     * UserPrincipalName.
     */
    private String userPrincipalName;

    /*
     * Device Configuration Setting State for a given device.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphDeviceConfigurationSettingState class.
     */
    public MicrosoftGraphDeviceConfigurationSettingState() {
    }

    /**
     * Get the currentValue property: Current value of setting on device.
     * 
     * @return the currentValue value.
     */
    public String currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: Current value of setting on device.
     * 
     * @param currentValue the currentValue value to set.
     * @return the MicrosoftGraphDeviceConfigurationSettingState object itself.
     */
    public MicrosoftGraphDeviceConfigurationSettingState withCurrentValue(String currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the errorCode property: Error code for the setting.
     * 
     * @return the errorCode value.
     */
    public Long errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: Error code for the setting.
     * 
     * @param errorCode the errorCode value to set.
     * @return the MicrosoftGraphDeviceConfigurationSettingState object itself.
     */
    public MicrosoftGraphDeviceConfigurationSettingState withErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorDescription property: Error description.
     * 
     * @return the errorDescription value.
     */
    public String errorDescription() {
        return this.errorDescription;
    }

    /**
     * Set the errorDescription property: Error description.
     * 
     * @param errorDescription the errorDescription value to set.
     * @return the MicrosoftGraphDeviceConfigurationSettingState object itself.
     */
    public MicrosoftGraphDeviceConfigurationSettingState withErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }

    /**
     * Get the instanceDisplayName property: Name of setting instance that is being reported.
     * 
     * @return the instanceDisplayName value.
     */
    public String instanceDisplayName() {
        return this.instanceDisplayName;
    }

    /**
     * Set the instanceDisplayName property: Name of setting instance that is being reported.
     * 
     * @param instanceDisplayName the instanceDisplayName value to set.
     * @return the MicrosoftGraphDeviceConfigurationSettingState object itself.
     */
    public MicrosoftGraphDeviceConfigurationSettingState withInstanceDisplayName(String instanceDisplayName) {
        this.instanceDisplayName = instanceDisplayName;
        return this;
    }

    /**
     * Get the setting property: The setting that is being reported.
     * 
     * @return the setting value.
     */
    public String setting() {
        return this.setting;
    }

    /**
     * Set the setting property: The setting that is being reported.
     * 
     * @param setting the setting value to set.
     * @return the MicrosoftGraphDeviceConfigurationSettingState object itself.
     */
    public MicrosoftGraphDeviceConfigurationSettingState withSetting(String setting) {
        this.setting = setting;
        return this;
    }

    /**
     * Get the settingName property: Localized/user friendly setting name that is being reported.
     * 
     * @return the settingName value.
     */
    public String settingName() {
        return this.settingName;
    }

    /**
     * Set the settingName property: Localized/user friendly setting name that is being reported.
     * 
     * @param settingName the settingName value to set.
     * @return the MicrosoftGraphDeviceConfigurationSettingState object itself.
     */
    public MicrosoftGraphDeviceConfigurationSettingState withSettingName(String settingName) {
        this.settingName = settingName;
        return this;
    }

    /**
     * Get the sources property: Contributing policies.
     * 
     * @return the sources value.
     */
    public List<MicrosoftGraphSettingSource> sources() {
        return this.sources;
    }

    /**
     * Set the sources property: Contributing policies.
     * 
     * @param sources the sources value to set.
     * @return the MicrosoftGraphDeviceConfigurationSettingState object itself.
     */
    public MicrosoftGraphDeviceConfigurationSettingState withSources(List<MicrosoftGraphSettingSource> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * Get the state property: complianceStatus.
     * 
     * @return the state value.
     */
    public MicrosoftGraphComplianceStatus state() {
        return this.state;
    }

    /**
     * Set the state property: complianceStatus.
     * 
     * @param state the state value to set.
     * @return the MicrosoftGraphDeviceConfigurationSettingState object itself.
     */
    public MicrosoftGraphDeviceConfigurationSettingState withState(MicrosoftGraphComplianceStatus state) {
        this.state = state;
        return this;
    }

    /**
     * Get the userEmail property: UserEmail.
     * 
     * @return the userEmail value.
     */
    public String userEmail() {
        return this.userEmail;
    }

    /**
     * Set the userEmail property: UserEmail.
     * 
     * @param userEmail the userEmail value to set.
     * @return the MicrosoftGraphDeviceConfigurationSettingState object itself.
     */
    public MicrosoftGraphDeviceConfigurationSettingState withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    /**
     * Get the userId property: UserId.
     * 
     * @return the userId value.
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Set the userId property: UserId.
     * 
     * @param userId the userId value to set.
     * @return the MicrosoftGraphDeviceConfigurationSettingState object itself.
     */
    public MicrosoftGraphDeviceConfigurationSettingState withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the username property: UserName.
     * 
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: UserName.
     * 
     * @param username the username value to set.
     * @return the MicrosoftGraphDeviceConfigurationSettingState object itself.
     */
    public MicrosoftGraphDeviceConfigurationSettingState withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the userPrincipalName property: UserPrincipalName.
     * 
     * @return the userPrincipalName value.
     */
    public String userPrincipalName() {
        return this.userPrincipalName;
    }

    /**
     * Set the userPrincipalName property: UserPrincipalName.
     * 
     * @param userPrincipalName the userPrincipalName value to set.
     * @return the MicrosoftGraphDeviceConfigurationSettingState object itself.
     */
    public MicrosoftGraphDeviceConfigurationSettingState withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

    /**
     * Get the additionalProperties property: Device Configuration Setting State for a given device.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Device Configuration Setting State for a given device.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDeviceConfigurationSettingState object itself.
     */
    public MicrosoftGraphDeviceConfigurationSettingState
        withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sources() != null) {
            sources().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("currentValue", this.currentValue);
        jsonWriter.writeNumberField("errorCode", this.errorCode);
        jsonWriter.writeStringField("errorDescription", this.errorDescription);
        jsonWriter.writeStringField("instanceDisplayName", this.instanceDisplayName);
        jsonWriter.writeStringField("setting", this.setting);
        jsonWriter.writeStringField("settingName", this.settingName);
        jsonWriter.writeArrayField("sources", this.sources, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        jsonWriter.writeStringField("userEmail", this.userEmail);
        jsonWriter.writeStringField("userId", this.userId);
        jsonWriter.writeStringField("userName", this.username);
        jsonWriter.writeStringField("userPrincipalName", this.userPrincipalName);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphDeviceConfigurationSettingState from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphDeviceConfigurationSettingState if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphDeviceConfigurationSettingState.
     */
    public static MicrosoftGraphDeviceConfigurationSettingState fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphDeviceConfigurationSettingState deserializedMicrosoftGraphDeviceConfigurationSettingState
                = new MicrosoftGraphDeviceConfigurationSettingState();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("currentValue".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceConfigurationSettingState.currentValue = reader.getString();
                } else if ("errorCode".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceConfigurationSettingState.errorCode
                        = reader.getNullable(JsonReader::getLong);
                } else if ("errorDescription".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceConfigurationSettingState.errorDescription = reader.getString();
                } else if ("instanceDisplayName".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceConfigurationSettingState.instanceDisplayName = reader.getString();
                } else if ("setting".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceConfigurationSettingState.setting = reader.getString();
                } else if ("settingName".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceConfigurationSettingState.settingName = reader.getString();
                } else if ("sources".equals(fieldName)) {
                    List<MicrosoftGraphSettingSource> sources
                        = reader.readArray(reader1 -> MicrosoftGraphSettingSource.fromJson(reader1));
                    deserializedMicrosoftGraphDeviceConfigurationSettingState.sources = sources;
                } else if ("state".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceConfigurationSettingState.state
                        = MicrosoftGraphComplianceStatus.fromString(reader.getString());
                } else if ("userEmail".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceConfigurationSettingState.userEmail = reader.getString();
                } else if ("userId".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceConfigurationSettingState.userId = reader.getString();
                } else if ("userName".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceConfigurationSettingState.username = reader.getString();
                } else if ("userPrincipalName".equals(fieldName)) {
                    deserializedMicrosoftGraphDeviceConfigurationSettingState.userPrincipalName = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphDeviceConfigurationSettingState.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphDeviceConfigurationSettingState;
        });
    }
}
