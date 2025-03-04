// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.scanning;

import com.azure.analytics.purview.scanning.implementation.ClassificationRulesImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous PurviewScanningClient type.
 */
@ServiceClient(builder = PurviewScanningClientBuilder.class, isAsync = true)
public final class ClassificationRulesAsyncClient {
    @Generated
    private final ClassificationRulesImpl serviceClient;

    /**
     * Initializes an instance of ClassificationRulesAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    ClassificationRulesAsyncClient(ClassificationRulesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get a classification rule.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Optional)
     *     name: String (Optional)
     *     kind: String(System/Custom) (Required)
     * }
     * }
     * </pre>
     * 
     * @param classificationRuleName The classificationRuleName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a classification rule along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(String classificationRuleName, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(classificationRuleName, requestOptions);
    }

    /**
     * Creates or Updates a classification rule.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>Content-Type</td><td>String</td><td>No</td><td>The content type. Allowed values:
     * "application/json".</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Optional)
     *     name: String (Optional)
     *     kind: String(System/Custom) (Required)
     * }
     * }
     * </pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Optional)
     *     name: String (Optional)
     *     kind: String(System/Custom) (Required)
     * }
     * }
     * </pre>
     * 
     * @param classificationRuleName The classificationRuleName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(String classificationRuleName,
        RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponseAsync(classificationRuleName, requestOptions);
    }

    /**
     * Deletes a classification rule.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Optional)
     *     name: String (Optional)
     *     kind: String(System/Custom) (Required)
     * }
     * }
     * </pre>
     * 
     * @param classificationRuleName The classificationRuleName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> deleteWithResponse(String classificationRuleName, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponseAsync(classificationRuleName, requestOptions);
    }

    /**
     * List classification rules in Account.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Optional)
     *     name: String (Optional)
     *     kind: String(System/Custom) (Required)
     * }
     * }
     * </pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAll(RequestOptions requestOptions) {
        return this.serviceClient.listAllAsync(requestOptions);
    }

    /**
     * Lists the rule versions of a classification rule.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     id: String (Optional)
     *     name: String (Optional)
     *     kind: String(System/Custom) (Required)
     * }
     * }
     * </pre>
     * 
     * @param classificationRuleName The classificationRuleName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listVersionsByClassificationRuleName(String classificationRuleName,
        RequestOptions requestOptions) {
        return this.serviceClient.listVersionsByClassificationRuleNameAsync(classificationRuleName, requestOptions);
    }

    /**
     * Sets Classification Action on a specific classification rule version.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     scanResultId: String (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     endTime: OffsetDateTime (Optional)
     *     status: String(Accepted/InProgress/TransientFailure/Succeeded/Failed/Canceled) (Optional)
     *     error (Optional): {
     *         code: String (Optional)
     *         message: String (Optional)
     *         target: String (Optional)
     *         details (Optional): [
     *              (Optional){
     *                 code: String (Optional)
     *                 message: String (Optional)
     *                 target: String (Optional)
     *                 details (Optional): [
     *                     (recursive schema, see above)
     *                 ]
     *             }
     *         ]
     *     }
     * }
     * }
     * </pre>
     * 
     * @param classificationRuleName The classificationRuleName parameter.
     * @param classificationRuleVersion The classificationRuleVersion parameter.
     * @param action The action parameter. Allowed values: "Keep", "Delete".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> tagClassificationVersionWithResponse(String classificationRuleName,
        int classificationRuleVersion, String action, RequestOptions requestOptions) {
        return this.serviceClient.tagClassificationVersionWithResponseAsync(classificationRuleName,
            classificationRuleVersion, action, requestOptions);
    }
}
