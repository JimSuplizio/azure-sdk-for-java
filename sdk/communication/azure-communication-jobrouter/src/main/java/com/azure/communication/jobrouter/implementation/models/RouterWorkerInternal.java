// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** An entity for jobs to be routed to. */
@Fluent
public final class RouterWorkerInternal {
    /*
     * The id property.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The current state of the worker.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private RouterWorkerStateInternal state;

    /*
     * The queue(s) that this worker can receive work from.
     */
    @JsonProperty(value = "queueAssignments")
    private Map<String, Object> queueAssignments;

    /*
     * The total capacity score this worker has to manage multiple concurrent jobs.
     */
    @JsonProperty(value = "totalCapacity")
    private Integer totalCapacity;

    /*
     * A set of key/value pairs that are identifying attributes used by the rules engines to make decisions.
     */
    @JsonProperty(value = "labels")
    private Map<String, Object> labels;

    /*
     * A set of non-identifying attributes attached to this worker.
     */
    @JsonProperty(value = "tags")
    private Map<String, Object> tags;

    /*
     * The channel(s) this worker can handle and their impact on the workers capacity.
     */
    @JsonProperty(value = "channelConfigurations")
    private Map<String, ChannelConfigurationInternal> channelConfigurations;

    /*
     * A list of active offers issued to this worker.
     */
    @JsonProperty(value = "offers", access = JsonProperty.Access.WRITE_ONLY)
    private List<RouterJobOfferInternal> offers;

    /*
     * A list of assigned jobs attached to this worker.
     */
    @JsonProperty(value = "assignedJobs", access = JsonProperty.Access.WRITE_ONLY)
    private List<RouterWorkerAssignmentInternal> assignedJobs;

    /*
     * A value indicating the workers capacity. A value of '1' means all capacity is consumed. A value of '0' means no
     * capacity is currently consumed.
     */
    @JsonProperty(value = "loadRatio", access = JsonProperty.Access.WRITE_ONLY)
    private Double loadRatio;

    /*
     * A flag indicating this worker is open to receive offers or not.
     */
    @JsonProperty(value = "availableForOffers")
    private Boolean availableForOffers;

    /** Creates an instance of RouterWorkerInternal class. */
    public RouterWorkerInternal() {}

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the state property: The current state of the worker.
     *
     * @return the state value.
     */
    public RouterWorkerStateInternal getState() {
        return this.state;
    }

    /**
     * Get the queueAssignments property: The queue(s) that this worker can receive work from.
     *
     * @return the queueAssignments value.
     */
    public Map<String, Object> getQueueAssignments() {
        return this.queueAssignments;
    }

    /**
     * Set the queueAssignments property: The queue(s) that this worker can receive work from.
     *
     * @param queueAssignments the queueAssignments value to set.
     * @return the RouterWorkerInternal object itself.
     */
    public RouterWorkerInternal setQueueAssignments(Map<String, Object> queueAssignments) {
        this.queueAssignments = queueAssignments;
        return this;
    }

    /**
     * Get the totalCapacity property: The total capacity score this worker has to manage multiple concurrent jobs.
     *
     * @return the totalCapacity value.
     */
    public Integer getTotalCapacity() {
        return this.totalCapacity;
    }

    /**
     * Set the totalCapacity property: The total capacity score this worker has to manage multiple concurrent jobs.
     *
     * @param totalCapacity the totalCapacity value to set.
     * @return the RouterWorkerInternal object itself.
     */
    public RouterWorkerInternal setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
        return this;
    }

    /**
     * Get the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions.
     *
     * @return the labels value.
     */
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions.
     *
     * @param labels the labels value to set.
     * @return the RouterWorkerInternal object itself.
     */
    public RouterWorkerInternal setLabels(Map<String, Object> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the tags property: A set of non-identifying attributes attached to this worker.
     *
     * @return the tags value.
     */
    public Map<String, Object> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: A set of non-identifying attributes attached to this worker.
     *
     * @param tags the tags value to set.
     * @return the RouterWorkerInternal object itself.
     */
    public RouterWorkerInternal setTags(Map<String, Object> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the channelConfigurations property: The channel(s) this worker can handle and their impact on the workers
     * capacity.
     *
     * @return the channelConfigurations value.
     */
    public Map<String, ChannelConfigurationInternal> getChannelConfigurations() {
        return this.channelConfigurations;
    }

    /**
     * Set the channelConfigurations property: The channel(s) this worker can handle and their impact on the workers
     * capacity.
     *
     * @param channelConfigurations the channelConfigurations value to set.
     * @return the RouterWorkerInternal object itself.
     */
    public RouterWorkerInternal setChannelConfigurations(
            Map<String, ChannelConfigurationInternal> channelConfigurations) {
        this.channelConfigurations = channelConfigurations;
        return this;
    }

    /**
     * Get the offers property: A list of active offers issued to this worker.
     *
     * @return the offers value.
     */
    public List<RouterJobOfferInternal> getOffers() {
        return this.offers;
    }

    /**
     * Get the assignedJobs property: A list of assigned jobs attached to this worker.
     *
     * @return the assignedJobs value.
     */
    public List<RouterWorkerAssignmentInternal> getAssignedJobs() {
        return this.assignedJobs;
    }

    /**
     * Get the loadRatio property: A value indicating the workers capacity. A value of '1' means all capacity is
     * consumed. A value of '0' means no capacity is currently consumed.
     *
     * @return the loadRatio value.
     */
    public Double getLoadRatio() {
        return this.loadRatio;
    }

    /**
     * Get the availableForOffers property: A flag indicating this worker is open to receive offers or not.
     *
     * @return the availableForOffers value.
     */
    public Boolean isAvailableForOffers() {
        return this.availableForOffers;
    }

    /**
     * Set the availableForOffers property: A flag indicating this worker is open to receive offers or not.
     *
     * @param availableForOffers the availableForOffers value to set.
     * @return the RouterWorkerInternal object itself.
     */
    public RouterWorkerInternal setAvailableForOffers(Boolean availableForOffers) {
        this.availableForOffers = availableForOffers;
        return this;
    }
}