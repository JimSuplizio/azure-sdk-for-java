// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.migration.assessment.fluent.models.AssessedSqlInstanceV2Inner;

/**
 * An instance of this class provides access to all the operations defined in AssessedSqlInstanceV2OperationsClient.
 */
public interface AssessedSqlInstanceV2OperationsClient {
    /**
     * List AssessedSqlInstanceV2 resources by SqlAssessmentV2.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName Assessment Project Name.
     * @param groupName Group ARM name.
     * @param assessmentName SQL Assessment arm name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AssessedSqlInstanceV2 list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AssessedSqlInstanceV2Inner> listBySqlAssessmentV2(String resourceGroupName, String projectName,
        String groupName, String assessmentName);

    /**
     * List AssessedSqlInstanceV2 resources by SqlAssessmentV2.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName Assessment Project Name.
     * @param groupName Group ARM name.
     * @param assessmentName SQL Assessment arm name.
     * @param filter Filter query.
     * @param pageSize Optional parameter for page size.
     * @param continuationToken Optional parameter for continuation token.
     * @param totalRecordCount Total record count.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a AssessedSqlInstanceV2 list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AssessedSqlInstanceV2Inner> listBySqlAssessmentV2(String resourceGroupName, String projectName,
        String groupName, String assessmentName, String filter, Integer pageSize, String continuationToken,
        Integer totalRecordCount, Context context);

    /**
     * Get a AssessedSqlInstanceV2.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName Assessment Project Name.
     * @param groupName Group ARM name.
     * @param assessmentName SQL Assessment arm name.
     * @param assessedSqlInstanceName Sql assessment Assessed Instance ARM name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AssessedSqlInstanceV2 along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AssessedSqlInstanceV2Inner> getWithResponse(String resourceGroupName, String projectName, String groupName,
        String assessmentName, String assessedSqlInstanceName, Context context);

    /**
     * Get a AssessedSqlInstanceV2.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName Assessment Project Name.
     * @param groupName Group ARM name.
     * @param assessmentName SQL Assessment arm name.
     * @param assessedSqlInstanceName Sql assessment Assessed Instance ARM name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a AssessedSqlInstanceV2.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AssessedSqlInstanceV2Inner get(String resourceGroupName, String projectName, String groupName,
        String assessmentName, String assessedSqlInstanceName);
}
