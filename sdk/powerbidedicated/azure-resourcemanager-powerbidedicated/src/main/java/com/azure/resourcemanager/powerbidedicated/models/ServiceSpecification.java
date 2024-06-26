// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Service specification for exposing performance metrics to shoebox. */
@Fluent
public final class ServiceSpecification {
    /*
     * Metric specifications for exposing performance metrics to shoebox.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<MetricSpecification> metricSpecifications;

    /*
     * Log specifications for exposing diagnostic logs to shoebox.
     */
    @JsonProperty(value = "logSpecifications")
    private List<LogSpecification> logSpecifications;

    /** Creates an instance of ServiceSpecification class. */
    public ServiceSpecification() {
    }

    /**
     * Get the metricSpecifications property: Metric specifications for exposing performance metrics to shoebox.
     *
     * @return the metricSpecifications value.
     */
    public List<MetricSpecification> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications property: Metric specifications for exposing performance metrics to shoebox.
     *
     * @param metricSpecifications the metricSpecifications value to set.
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withMetricSpecifications(List<MetricSpecification> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Get the logSpecifications property: Log specifications for exposing diagnostic logs to shoebox.
     *
     * @return the logSpecifications value.
     */
    public List<LogSpecification> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Set the logSpecifications property: Log specifications for exposing diagnostic logs to shoebox.
     *
     * @param logSpecifications the logSpecifications value to set.
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withLogSpecifications(List<LogSpecification> logSpecifications) {
        this.logSpecifications = logSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricSpecifications() != null) {
            metricSpecifications().forEach(e -> e.validate());
        }
        if (logSpecifications() != null) {
            logSpecifications().forEach(e -> e.validate());
        }
    }
}
