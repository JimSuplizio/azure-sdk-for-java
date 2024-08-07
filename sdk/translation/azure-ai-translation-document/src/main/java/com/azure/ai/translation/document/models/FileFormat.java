// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.document.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * File Format.
 */
@Immutable
public final class FileFormat {

    /*
     * Name of the format
     */
    @Generated
    @JsonProperty(value = "format")
    private final String format;

    /*
     * Supported file extension for this format
     */
    @Generated
    @JsonProperty(value = "fileExtensions")
    private final List<String> fileExtensions;

    /*
     * Supported Content-Types for this format
     */
    @Generated
    @JsonProperty(value = "contentTypes")
    private final List<String> contentTypes;

    /*
     * Default version if none is specified
     */
    @Generated
    @JsonProperty(value = "defaultVersion")
    private String defaultVersion;

    /*
     * Supported Version
     */
    @Generated
    @JsonProperty(value = "versions")
    private List<String> versions;

    /*
     * Supported Type for this format
     */
    @Generated
    @JsonProperty(value = "type")
    private String type;

    /**
     * Creates an instance of FileFormat class.
     *
     * @param format the format value to set.
     * @param fileExtensions the fileExtensions value to set.
     * @param contentTypes the contentTypes value to set.
     */
    @Generated
    @JsonCreator
    private FileFormat(@JsonProperty(value = "format") String format,
        @JsonProperty(value = "fileExtensions") List<String> fileExtensions,
        @JsonProperty(value = "contentTypes") List<String> contentTypes) {
        this.format = format;
        this.fileExtensions = fileExtensions;
        this.contentTypes = contentTypes;
    }

    /**
     * Get the format property: Name of the format.
     *
     * @return the format value.
     */
    @Generated
    public String getFormat() {
        return this.format;
    }

    /**
     * Get the fileExtensions property: Supported file extension for this format.
     *
     * @return the fileExtensions value.
     */
    @Generated
    public List<String> getFileExtensions() {
        return this.fileExtensions;
    }

    /**
     * Get the contentTypes property: Supported Content-Types for this format.
     *
     * @return the contentTypes value.
     */
    @Generated
    public List<String> getContentTypes() {
        return this.contentTypes;
    }

    /**
     * Get the defaultVersion property: Default version if none is specified.
     *
     * @return the defaultVersion value.
     */
    @Generated
    public String getDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * Get the versions property: Supported Version.
     *
     * @return the versions value.
     */
    @Generated
    public List<String> getVersions() {
        return this.versions;
    }

    /**
     * Get the type property: Supported Type for this format.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }
}
