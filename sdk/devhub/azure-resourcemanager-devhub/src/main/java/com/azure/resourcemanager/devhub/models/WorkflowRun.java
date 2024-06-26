// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The WorkflowRun model. */
@Fluent
public final class WorkflowRun {
    /*
     * Describes if the workflow run succeeded.
     */
    @JsonProperty(value = "succeeded", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean succeeded;

    /*
     * URL to the run of the workflow.
     */
    @JsonProperty(value = "workflowRunURL", access = JsonProperty.Access.WRITE_ONLY)
    private String workflowRunUrl;

    /*
     * The timestamp of the last workflow run.
     */
    @JsonProperty(value = "lastRunAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastRunAt;

    /*
     * Describes the status of the workflow run
     */
    @JsonProperty(value = "workflowRunStatus")
    private WorkflowRunStatus workflowRunStatus;

    /** Creates an instance of WorkflowRun class. */
    public WorkflowRun() {
    }

    /**
     * Get the succeeded property: Describes if the workflow run succeeded.
     *
     * @return the succeeded value.
     */
    public Boolean succeeded() {
        return this.succeeded;
    }

    /**
     * Get the workflowRunUrl property: URL to the run of the workflow.
     *
     * @return the workflowRunUrl value.
     */
    public String workflowRunUrl() {
        return this.workflowRunUrl;
    }

    /**
     * Get the lastRunAt property: The timestamp of the last workflow run.
     *
     * @return the lastRunAt value.
     */
    public OffsetDateTime lastRunAt() {
        return this.lastRunAt;
    }

    /**
     * Get the workflowRunStatus property: Describes the status of the workflow run.
     *
     * @return the workflowRunStatus value.
     */
    public WorkflowRunStatus workflowRunStatus() {
        return this.workflowRunStatus;
    }

    /**
     * Set the workflowRunStatus property: Describes the status of the workflow run.
     *
     * @param workflowRunStatus the workflowRunStatus value to set.
     * @return the WorkflowRun object itself.
     */
    public WorkflowRun withWorkflowRunStatus(WorkflowRunStatus workflowRunStatus) {
        this.workflowRunStatus = workflowRunStatus;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
