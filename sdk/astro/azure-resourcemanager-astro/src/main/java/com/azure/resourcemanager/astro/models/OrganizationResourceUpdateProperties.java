// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.astro.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The updatable properties of the OrganizationResource.
 */
@Fluent
public final class OrganizationResourceUpdateProperties
    implements JsonSerializable<OrganizationResourceUpdateProperties> {
    /*
     * Marketplace details of the resource.
     */
    private LiftrBaseMarketplaceDetailsUpdate marketplace;

    /*
     * Details of the user.
     */
    private LiftrBaseUserDetailsUpdate user;

    /*
     * Organization properties
     */
    private LiftrBaseDataPartnerOrganizationPropertiesUpdate partnerOrganizationProperties;

    /**
     * Creates an instance of OrganizationResourceUpdateProperties class.
     */
    public OrganizationResourceUpdateProperties() {
    }

    /**
     * Get the marketplace property: Marketplace details of the resource.
     * 
     * @return the marketplace value.
     */
    public LiftrBaseMarketplaceDetailsUpdate marketplace() {
        return this.marketplace;
    }

    /**
     * Set the marketplace property: Marketplace details of the resource.
     * 
     * @param marketplace the marketplace value to set.
     * @return the OrganizationResourceUpdateProperties object itself.
     */
    public OrganizationResourceUpdateProperties withMarketplace(LiftrBaseMarketplaceDetailsUpdate marketplace) {
        this.marketplace = marketplace;
        return this;
    }

    /**
     * Get the user property: Details of the user.
     * 
     * @return the user value.
     */
    public LiftrBaseUserDetailsUpdate user() {
        return this.user;
    }

    /**
     * Set the user property: Details of the user.
     * 
     * @param user the user value to set.
     * @return the OrganizationResourceUpdateProperties object itself.
     */
    public OrganizationResourceUpdateProperties withUser(LiftrBaseUserDetailsUpdate user) {
        this.user = user;
        return this;
    }

    /**
     * Get the partnerOrganizationProperties property: Organization properties.
     * 
     * @return the partnerOrganizationProperties value.
     */
    public LiftrBaseDataPartnerOrganizationPropertiesUpdate partnerOrganizationProperties() {
        return this.partnerOrganizationProperties;
    }

    /**
     * Set the partnerOrganizationProperties property: Organization properties.
     * 
     * @param partnerOrganizationProperties the partnerOrganizationProperties value to set.
     * @return the OrganizationResourceUpdateProperties object itself.
     */
    public OrganizationResourceUpdateProperties withPartnerOrganizationProperties(
        LiftrBaseDataPartnerOrganizationPropertiesUpdate partnerOrganizationProperties) {
        this.partnerOrganizationProperties = partnerOrganizationProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (marketplace() != null) {
            marketplace().validate();
        }
        if (user() != null) {
            user().validate();
        }
        if (partnerOrganizationProperties() != null) {
            partnerOrganizationProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("marketplace", this.marketplace);
        jsonWriter.writeJsonField("user", this.user);
        jsonWriter.writeJsonField("partnerOrganizationProperties", this.partnerOrganizationProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OrganizationResourceUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OrganizationResourceUpdateProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OrganizationResourceUpdateProperties.
     */
    public static OrganizationResourceUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OrganizationResourceUpdateProperties deserializedOrganizationResourceUpdateProperties
                = new OrganizationResourceUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("marketplace".equals(fieldName)) {
                    deserializedOrganizationResourceUpdateProperties.marketplace
                        = LiftrBaseMarketplaceDetailsUpdate.fromJson(reader);
                } else if ("user".equals(fieldName)) {
                    deserializedOrganizationResourceUpdateProperties.user = LiftrBaseUserDetailsUpdate.fromJson(reader);
                } else if ("partnerOrganizationProperties".equals(fieldName)) {
                    deserializedOrganizationResourceUpdateProperties.partnerOrganizationProperties
                        = LiftrBaseDataPartnerOrganizationPropertiesUpdate.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOrganizationResourceUpdateProperties;
        });
    }
}
