// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmFailbackProtectedDiskDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageRcmFailbackSyncDetails;

public final class InMageRcmFailbackProtectedDiskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageRcmFailbackProtectedDiskDetails model = BinaryData.fromString(
            "{\"diskId\":\"lvs\",\"diskName\":\"ywjopac\",\"isOSDisk\":\"hydv\",\"capacityInBytes\":7196910522233474156,\"diskUuid\":\"gpmillxgjs\",\"dataPendingInLogDataStoreInMB\":70.24965275674056,\"dataPendingAtSourceAgentInMB\":88.82129123990158,\"isInitialReplicationComplete\":\"iobijeiydyeuynhb\",\"irDetails\":{\"progressHealth\":\"InProgress\",\"transferredBytes\":8991689761064995996,\"last15MinutesTransferredBytes\":870519523900353978,\"lastDataTransferTimeUtc\":\"opdweoft\",\"processedBytes\":6885598853699298526,\"startTime\":\"igsioctqkm\",\"lastRefreshTime\":\"a\",\"progressPercentage\":1045792223},\"resyncDetails\":{\"progressHealth\":\"NoProgress\",\"transferredBytes\":5944613768997801995,\"last15MinutesTransferredBytes\":8824443803915143462,\"lastDataTransferTimeUtc\":\"sstfjxtvlxx\",\"processedBytes\":5911202779481860995,\"startTime\":\"rr\",\"lastRefreshTime\":\"mxeezwyh\",\"progressPercentage\":1081801760},\"lastSyncTime\":\"2021-10-30T12:38:01Z\"}")
            .toObject(InMageRcmFailbackProtectedDiskDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageRcmFailbackProtectedDiskDetails model
            = new InMageRcmFailbackProtectedDiskDetails().withIrDetails(new InMageRcmFailbackSyncDetails())
                .withResyncDetails(new InMageRcmFailbackSyncDetails());
        model = BinaryData.fromObject(model).toObject(InMageRcmFailbackProtectedDiskDetails.class);
    }
}
