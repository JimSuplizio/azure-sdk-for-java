// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of a policy set evaluation. */
@Fluent
public final class PolicySetResult {
    /*
     * A value indicating whether this policy set evaluation has discovered violations.
     */
    @JsonProperty(value = "hasError")
    private Boolean hasError;

    /*
     * The list of policy violations.
     */
    @JsonProperty(value = "policyViolations")
    private List<PolicyViolation> policyViolations;

    /** Creates an instance of PolicySetResult class. */
    public PolicySetResult() {
    }

    /**
     * Get the hasError property: A value indicating whether this policy set evaluation has discovered violations.
     *
     * @return the hasError value.
     */
    public Boolean hasError() {
        return this.hasError;
    }

    /**
     * Set the hasError property: A value indicating whether this policy set evaluation has discovered violations.
     *
     * @param hasError the hasError value to set.
     * @return the PolicySetResult object itself.
     */
    public PolicySetResult withHasError(Boolean hasError) {
        this.hasError = hasError;
        return this;
    }

    /**
     * Get the policyViolations property: The list of policy violations.
     *
     * @return the policyViolations value.
     */
    public List<PolicyViolation> policyViolations() {
        return this.policyViolations;
    }

    /**
     * Set the policyViolations property: The list of policy violations.
     *
     * @param policyViolations the policyViolations value to set.
     * @return the PolicySetResult object itself.
     */
    public PolicySetResult withPolicyViolations(List<PolicyViolation> policyViolations) {
        this.policyViolations = policyViolations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policyViolations() != null) {
            policyViolations().forEach(e -> e.validate());
        }
    }
}
