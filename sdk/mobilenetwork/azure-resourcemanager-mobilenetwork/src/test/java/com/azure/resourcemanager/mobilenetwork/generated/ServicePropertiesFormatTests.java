// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.ServicePropertiesFormat;
import com.azure.resourcemanager.mobilenetwork.models.Ambr;
import com.azure.resourcemanager.mobilenetwork.models.PccRuleConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.PccRuleQosPolicy;
import com.azure.resourcemanager.mobilenetwork.models.PreemptionCapability;
import com.azure.resourcemanager.mobilenetwork.models.PreemptionVulnerability;
import com.azure.resourcemanager.mobilenetwork.models.QosPolicy;
import com.azure.resourcemanager.mobilenetwork.models.SdfDirection;
import com.azure.resourcemanager.mobilenetwork.models.ServiceDataFlowTemplate;
import com.azure.resourcemanager.mobilenetwork.models.TrafficControlPermission;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServicePropertiesFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServicePropertiesFormat model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Accepted\",\"servicePrecedence\":883712921,\"serviceQosPolicy\":{\"5qi\":843863757,\"allocationAndRetentionPriorityLevel\":196039433,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"maximumBitRate\":{\"uplink\":\"srp\",\"downlink\":\"vu\"}},\"pccRules\":[{\"ruleName\":\"raehtwdwrft\",\"rulePrecedence\":575939452,\"ruleQosPolicy\":{\"guaranteedBitRate\":{\"uplink\":\"yrcdlbhshfwprac\",\"downlink\":\"twitykhev\"},\"5qi\":87341209,\"allocationAndRetentionPriorityLevel\":685537305,\"preemptionCapability\":\"MayPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"maximumBitRate\":{\"uplink\":\"dyodnwzxltj\",\"downlink\":\"vnhltiugcx\"}},\"trafficControl\":\"Enabled\",\"serviceDataFlowTemplates\":[{\"templateName\":\"wxqibyq\",\"direction\":\"Bidirectional\",\"protocol\":[\"owx\"],\"remoteIpList\":[\"mdjrkvfgbvfvp\",\"bodacizsjq\",\"hkr\",\"ibdeibq\"],\"ports\":[\"kghv\"]},{\"templateName\":\"ndzwmkrefa\",\"direction\":\"Bidirectional\",\"protocol\":[\"orwkqnyh\",\"b\",\"j\",\"jivfxzsjabib\"],\"remoteIpList\":[\"stawfsdjpvkv\",\"bjxbkzbzk\",\"vncjabudurgk\",\"kmokz\"],\"ports\":[\"klff\"]},{\"templateName\":\"mouwqlgzrfzeey\",\"direction\":\"Uplink\",\"protocol\":[\"zi\",\"ayuhqlbjbsy\",\"bqwrvtldgm\"],\"remoteIpList\":[\"gvmpipaslthaqfx\",\"smwutwbdsrezpd\",\"hneuyowqkd\",\"ytisibir\"],\"ports\":[\"ikpzimejza\",\"lfzxiavrmbzonoki\"]}]},{\"ruleName\":\"rjqc\",\"rulePrecedence\":749799353,\"ruleQosPolicy\":{\"guaranteedBitRate\":{\"uplink\":\"pfrlazsz\",\"downlink\":\"nwoiind\"},\"5qi\":369486551,\"allocationAndRetentionPriorityLevel\":941939967,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"maximumBitRate\":{\"uplink\":\"tlhflsjcdhszf\",\"downlink\":\"vfbgofeljagrqmqh\"}},\"trafficControl\":\"Enabled\",\"serviceDataFlowTemplates\":[{\"templateName\":\"iiiojnalghf\",\"direction\":\"Uplink\",\"protocol\":[\"vsexsowuelu\",\"hhahhxvrhmzkwpjg\",\"wspughftqsxhqx\"],\"remoteIpList\":[\"xukndxdigr\"],\"ports\":[\"ufzdmsyq\",\"fi\",\"whbotzingamv\",\"phoszqz\"]},{\"templateName\":\"dphqamv\",\"direction\":\"Bidirectional\",\"protocol\":[\"wynwcvtbvkayhm\",\"nvyq\",\"atkzwpcnpw\",\"cjaesgvvs\"],\"remoteIpList\":[\"yajguqfhwygzlv\",\"nk\"],\"ports\":[\"semdwzrmu\",\"apfcqdpsq\",\"qvpsvuoymg\",\"celve\"]},{\"templateName\":\"rypqlmfeo\",\"direction\":\"Bidirectional\",\"protocol\":[\"qwkyhkobop\",\"xedk\"],\"remoteIpList\":[\"epbqpcrfkbw\"],\"ports\":[\"njv\",\"dw\",\"lpqekf\",\"nkhtjsyingw\"]},{\"templateName\":\"qatmtdhtmdvy\",\"direction\":\"Uplink\",\"protocol\":[\"kdgszywkbirr\",\"uzhlhkjoqrv\",\"qaatjinrv\"],\"remoteIpList\":[\"upmfiibfg\",\"jioolvrwxk\"],\"ports\":[\"k\",\"llqwjygvjayvblmh\"]}]}]}")
                .toObject(ServicePropertiesFormat.class);
        Assertions.assertEquals(883712921, model.servicePrecedence());
        Assertions.assertEquals(843863757, model.serviceQosPolicy().fiveQi());
        Assertions.assertEquals(196039433, model.serviceQosPolicy().allocationAndRetentionPriorityLevel());
        Assertions.assertEquals(PreemptionCapability.NOT_PREEMPT, model.serviceQosPolicy().preemptionCapability());
        Assertions
            .assertEquals(PreemptionVulnerability.NOT_PREEMPTABLE, model.serviceQosPolicy().preemptionVulnerability());
        Assertions.assertEquals("srp", model.serviceQosPolicy().maximumBitRate().uplink());
        Assertions.assertEquals("vu", model.serviceQosPolicy().maximumBitRate().downlink());
        Assertions.assertEquals("raehtwdwrft", model.pccRules().get(0).ruleName());
        Assertions.assertEquals(575939452, model.pccRules().get(0).rulePrecedence());
        Assertions.assertEquals(87341209, model.pccRules().get(0).ruleQosPolicy().fiveQi());
        Assertions
            .assertEquals(685537305, model.pccRules().get(0).ruleQosPolicy().allocationAndRetentionPriorityLevel());
        Assertions
            .assertEquals(
                PreemptionCapability.MAY_PREEMPT, model.pccRules().get(0).ruleQosPolicy().preemptionCapability());
        Assertions
            .assertEquals(
                PreemptionVulnerability.NOT_PREEMPTABLE,
                model.pccRules().get(0).ruleQosPolicy().preemptionVulnerability());
        Assertions.assertEquals("dyodnwzxltj", model.pccRules().get(0).ruleQosPolicy().maximumBitRate().uplink());
        Assertions.assertEquals("vnhltiugcx", model.pccRules().get(0).ruleQosPolicy().maximumBitRate().downlink());
        Assertions
            .assertEquals("yrcdlbhshfwprac", model.pccRules().get(0).ruleQosPolicy().guaranteedBitRate().uplink());
        Assertions.assertEquals("twitykhev", model.pccRules().get(0).ruleQosPolicy().guaranteedBitRate().downlink());
        Assertions.assertEquals(TrafficControlPermission.ENABLED, model.pccRules().get(0).trafficControl());
        Assertions.assertEquals("wxqibyq", model.pccRules().get(0).serviceDataFlowTemplates().get(0).templateName());
        Assertions
            .assertEquals(
                SdfDirection.BIDIRECTIONAL, model.pccRules().get(0).serviceDataFlowTemplates().get(0).direction());
        Assertions.assertEquals("owx", model.pccRules().get(0).serviceDataFlowTemplates().get(0).protocol().get(0));
        Assertions
            .assertEquals(
                "mdjrkvfgbvfvp", model.pccRules().get(0).serviceDataFlowTemplates().get(0).remoteIpList().get(0));
        Assertions.assertEquals("kghv", model.pccRules().get(0).serviceDataFlowTemplates().get(0).ports().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServicePropertiesFormat model =
            new ServicePropertiesFormat()
                .withServicePrecedence(883712921)
                .withServiceQosPolicy(
                    new QosPolicy()
                        .withFiveQi(843863757)
                        .withAllocationAndRetentionPriorityLevel(196039433)
                        .withPreemptionCapability(PreemptionCapability.NOT_PREEMPT)
                        .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                        .withMaximumBitRate(new Ambr().withUplink("srp").withDownlink("vu")))
                .withPccRules(
                    Arrays
                        .asList(
                            new PccRuleConfiguration()
                                .withRuleName("raehtwdwrft")
                                .withRulePrecedence(575939452)
                                .withRuleQosPolicy(
                                    new PccRuleQosPolicy()
                                        .withFiveQi(87341209)
                                        .withAllocationAndRetentionPriorityLevel(685537305)
                                        .withPreemptionCapability(PreemptionCapability.MAY_PREEMPT)
                                        .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                                        .withMaximumBitRate(
                                            new Ambr().withUplink("dyodnwzxltj").withDownlink("vnhltiugcx"))
                                        .withGuaranteedBitRate(
                                            new Ambr().withUplink("yrcdlbhshfwprac").withDownlink("twitykhev")))
                                .withTrafficControl(TrafficControlPermission.ENABLED)
                                .withServiceDataFlowTemplates(
                                    Arrays
                                        .asList(
                                            new ServiceDataFlowTemplate()
                                                .withTemplateName("wxqibyq")
                                                .withDirection(SdfDirection.BIDIRECTIONAL)
                                                .withProtocol(Arrays.asList("owx"))
                                                .withRemoteIpList(
                                                    Arrays.asList("mdjrkvfgbvfvp", "bodacizsjq", "hkr", "ibdeibq"))
                                                .withPorts(Arrays.asList("kghv")),
                                            new ServiceDataFlowTemplate()
                                                .withTemplateName("ndzwmkrefa")
                                                .withDirection(SdfDirection.BIDIRECTIONAL)
                                                .withProtocol(Arrays.asList("orwkqnyh", "b", "j", "jivfxzsjabib"))
                                                .withRemoteIpList(
                                                    Arrays.asList("stawfsdjpvkv", "bjxbkzbzk", "vncjabudurgk", "kmokz"))
                                                .withPorts(Arrays.asList("klff")),
                                            new ServiceDataFlowTemplate()
                                                .withTemplateName("mouwqlgzrfzeey")
                                                .withDirection(SdfDirection.UPLINK)
                                                .withProtocol(Arrays.asList("zi", "ayuhqlbjbsy", "bqwrvtldgm"))
                                                .withRemoteIpList(
                                                    Arrays
                                                        .asList(
                                                            "gvmpipaslthaqfx",
                                                            "smwutwbdsrezpd",
                                                            "hneuyowqkd",
                                                            "ytisibir"))
                                                .withPorts(Arrays.asList("ikpzimejza", "lfzxiavrmbzonoki")))),
                            new PccRuleConfiguration()
                                .withRuleName("rjqc")
                                .withRulePrecedence(749799353)
                                .withRuleQosPolicy(
                                    new PccRuleQosPolicy()
                                        .withFiveQi(369486551)
                                        .withAllocationAndRetentionPriorityLevel(941939967)
                                        .withPreemptionCapability(PreemptionCapability.NOT_PREEMPT)
                                        .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                                        .withMaximumBitRate(
                                            new Ambr().withUplink("tlhflsjcdhszf").withDownlink("vfbgofeljagrqmqh"))
                                        .withGuaranteedBitRate(
                                            new Ambr().withUplink("pfrlazsz").withDownlink("nwoiind")))
                                .withTrafficControl(TrafficControlPermission.ENABLED)
                                .withServiceDataFlowTemplates(
                                    Arrays
                                        .asList(
                                            new ServiceDataFlowTemplate()
                                                .withTemplateName("iiiojnalghf")
                                                .withDirection(SdfDirection.UPLINK)
                                                .withProtocol(
                                                    Arrays.asList("vsexsowuelu", "hhahhxvrhmzkwpjg", "wspughftqsxhqx"))
                                                .withRemoteIpList(Arrays.asList("xukndxdigr"))
                                                .withPorts(Arrays.asList("ufzdmsyq", "fi", "whbotzingamv", "phoszqz")),
                                            new ServiceDataFlowTemplate()
                                                .withTemplateName("dphqamv")
                                                .withDirection(SdfDirection.BIDIRECTIONAL)
                                                .withProtocol(
                                                    Arrays.asList("wynwcvtbvkayhm", "nvyq", "atkzwpcnpw", "cjaesgvvs"))
                                                .withRemoteIpList(Arrays.asList("yajguqfhwygzlv", "nk"))
                                                .withPorts(
                                                    Arrays.asList("semdwzrmu", "apfcqdpsq", "qvpsvuoymg", "celve")),
                                            new ServiceDataFlowTemplate()
                                                .withTemplateName("rypqlmfeo")
                                                .withDirection(SdfDirection.BIDIRECTIONAL)
                                                .withProtocol(Arrays.asList("qwkyhkobop", "xedk"))
                                                .withRemoteIpList(Arrays.asList("epbqpcrfkbw"))
                                                .withPorts(Arrays.asList("njv", "dw", "lpqekf", "nkhtjsyingw")),
                                            new ServiceDataFlowTemplate()
                                                .withTemplateName("qatmtdhtmdvy")
                                                .withDirection(SdfDirection.UPLINK)
                                                .withProtocol(Arrays.asList("kdgszywkbirr", "uzhlhkjoqrv", "qaatjinrv"))
                                                .withRemoteIpList(Arrays.asList("upmfiibfg", "jioolvrwxk"))
                                                .withPorts(Arrays.asList("k", "llqwjygvjayvblmh"))))));
        model = BinaryData.fromObject(model).toObject(ServicePropertiesFormat.class);
        Assertions.assertEquals(883712921, model.servicePrecedence());
        Assertions.assertEquals(843863757, model.serviceQosPolicy().fiveQi());
        Assertions.assertEquals(196039433, model.serviceQosPolicy().allocationAndRetentionPriorityLevel());
        Assertions.assertEquals(PreemptionCapability.NOT_PREEMPT, model.serviceQosPolicy().preemptionCapability());
        Assertions
            .assertEquals(PreemptionVulnerability.NOT_PREEMPTABLE, model.serviceQosPolicy().preemptionVulnerability());
        Assertions.assertEquals("srp", model.serviceQosPolicy().maximumBitRate().uplink());
        Assertions.assertEquals("vu", model.serviceQosPolicy().maximumBitRate().downlink());
        Assertions.assertEquals("raehtwdwrft", model.pccRules().get(0).ruleName());
        Assertions.assertEquals(575939452, model.pccRules().get(0).rulePrecedence());
        Assertions.assertEquals(87341209, model.pccRules().get(0).ruleQosPolicy().fiveQi());
        Assertions
            .assertEquals(685537305, model.pccRules().get(0).ruleQosPolicy().allocationAndRetentionPriorityLevel());
        Assertions
            .assertEquals(
                PreemptionCapability.MAY_PREEMPT, model.pccRules().get(0).ruleQosPolicy().preemptionCapability());
        Assertions
            .assertEquals(
                PreemptionVulnerability.NOT_PREEMPTABLE,
                model.pccRules().get(0).ruleQosPolicy().preemptionVulnerability());
        Assertions.assertEquals("dyodnwzxltj", model.pccRules().get(0).ruleQosPolicy().maximumBitRate().uplink());
        Assertions.assertEquals("vnhltiugcx", model.pccRules().get(0).ruleQosPolicy().maximumBitRate().downlink());
        Assertions
            .assertEquals("yrcdlbhshfwprac", model.pccRules().get(0).ruleQosPolicy().guaranteedBitRate().uplink());
        Assertions.assertEquals("twitykhev", model.pccRules().get(0).ruleQosPolicy().guaranteedBitRate().downlink());
        Assertions.assertEquals(TrafficControlPermission.ENABLED, model.pccRules().get(0).trafficControl());
        Assertions.assertEquals("wxqibyq", model.pccRules().get(0).serviceDataFlowTemplates().get(0).templateName());
        Assertions
            .assertEquals(
                SdfDirection.BIDIRECTIONAL, model.pccRules().get(0).serviceDataFlowTemplates().get(0).direction());
        Assertions.assertEquals("owx", model.pccRules().get(0).serviceDataFlowTemplates().get(0).protocol().get(0));
        Assertions
            .assertEquals(
                "mdjrkvfgbvfvp", model.pccRules().get(0).serviceDataFlowTemplates().get(0).remoteIpList().get(0));
        Assertions.assertEquals("kghv", model.pccRules().get(0).serviceDataFlowTemplates().get(0).ports().get(0));
    }
}