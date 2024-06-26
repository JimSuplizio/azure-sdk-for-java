// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes an automation rule action to modify an object's properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "actionType")
@JsonTypeName("ModifyProperties")
@Fluent
public final class AutomationRuleModifyPropertiesAction extends AutomationRuleAction {
    /*
     * The actionConfiguration property.
     */
    @JsonProperty(value = "actionConfiguration")
    private IncidentPropertiesAction actionConfiguration;

    /**
     * Get the actionConfiguration property: The actionConfiguration property.
     *
     * @return the actionConfiguration value.
     */
    public IncidentPropertiesAction actionConfiguration() {
        return this.actionConfiguration;
    }

    /**
     * Set the actionConfiguration property: The actionConfiguration property.
     *
     * @param actionConfiguration the actionConfiguration value to set.
     * @return the AutomationRuleModifyPropertiesAction object itself.
     */
    public AutomationRuleModifyPropertiesAction withActionConfiguration(IncidentPropertiesAction actionConfiguration) {
        this.actionConfiguration = actionConfiguration;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AutomationRuleModifyPropertiesAction withOrder(int order) {
        super.withOrder(order);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (actionConfiguration() != null) {
            actionConfiguration().validate();
        }
    }
}
