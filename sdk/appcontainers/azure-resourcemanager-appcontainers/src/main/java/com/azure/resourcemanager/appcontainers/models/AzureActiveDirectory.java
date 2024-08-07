// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The configuration settings of the Azure Active directory provider.
 */
@Fluent
public final class AzureActiveDirectory implements JsonSerializable<AzureActiveDirectory> {
    /*
     * <code>false</code> if the Azure Active Directory provider should not be enabled despite the set registration;
     * otherwise, <code>true</code>.
     */
    private Boolean enabled;

    /*
     * The configuration settings of the Azure Active Directory app registration.
     */
    private AzureActiveDirectoryRegistration registration;

    /*
     * The configuration settings of the Azure Active Directory login flow.
     */
    private AzureActiveDirectoryLogin login;

    /*
     * The configuration settings of the Azure Active Directory token validation flow.
     */
    private AzureActiveDirectoryValidation validation;

    /*
     * Gets a value indicating whether the Azure AD configuration was auto-provisioned using 1st party tooling.
     * This is an internal flag primarily intended to support the Azure Management Portal. Users should not
     * read or write to this property.
     */
    private Boolean isAutoProvisioned;

    /**
     * Creates an instance of AzureActiveDirectory class.
     */
    public AzureActiveDirectory() {
    }

    /**
     * Get the enabled property: &lt;code&gt;false&lt;/code&gt; if the Azure Active Directory provider should not be
     * enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: &lt;code&gt;false&lt;/code&gt; if the Azure Active Directory provider should not be
     * enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     * @param enabled the enabled value to set.
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the registration property: The configuration settings of the Azure Active Directory app registration.
     * 
     * @return the registration value.
     */
    public AzureActiveDirectoryRegistration registration() {
        return this.registration;
    }

    /**
     * Set the registration property: The configuration settings of the Azure Active Directory app registration.
     * 
     * @param registration the registration value to set.
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withRegistration(AzureActiveDirectoryRegistration registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Get the login property: The configuration settings of the Azure Active Directory login flow.
     * 
     * @return the login value.
     */
    public AzureActiveDirectoryLogin login() {
        return this.login;
    }

    /**
     * Set the login property: The configuration settings of the Azure Active Directory login flow.
     * 
     * @param login the login value to set.
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withLogin(AzureActiveDirectoryLogin login) {
        this.login = login;
        return this;
    }

    /**
     * Get the validation property: The configuration settings of the Azure Active Directory token validation flow.
     * 
     * @return the validation value.
     */
    public AzureActiveDirectoryValidation validation() {
        return this.validation;
    }

    /**
     * Set the validation property: The configuration settings of the Azure Active Directory token validation flow.
     * 
     * @param validation the validation value to set.
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withValidation(AzureActiveDirectoryValidation validation) {
        this.validation = validation;
        return this;
    }

    /**
     * Get the isAutoProvisioned property: Gets a value indicating whether the Azure AD configuration was
     * auto-provisioned using 1st party tooling.
     * This is an internal flag primarily intended to support the Azure Management Portal. Users should not
     * read or write to this property.
     * 
     * @return the isAutoProvisioned value.
     */
    public Boolean isAutoProvisioned() {
        return this.isAutoProvisioned;
    }

    /**
     * Set the isAutoProvisioned property: Gets a value indicating whether the Azure AD configuration was
     * auto-provisioned using 1st party tooling.
     * This is an internal flag primarily intended to support the Azure Management Portal. Users should not
     * read or write to this property.
     * 
     * @param isAutoProvisioned the isAutoProvisioned value to set.
     * @return the AzureActiveDirectory object itself.
     */
    public AzureActiveDirectory withIsAutoProvisioned(Boolean isAutoProvisioned) {
        this.isAutoProvisioned = isAutoProvisioned;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (registration() != null) {
            registration().validate();
        }
        if (login() != null) {
            login().validate();
        }
        if (validation() != null) {
            validation().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeJsonField("registration", this.registration);
        jsonWriter.writeJsonField("login", this.login);
        jsonWriter.writeJsonField("validation", this.validation);
        jsonWriter.writeBooleanField("isAutoProvisioned", this.isAutoProvisioned);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureActiveDirectory from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureActiveDirectory if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureActiveDirectory.
     */
    public static AzureActiveDirectory fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureActiveDirectory deserializedAzureActiveDirectory = new AzureActiveDirectory();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedAzureActiveDirectory.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("registration".equals(fieldName)) {
                    deserializedAzureActiveDirectory.registration = AzureActiveDirectoryRegistration.fromJson(reader);
                } else if ("login".equals(fieldName)) {
                    deserializedAzureActiveDirectory.login = AzureActiveDirectoryLogin.fromJson(reader);
                } else if ("validation".equals(fieldName)) {
                    deserializedAzureActiveDirectory.validation = AzureActiveDirectoryValidation.fromJson(reader);
                } else if ("isAutoProvisioned".equals(fieldName)) {
                    deserializedAzureActiveDirectory.isAutoProvisioned = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureActiveDirectory;
        });
    }
}
