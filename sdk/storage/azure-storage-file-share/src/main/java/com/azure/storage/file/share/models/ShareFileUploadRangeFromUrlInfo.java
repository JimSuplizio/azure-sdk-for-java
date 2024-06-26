// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.share.models;

import com.azure.core.annotation.Immutable;

import java.time.OffsetDateTime;

/**
 * Response from uploading a range from a URL source.
 */
@Immutable
public final class ShareFileUploadRangeFromUrlInfo {
    private final String eTag;
    private final OffsetDateTime lastModified;
    private final Boolean isServerEncrypted;

    /**
     * Creates a new instance of this class.
     *
     * @param eTag The entity tag that corresponds to the directory.
     * @param lastModified The last time the share was modified.
     * @param isServerEncrypted The value of this header is true if the directory metadata is completely encrypted using
     * the specified algorithm.
     */
    public ShareFileUploadRangeFromUrlInfo(String eTag, OffsetDateTime lastModified, Boolean isServerEncrypted) {
        this.eTag = eTag;
        this.lastModified = lastModified;
        this.isServerEncrypted = isServerEncrypted;
    }

    /**
     * Get the entity tag that corresponds to the directory.
     *
     * @return The entity tag that corresponds to the directory.
     */
    public String getETag() {
        return eTag;
    }

    /**
     * Get the last time the share was modified.
     *
     * @return The last time the share was modified.
     */
    public OffsetDateTime getLastModified() {
        return lastModified;
    }

    /**
     * Get the value of this header is true if the directory metadata is completely encrypted using the specified
     * algorithm. Otherwise, the value is false.
     *
     * @return The value of this header is true if the directory metadata is completely encrypted using the specified
     * algorithm. Otherwise, the value is false.
     */
    public Boolean isServerEncrypted() {
        return isServerEncrypted;
    }
}
