// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.networkcloud.fluent.models.KubernetesClusterInner;
import com.azure.resourcemanager.networkcloud.models.KubernetesClusterPatchParameters;
import com.azure.resourcemanager.networkcloud.models.KubernetesClusterRestartNodeParameters;

/** An instance of this class provides access to all the operations defined in KubernetesClustersClient. */
public interface KubernetesClustersClient {
    /**
     * List Kubernetes clusters in the subscription.
     *
     * <p>Get a list of Kubernetes clusters in the provided subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Kubernetes clusters in the provided subscription as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<KubernetesClusterInner> list();

    /**
     * List Kubernetes clusters in the subscription.
     *
     * <p>Get a list of Kubernetes clusters in the provided subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Kubernetes clusters in the provided subscription as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<KubernetesClusterInner> list(Context context);

    /**
     * List Kubernetes clusters in the resource group.
     *
     * <p>Get a list of Kubernetes clusters in the provided resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Kubernetes clusters in the provided resource group as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<KubernetesClusterInner> listByResourceGroup(String resourceGroupName);

    /**
     * List Kubernetes clusters in the resource group.
     *
     * <p>Get a list of Kubernetes clusters in the provided resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Kubernetes clusters in the provided resource group as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<KubernetesClusterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieve the Kubernetes cluster.
     *
     * <p>Get properties of the provided the Kubernetes cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided the Kubernetes cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<KubernetesClusterInner> getByResourceGroupWithResponse(
        String resourceGroupName, String kubernetesClusterName, Context context);

    /**
     * Retrieve the Kubernetes cluster.
     *
     * <p>Get properties of the provided the Kubernetes cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided the Kubernetes cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KubernetesClusterInner getByResourceGroup(String resourceGroupName, String kubernetesClusterName);

    /**
     * Create or update the Kubernetes cluster.
     *
     * <p>Create a new Kubernetes cluster or update the properties of the existing one.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @param kubernetesClusterParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of kubernetesCluster represents the Kubernetes cluster hosted on
     *     Network Cloud.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<KubernetesClusterInner>, KubernetesClusterInner> beginCreateOrUpdate(
        String resourceGroupName, String kubernetesClusterName, KubernetesClusterInner kubernetesClusterParameters);

    /**
     * Create or update the Kubernetes cluster.
     *
     * <p>Create a new Kubernetes cluster or update the properties of the existing one.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @param kubernetesClusterParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of kubernetesCluster represents the Kubernetes cluster hosted on
     *     Network Cloud.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<KubernetesClusterInner>, KubernetesClusterInner> beginCreateOrUpdate(
        String resourceGroupName,
        String kubernetesClusterName,
        KubernetesClusterInner kubernetesClusterParameters,
        Context context);

    /**
     * Create or update the Kubernetes cluster.
     *
     * <p>Create a new Kubernetes cluster or update the properties of the existing one.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @param kubernetesClusterParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return kubernetesCluster represents the Kubernetes cluster hosted on Network Cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KubernetesClusterInner createOrUpdate(
        String resourceGroupName, String kubernetesClusterName, KubernetesClusterInner kubernetesClusterParameters);

    /**
     * Create or update the Kubernetes cluster.
     *
     * <p>Create a new Kubernetes cluster or update the properties of the existing one.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @param kubernetesClusterParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return kubernetesCluster represents the Kubernetes cluster hosted on Network Cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KubernetesClusterInner createOrUpdate(
        String resourceGroupName,
        String kubernetesClusterName,
        KubernetesClusterInner kubernetesClusterParameters,
        Context context);

    /**
     * Delete the Kubernetes cluster.
     *
     * <p>Delete the provided Kubernetes cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String kubernetesClusterName);

    /**
     * Delete the Kubernetes cluster.
     *
     * <p>Delete the provided Kubernetes cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String kubernetesClusterName, Context context);

    /**
     * Delete the Kubernetes cluster.
     *
     * <p>Delete the provided Kubernetes cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String kubernetesClusterName);

    /**
     * Delete the Kubernetes cluster.
     *
     * <p>Delete the provided Kubernetes cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String kubernetesClusterName, Context context);

    /**
     * Patch the Kubernetes cluster.
     *
     * <p>Patch the properties of the provided Kubernetes cluster, or update the tags associated with the Kubernetes
     * cluster. Properties and tag updates can be done independently.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of kubernetesCluster represents the Kubernetes cluster hosted on
     *     Network Cloud.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<KubernetesClusterInner>, KubernetesClusterInner> beginUpdate(
        String resourceGroupName, String kubernetesClusterName);

    /**
     * Patch the Kubernetes cluster.
     *
     * <p>Patch the properties of the provided Kubernetes cluster, or update the tags associated with the Kubernetes
     * cluster. Properties and tag updates can be done independently.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @param kubernetesClusterUpdateParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of kubernetesCluster represents the Kubernetes cluster hosted on
     *     Network Cloud.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<KubernetesClusterInner>, KubernetesClusterInner> beginUpdate(
        String resourceGroupName,
        String kubernetesClusterName,
        KubernetesClusterPatchParameters kubernetesClusterUpdateParameters,
        Context context);

    /**
     * Patch the Kubernetes cluster.
     *
     * <p>Patch the properties of the provided Kubernetes cluster, or update the tags associated with the Kubernetes
     * cluster. Properties and tag updates can be done independently.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return kubernetesCluster represents the Kubernetes cluster hosted on Network Cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KubernetesClusterInner update(String resourceGroupName, String kubernetesClusterName);

    /**
     * Patch the Kubernetes cluster.
     *
     * <p>Patch the properties of the provided Kubernetes cluster, or update the tags associated with the Kubernetes
     * cluster. Properties and tag updates can be done independently.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @param kubernetesClusterUpdateParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return kubernetesCluster represents the Kubernetes cluster hosted on Network Cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KubernetesClusterInner update(
        String resourceGroupName,
        String kubernetesClusterName,
        KubernetesClusterPatchParameters kubernetesClusterUpdateParameters,
        Context context);

    /**
     * Restart a targeted node.
     *
     * <p>Restart a targeted node of a Kubernetes cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @param kubernetesClusterRestartNodeParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestartNode(
        String resourceGroupName,
        String kubernetesClusterName,
        KubernetesClusterRestartNodeParameters kubernetesClusterRestartNodeParameters);

    /**
     * Restart a targeted node.
     *
     * <p>Restart a targeted node of a Kubernetes cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @param kubernetesClusterRestartNodeParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestartNode(
        String resourceGroupName,
        String kubernetesClusterName,
        KubernetesClusterRestartNodeParameters kubernetesClusterRestartNodeParameters,
        Context context);

    /**
     * Restart a targeted node.
     *
     * <p>Restart a targeted node of a Kubernetes cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @param kubernetesClusterRestartNodeParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restartNode(
        String resourceGroupName,
        String kubernetesClusterName,
        KubernetesClusterRestartNodeParameters kubernetesClusterRestartNodeParameters);

    /**
     * Restart a targeted node.
     *
     * <p>Restart a targeted node of a Kubernetes cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param kubernetesClusterName The name of the Kubernetes cluster.
     * @param kubernetesClusterRestartNodeParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restartNode(
        String resourceGroupName,
        String kubernetesClusterName,
        KubernetesClusterRestartNodeParameters kubernetesClusterRestartNodeParameters,
        Context context);
}