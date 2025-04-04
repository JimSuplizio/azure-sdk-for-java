// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cognitiveservices.fluent.models.RaiBlocklistItemInner;
import java.util.Map;

/**
 * An immutable client-side representation of RaiBlocklistItem.
 */
public interface RaiBlocklistItem {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the etag property: Resource Etag.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: Properties of Cognitive Services RaiBlocklist Item.
     * 
     * @return the properties value.
     */
    RaiBlocklistItemProperties properties();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.cognitiveservices.fluent.models.RaiBlocklistItemInner object.
     * 
     * @return the inner object.
     */
    RaiBlocklistItemInner innerModel();

    /**
     * The entirety of the RaiBlocklistItem definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The RaiBlocklistItem definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the RaiBlocklistItem definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the RaiBlocklistItem definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName, raiBlocklistName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName The name of Cognitive Services account.
             * @param raiBlocklistName The name of the RaiBlocklist associated with the Cognitive Services Account.
             * @return the next definition stage.
             */
            WithCreate withExistingRaiBlocklist(String resourceGroupName, String accountName, String raiBlocklistName);
        }

        /**
         * The stage of the RaiBlocklistItem definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            RaiBlocklistItem create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RaiBlocklistItem create(Context context);
        }

        /**
         * The stage of the RaiBlocklistItem definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the RaiBlocklistItem definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of Cognitive Services RaiBlocklist Item..
             * 
             * @param properties Properties of Cognitive Services RaiBlocklist Item.
             * @return the next definition stage.
             */
            WithCreate withProperties(RaiBlocklistItemProperties properties);
        }
    }

    /**
     * Begins update for the RaiBlocklistItem resource.
     * 
     * @return the stage of resource update.
     */
    RaiBlocklistItem.Update update();

    /**
     * The template for RaiBlocklistItem update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        RaiBlocklistItem apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        RaiBlocklistItem apply(Context context);
    }

    /**
     * The RaiBlocklistItem update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the RaiBlocklistItem update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the RaiBlocklistItem update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of Cognitive Services RaiBlocklist Item..
             * 
             * @param properties Properties of Cognitive Services RaiBlocklist Item.
             * @return the next definition stage.
             */
            Update withProperties(RaiBlocklistItemProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    RaiBlocklistItem refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    RaiBlocklistItem refresh(Context context);
}
