// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.datalakeanalytics.fluent.AccountsClient;
import com.azure.resourcemanager.datalakeanalytics.fluent.ComputePoliciesClient;
import com.azure.resourcemanager.datalakeanalytics.fluent.DataLakeAnalyticsAccountManagementClient;
import com.azure.resourcemanager.datalakeanalytics.fluent.DataLakeStoreAccountsClient;
import com.azure.resourcemanager.datalakeanalytics.fluent.FirewallRulesClient;
import com.azure.resourcemanager.datalakeanalytics.fluent.LocationsClient;
import com.azure.resourcemanager.datalakeanalytics.fluent.OperationsClient;
import com.azure.resourcemanager.datalakeanalytics.fluent.StorageAccountsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the DataLakeAnalyticsAccountManagementClientImpl type.
 */
@ServiceClient(builder = DataLakeAnalyticsAccountManagementClientBuilder.class)
public final class DataLakeAnalyticsAccountManagementClientImpl implements DataLakeAnalyticsAccountManagementClient {
    /**
     * Get subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part
     * of the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets Get subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * server parameter.
     */
    private final String endpoint;

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Api Version.
     */
    private final String apiVersion;

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The default poll interval for long-running operation.
     */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /**
     * The AccountsClient object to access its operations.
     */
    private final AccountsClient accounts;

    /**
     * Gets the AccountsClient object to access its operations.
     * 
     * @return the AccountsClient object.
     */
    public AccountsClient getAccounts() {
        return this.accounts;
    }

    /**
     * The DataLakeStoreAccountsClient object to access its operations.
     */
    private final DataLakeStoreAccountsClient dataLakeStoreAccounts;

    /**
     * Gets the DataLakeStoreAccountsClient object to access its operations.
     * 
     * @return the DataLakeStoreAccountsClient object.
     */
    public DataLakeStoreAccountsClient getDataLakeStoreAccounts() {
        return this.dataLakeStoreAccounts;
    }

    /**
     * The StorageAccountsClient object to access its operations.
     */
    private final StorageAccountsClient storageAccounts;

    /**
     * Gets the StorageAccountsClient object to access its operations.
     * 
     * @return the StorageAccountsClient object.
     */
    public StorageAccountsClient getStorageAccounts() {
        return this.storageAccounts;
    }

    /**
     * The ComputePoliciesClient object to access its operations.
     */
    private final ComputePoliciesClient computePolicies;

    /**
     * Gets the ComputePoliciesClient object to access its operations.
     * 
     * @return the ComputePoliciesClient object.
     */
    public ComputePoliciesClient getComputePolicies() {
        return this.computePolicies;
    }

    /**
     * The FirewallRulesClient object to access its operations.
     */
    private final FirewallRulesClient firewallRules;

    /**
     * Gets the FirewallRulesClient object to access its operations.
     * 
     * @return the FirewallRulesClient object.
     */
    public FirewallRulesClient getFirewallRules() {
        return this.firewallRules;
    }

    /**
     * The OperationsClient object to access its operations.
     */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /**
     * The LocationsClient object to access its operations.
     */
    private final LocationsClient locations;

    /**
     * Gets the LocationsClient object to access its operations.
     * 
     * @return the LocationsClient object.
     */
    public LocationsClient getLocations() {
        return this.locations;
    }

    /**
     * Initializes an instance of DataLakeAnalyticsAccountManagementClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Get subscription credentials which uniquely identify Microsoft Azure subscription. The
     * subscription ID forms part of the URI for every service call.
     * @param endpoint server parameter.
     */
    DataLakeAnalyticsAccountManagementClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        Duration defaultPollInterval, AzureEnvironment environment, String subscriptionId, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2016-11-01";
        this.accounts = new AccountsClientImpl(this);
        this.dataLakeStoreAccounts = new DataLakeStoreAccountsClientImpl(this);
        this.storageAccounts = new StorageAccountsClientImpl(this);
        this.computePolicies = new ComputePoliciesClientImpl(this);
        this.firewallRules = new FirewallRulesClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.locations = new LocationsClientImpl(this);
    }

    /**
     * Gets default client context.
     * 
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     * 
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     * 
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline, Type pollResultType, Type finalResultType, Context context) {
        return PollerFactory.create(serializerAdapter, httpPipeline, pollResultType, finalResultType,
            defaultPollInterval, activationResponse, context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     * 
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse = new HttpResponseImpl(lroError.getResponseStatusCode(), lroError.getResponseHeaders(),
                    lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError = this.getSerializerAdapter()
                            .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(HttpHeaderName.fromString(s));
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataLakeAnalyticsAccountManagementClientImpl.class);
}
