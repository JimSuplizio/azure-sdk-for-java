// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager;
import com.azure.resourcemanager.redisenterprise.models.AofFrequency;
import com.azure.resourcemanager.redisenterprise.models.ClusteringPolicy;
import com.azure.resourcemanager.redisenterprise.models.Database;
import com.azure.resourcemanager.redisenterprise.models.DatabasePropertiesGeoReplication;
import com.azure.resourcemanager.redisenterprise.models.DeferUpgradeSetting;
import com.azure.resourcemanager.redisenterprise.models.EvictionPolicy;
import com.azure.resourcemanager.redisenterprise.models.LinkedDatabase;
import com.azure.resourcemanager.redisenterprise.models.Module;
import com.azure.resourcemanager.redisenterprise.models.Persistence;
import com.azure.resourcemanager.redisenterprise.models.Protocol;
import com.azure.resourcemanager.redisenterprise.models.RdbFrequency;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DatabasesCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr
            = "{\"properties\":{\"clientProtocol\":\"Plaintext\",\"port\":1700948230,\"provisioningState\":\"Succeeded\",\"resourceState\":\"ScalingFailed\",\"clusteringPolicy\":\"EnterpriseCluster\",\"evictionPolicy\":\"AllKeysRandom\",\"persistence\":{\"aofEnabled\":false,\"rdbEnabled\":true,\"aofFrequency\":\"always\",\"rdbFrequency\":\"12h\"},\"modules\":[{\"name\":\"jzuaejxdultskzbb\",\"args\":\"zumveekgpwo\",\"version\":\"hkfpbs\"}],\"geoReplication\":{\"groupNickname\":\"f\",\"linkedDatabases\":[{\"id\":\"us\",\"state\":\"LinkFailed\"}]},\"redisVersion\":\"uwaboekqvke\",\"deferUpgrade\":\"Deferred\"},\"id\":\"mvb\",\"name\":\"wyjsflhhcaalnjix\",\"type\":\"sxyawjoyaqcs\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RedisEnterpriseManager manager = RedisEnterpriseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Database response = manager.databases()
            .define("nrjawgqwg")
            .withExistingRedisEnterprise("euojgjrwju", "iotwmcdytdxwit")
            .withClientProtocol(Protocol.ENCRYPTED)
            .withPort(1840512089)
            .withClusteringPolicy(ClusteringPolicy.ENTERPRISE_CLUSTER)
            .withEvictionPolicy(EvictionPolicy.ALL_KEYS_RANDOM)
            .withPersistence(new Persistence().withAofEnabled(false)
                .withRdbEnabled(true)
                .withAofFrequency(AofFrequency.ALWAYS)
                .withRdbFrequency(RdbFrequency.ONE_TWOH))
            .withModules(Arrays.asList(new Module().withName("whvylw").withArgs("tdhxujznbmpowuwp"),
                new Module().withName("xobbcswsrt").withArgs("iplrbpbewtghfgb"),
                new Module().withName("zvlvqhjkbegib").withArgs("mxiebw"),
                new Module().withName("tzjuzgwyzmhtxo").withArgs("mtsavjcbpwxqp")))
            .withGeoReplication(new DatabasePropertiesGeoReplication().withGroupNickname("mdyvxqtayriw")
                .withLinkedDatabases(Arrays.asList(new LinkedDatabase().withId("qbex"))))
            .withDeferUpgrade(DeferUpgradeSetting.DEFERRED)
            .create();

        Assertions.assertEquals(Protocol.PLAINTEXT, response.clientProtocol());
        Assertions.assertEquals(1700948230, response.port());
        Assertions.assertEquals(ClusteringPolicy.ENTERPRISE_CLUSTER, response.clusteringPolicy());
        Assertions.assertEquals(EvictionPolicy.ALL_KEYS_RANDOM, response.evictionPolicy());
        Assertions.assertEquals(false, response.persistence().aofEnabled());
        Assertions.assertEquals(true, response.persistence().rdbEnabled());
        Assertions.assertEquals(AofFrequency.ALWAYS, response.persistence().aofFrequency());
        Assertions.assertEquals(RdbFrequency.ONE_TWOH, response.persistence().rdbFrequency());
        Assertions.assertEquals("jzuaejxdultskzbb", response.modules().get(0).name());
        Assertions.assertEquals("zumveekgpwo", response.modules().get(0).args());
        Assertions.assertEquals("f", response.geoReplication().groupNickname());
        Assertions.assertEquals("us", response.geoReplication().linkedDatabases().get(0).id());
        Assertions.assertEquals(DeferUpgradeSetting.DEFERRED, response.deferUpgrade());
    }
}
