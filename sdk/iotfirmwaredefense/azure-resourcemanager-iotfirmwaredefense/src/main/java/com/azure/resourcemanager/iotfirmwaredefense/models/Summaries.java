// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Summaries.
 */
public interface Summaries {
    /**
     * Get an analysis result summary of a firmware by name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the firmware analysis workspace.
     * @param firmwareId The id of the firmware.
     * @param summaryType The Firmware analysis summary name describing the type of summary.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an analysis result summary of a firmware by name along with {@link Response}.
     */
    Response<SummaryResource> getWithResponse(String resourceGroupName, String workspaceName, String firmwareId,
        SummaryType summaryType, Context context);

    /**
     * Get an analysis result summary of a firmware by name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the firmware analysis workspace.
     * @param firmwareId The id of the firmware.
     * @param summaryType The Firmware analysis summary name describing the type of summary.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an analysis result summary of a firmware by name.
     */
    SummaryResource get(String resourceGroupName, String workspaceName, String firmwareId, SummaryType summaryType);

    /**
     * Lists analysis result summary names of a firmware. To fetch the full summary data, get that summary by name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the firmware analysis workspace.
     * @param firmwareId The id of the firmware.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a SummaryResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SummaryResource> listByFirmware(String resourceGroupName, String workspaceName, String firmwareId);

    /**
     * Lists analysis result summary names of a firmware. To fetch the full summary data, get that summary by name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the firmware analysis workspace.
     * @param firmwareId The id of the firmware.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a SummaryResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SummaryResource> listByFirmware(String resourceGroupName, String workspaceName, String firmwareId,
        Context context);
}
