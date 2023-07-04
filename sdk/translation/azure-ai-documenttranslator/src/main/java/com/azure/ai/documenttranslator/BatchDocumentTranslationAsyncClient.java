// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.documenttranslator;

import com.azure.ai.documenttranslator.implementation.DocumentTranslationsImpl;
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
import com.azure.core.util.polling.PollerFlux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous BatchDocumentTranslationClient type. */
@ServiceClient(builder = BatchDocumentTranslationClientBuilder.class, isAsync = true)
public final class BatchDocumentTranslationAsyncClient {
    @Generated private final DocumentTranslationsImpl serviceClient;

    /**
     * Initializes an instance of BatchDocumentTranslationAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    BatchDocumentTranslationAsyncClient(DocumentTranslationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Submit a document translation request to the Document Translation service
     *
     * <p>Use this API to submit a bulk (batch) translation request to the Document Translation service. Each request
     * can contain multiple documents and must contain a source and destination container for each document.
     *
     * <p>The prefix and suffix filter (if supplied) are used to filter folders. The prefix is applied to the subpath
     * after the container name.
     *
     * <p>Glossaries / Translation memory can be included in the request and are applied by the service when the
     * document is translated.
     *
     * <p>If the glossary is invalid or unreachable during translation, an error is indicated in the document status. If
     * a file with the same name already exists at the destination, it will be overwritten. The targetUrl for each
     * target language must be unique.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     inputs (Required): [
     *          (Required){
     *             source (Required): {
     *                 sourceUrl: String (Required)
     *                 filter (Optional): {
     *                     prefix: String (Optional)
     *                     suffix: String (Optional)
     *                 }
     *                 language: String (Optional)
     *                 storageSource: String(AzureBlob) (Optional)
     *             }
     *             targets (Required): [
     *                  (Required){
     *                     targetUrl: String (Required)
     *                     category: String (Optional)
     *                     language: String (Required)
     *                     glossaries (Optional): [
     *                          (Optional){
     *                             glossaryUrl: String (Required)
     *                             format: String (Required)
     *                             version: String (Optional)
     *                             storageSource: String(AzureBlob) (Optional)
     *                         }
     *                     ]
     *                     storageSource: String(AzureBlob) (Optional)
     *                 }
     *             ]
     *             storageType: String(Folder/File) (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param body request details.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginStartTranslation(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.beginStartTranslationAsync(body, requestOptions);
    }

    /**
     * Returns a list of batch requests submitted and the status for each request
     *
     * <p>Returns a list of batch requests submitted and the status for each request. This list only contains batch
     * requests submitted by the user (based on the resource).
     *
     * <p>If the number of requests exceeds our paging limit, server-side paging is used. Paginated responses indicate a
     * partial result and include a continuation token in the response. The absence of a continuation token means that
     * no additional pages are available.
     *
     * <p>$top, $skip and $maxpagesize query parameters can be used to specify a number of results to return and an
     * offset for the collection.
     *
     * <p>$top indicates the total number of records the user wants to be returned across all pages. $skip indicates the
     * number of records to skip from the list of batches based on the sorting method specified. By default, we sort by
     * descending start time. $maxpagesize is the maximum items returned in a page. If more items are requested via $top
     * (or $top is not specified and there are more items to be returned), @nextLink will contain the link to the next
     * page.
     *
     * <p>$orderBy query parameter can be used to sort the returned list (ex "$orderBy=createdDateTimeUtc asc" or
     * "$orderBy=createdDateTimeUtc desc"). The default sorting is descending by createdDateTimeUtc. Some query
     * parameters can be used to filter the returned list (ex: "status=Succeeded,Cancelled") will only return succeeded
     * and cancelled operations. createdDateTimeUtcStart and createdDateTimeUtcEnd can be used combined or separately to
     * specify a range of datetime to filter the returned list by. The supported filtering query parameters are (status,
     * ids, createdDateTimeUtcStart, createdDateTimeUtcEnd).
     *
     * <p>The server honors the values specified by the client. However, clients must be prepared to handle responses
     * that contain a different page size or contain a continuation token.
     *
     * <p>When both $top and $skip are included, the server should first apply $skip and then $top on the collection.
     * Note: If the server can't honor $top and/or $skip, the server must return an error to the client informing about
     * it instead of just ignoring the query options. This reduces the risk of the client making assumptions about the
     * data returned.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>$top</td><td>Integer</td><td>No</td><td>$top indicates the total number of records the user wants to be returned across all pages.
     *
     * Clients MAY use $top and $skip query parameters to specify a number of results to return and an offset into the collection.
     * When both $top and $skip are given by a client, the server SHOULD first apply $skip and then $top on the collection.
     *
     * Note: If the server can't honor $top and/or $skip, the server MUST return an error to the client informing about it instead of just ignoring the query options.</td></tr>
     *     <tr><td>$skip</td><td>Integer</td><td>No</td><td>$skip indicates the number of records to skip from the list of records held by the server based on the sorting method specified.  By default, we sort by descending start time.
     *
     * Clients MAY use $top and $skip query parameters to specify a number of results to return and an offset into the collection.
     * When both $top and $skip are given by a client, the server SHOULD first apply $skip and then $top on the collection.
     *
     * Note: If the server can't honor $top and/or $skip, the server MUST return an error to the client informing about it instead of just ignoring the query options.</td></tr>
     *     <tr><td>$maxpagesize</td><td>Integer</td><td>No</td><td>$maxpagesize is the maximum items returned in a page.  If more items are requested via $top (or $top is not specified and there are more items to be returned), @nextLink will contain the link to the next page.
     *
     * Clients MAY request server-driven paging with a specific page size by specifying a $maxpagesize preference. The server SHOULD honor this preference if the specified page size is smaller than the server's default page size.</td></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>No</td><td>Ids to use in filtering. In the form of "," separated string.</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>No</td><td>Statuses to use in filtering. In the form of "," separated string.</td></tr>
     *     <tr><td>createdDateTimeUtcStart</td><td>OffsetDateTime</td><td>No</td><td>the start datetime to get items after</td></tr>
     *     <tr><td>createdDateTimeUtcEnd</td><td>OffsetDateTime</td><td>No</td><td>the end datetime to get items before</td></tr>
     *     <tr><td>$orderBy</td><td>List&lt;String&gt;</td><td>No</td><td>the sorting query for the collection (ex: 'CreatedDateTimeUtc asc', 'CreatedDateTimeUtc desc'). In the form of "," separated string.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     createdDateTimeUtc: OffsetDateTime (Required)
     *     lastActionDateTimeUtc: OffsetDateTime (Required)
     *     status: String(NotStarted/Running/Succeeded/Failed/Cancelled/Cancelling/ValidationFailed) (Required)
     *     error (Optional): {
     *         code: String(InvalidRequest/InvalidArgument/InternalServerError/ServiceUnavailable/ResourceNotFound/Unauthorized/RequestRateTooHigh) (Required)
     *         message: String (Required)
     *         target: String (Optional)
     *         innerError (Optional): {
     *             code: String (Required)
     *             message: String (Required)
     *             target: String (Optional)
     *             innerError (Optional): (recursive schema, see innerError above)
     *         }
     *     }
     *     summary (Required): {
     *         total: int (Required)
     *         failed: int (Required)
     *         success: int (Required)
     *         inProgress: int (Required)
     *         notYetStarted: int (Required)
     *         cancelled: int (Required)
     *         totalCharacterCharged: long (Required)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return translation job Status Response as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getTranslationsStatus(RequestOptions requestOptions) {
        return this.serviceClient.getTranslationsStatusAsync(requestOptions);
    }

    /**
     * Returns the status for a specific document
     *
     * <p>Returns the translation status for a specific document based on the request Id and document Id.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     path: String (Optional)
     *     sourcePath: String (Required)
     *     createdDateTimeUtc: OffsetDateTime (Required)
     *     lastActionDateTimeUtc: OffsetDateTime (Required)
     *     status: String(NotStarted/Running/Succeeded/Failed/Cancelled/Cancelling/ValidationFailed) (Required)
     *     to: String (Required)
     *     error (Optional): {
     *         code: String(InvalidRequest/InvalidArgument/InternalServerError/ServiceUnavailable/ResourceNotFound/Unauthorized/RequestRateTooHigh) (Required)
     *         message: String (Required)
     *         target: String (Optional)
     *         innerError (Optional): {
     *             code: String (Required)
     *             message: String (Required)
     *             target: String (Optional)
     *             innerError (Optional): (recursive schema, see innerError above)
     *         }
     *     }
     *     progress: float (Required)
     *     id: String (Required)
     *     characterCharged: Long (Optional)
     * }
     * }</pre>
     *
     * @param id Format - uuid. The batch id.
     * @param documentId Format - uuid. The document id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return document Status Response along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDocumentStatusWithResponse(
            String id, String documentId, RequestOptions requestOptions) {
        return this.serviceClient.getDocumentStatusWithResponseAsync(id, documentId, requestOptions);
    }

    /**
     * Returns the status for a document translation request
     *
     * <p>Returns the status for a document translation request. The status includes the overall request status, as well
     * as the status for documents that are being translated as part of that request.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     createdDateTimeUtc: OffsetDateTime (Required)
     *     lastActionDateTimeUtc: OffsetDateTime (Required)
     *     status: String(NotStarted/Running/Succeeded/Failed/Cancelled/Cancelling/ValidationFailed) (Required)
     *     error (Optional): {
     *         code: String(InvalidRequest/InvalidArgument/InternalServerError/ServiceUnavailable/ResourceNotFound/Unauthorized/RequestRateTooHigh) (Required)
     *         message: String (Required)
     *         target: String (Optional)
     *         innerError (Optional): {
     *             code: String (Required)
     *             message: String (Required)
     *             target: String (Optional)
     *             innerError (Optional): (recursive schema, see innerError above)
     *         }
     *     }
     *     summary (Required): {
     *         total: int (Required)
     *         failed: int (Required)
     *         success: int (Required)
     *         inProgress: int (Required)
     *         notYetStarted: int (Required)
     *         cancelled: int (Required)
     *         totalCharacterCharged: long (Required)
     *     }
     * }
     * }</pre>
     *
     * @param id Format - uuid. The operation id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return translation job status response along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getTranslationStatusWithResponse(String id, RequestOptions requestOptions) {
        return this.serviceClient.getTranslationStatusWithResponseAsync(id, requestOptions);
    }

    /**
     * Cancel a currently processing or queued translation
     *
     * <p>Cancel a currently processing or queued translation. Cancel a currently processing or queued translation. A
     * translation will not be cancelled if it is already completed or failed or cancelling. A bad request will be
     * returned. All documents that have completed translation will not be cancelled and will be charged. All pending
     * documents will be cancelled if possible.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     createdDateTimeUtc: OffsetDateTime (Required)
     *     lastActionDateTimeUtc: OffsetDateTime (Required)
     *     status: String(NotStarted/Running/Succeeded/Failed/Cancelled/Cancelling/ValidationFailed) (Required)
     *     error (Optional): {
     *         code: String(InvalidRequest/InvalidArgument/InternalServerError/ServiceUnavailable/ResourceNotFound/Unauthorized/RequestRateTooHigh) (Required)
     *         message: String (Required)
     *         target: String (Optional)
     *         innerError (Optional): {
     *             code: String (Required)
     *             message: String (Required)
     *             target: String (Optional)
     *             innerError (Optional): (recursive schema, see innerError above)
     *         }
     *     }
     *     summary (Required): {
     *         total: int (Required)
     *         failed: int (Required)
     *         success: int (Required)
     *         inProgress: int (Required)
     *         notYetStarted: int (Required)
     *         cancelled: int (Required)
     *         totalCharacterCharged: long (Required)
     *     }
     * }
     * }</pre>
     *
     * @param id Format - uuid. The operation-id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return translation job status response along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> cancelTranslationWithResponse(String id, RequestOptions requestOptions) {
        return this.serviceClient.cancelTranslationWithResponseAsync(id, requestOptions);
    }

    /**
     * Returns the status for all documents in a batch document translation request
     *
     * <p>Returns the status for all documents in a batch document translation request.
     *
     * <p>If the number of documents in the response exceeds our paging limit, server-side paging is used. Paginated
     * responses indicate a partial result and include a continuation token in the response. The absence of a
     * continuation token means that no additional pages are available.
     *
     * <p>$top, $skip and $maxpagesize query parameters can be used to specify a number of results to return and an
     * offset for the collection.
     *
     * <p>$top indicates the total number of records the user wants to be returned across all pages. $skip indicates the
     * number of records to skip from the list of document status held by the server based on the sorting method
     * specified. By default, we sort by descending start time. $maxpagesize is the maximum items returned in a page. If
     * more items are requested via $top (or $top is not specified and there are more items to be returned), @nextLink
     * will contain the link to the next page.
     *
     * <p>$orderBy query parameter can be used to sort the returned list (ex "$orderBy=createdDateTimeUtc asc" or
     * "$orderBy=createdDateTimeUtc desc"). The default sorting is descending by createdDateTimeUtc. Some query
     * parameters can be used to filter the returned list (ex: "status=Succeeded,Cancelled") will only return succeeded
     * and cancelled documents. createdDateTimeUtcStart and createdDateTimeUtcEnd can be used combined or separately to
     * specify a range of datetime to filter the returned list by. The supported filtering query parameters are (status,
     * ids, createdDateTimeUtcStart, createdDateTimeUtcEnd).
     *
     * <p>When both $top and $skip are included, the server should first apply $skip and then $top on the collection.
     * Note: If the server can't honor $top and/or $skip, the server must return an error to the client informing about
     * it instead of just ignoring the query options. This reduces the risk of the client making assumptions about the
     * data returned.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>$top</td><td>Integer</td><td>No</td><td>$top indicates the total number of records the user wants to be returned across all pages.
     *
     * Clients MAY use $top and $skip query parameters to specify a number of results to return and an offset into the collection.
     * When both $top and $skip are given by a client, the server SHOULD first apply $skip and then $top on the collection.
     *
     * Note: If the server can't honor $top and/or $skip, the server MUST return an error to the client informing about it instead of just ignoring the query options.</td></tr>
     *     <tr><td>$skip</td><td>Integer</td><td>No</td><td>$skip indicates the number of records to skip from the list of records held by the server based on the sorting method specified.  By default, we sort by descending start time.
     *
     * Clients MAY use $top and $skip query parameters to specify a number of results to return and an offset into the collection.
     * When both $top and $skip are given by a client, the server SHOULD first apply $skip and then $top on the collection.
     *
     * Note: If the server can't honor $top and/or $skip, the server MUST return an error to the client informing about it instead of just ignoring the query options.</td></tr>
     *     <tr><td>$maxpagesize</td><td>Integer</td><td>No</td><td>$maxpagesize is the maximum items returned in a page.  If more items are requested via $top (or $top is not specified and there are more items to be returned), @nextLink will contain the link to the next page.
     *
     * Clients MAY request server-driven paging with a specific page size by specifying a $maxpagesize preference. The server SHOULD honor this preference if the specified page size is smaller than the server's default page size.</td></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>No</td><td>Ids to use in filtering. In the form of "," separated string.</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>No</td><td>Statuses to use in filtering. In the form of "," separated string.</td></tr>
     *     <tr><td>createdDateTimeUtcStart</td><td>OffsetDateTime</td><td>No</td><td>the start datetime to get items after</td></tr>
     *     <tr><td>createdDateTimeUtcEnd</td><td>OffsetDateTime</td><td>No</td><td>the end datetime to get items before</td></tr>
     *     <tr><td>$orderBy</td><td>List&lt;String&gt;</td><td>No</td><td>the sorting query for the collection (ex: 'CreatedDateTimeUtc asc', 'CreatedDateTimeUtc desc'). In the form of "," separated string.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     path: String (Optional)
     *     sourcePath: String (Required)
     *     createdDateTimeUtc: OffsetDateTime (Required)
     *     lastActionDateTimeUtc: OffsetDateTime (Required)
     *     status: String(NotStarted/Running/Succeeded/Failed/Cancelled/Cancelling/ValidationFailed) (Required)
     *     to: String (Required)
     *     error (Optional): {
     *         code: String(InvalidRequest/InvalidArgument/InternalServerError/ServiceUnavailable/ResourceNotFound/Unauthorized/RequestRateTooHigh) (Required)
     *         message: String (Required)
     *         target: String (Optional)
     *         innerError (Optional): {
     *             code: String (Required)
     *             message: String (Required)
     *             target: String (Optional)
     *             innerError (Optional): (recursive schema, see innerError above)
     *         }
     *     }
     *     progress: float (Required)
     *     id: String (Required)
     *     characterCharged: Long (Optional)
     * }
     * }</pre>
     *
     * @param id Format - uuid. The operation id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return documents Status Response as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getDocumentsStatus(String id, RequestOptions requestOptions) {
        return this.serviceClient.getDocumentsStatusAsync(id, requestOptions);
    }

    /**
     * Returns a list of supported document formats
     *
     * <p>The list of supported document formats supported by the Document Translation service. The list includes the
     * common file extension, as well as the content-type if using the upload API.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             format: String (Required)
     *             fileExtensions (Required): [
     *                 String (Required)
     *             ]
     *             contentTypes (Required): [
     *                 String (Required)
     *             ]
     *             defaultVersion: String (Optional)
     *             versions (Optional): [
     *                 String (Optional)
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return base type for List return in our api along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getSupportedDocumentFormatsWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getSupportedDocumentFormatsWithResponseAsync(requestOptions);
    }

    /**
     * Returns the list of supported glossary formats
     *
     * <p>The list of supported glossary formats supported by the Document Translation service. The list includes the
     * common file extension used.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             format: String (Required)
     *             fileExtensions (Required): [
     *                 String (Required)
     *             ]
     *             contentTypes (Required): [
     *                 String (Required)
     *             ]
     *             defaultVersion: String (Optional)
     *             versions (Optional): [
     *                 String (Optional)
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return base type for List return in our api along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getSupportedGlossaryFormatsWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getSupportedGlossaryFormatsWithResponseAsync(requestOptions);
    }

    /**
     * Returns a list of supported storage sources
     *
     * <p>Returns a list of storage sources/options supported by the Document Translation service.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *         String(AzureBlob) (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return base type for List return in our api along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getSupportedStorageSourcesWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getSupportedStorageSourcesWithResponseAsync(requestOptions);
    }
}