// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VpnNatRuleMapping;
import com.azure.resourcemanager.network.models.VpnNatRuleMode;
import com.azure.resourcemanager.network.models.VpnNatRuleType;
import java.io.IOException;
import java.util.List;

/**
 * Parameters for VirtualNetworkGatewayNatRule.
 */
@Fluent
public final class VirtualNetworkGatewayNatRuleProperties
    implements JsonSerializable<VirtualNetworkGatewayNatRuleProperties> {
    /*
     * The provisioning state of the NAT Rule resource.
     */
    private ProvisioningState provisioningState;

    /*
     * The type of NAT rule for VPN NAT.
     */
    private VpnNatRuleType type;

    /*
     * The Source NAT direction of a VPN NAT.
     */
    private VpnNatRuleMode mode;

    /*
     * The private IP address internal mapping for NAT.
     */
    private List<VpnNatRuleMapping> internalMappings;

    /*
     * The private IP address external mapping for NAT.
     */
    private List<VpnNatRuleMapping> externalMappings;

    /*
     * The IP Configuration ID this NAT rule applies to.
     */
    private String ipConfigurationId;

    /**
     * Creates an instance of VirtualNetworkGatewayNatRuleProperties class.
     */
    public VirtualNetworkGatewayNatRuleProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the NAT Rule resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the type property: The type of NAT rule for VPN NAT.
     * 
     * @return the type value.
     */
    public VpnNatRuleType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of NAT rule for VPN NAT.
     * 
     * @param type the type value to set.
     * @return the VirtualNetworkGatewayNatRuleProperties object itself.
     */
    public VirtualNetworkGatewayNatRuleProperties withType(VpnNatRuleType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the mode property: The Source NAT direction of a VPN NAT.
     * 
     * @return the mode value.
     */
    public VpnNatRuleMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: The Source NAT direction of a VPN NAT.
     * 
     * @param mode the mode value to set.
     * @return the VirtualNetworkGatewayNatRuleProperties object itself.
     */
    public VirtualNetworkGatewayNatRuleProperties withMode(VpnNatRuleMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the internalMappings property: The private IP address internal mapping for NAT.
     * 
     * @return the internalMappings value.
     */
    public List<VpnNatRuleMapping> internalMappings() {
        return this.internalMappings;
    }

    /**
     * Set the internalMappings property: The private IP address internal mapping for NAT.
     * 
     * @param internalMappings the internalMappings value to set.
     * @return the VirtualNetworkGatewayNatRuleProperties object itself.
     */
    public VirtualNetworkGatewayNatRuleProperties withInternalMappings(List<VpnNatRuleMapping> internalMappings) {
        this.internalMappings = internalMappings;
        return this;
    }

    /**
     * Get the externalMappings property: The private IP address external mapping for NAT.
     * 
     * @return the externalMappings value.
     */
    public List<VpnNatRuleMapping> externalMappings() {
        return this.externalMappings;
    }

    /**
     * Set the externalMappings property: The private IP address external mapping for NAT.
     * 
     * @param externalMappings the externalMappings value to set.
     * @return the VirtualNetworkGatewayNatRuleProperties object itself.
     */
    public VirtualNetworkGatewayNatRuleProperties withExternalMappings(List<VpnNatRuleMapping> externalMappings) {
        this.externalMappings = externalMappings;
        return this;
    }

    /**
     * Get the ipConfigurationId property: The IP Configuration ID this NAT rule applies to.
     * 
     * @return the ipConfigurationId value.
     */
    public String ipConfigurationId() {
        return this.ipConfigurationId;
    }

    /**
     * Set the ipConfigurationId property: The IP Configuration ID this NAT rule applies to.
     * 
     * @param ipConfigurationId the ipConfigurationId value to set.
     * @return the VirtualNetworkGatewayNatRuleProperties object itself.
     */
    public VirtualNetworkGatewayNatRuleProperties withIpConfigurationId(String ipConfigurationId) {
        this.ipConfigurationId = ipConfigurationId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (internalMappings() != null) {
            internalMappings().forEach(e -> e.validate());
        }
        if (externalMappings() != null) {
            externalMappings().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("mode", this.mode == null ? null : this.mode.toString());
        jsonWriter.writeArrayField("internalMappings", this.internalMappings,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("externalMappings", this.externalMappings,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("ipConfigurationId", this.ipConfigurationId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualNetworkGatewayNatRuleProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualNetworkGatewayNatRuleProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualNetworkGatewayNatRuleProperties.
     */
    public static VirtualNetworkGatewayNatRuleProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualNetworkGatewayNatRuleProperties deserializedVirtualNetworkGatewayNatRuleProperties
                = new VirtualNetworkGatewayNatRuleProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayNatRuleProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayNatRuleProperties.type
                        = VpnNatRuleType.fromString(reader.getString());
                } else if ("mode".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayNatRuleProperties.mode
                        = VpnNatRuleMode.fromString(reader.getString());
                } else if ("internalMappings".equals(fieldName)) {
                    List<VpnNatRuleMapping> internalMappings
                        = reader.readArray(reader1 -> VpnNatRuleMapping.fromJson(reader1));
                    deserializedVirtualNetworkGatewayNatRuleProperties.internalMappings = internalMappings;
                } else if ("externalMappings".equals(fieldName)) {
                    List<VpnNatRuleMapping> externalMappings
                        = reader.readArray(reader1 -> VpnNatRuleMapping.fromJson(reader1));
                    deserializedVirtualNetworkGatewayNatRuleProperties.externalMappings = externalMappings;
                } else if ("ipConfigurationId".equals(fieldName)) {
                    deserializedVirtualNetworkGatewayNatRuleProperties.ipConfigurationId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualNetworkGatewayNatRuleProperties;
        });
    }
}
