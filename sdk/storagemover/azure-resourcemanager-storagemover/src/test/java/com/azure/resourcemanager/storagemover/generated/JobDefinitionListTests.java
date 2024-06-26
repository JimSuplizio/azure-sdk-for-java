// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagemover.models.JobDefinitionList;

public final class JobDefinitionListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobDefinitionList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"description\":\"rhhbcs\",\"copyMode\":\"Additive\",\"sourceName\":\"ummajtjaod\",\"sourceResourceId\":\"bnbdxkqpxokajion\",\"sourceSubpath\":\"mexgstxgcp\",\"targetName\":\"dg\",\"targetResourceId\":\"ajrmvdjwzrlovmc\",\"targetSubpath\":\"hijco\",\"latestJobRunName\":\"ctbzaq\",\"latestJobRunResourceId\":\"sycbkbfk\",\"latestJobRunStatus\":\"Started\",\"agentName\":\"kexxppof\",\"agentResourceId\":\"axcfjpgddtocjjx\",\"provisioningState\":\"Failed\"},\"id\":\"o\",\"name\":\"exhd\",\"type\":\"xibqeojnx\"},{\"properties\":{\"description\":\"zvddntwndeicbtwn\",\"copyMode\":\"Additive\",\"sourceName\":\"aoqvuh\",\"sourceResourceId\":\"cffcyddglmj\",\"sourceSubpath\":\"jqkwpyeicx\",\"targetName\":\"qciwqvhkhixuigdt\",\"targetResourceId\":\"bob\",\"targetSubpath\":\"ghmewuam\",\"latestJobRunName\":\"hrzayvvtpgvdf\",\"latestJobRunResourceId\":\"otkftutqxlngx\",\"latestJobRunStatus\":\"Started\",\"agentName\":\"ugnxkrxdqmi\",\"agentResourceId\":\"thz\",\"provisioningState\":\"Deleting\"},\"id\":\"rabhjybigeho\",\"name\":\"fbowskanyk\",\"type\":\"zlcuiywgqywgndrv\"},{\"properties\":{\"description\":\"hzgpphrcgyncocpe\",\"copyMode\":\"Additive\",\"sourceName\":\"vmmcoofs\",\"sourceResourceId\":\"zevgb\",\"sourceSubpath\":\"jqabcypmivkwlzuv\",\"targetName\":\"c\",\"targetResourceId\":\"nfnbacfionlebxe\",\"targetSubpath\":\"gtzxdpn\",\"latestJobRunName\":\"qqwx\",\"latestJobRunResourceId\":\"feallnwsu\",\"latestJobRunStatus\":\"Canceling\",\"agentName\":\"jampmngnzscxaqw\",\"agentResourceId\":\"chcbonqvpkvlrxnj\",\"provisioningState\":\"Canceled\"},\"id\":\"ipheoflokeyyien\",\"name\":\"bdlwtgrhpdjpj\",\"type\":\"masxazjpqyegu\"},{\"properties\":{\"description\":\"hb\",\"copyMode\":\"Mirror\",\"sourceName\":\"hejjz\",\"sourceResourceId\":\"dudgwdslfhot\",\"sourceSubpath\":\"cynpwlbjnp\",\"targetName\":\"acfta\",\"targetResourceId\":\"h\",\"targetSubpath\":\"ltyfsop\",\"latestJobRunName\":\"suesnzw\",\"latestJobRunResourceId\":\"jbavorxzdm\",\"latestJobRunStatus\":\"Succeeded\",\"agentName\":\"bqvudwxdndn\",\"agentResourceId\":\"w\",\"provisioningState\":\"Deleting\"},\"id\":\"ugw\",\"name\":\"kcglhslaz\",\"type\":\"dyggdtjixhbku\"}],\"nextLink\":\"qweykhmenev\"}")
            .toObject(JobDefinitionList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobDefinitionList model = new JobDefinitionList();
        model = BinaryData.fromObject(model).toObject(JobDefinitionList.class);
    }
}
