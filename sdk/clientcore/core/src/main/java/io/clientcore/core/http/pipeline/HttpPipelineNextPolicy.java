// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.http.pipeline;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.implementation.http.HttpPipelineCallState;
import io.clientcore.core.instrumentation.logging.ClientLogger;
import io.clientcore.core.models.binarydata.BinaryData;

import java.io.IOException;
import java.io.UncheckedIOException;

/**
 * A type that invokes next policy in the pipeline.
 */
@Metadata(properties = MetadataProperties.IMMUTABLE)
public class HttpPipelineNextPolicy {
    private static final ClientLogger LOGGER = new ClientLogger(HttpPipelineNextPolicy.class);

    private final HttpPipelineCallState state;

    /**
     * Package-private constructor. Creates an HttpPipelineNextPolicy instance.
     *
     * @param state The pipeline call state.
     */
    HttpPipelineNextPolicy(HttpPipelineCallState state) {
        this.state = state;
    }

    /**
     * Invokes the next {@link HttpPipelinePolicy}.
     *
     * @return The response.
     * @throws UncheckedIOException If an error occurs when sending the request or receiving the response.
     */
    public Response<BinaryData> process() {
        HttpPipelinePolicy nextPolicy = state.getNextPolicy();

        if (nextPolicy == null) {
            try {
                return this.state.getPipeline().getHttpClient().send(this.state.getHttpRequest());
            } catch (IOException e) {
                // TODO (alzimmer): Having 'process' throw an IOException forces HttpPipelinePolicy and HttpPipeline to
                //  also throw IOException. Is this something we'd want?
                throw LOGGER.logThrowableAsError(new UncheckedIOException(e));
            }
        } else {
            return nextPolicy.process(this.state.getHttpRequest(), this);
        }
    }

    /**
     * Copies the current state of the {@link HttpPipelineNextPolicy}.
     * <p>
     * This method must be used when a re-request is made in the pipeline.
     *
     * @return A new instance of this next pipeline policy.
     */
    public HttpPipelineNextPolicy copy() {
        return new HttpPipelineNextPolicy(this.state.copy());
    }
}
