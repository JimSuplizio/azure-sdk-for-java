// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for ServerTrustCertificates Delete.
 */
public final class ServerTrustCertificatesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ServerTrustCertificatesDelete.json
     */
    /**
     * Sample code: Delete server trust certificate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteServerTrustCertificate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getServerTrustCertificates()
            .delete("testrg", "testcl", "customerCertificateName", com.azure.core.util.Context.NONE);
    }
}
