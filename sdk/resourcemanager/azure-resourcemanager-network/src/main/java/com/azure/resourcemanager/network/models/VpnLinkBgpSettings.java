// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * BGP settings details for a link.
 */
@Fluent
public final class VpnLinkBgpSettings implements JsonSerializable<VpnLinkBgpSettings> {
    /*
     * The BGP speaker's ASN.
     */
    private Long asn;

    /*
     * The BGP peering address and BGP identifier of this BGP speaker.
     */
    private String bgpPeeringAddress;

    /**
     * Creates an instance of VpnLinkBgpSettings class.
     */
    public VpnLinkBgpSettings() {
    }

    /**
     * Get the asn property: The BGP speaker's ASN.
     * 
     * @return the asn value.
     */
    public Long asn() {
        return this.asn;
    }

    /**
     * Set the asn property: The BGP speaker's ASN.
     * 
     * @param asn the asn value to set.
     * @return the VpnLinkBgpSettings object itself.
     */
    public VpnLinkBgpSettings withAsn(Long asn) {
        this.asn = asn;
        return this;
    }

    /**
     * Get the bgpPeeringAddress property: The BGP peering address and BGP identifier of this BGP speaker.
     * 
     * @return the bgpPeeringAddress value.
     */
    public String bgpPeeringAddress() {
        return this.bgpPeeringAddress;
    }

    /**
     * Set the bgpPeeringAddress property: The BGP peering address and BGP identifier of this BGP speaker.
     * 
     * @param bgpPeeringAddress the bgpPeeringAddress value to set.
     * @return the VpnLinkBgpSettings object itself.
     */
    public VpnLinkBgpSettings withBgpPeeringAddress(String bgpPeeringAddress) {
        this.bgpPeeringAddress = bgpPeeringAddress;
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
        jsonWriter.writeNumberField("asn", this.asn);
        jsonWriter.writeStringField("bgpPeeringAddress", this.bgpPeeringAddress);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VpnLinkBgpSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VpnLinkBgpSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the VpnLinkBgpSettings.
     */
    public static VpnLinkBgpSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VpnLinkBgpSettings deserializedVpnLinkBgpSettings = new VpnLinkBgpSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("asn".equals(fieldName)) {
                    deserializedVpnLinkBgpSettings.asn = reader.getNullable(JsonReader::getLong);
                } else if ("bgpPeeringAddress".equals(fieldName)) {
                    deserializedVpnLinkBgpSettings.bgpPeeringAddress = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVpnLinkBgpSettings;
        });
    }
}
