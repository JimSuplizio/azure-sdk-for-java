// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.BackupVaultResourceInner;
import com.azure.resourcemanager.dataprotection.models.BackupVault;
import com.azure.resourcemanager.dataprotection.models.BackupVaultResourceList;
import com.azure.resourcemanager.dataprotection.models.DppIdentityDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupVaultResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupVaultResourceList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Unknown\",\"resourceMoveState\":\"MoveSucceeded\",\"storageSettings\":[],\"isVaultProtectedByResourceGuard\":true},\"identity\":{\"principalId\":\"m\",\"tenantId\":\"mtz\",\"type\":\"bsphrupidgsybbe\"},\"eTag\":\"ph\",\"location\":\"cmsxaobhdxbm\",\"tags\":{\"zhwlrxy\":\"oqjzehtbmufpowno\"},\"id\":\"qsoqijgkd\",\"name\":\"bpazlobcufpdzn\",\"type\":\"btcqq\"},{\"properties\":{\"provisioningState\":\"Unknown\",\"resourceMoveState\":\"CriticalFailure\",\"storageSettings\":[],\"isVaultProtectedByResourceGuard\":false},\"identity\":{\"principalId\":\"ojywifsqesa\",\"tenantId\":\"dfmglzlhjx\",\"type\":\"f\"},\"eTag\":\"mrvktsizntoc\",\"location\":\"a\",\"tags\":{\"cmpoyfdkfogkny\":\"jpsq\",\"eqsrdeupewnwreit\":\"jofjd\"},\"id\":\"zyf\",\"name\":\"usarhmofc\",\"type\":\"hs\"},{\"properties\":{\"provisioningState\":\"Updating\",\"resourceMoveState\":\"CommitTimedout\",\"storageSettings\":[],\"isVaultProtectedByResourceGuard\":true},\"identity\":{\"principalId\":\"uksjtxukcdmp\",\"tenantId\":\"cryuan\",\"type\":\"uxzdxtay\"},\"eTag\":\"hmwhfpmrqo\",\"location\":\"tu\",\"tags\":{\"nwzsymg\":\"ryrtihfxtijbpzv\",\"anufhfcbjysag\":\"zufcyzkohdbi\"},\"id\":\"th\",\"name\":\"qhabifpikxwcz\",\"type\":\"yscnpqxu\"}],\"nextLink\":\"vyq\"}")
                .toObject(BackupVaultResourceList.class);
        Assertions.assertEquals("vyq", model.nextLink());
        Assertions.assertEquals("cmsxaobhdxbm", model.value().get(0).location());
        Assertions.assertEquals("oqjzehtbmufpowno", model.value().get(0).tags().get("zhwlrxy"));
        Assertions.assertEquals("ph", model.value().get(0).etag());
        Assertions.assertEquals("bsphrupidgsybbe", model.value().get(0).identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupVaultResourceList model =
            new BackupVaultResourceList()
                .withNextLink("vyq")
                .withValue(
                    Arrays
                        .asList(
                            new BackupVaultResourceInner()
                                .withLocation("cmsxaobhdxbm")
                                .withTags(mapOf("zhwlrxy", "oqjzehtbmufpowno"))
                                .withEtag("ph")
                                .withIdentity(new DppIdentityDetails().withType("bsphrupidgsybbe"))
                                .withProperties(new BackupVault().withStorageSettings(Arrays.asList())),
                            new BackupVaultResourceInner()
                                .withLocation("a")
                                .withTags(mapOf("cmpoyfdkfogkny", "jpsq", "eqsrdeupewnwreit", "jofjd"))
                                .withEtag("mrvktsizntoc")
                                .withIdentity(new DppIdentityDetails().withType("f"))
                                .withProperties(new BackupVault().withStorageSettings(Arrays.asList())),
                            new BackupVaultResourceInner()
                                .withLocation("tu")
                                .withTags(mapOf("nwzsymg", "ryrtihfxtijbpzv", "anufhfcbjysag", "zufcyzkohdbi"))
                                .withEtag("hmwhfpmrqo")
                                .withIdentity(new DppIdentityDetails().withType("uxzdxtay"))
                                .withProperties(new BackupVault().withStorageSettings(Arrays.asList()))));
        model = BinaryData.fromObject(model).toObject(BackupVaultResourceList.class);
        Assertions.assertEquals("vyq", model.nextLink());
        Assertions.assertEquals("cmsxaobhdxbm", model.value().get(0).location());
        Assertions.assertEquals("oqjzehtbmufpowno", model.value().get(0).tags().get("zhwlrxy"));
        Assertions.assertEquals("ph", model.value().get(0).etag());
        Assertions.assertEquals("bsphrupidgsybbe", model.value().get(0).identity().type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}