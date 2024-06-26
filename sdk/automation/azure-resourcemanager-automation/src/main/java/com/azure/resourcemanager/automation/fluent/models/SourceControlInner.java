// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.automation.models.SourceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Definition of the source control. */
@Fluent
public final class SourceControlInner extends ProxyResource {
    /*
     * The properties of the source control.
     */
    @JsonProperty(value = "properties")
    private SourceControlProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of the source control.
     *
     * @return the innerProperties value.
     */
    private SourceControlProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the repoUrl property: The repo url of the source control.
     *
     * @return the repoUrl value.
     */
    public String repoUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().repoUrl();
    }

    /**
     * Set the repoUrl property: The repo url of the source control.
     *
     * @param repoUrl the repoUrl value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withRepoUrl(String repoUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withRepoUrl(repoUrl);
        return this;
    }

    /**
     * Get the branch property: The repo branch of the source control. Include branch as empty string for VsoTfvc.
     *
     * @return the branch value.
     */
    public String branch() {
        return this.innerProperties() == null ? null : this.innerProperties().branch();
    }

    /**
     * Set the branch property: The repo branch of the source control. Include branch as empty string for VsoTfvc.
     *
     * @param branch the branch value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withBranch(String branch) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withBranch(branch);
        return this;
    }

    /**
     * Get the folderPath property: The folder path of the source control.
     *
     * @return the folderPath value.
     */
    public String folderPath() {
        return this.innerProperties() == null ? null : this.innerProperties().folderPath();
    }

    /**
     * Set the folderPath property: The folder path of the source control.
     *
     * @param folderPath the folderPath value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withFolderPath(String folderPath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withFolderPath(folderPath);
        return this;
    }

    /**
     * Get the autoSync property: The auto sync of the source control. Default is false.
     *
     * @return the autoSync value.
     */
    public Boolean autoSync() {
        return this.innerProperties() == null ? null : this.innerProperties().autoSync();
    }

    /**
     * Set the autoSync property: The auto sync of the source control. Default is false.
     *
     * @param autoSync the autoSync value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withAutoSync(Boolean autoSync) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withAutoSync(autoSync);
        return this;
    }

    /**
     * Get the publishRunbook property: The auto publish of the source control. Default is true.
     *
     * @return the publishRunbook value.
     */
    public Boolean publishRunbook() {
        return this.innerProperties() == null ? null : this.innerProperties().publishRunbook();
    }

    /**
     * Set the publishRunbook property: The auto publish of the source control. Default is true.
     *
     * @param publishRunbook the publishRunbook value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withPublishRunbook(Boolean publishRunbook) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withPublishRunbook(publishRunbook);
        return this;
    }

    /**
     * Get the sourceType property: The source type. Must be one of VsoGit, VsoTfvc, GitHub.
     *
     * @return the sourceType value.
     */
    public SourceType sourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceType();
    }

    /**
     * Set the sourceType property: The source type. Must be one of VsoGit, VsoTfvc, GitHub.
     *
     * @param sourceType the sourceType value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withSourceType(SourceType sourceType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withSourceType(sourceType);
        return this;
    }

    /**
     * Get the description property: The description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description.
     *
     * @param description the description value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the creationTime property: The creation time.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
    }

    /**
     * Set the creationTime property: The creation time.
     *
     * @param creationTime the creationTime value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withCreationTime(OffsetDateTime creationTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withCreationTime(creationTime);
        return this;
    }

    /**
     * Get the lastModifiedTime property: The last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedTime();
    }

    /**
     * Set the lastModifiedTime property: The last modified time.
     *
     * @param lastModifiedTime the lastModifiedTime value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
