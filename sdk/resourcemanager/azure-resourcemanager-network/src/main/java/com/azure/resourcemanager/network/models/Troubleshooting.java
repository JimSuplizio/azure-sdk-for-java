// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasParent;
import com.azure.resourcemanager.resources.fluentcore.model.Executable;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * A client-side representation allowing user to get troubleshooting information for virtual network gateway or virtual
 * network gateway connection.
 */
@Fluent
public interface Troubleshooting extends Executable<Troubleshooting>, HasParent<NetworkWatcher> {
    /**
     * Get the resource identifier of the target resource against which the action is to be performed.
     *
     * @return the targetResourceId value
     */
    String targetResourceId();

    /**
     * Gets ID of the storage account where troubleshooting information was saved.
     *
     * @return ID of the storage account where troubleshooting information was saved
     */
    String storageId();

    /**
     * Gets the path to the blob to save the troubleshoot result in.
     *
     * @return the path to the blob to save the troubleshoot result in
     */
    String storagePath();

    /**
     * Gets the start time of the troubleshooting.
     *
     * @return The start time of the troubleshooting
     */
    OffsetDateTime startTime();

    /**
     * Gets the end time of the troubleshooting.
     *
     * @return the end time of the troubleshooting
     */
    OffsetDateTime endTime();

    /**
     * Gets the result code of the troubleshooting.
     *
     * @return the result code of the troubleshooting
     */
    String code();

    /**
     * Gets information from troubleshooting.
     *
     * @return information from troubleshooting
     */
    List<TroubleshootingDetails> results();

    /** The entirety of troubleshooting parameters definition. */
    interface Definition extends DefinitionStages.WithTargetResource, DefinitionStages.WithStorageAccount,
        DefinitionStages.WithStoragePath, DefinitionStages.WithExecute {
    }

    /** Grouping of troubleshooting definition stages. */
    interface DefinitionStages {
        /** The first stage of troubleshooting parameters definition. */
        interface WithTargetResource {
            /**
             * Set the targetResourceId value (virtual network gateway or virtual network gateway connecyion id).
             *
             * @param targetResourceId the targetResourceId value to set
             * @return the next stage of definition
             */
            WithStorageAccount withTargetResourceId(String targetResourceId);
        }

        /** Sets the storage account to save the troubleshoot result. */
        interface WithStorageAccount {
            /**
             * Set the storageAccountId value.
             *
             * @param storageAccountId the ID for the storage account to save the troubleshoot result
             * @return the next stage of definition.
             */
            WithStoragePath withStorageAccount(String storageAccountId);
        }

        /** Sets the path to the blob to save the troubleshoot result in. */
        interface WithStoragePath {
            /**
             * Specifies the storage path.
             *
             * @param storagePath the storage path
             * @return the next stage of definition.
             */
            WithExecute withStoragePath(String storagePath);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for execution, but also allows for
         * any other optional settings to be specified.
         */
        interface WithExecute extends Executable<Troubleshooting> {
        }
    }
}
