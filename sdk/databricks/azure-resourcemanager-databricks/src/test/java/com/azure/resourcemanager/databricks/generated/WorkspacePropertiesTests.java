// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.fluent.models.WorkspaceProperties;
import com.azure.resourcemanager.databricks.models.CreatedBy;
import com.azure.resourcemanager.databricks.models.EncryptionEntitiesDefinition;
import com.azure.resourcemanager.databricks.models.ManagedIdentityConfiguration;
import com.azure.resourcemanager.databricks.models.PublicNetworkAccess;
import com.azure.resourcemanager.databricks.models.RequiredNsgRules;
import com.azure.resourcemanager.databricks.models.WorkspaceCustomBooleanParameter;
import com.azure.resourcemanager.databricks.models.WorkspaceCustomParameters;
import com.azure.resourcemanager.databricks.models.WorkspaceCustomStringParameter;
import com.azure.resourcemanager.databricks.models.WorkspaceEncryptionParameter;
import com.azure.resourcemanager.databricks.models.WorkspacePropertiesEncryption;
import com.azure.resourcemanager.databricks.models.WorkspaceProviderAuthorization;
import java.util.Arrays;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class WorkspacePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspaceProperties model =
            BinaryData
                .fromString(
                    "{\"managedResourceGroupId\":\"hdbihan\",\"parameters\":{\"amlWorkspaceId\":{\"type\":\"String\",\"value\":\"bj\"},\"customVirtualNetworkId\":{\"type\":\"Bool\",\"value\":\"ithxqhabifpi\"},\"customPublicSubnetName\":{\"type\":\"Bool\",\"value\":\"zb\"},\"customPrivateSubnetName\":{\"type\":\"Object\",\"value\":\"pqxu\"},\"enableNoPublicIp\":{\"type\":\"Bool\",\"value\":true},\"loadBalancerBackendPoolName\":{\"type\":\"Bool\",\"value\":\"b\"},\"loadBalancerId\":{\"type\":\"Object\",\"value\":\"xvd\"},\"natGatewayName\":{\"type\":\"Object\",\"value\":\"rtfw\"},\"publicIpName\":{\"type\":\"String\",\"value\":\"gaudcc\"},\"prepareEncryption\":{\"type\":\"String\",\"value\":false},\"encryption\":{\"type\":\"Bool\"},\"requireInfrastructureEncryption\":{\"type\":\"String\",\"value\":true},\"storageAccountName\":{\"type\":\"String\",\"value\":\"napczwlokjy\"},\"storageAccountSkuName\":{\"type\":\"Object\",\"value\":\"vnipjox\"},\"vnetAddressPrefix\":{\"type\":\"Object\",\"value\":\"hgejspodma\"},\"resourceTags\":{\"type\":\"String\",\"value\":\"datadeh\"}},\"provisioningState\":\"Created\",\"uiDefinitionUri\":\"ahuxinpm\",\"authorizations\":[{\"principalId\":\"b9ea483e-c7cb-4551-94a7-4080d0ce0eb6\",\"roleDefinitionId\":\"0b0b6bcc-8097-4e8f-a3d1-069c0a123285\"},{\"principalId\":\"57aa17f9-c759-4e99-8a18-93ac71b51725\",\"roleDefinitionId\":\"80546bc5-d619-41e0-9568-fd0d44ceb327\"},{\"principalId\":\"799c8db6-26cd-45b9-919d-7ddfb207fc8f\",\"roleDefinitionId\":\"5ec90243-32bc-4342-96bf-472f60924500\"}],\"createdBy\":{\"oid\":\"fa7610f7-177e-49d8-994a-89169bace4f0\",\"puid\":\"ixjsprozvcputeg\",\"applicationId\":\"1d60707c-30e5-44ee-ab00-e368d4cc2a4a\"},\"updatedBy\":{\"oid\":\"baee5194-113f-4690-ab7e-57afcc1a7edf\",\"puid\":\"datscmd\",\"applicationId\":\"77a1e544-3cb5-4baa-a3a7-a251629de348\"},\"createdDateTime\":\"2021-06-13T21:33:31Z\",\"workspaceId\":\"suuv\",\"workspaceUrl\":\"jozkrwfndiod\",\"storageAccountIdentity\":{\"principalId\":\"bbeaf97b-b4cf-4603-8579-7c831666ccdf\",\"tenantId\":\"59155f7a-6bad-4715-afa2-47c590e5e292\",\"type\":\"ej\"},\"encryption\":{\"entities\":{}},\"privateEndpointConnections\":[{\"properties\":{\"provisioningState\":\"Updating\"},\"id\":\"psoacctazakljl\",\"name\":\"hbcryffdfdosyge\",\"type\":\"paojakhmsbzjh\"}],\"publicNetworkAccess\":\"Enabled\",\"requiredNsgRules\":\"NoAzureDatabricksRules\"}")
                .toObject(WorkspaceProperties.class);
        Assertions.assertEquals("hdbihan", model.managedResourceGroupId());
        Assertions.assertEquals("bj", model.parameters().amlWorkspaceId().value());
        Assertions.assertEquals("ithxqhabifpi", model.parameters().customVirtualNetworkId().value());
        Assertions.assertEquals("zb", model.parameters().customPublicSubnetName().value());
        Assertions.assertEquals("pqxu", model.parameters().customPrivateSubnetName().value());
        Assertions.assertEquals(true, model.parameters().enableNoPublicIp().value());
        Assertions.assertEquals("b", model.parameters().loadBalancerBackendPoolName().value());
        Assertions.assertEquals("xvd", model.parameters().loadBalancerId().value());
        Assertions.assertEquals("rtfw", model.parameters().natGatewayName().value());
        Assertions.assertEquals("gaudcc", model.parameters().publicIpName().value());
        Assertions.assertEquals(false, model.parameters().prepareEncryption().value());
        Assertions.assertEquals(true, model.parameters().requireInfrastructureEncryption().value());
        Assertions.assertEquals("napczwlokjy", model.parameters().storageAccountName().value());
        Assertions.assertEquals("vnipjox", model.parameters().storageAccountSkuName().value());
        Assertions.assertEquals("hgejspodma", model.parameters().vnetAddressPrefix().value());
        Assertions.assertEquals("ahuxinpm", model.uiDefinitionUri());
        Assertions
            .assertEquals(
                UUID.fromString("b9ea483e-c7cb-4551-94a7-4080d0ce0eb6"), model.authorizations().get(0).principalId());
        Assertions
            .assertEquals(
                UUID.fromString("0b0b6bcc-8097-4e8f-a3d1-069c0a123285"),
                model.authorizations().get(0).roleDefinitionId());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
        Assertions.assertEquals(RequiredNsgRules.NO_AZURE_DATABRICKS_RULES, model.requiredNsgRules());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspaceProperties model =
            new WorkspaceProperties()
                .withManagedResourceGroupId("hdbihan")
                .withParameters(
                    new WorkspaceCustomParameters()
                        .withAmlWorkspaceId(new WorkspaceCustomStringParameter().withValue("bj"))
                        .withCustomVirtualNetworkId(new WorkspaceCustomStringParameter().withValue("ithxqhabifpi"))
                        .withCustomPublicSubnetName(new WorkspaceCustomStringParameter().withValue("zb"))
                        .withCustomPrivateSubnetName(new WorkspaceCustomStringParameter().withValue("pqxu"))
                        .withEnableNoPublicIp(new WorkspaceCustomBooleanParameter().withValue(true))
                        .withLoadBalancerBackendPoolName(new WorkspaceCustomStringParameter().withValue("b"))
                        .withLoadBalancerId(new WorkspaceCustomStringParameter().withValue("xvd"))
                        .withNatGatewayName(new WorkspaceCustomStringParameter().withValue("rtfw"))
                        .withPublicIpName(new WorkspaceCustomStringParameter().withValue("gaudcc"))
                        .withPrepareEncryption(new WorkspaceCustomBooleanParameter().withValue(false))
                        .withEncryption(new WorkspaceEncryptionParameter())
                        .withRequireInfrastructureEncryption(new WorkspaceCustomBooleanParameter().withValue(true))
                        .withStorageAccountName(new WorkspaceCustomStringParameter().withValue("napczwlokjy"))
                        .withStorageAccountSkuName(new WorkspaceCustomStringParameter().withValue("vnipjox"))
                        .withVnetAddressPrefix(new WorkspaceCustomStringParameter().withValue("hgejspodma")))
                .withUiDefinitionUri("ahuxinpm")
                .withAuthorizations(
                    Arrays
                        .asList(
                            new WorkspaceProviderAuthorization()
                                .withPrincipalId(UUID.fromString("b9ea483e-c7cb-4551-94a7-4080d0ce0eb6"))
                                .withRoleDefinitionId(UUID.fromString("0b0b6bcc-8097-4e8f-a3d1-069c0a123285")),
                            new WorkspaceProviderAuthorization()
                                .withPrincipalId(UUID.fromString("57aa17f9-c759-4e99-8a18-93ac71b51725"))
                                .withRoleDefinitionId(UUID.fromString("80546bc5-d619-41e0-9568-fd0d44ceb327")),
                            new WorkspaceProviderAuthorization()
                                .withPrincipalId(UUID.fromString("799c8db6-26cd-45b9-919d-7ddfb207fc8f"))
                                .withRoleDefinitionId(UUID.fromString("5ec90243-32bc-4342-96bf-472f60924500"))))
                .withCreatedBy(new CreatedBy())
                .withUpdatedBy(new CreatedBy())
                .withStorageAccountIdentity(new ManagedIdentityConfiguration())
                .withEncryption(new WorkspacePropertiesEncryption().withEntities(new EncryptionEntitiesDefinition()))
                .withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
                .withRequiredNsgRules(RequiredNsgRules.NO_AZURE_DATABRICKS_RULES);
        model = BinaryData.fromObject(model).toObject(WorkspaceProperties.class);
        Assertions.assertEquals("hdbihan", model.managedResourceGroupId());
        Assertions.assertEquals("bj", model.parameters().amlWorkspaceId().value());
        Assertions.assertEquals("ithxqhabifpi", model.parameters().customVirtualNetworkId().value());
        Assertions.assertEquals("zb", model.parameters().customPublicSubnetName().value());
        Assertions.assertEquals("pqxu", model.parameters().customPrivateSubnetName().value());
        Assertions.assertEquals(true, model.parameters().enableNoPublicIp().value());
        Assertions.assertEquals("b", model.parameters().loadBalancerBackendPoolName().value());
        Assertions.assertEquals("xvd", model.parameters().loadBalancerId().value());
        Assertions.assertEquals("rtfw", model.parameters().natGatewayName().value());
        Assertions.assertEquals("gaudcc", model.parameters().publicIpName().value());
        Assertions.assertEquals(false, model.parameters().prepareEncryption().value());
        Assertions.assertEquals(true, model.parameters().requireInfrastructureEncryption().value());
        Assertions.assertEquals("napczwlokjy", model.parameters().storageAccountName().value());
        Assertions.assertEquals("vnipjox", model.parameters().storageAccountSkuName().value());
        Assertions.assertEquals("hgejspodma", model.parameters().vnetAddressPrefix().value());
        Assertions.assertEquals("ahuxinpm", model.uiDefinitionUri());
        Assertions
            .assertEquals(
                UUID.fromString("b9ea483e-c7cb-4551-94a7-4080d0ce0eb6"), model.authorizations().get(0).principalId());
        Assertions
            .assertEquals(
                UUID.fromString("0b0b6bcc-8097-4e8f-a3d1-069c0a123285"),
                model.authorizations().get(0).roleDefinitionId());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.publicNetworkAccess());
        Assertions.assertEquals(RequiredNsgRules.NO_AZURE_DATABRICKS_RULES, model.requiredNsgRules());
    }
}