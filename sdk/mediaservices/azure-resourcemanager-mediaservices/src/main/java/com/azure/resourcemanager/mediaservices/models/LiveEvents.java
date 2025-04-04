// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of LiveEvents.
 */
public interface LiveEvents {
    /**
     * List live events
     * 
     * Lists all the live events in the account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return liveEventListResult as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LiveEvent> list(String resourceGroupName, String accountName);

    /**
     * List live events
     * 
     * Lists all the live events in the account.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return liveEventListResult as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LiveEvent> list(String resourceGroupName, String accountName, Context context);

    /**
     * Get Live Event
     * 
     * Gets properties of a live event.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a live event along with {@link Response}.
     */
    Response<LiveEvent> getWithResponse(String resourceGroupName, String accountName, String liveEventName,
        Context context);

    /**
     * Get Live Event
     * 
     * Gets properties of a live event.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a live event.
     */
    LiveEvent get(String resourceGroupName, String accountName, String liveEventName);

    /**
     * Delete Live Event
     * 
     * Deletes a live event.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String liveEventName);

    /**
     * Delete Live Event
     * 
     * Deletes a live event.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String liveEventName, Context context);

    /**
     * Allocate resources for a live event
     * 
     * A live event is in StandBy state after allocation completes, and is ready to start.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void allocate(String resourceGroupName, String accountName, String liveEventName);

    /**
     * Allocate resources for a live event
     * 
     * A live event is in StandBy state after allocation completes, and is ready to start.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void allocate(String resourceGroupName, String accountName, String liveEventName, Context context);

    /**
     * Start Live Event
     * 
     * A live event in Stopped or StandBy state will be in Running state after the start operation completes.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String accountName, String liveEventName);

    /**
     * Start Live Event
     * 
     * A live event in Stopped or StandBy state will be in Running state after the start operation completes.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String accountName, String liveEventName, Context context);

    /**
     * Stop Live Event
     * 
     * Stops a running live event.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param parameters LiveEvent stop parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String accountName, String liveEventName, LiveEventActionInput parameters);

    /**
     * Stop Live Event
     * 
     * Stops a running live event.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param parameters LiveEvent stop parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String accountName, String liveEventName, LiveEventActionInput parameters,
        Context context);

    /**
     * Reset Live Event
     * 
     * Resets an existing live event. All live outputs for the live event are deleted and the live event is stopped and
     * will be started again. All assets used by the live outputs and streaming locators created on these assets are
     * unaffected.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reset(String resourceGroupName, String accountName, String liveEventName);

    /**
     * Reset Live Event
     * 
     * Resets an existing live event. All live outputs for the live event are deleted and the live event is stopped and
     * will be started again. All assets used by the live outputs and streaming locators created on these assets are
     * unaffected.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reset(String resourceGroupName, String accountName, String liveEventName, Context context);

    /**
     * Get status of one live event
     * 
     * Gets status telemetry of a live event.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status telemetry of a live event as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LiveEventStatus> listGetStatus(String resourceGroupName, String accountName, String liveEventName);

    /**
     * Get status of one live event
     * 
     * Gets status telemetry of a live event.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status telemetry of a live event as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LiveEventStatus> listGetStatus(String resourceGroupName, String accountName, String liveEventName,
        Context context);

    /**
     * Get stream events of one live event
     * 
     * Get stream events telemetry of a live event.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return stream events telemetry of a live event as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LiveEventStreamEvent> listGetStreamEvents(String resourceGroupName, String accountName,
        String liveEventName);

    /**
     * Get stream events of one live event
     * 
     * Get stream events telemetry of a live event.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return stream events telemetry of a live event as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LiveEventStreamEvent> listGetStreamEvents(String resourceGroupName, String accountName,
        String liveEventName, Context context);

    /**
     * Get track events of one live event
     * 
     * Get track ingest heartbeat events telemetry of a live event.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return track ingest heartbeat events telemetry of a live event as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LiveEventTrackEvent> listGetTrackIngestHeartbeats(String resourceGroupName, String accountName,
        String liveEventName);

    /**
     * Get track events of one live event
     * 
     * Get track ingest heartbeat events telemetry of a live event.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return track ingest heartbeat events telemetry of a live event as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LiveEventTrackEvent> listGetTrackIngestHeartbeats(String resourceGroupName, String accountName,
        String liveEventName, Context context);

    /**
     * Get operation status.
     * 
     * Get a live event operation status.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param operationId The ID of an ongoing async operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a live event operation status along with {@link Response}.
     */
    Response<AsyncOperationResult> asyncOperationWithResponse(String resourceGroupName, String accountName,
        String operationId, Context context);

    /**
     * Get operation status.
     * 
     * Get a live event operation status.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param operationId The ID of an ongoing async operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a live event operation status.
     */
    AsyncOperationResult asyncOperation(String resourceGroupName, String accountName, String operationId);

    /**
     * Get operation status.
     * 
     * Get a live event operation status.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param operationId The ID of an ongoing async operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a live event operation status along with {@link Response}.
     */
    Response<LiveEvent> operationLocationWithResponse(String resourceGroupName, String accountName,
        String liveEventName, String operationId, Context context);

    /**
     * Get operation status.
     * 
     * Get a live event operation status.
     * 
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param liveEventName The name of the live event, maximum length is 32.
     * @param operationId The ID of an ongoing async operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a live event operation status.
     */
    LiveEvent operationLocation(String resourceGroupName, String accountName, String liveEventName, String operationId);

    /**
     * Get Live Event
     * 
     * Gets properties of a live event.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a live event along with {@link Response}.
     */
    LiveEvent getById(String id);

    /**
     * Get Live Event
     * 
     * Gets properties of a live event.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a live event along with {@link Response}.
     */
    Response<LiveEvent> getByIdWithResponse(String id, Context context);

    /**
     * Delete Live Event
     * 
     * Deletes a live event.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete Live Event
     * 
     * Deletes a live event.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new LiveEvent resource.
     * 
     * @param name resource name.
     * @return the first stage of the new LiveEvent definition.
     */
    LiveEvent.DefinitionStages.Blank define(String name);
}
