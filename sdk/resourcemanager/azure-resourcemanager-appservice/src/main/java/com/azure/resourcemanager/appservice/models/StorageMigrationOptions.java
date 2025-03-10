// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.fluent.models.StorageMigrationOptionsProperties;
import java.io.IOException;

/**
 * Options for app content migration.
 */
@Fluent
public final class StorageMigrationOptions extends ProxyOnlyResource {
    /*
     * StorageMigrationOptions resource specific properties
     */
    private StorageMigrationOptionsProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of StorageMigrationOptions class.
     */
    public StorageMigrationOptions() {
    }

    /**
     * Get the innerProperties property: StorageMigrationOptions resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private StorageMigrationOptionsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StorageMigrationOptions withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the azurefilesConnectionString property: AzureFiles connection string.
     * 
     * @return the azurefilesConnectionString value.
     */
    public String azurefilesConnectionString() {
        return this.innerProperties() == null ? null : this.innerProperties().azurefilesConnectionString();
    }

    /**
     * Set the azurefilesConnectionString property: AzureFiles connection string.
     * 
     * @param azurefilesConnectionString the azurefilesConnectionString value to set.
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withAzurefilesConnectionString(String azurefilesConnectionString) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageMigrationOptionsProperties();
        }
        this.innerProperties().withAzurefilesConnectionString(azurefilesConnectionString);
        return this;
    }

    /**
     * Get the azurefilesShare property: AzureFiles share.
     * 
     * @return the azurefilesShare value.
     */
    public String azurefilesShare() {
        return this.innerProperties() == null ? null : this.innerProperties().azurefilesShare();
    }

    /**
     * Set the azurefilesShare property: AzureFiles share.
     * 
     * @param azurefilesShare the azurefilesShare value to set.
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withAzurefilesShare(String azurefilesShare) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageMigrationOptionsProperties();
        }
        this.innerProperties().withAzurefilesShare(azurefilesShare);
        return this;
    }

    /**
     * Get the switchSiteAfterMigration property: &lt;code&gt;true&lt;/code&gt;if the app should be switched over;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the switchSiteAfterMigration value.
     */
    public Boolean switchSiteAfterMigration() {
        return this.innerProperties() == null ? null : this.innerProperties().switchSiteAfterMigration();
    }

    /**
     * Set the switchSiteAfterMigration property: &lt;code&gt;true&lt;/code&gt;if the app should be switched over;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param switchSiteAfterMigration the switchSiteAfterMigration value to set.
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withSwitchSiteAfterMigration(Boolean switchSiteAfterMigration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageMigrationOptionsProperties();
        }
        this.innerProperties().withSwitchSiteAfterMigration(switchSiteAfterMigration);
        return this;
    }

    /**
     * Get the blockWriteAccessToSite property: &lt;code&gt;true&lt;/code&gt; if the app should be read only during copy
     * operation; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the blockWriteAccessToSite value.
     */
    public Boolean blockWriteAccessToSite() {
        return this.innerProperties() == null ? null : this.innerProperties().blockWriteAccessToSite();
    }

    /**
     * Set the blockWriteAccessToSite property: &lt;code&gt;true&lt;/code&gt; if the app should be read only during copy
     * operation; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param blockWriteAccessToSite the blockWriteAccessToSite value to set.
     * @return the StorageMigrationOptions object itself.
     */
    public StorageMigrationOptions withBlockWriteAccessToSite(Boolean blockWriteAccessToSite) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageMigrationOptionsProperties();
        }
        this.innerProperties().withBlockWriteAccessToSite(blockWriteAccessToSite);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageMigrationOptions from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageMigrationOptions if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StorageMigrationOptions.
     */
    public static StorageMigrationOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageMigrationOptions deserializedStorageMigrationOptions = new StorageMigrationOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedStorageMigrationOptions.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedStorageMigrationOptions.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedStorageMigrationOptions.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedStorageMigrationOptions.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedStorageMigrationOptions.innerProperties
                        = StorageMigrationOptionsProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageMigrationOptions;
        });
    }
}
