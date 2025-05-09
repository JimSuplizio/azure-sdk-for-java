// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.neonpostgres.fluent.models.ConnectionUriPropertiesInner;
import com.azure.resourcemanager.neonpostgres.fluent.models.ProjectInner;

/**
 * An immutable client-side representation of Project.
 */
public interface Project {
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
     * Gets the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    ProjectProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.neonpostgres.fluent.models.ProjectInner object.
     * 
     * @return the inner object.
     */
    ProjectInner innerModel();

    /**
     * The entirety of the Project definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The Project definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Project definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the Project definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, organizationName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param organizationName Name of the Neon Organizations resource.
             * @return the next definition stage.
             */
            WithCreate withExistingOrganization(String resourceGroupName, String organizationName);
        }

        /**
         * The stage of the Project definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Project create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Project create(Context context);
        }

        /**
         * The stage of the Project definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The resource-specific properties for this resource..
             * 
             * @param properties The resource-specific properties for this resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(ProjectProperties properties);
        }
    }

    /**
     * Begins update for the Project resource.
     * 
     * @return the stage of resource update.
     */
    Project.Update update();

    /**
     * The template for Project update.
     */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Project apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Project apply(Context context);
    }

    /**
     * The Project update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Project update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The resource-specific properties for this resource..
             * 
             * @param properties The resource-specific properties for this resource.
             * @return the next definition stage.
             */
            Update withProperties(ProjectProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Project refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Project refresh(Context context);

    /**
     * Action to retrieve the connection URI for the Neon Database.
     * 
     * @param connectionUriParameters Additional parameters for retrieving the database connection URI.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return connection uri parameters for the associated database along with {@link Response}.
     */
    Response<ConnectionUriProperties> getConnectionUriWithResponse(ConnectionUriPropertiesInner connectionUriParameters,
        Context context);

    /**
     * Action to retrieve the connection URI for the Neon Database.
     * 
     * @param connectionUriParameters Additional parameters for retrieving the database connection URI.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return connection uri parameters for the associated database.
     */
    ConnectionUriProperties getConnectionUri(ConnectionUriPropertiesInner connectionUriParameters);
}
