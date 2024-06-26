// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation.changefeed;

import com.azure.cosmos.implementation.changefeed.common.ChangeFeedState;
import reactor.core.publisher.Mono;

/**
 * Checkpoint the given partition up to the given continuation token.
 */
public interface PartitionCheckpointer {
    /**
     * Checkpoints the given partition up to the given continuation token.
     *
     * @param continuationState the continuation token.
     * @return a deferred operation of this call.
     */
    Mono<Lease> checkpointPartition(ChangeFeedState continuationState);

    /**
     * Sets the cancellation token in case we need to bail out before check-pointing.
     *
     * @param cancellationToken the cancellation token.
     * @return this instance.
     */
    PartitionCheckpointer setCancellationToken(CancellationToken cancellationToken);
}
