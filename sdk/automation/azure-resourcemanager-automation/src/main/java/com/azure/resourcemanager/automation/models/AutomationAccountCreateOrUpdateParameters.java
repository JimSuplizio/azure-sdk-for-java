// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.automation.fluent.models.AutomationAccountCreateOrUpdateProperties;
import java.io.IOException;
import java.util.Map;

/**
 * The parameters supplied to the create or update automation account operation.
 */
@Fluent
public final class AutomationAccountCreateOrUpdateParameters
    implements JsonSerializable<AutomationAccountCreateOrUpdateParameters> {
    /*
     * Gets or sets account create or update properties.
     */
    private AutomationAccountCreateOrUpdateProperties innerProperties;

    /*
     * Gets or sets name of the resource.
     */
    private String name;

    /*
     * Gets or sets the location of the resource.
     */
    private String location;

    /*
     * Sets the identity property for automation account
     */
    private Identity identity;

    /*
     * Gets or sets the tags attached to the resource.
     */
    private Map<String, String> tags;

    /**
     * Creates an instance of AutomationAccountCreateOrUpdateParameters class.
     */
    public AutomationAccountCreateOrUpdateParameters() {
    }

    /**
     * Get the innerProperties property: Gets or sets account create or update properties.
     * 
     * @return the innerProperties value.
     */
    private AutomationAccountCreateOrUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Gets or sets name of the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets name of the resource.
     * 
     * @param name the name value to set.
     * @return the AutomationAccountCreateOrUpdateParameters object itself.
     */
    public AutomationAccountCreateOrUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the location property: Gets or sets the location of the resource.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Gets or sets the location of the resource.
     * 
     * @param location the location value to set.
     * @return the AutomationAccountCreateOrUpdateParameters object itself.
     */
    public AutomationAccountCreateOrUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the identity property: Sets the identity property for automation account.
     * 
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Sets the identity property for automation account.
     * 
     * @param identity the identity value to set.
     * @return the AutomationAccountCreateOrUpdateParameters object itself.
     */
    public AutomationAccountCreateOrUpdateParameters withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the tags property: Gets or sets the tags attached to the resource.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets the tags attached to the resource.
     * 
     * @param tags the tags value to set.
     * @return the AutomationAccountCreateOrUpdateParameters object itself.
     */
    public AutomationAccountCreateOrUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: Gets or sets account SKU.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: Gets or sets account SKU.
     * 
     * @param sku the sku value to set.
     * @return the AutomationAccountCreateOrUpdateParameters object itself.
     */
    public AutomationAccountCreateOrUpdateParameters withSku(Sku sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutomationAccountCreateOrUpdateProperties();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Get the encryption property: Set the encryption properties for the automation account.
     * 
     * @return the encryption value.
     */
    public EncryptionProperties encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Set the encryption properties for the automation account.
     * 
     * @param encryption the encryption value to set.
     * @return the AutomationAccountCreateOrUpdateParameters object itself.
     */
    public AutomationAccountCreateOrUpdateParameters withEncryption(EncryptionProperties encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutomationAccountCreateOrUpdateProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Indicates whether traffic on the non-ARM endpoint (Webhook/Agent) is
     * allowed from the public internet.
     * 
     * @return the publicNetworkAccess value.
     */
    public Boolean publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Indicates whether traffic on the non-ARM endpoint (Webhook/Agent) is
     * allowed from the public internet.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the AutomationAccountCreateOrUpdateParameters object itself.
     */
    public AutomationAccountCreateOrUpdateParameters withPublicNetworkAccess(Boolean publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutomationAccountCreateOrUpdateProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the disableLocalAuth property: Indicates whether requests using non-AAD authentication are blocked.
     * 
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.innerProperties() == null ? null : this.innerProperties().disableLocalAuth();
    }

    /**
     * Set the disableLocalAuth property: Indicates whether requests using non-AAD authentication are blocked.
     * 
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the AutomationAccountCreateOrUpdateParameters object itself.
     */
    public AutomationAccountCreateOrUpdateParameters withDisableLocalAuth(Boolean disableLocalAuth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutomationAccountCreateOrUpdateProperties();
        }
        this.innerProperties().withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AutomationAccountCreateOrUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutomationAccountCreateOrUpdateParameters if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AutomationAccountCreateOrUpdateParameters.
     */
    public static AutomationAccountCreateOrUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AutomationAccountCreateOrUpdateParameters deserializedAutomationAccountCreateOrUpdateParameters
                = new AutomationAccountCreateOrUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedAutomationAccountCreateOrUpdateParameters.innerProperties
                        = AutomationAccountCreateOrUpdateProperties.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedAutomationAccountCreateOrUpdateParameters.name = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedAutomationAccountCreateOrUpdateParameters.location = reader.getString();
                } else if ("identity".equals(fieldName)) {
                    deserializedAutomationAccountCreateOrUpdateParameters.identity = Identity.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedAutomationAccountCreateOrUpdateParameters.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAutomationAccountCreateOrUpdateParameters;
        });
    }
}
