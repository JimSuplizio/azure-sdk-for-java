// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.quota.fluent.models.GroupQuotaSubscriptionIdInner;

/**
 * An instance of this class provides access to all the operations defined in GroupQuotaSubscriptionsClient.
 */
public interface GroupQuotaSubscriptionsClient {
    /**
     * Adds subscription to the GroupQuotas.
     * 
     * Adds a subscription to GroupQuotas. The subscriptions will be validated based on the additionalAttributes defined
     * in the GroupQuota. The additionalAttributes works as filter for the subscriptions, which can be included in the
     * GroupQuotas. The request's TenantId is validated against the subscription's TenantId.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of this represents a Azure subscriptionId that is associated with a
     * GroupQuotasEntity.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProxyResource>, ProxyResource> beginCreateOrUpdate(String managementGroupId,
        String groupQuotaName);

    /**
     * Adds subscription to the GroupQuotas.
     * 
     * Adds a subscription to GroupQuotas. The subscriptions will be validated based on the additionalAttributes defined
     * in the GroupQuota. The additionalAttributes works as filter for the subscriptions, which can be included in the
     * GroupQuotas. The request's TenantId is validated against the subscription's TenantId.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of this represents a Azure subscriptionId that is associated with a
     * GroupQuotasEntity.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProxyResource>, ProxyResource> beginCreateOrUpdate(String managementGroupId,
        String groupQuotaName, Context context);

    /**
     * Adds subscription to the GroupQuotas.
     * 
     * Adds a subscription to GroupQuotas. The subscriptions will be validated based on the additionalAttributes defined
     * in the GroupQuota. The additionalAttributes works as filter for the subscriptions, which can be included in the
     * GroupQuotas. The request's TenantId is validated against the subscription's TenantId.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this represents a Azure subscriptionId that is associated with a GroupQuotasEntity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProxyResource createOrUpdate(String managementGroupId, String groupQuotaName);

    /**
     * Adds subscription to the GroupQuotas.
     * 
     * Adds a subscription to GroupQuotas. The subscriptions will be validated based on the additionalAttributes defined
     * in the GroupQuota. The additionalAttributes works as filter for the subscriptions, which can be included in the
     * GroupQuotas. The request's TenantId is validated against the subscription's TenantId.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this represents a Azure subscriptionId that is associated with a GroupQuotasEntity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProxyResource createOrUpdate(String managementGroupId, String groupQuotaName, Context context);

    /**
     * Updates the GroupQuotas with the subscription to add to the subscriptions list.
     * 
     * Updates the GroupQuotas with the subscription to add to the subscriptions list. The subscriptions will be
     * validated if additionalAttributes are defined in the GroupQuota. The request's TenantId is validated against the
     * subscription's TenantId.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of this represents a Azure subscriptionId that is associated with a
     * GroupQuotasEntity.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<GroupQuotaSubscriptionIdInner>, GroupQuotaSubscriptionIdInner>
        beginUpdate(String managementGroupId, String groupQuotaName);

    /**
     * Updates the GroupQuotas with the subscription to add to the subscriptions list.
     * 
     * Updates the GroupQuotas with the subscription to add to the subscriptions list. The subscriptions will be
     * validated if additionalAttributes are defined in the GroupQuota. The request's TenantId is validated against the
     * subscription's TenantId.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of this represents a Azure subscriptionId that is associated with a
     * GroupQuotasEntity.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<GroupQuotaSubscriptionIdInner>, GroupQuotaSubscriptionIdInner>
        beginUpdate(String managementGroupId, String groupQuotaName, Context context);

    /**
     * Updates the GroupQuotas with the subscription to add to the subscriptions list.
     * 
     * Updates the GroupQuotas with the subscription to add to the subscriptions list. The subscriptions will be
     * validated if additionalAttributes are defined in the GroupQuota. The request's TenantId is validated against the
     * subscription's TenantId.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this represents a Azure subscriptionId that is associated with a GroupQuotasEntity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GroupQuotaSubscriptionIdInner update(String managementGroupId, String groupQuotaName);

    /**
     * Updates the GroupQuotas with the subscription to add to the subscriptions list.
     * 
     * Updates the GroupQuotas with the subscription to add to the subscriptions list. The subscriptions will be
     * validated if additionalAttributes are defined in the GroupQuota. The request's TenantId is validated against the
     * subscription's TenantId.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this represents a Azure subscriptionId that is associated with a GroupQuotasEntity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GroupQuotaSubscriptionIdInner update(String managementGroupId, String groupQuotaName, Context context);

    /**
     * Removes the subscription from GroupQuotas.
     * 
     * Removes the subscription from GroupQuotas. The request's TenantId is validated against the subscription's
     * TenantId.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String managementGroupId, String groupQuotaName);

    /**
     * Removes the subscription from GroupQuotas.
     * 
     * Removes the subscription from GroupQuotas. The request's TenantId is validated against the subscription's
     * TenantId.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String managementGroupId, String groupQuotaName, Context context);

    /**
     * Removes the subscription from GroupQuotas.
     * 
     * Removes the subscription from GroupQuotas. The request's TenantId is validated against the subscription's
     * TenantId.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String managementGroupId, String groupQuotaName);

    /**
     * Removes the subscription from GroupQuotas.
     * 
     * Removes the subscription from GroupQuotas. The request's TenantId is validated against the subscription's
     * TenantId.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String managementGroupId, String groupQuotaName, Context context);

    /**
     * Returns the subscriptionId along with its provisioning state for being associated with the GroupQuotas.
     * 
     * Returns the subscriptionIds along with its provisioning state for being associated with the GroupQuota. If the
     * subscription is not a member of GroupQuota, it will return 404, else 200.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this represents a Azure subscriptionId that is associated with a GroupQuotasEntity along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GroupQuotaSubscriptionIdInner> getWithResponse(String managementGroupId, String groupQuotaName,
        Context context);

    /**
     * Returns the subscriptionId along with its provisioning state for being associated with the GroupQuotas.
     * 
     * Returns the subscriptionIds along with its provisioning state for being associated with the GroupQuota. If the
     * subscription is not a member of GroupQuota, it will return 404, else 200.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this represents a Azure subscriptionId that is associated with a GroupQuotasEntity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GroupQuotaSubscriptionIdInner get(String managementGroupId, String groupQuotaName);

    /**
     * Returns a list of the subscriptionIds for the GroupQuotas.
     * 
     * Returns a list of the subscriptionIds associated with the GroupQuotas.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of GroupQuotaSubscriptionIds as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GroupQuotaSubscriptionIdInner> list(String managementGroupId, String groupQuotaName);

    /**
     * Returns a list of the subscriptionIds for the GroupQuotas.
     * 
     * Returns a list of the subscriptionIds associated with the GroupQuotas.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of GroupQuotaSubscriptionIds as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GroupQuotaSubscriptionIdInner> list(String managementGroupId, String groupQuotaName, Context context);
}
