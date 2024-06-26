// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigurationProfile;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterInfo;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterProfileAccessRule;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterProfileAccessRuleDirection;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterSubscription;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkSecurityPerimeterConfigurationProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkSecurityPerimeterConfigurationProfile model = BinaryData.fromString(
            "{\"name\":\"narfdlpukhpyrn\",\"accessRulesVersion\":\"zjcpeogk\",\"accessRules\":[{\"fullyQualifiedArmId\":\"brouxdd\",\"name\":\"fhp\",\"type\":\"azjzo\",\"properties\":{\"direction\":\"Outbound\",\"addressPrefixes\":[\"dulontacn\",\"qwtehtuevr\"],\"subscriptions\":[{\"id\":\"yoogw\"},{\"id\":\"nsduugwbsre\"}],\"networkSecurityPerimeters\":[{\"id\":\"kfuarenlv\",\"perimeterGuid\":\"tklnvnafvvkyfed\",\"location\":\"jboslcqxypok\"},{\"id\":\"minqcym\",\"perimeterGuid\":\"ngnbdxxew\",\"location\":\"invudbch\"},{\"id\":\"dtvqe\",\"perimeterGuid\":\"qct\",\"location\":\"xdtddmflhuytxzv\"}],\"fullyQualifiedDomainNames\":[\"apxbannovvoxczy\",\"prwnwvroevytlyo\",\"rrrouuxvnsa\"],\"emailAddresses\":[\"rymo\",\"izrxklob\",\"xnazpmkml\",\"vevfxz\"],\"phoneNumbers\":[\"hbzxli\",\"hrdd\",\"tfgxqbawpcb\",\"nzqcy\"]}},{\"fullyQualifiedArmId\":\"apqofyuicdhz\",\"name\":\"ybww\",\"type\":\"d\",\"properties\":{\"direction\":\"Inbound\",\"addressPrefixes\":[\"hmwffplfmuv\",\"pckc\"],\"subscriptions\":[{\"id\":\"weyoxoy\"}],\"networkSecurityPerimeters\":[{\"id\":\"haim\",\"perimeterGuid\":\"iroqbosh\",\"location\":\"a\"}],\"fullyQualifiedDomainNames\":[\"yyrmfsvbp\",\"vbopfppdbwnu\"],\"emailAddresses\":[\"hxkumasjcaacfdmm\",\"pugmehqe\"],\"phoneNumbers\":[\"fhbzehewhoqhn\"]}}],\"diagnosticSettingsVersion\":\"qnbldxe\",\"enabledLogCategories\":[\"gschorimkrsrr\"]}")
            .toObject(NetworkSecurityPerimeterConfigurationProfile.class);
        Assertions.assertEquals("narfdlpukhpyrn", model.name());
        Assertions.assertEquals("zjcpeogk", model.accessRulesVersion());
        Assertions.assertEquals("brouxdd", model.accessRules().get(0).fullyQualifiedArmId());
        Assertions.assertEquals("fhp", model.accessRules().get(0).name());
        Assertions.assertEquals("azjzo", model.accessRules().get(0).type());
        Assertions.assertEquals(NetworkSecurityPerimeterProfileAccessRuleDirection.OUTBOUND,
            model.accessRules().get(0).direction());
        Assertions.assertEquals("dulontacn", model.accessRules().get(0).addressPrefixes().get(0));
        Assertions.assertEquals("yoogw", model.accessRules().get(0).subscriptions().get(0).id());
        Assertions.assertEquals("kfuarenlv", model.accessRules().get(0).networkSecurityPerimeters().get(0).id());
        Assertions.assertEquals("tklnvnafvvkyfed",
            model.accessRules().get(0).networkSecurityPerimeters().get(0).perimeterGuid());
        Assertions.assertEquals("jboslcqxypok",
            model.accessRules().get(0).networkSecurityPerimeters().get(0).location());
        Assertions.assertEquals("apxbannovvoxczy", model.accessRules().get(0).fullyQualifiedDomainNames().get(0));
        Assertions.assertEquals("rymo", model.accessRules().get(0).emailAddresses().get(0));
        Assertions.assertEquals("hbzxli", model.accessRules().get(0).phoneNumbers().get(0));
        Assertions.assertEquals("qnbldxe", model.diagnosticSettingsVersion());
        Assertions.assertEquals("gschorimkrsrr", model.enabledLogCategories().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkSecurityPerimeterConfigurationProfile model = new NetworkSecurityPerimeterConfigurationProfile()
            .withName("narfdlpukhpyrn")
            .withAccessRulesVersion("zjcpeogk")
            .withAccessRules(Arrays.asList(
                new NetworkSecurityPerimeterProfileAccessRule().withFullyQualifiedArmId("brouxdd")
                    .withName("fhp")
                    .withType("azjzo")
                    .withDirection(NetworkSecurityPerimeterProfileAccessRuleDirection.OUTBOUND)
                    .withAddressPrefixes(Arrays.asList("dulontacn", "qwtehtuevr"))
                    .withSubscriptions(Arrays.asList(new NetworkSecurityPerimeterSubscription().withId("yoogw"),
                        new NetworkSecurityPerimeterSubscription().withId("nsduugwbsre")))
                    .withNetworkSecurityPerimeters(Arrays.asList(
                        new NetworkSecurityPerimeterInfo().withId("kfuarenlv")
                            .withPerimeterGuid("tklnvnafvvkyfed")
                            .withLocation("jboslcqxypok"),
                        new NetworkSecurityPerimeterInfo().withId("minqcym")
                            .withPerimeterGuid("ngnbdxxew")
                            .withLocation("invudbch"),
                        new NetworkSecurityPerimeterInfo().withId("dtvqe")
                            .withPerimeterGuid("qct")
                            .withLocation("xdtddmflhuytxzv")))
                    .withFullyQualifiedDomainNames(Arrays.asList("apxbannovvoxczy", "prwnwvroevytlyo", "rrrouuxvnsa"))
                    .withEmailAddresses(Arrays.asList("rymo", "izrxklob", "xnazpmkml", "vevfxz"))
                    .withPhoneNumbers(Arrays.asList("hbzxli", "hrdd", "tfgxqbawpcb", "nzqcy")),
                new NetworkSecurityPerimeterProfileAccessRule().withFullyQualifiedArmId("apqofyuicdhz")
                    .withName("ybww")
                    .withType("d")
                    .withDirection(NetworkSecurityPerimeterProfileAccessRuleDirection.INBOUND)
                    .withAddressPrefixes(Arrays.asList("hmwffplfmuv", "pckc"))
                    .withSubscriptions(Arrays.asList(new NetworkSecurityPerimeterSubscription().withId("weyoxoy")))
                    .withNetworkSecurityPerimeters(Arrays.asList(new NetworkSecurityPerimeterInfo().withId("haim")
                        .withPerimeterGuid("iroqbosh")
                        .withLocation("a")))
                    .withFullyQualifiedDomainNames(Arrays.asList("yyrmfsvbp", "vbopfppdbwnu"))
                    .withEmailAddresses(Arrays.asList("hxkumasjcaacfdmm", "pugmehqe"))
                    .withPhoneNumbers(Arrays.asList("fhbzehewhoqhn"))))
            .withDiagnosticSettingsVersion("qnbldxe")
            .withEnabledLogCategories(Arrays.asList("gschorimkrsrr"));
        model = BinaryData.fromObject(model).toObject(NetworkSecurityPerimeterConfigurationProfile.class);
        Assertions.assertEquals("narfdlpukhpyrn", model.name());
        Assertions.assertEquals("zjcpeogk", model.accessRulesVersion());
        Assertions.assertEquals("brouxdd", model.accessRules().get(0).fullyQualifiedArmId());
        Assertions.assertEquals("fhp", model.accessRules().get(0).name());
        Assertions.assertEquals("azjzo", model.accessRules().get(0).type());
        Assertions.assertEquals(NetworkSecurityPerimeterProfileAccessRuleDirection.OUTBOUND,
            model.accessRules().get(0).direction());
        Assertions.assertEquals("dulontacn", model.accessRules().get(0).addressPrefixes().get(0));
        Assertions.assertEquals("yoogw", model.accessRules().get(0).subscriptions().get(0).id());
        Assertions.assertEquals("kfuarenlv", model.accessRules().get(0).networkSecurityPerimeters().get(0).id());
        Assertions.assertEquals("tklnvnafvvkyfed",
            model.accessRules().get(0).networkSecurityPerimeters().get(0).perimeterGuid());
        Assertions.assertEquals("jboslcqxypok",
            model.accessRules().get(0).networkSecurityPerimeters().get(0).location());
        Assertions.assertEquals("apxbannovvoxczy", model.accessRules().get(0).fullyQualifiedDomainNames().get(0));
        Assertions.assertEquals("rymo", model.accessRules().get(0).emailAddresses().get(0));
        Assertions.assertEquals("hbzxli", model.accessRules().get(0).phoneNumbers().get(0));
        Assertions.assertEquals("qnbldxe", model.diagnosticSettingsVersion());
        Assertions.assertEquals("gschorimkrsrr", model.enabledLogCategories().get(0));
    }
}
