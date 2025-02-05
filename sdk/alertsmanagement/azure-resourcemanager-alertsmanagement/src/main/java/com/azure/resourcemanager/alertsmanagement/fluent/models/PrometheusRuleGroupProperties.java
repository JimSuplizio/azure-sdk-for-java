// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.alertsmanagement.models.PrometheusRule;
import java.io.IOException;
import java.util.List;

/**
 * An alert rule.
 */
@Fluent
public final class PrometheusRuleGroupProperties implements JsonSerializable<PrometheusRuleGroupProperties> {
    /*
     * the description of the Prometheus rule group that will be included in the alert email.
     */
    private String description;

    /*
     * the flag that indicates whether the Prometheus rule group is enabled.
     */
    private Boolean enabled;

    /*
     * the cluster name of the rule group evaluation.
     */
    private String clusterName;

    /*
     * the list of resource id's that this rule group is scoped to.
     */
    private List<String> scopes;

    /*
     * the interval in which to run the Prometheus rule group represented in ISO 8601 duration format. Should be between
     * 1 and 15 minutes
     */
    private String interval;

    /*
     * defines the rules in the Prometheus rule group.
     */
    private List<PrometheusRule> rules;

    /**
     * Creates an instance of PrometheusRuleGroupProperties class.
     */
    public PrometheusRuleGroupProperties() {
    }

    /**
     * Get the description property: the description of the Prometheus rule group that will be included in the alert
     * email.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: the description of the Prometheus rule group that will be included in the alert
     * email.
     * 
     * @param description the description value to set.
     * @return the PrometheusRuleGroupProperties object itself.
     */
    public PrometheusRuleGroupProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the enabled property: the flag that indicates whether the Prometheus rule group is enabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: the flag that indicates whether the Prometheus rule group is enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the PrometheusRuleGroupProperties object itself.
     */
    public PrometheusRuleGroupProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the clusterName property: the cluster name of the rule group evaluation.
     * 
     * @return the clusterName value.
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * Set the clusterName property: the cluster name of the rule group evaluation.
     * 
     * @param clusterName the clusterName value to set.
     * @return the PrometheusRuleGroupProperties object itself.
     */
    public PrometheusRuleGroupProperties withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * Get the scopes property: the list of resource id's that this rule group is scoped to.
     * 
     * @return the scopes value.
     */
    public List<String> scopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: the list of resource id's that this rule group is scoped to.
     * 
     * @param scopes the scopes value to set.
     * @return the PrometheusRuleGroupProperties object itself.
     */
    public PrometheusRuleGroupProperties withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Get the interval property: the interval in which to run the Prometheus rule group represented in ISO 8601
     * duration format. Should be between 1 and 15 minutes.
     * 
     * @return the interval value.
     */
    public String interval() {
        return this.interval;
    }

    /**
     * Set the interval property: the interval in which to run the Prometheus rule group represented in ISO 8601
     * duration format. Should be between 1 and 15 minutes.
     * 
     * @param interval the interval value to set.
     * @return the PrometheusRuleGroupProperties object itself.
     */
    public PrometheusRuleGroupProperties withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the rules property: defines the rules in the Prometheus rule group.
     * 
     * @return the rules value.
     */
    public List<PrometheusRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: defines the rules in the Prometheus rule group.
     * 
     * @param rules the rules value to set.
     * @return the PrometheusRuleGroupProperties object itself.
     */
    public PrometheusRuleGroupProperties withRules(List<PrometheusRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scopes() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property scopes in model PrometheusRuleGroupProperties"));
        }
        if (rules() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property rules in model PrometheusRuleGroupProperties"));
        } else {
            rules().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrometheusRuleGroupProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("scopes", this.scopes, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("rules", this.rules, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeStringField("clusterName", this.clusterName);
        jsonWriter.writeStringField("interval", this.interval);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrometheusRuleGroupProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrometheusRuleGroupProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PrometheusRuleGroupProperties.
     */
    public static PrometheusRuleGroupProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrometheusRuleGroupProperties deserializedPrometheusRuleGroupProperties
                = new PrometheusRuleGroupProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("scopes".equals(fieldName)) {
                    List<String> scopes = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrometheusRuleGroupProperties.scopes = scopes;
                } else if ("rules".equals(fieldName)) {
                    List<PrometheusRule> rules = reader.readArray(reader1 -> PrometheusRule.fromJson(reader1));
                    deserializedPrometheusRuleGroupProperties.rules = rules;
                } else if ("description".equals(fieldName)) {
                    deserializedPrometheusRuleGroupProperties.description = reader.getString();
                } else if ("enabled".equals(fieldName)) {
                    deserializedPrometheusRuleGroupProperties.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("clusterName".equals(fieldName)) {
                    deserializedPrometheusRuleGroupProperties.clusterName = reader.getString();
                } else if ("interval".equals(fieldName)) {
                    deserializedPrometheusRuleGroupProperties.interval = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrometheusRuleGroupProperties;
        });
    }
}
