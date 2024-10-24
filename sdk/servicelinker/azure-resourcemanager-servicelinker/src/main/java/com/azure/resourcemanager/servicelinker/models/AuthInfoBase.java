// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The authentication info.
 */
@Fluent
public class AuthInfoBase implements JsonSerializable<AuthInfoBase> {
    /*
     * The authentication type.
     */
    private AuthType authType = AuthType.fromString("AuthInfoBase");

    /*
     * Optional. Indicates how to configure authentication. If optInAllAuth, service linker configures authentication
     * such as enabling identity on source resource and granting RBAC roles. If optOutAllAuth, opt out authentication
     * setup. Default is optInAllAuth.
     */
    private AuthMode authMode;

    /**
     * Creates an instance of AuthInfoBase class.
     */
    public AuthInfoBase() {
    }

    /**
     * Get the authType property: The authentication type.
     * 
     * @return the authType value.
     */
    public AuthType authType() {
        return this.authType;
    }

    /**
     * Get the authMode property: Optional. Indicates how to configure authentication. If optInAllAuth, service linker
     * configures authentication such as enabling identity on source resource and granting RBAC roles. If optOutAllAuth,
     * opt out authentication setup. Default is optInAllAuth.
     * 
     * @return the authMode value.
     */
    public AuthMode authMode() {
        return this.authMode;
    }

    /**
     * Set the authMode property: Optional. Indicates how to configure authentication. If optInAllAuth, service linker
     * configures authentication such as enabling identity on source resource and granting RBAC roles. If optOutAllAuth,
     * opt out authentication setup. Default is optInAllAuth.
     * 
     * @param authMode the authMode value to set.
     * @return the AuthInfoBase object itself.
     */
    public AuthInfoBase withAuthMode(AuthMode authMode) {
        this.authMode = authMode;
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
        jsonWriter.writeStringField("authType", this.authType == null ? null : this.authType.toString());
        jsonWriter.writeStringField("authMode", this.authMode == null ? null : this.authMode.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AuthInfoBase from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuthInfoBase if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AuthInfoBase.
     */
    public static AuthInfoBase fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("authType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("accessKey".equals(discriminatorValue)) {
                    return AccessKeyInfoBase.fromJson(readerToUse.reset());
                } else if ("secret".equals(discriminatorValue)) {
                    return SecretAuthInfo.fromJson(readerToUse.reset());
                } else if ("userAssignedIdentity".equals(discriminatorValue)) {
                    return UserAssignedIdentityAuthInfo.fromJson(readerToUse.reset());
                } else if ("systemAssignedIdentity".equals(discriminatorValue)) {
                    return SystemAssignedIdentityAuthInfo.fromJson(readerToUse.reset());
                } else if ("servicePrincipalSecret".equals(discriminatorValue)) {
                    return ServicePrincipalSecretAuthInfo.fromJson(readerToUse.reset());
                } else if ("servicePrincipalCertificate".equals(discriminatorValue)) {
                    return ServicePrincipalCertificateAuthInfo.fromJson(readerToUse.reset());
                } else if ("userAccount".equals(discriminatorValue)) {
                    return UserAccountAuthInfo.fromJson(readerToUse.reset());
                } else if ("easyAuthMicrosoftEntraID".equals(discriminatorValue)) {
                    return EasyAuthMicrosoftEntraIdAuthInfo.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static AuthInfoBase fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AuthInfoBase deserializedAuthInfoBase = new AuthInfoBase();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("authType".equals(fieldName)) {
                    deserializedAuthInfoBase.authType = AuthType.fromString(reader.getString());
                } else if ("authMode".equals(fieldName)) {
                    deserializedAuthInfoBase.authMode = AuthMode.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAuthInfoBase;
        });
    }
}
