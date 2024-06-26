// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ActionableRemediation;
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AnnotateDefaultBranchState;
import com.azure.resourcemanager.security.models.CategoryConfiguration;
import com.azure.resourcemanager.security.models.InheritFromParentState;
import com.azure.resourcemanager.security.models.RuleCategory;
import com.azure.resourcemanager.security.models.TargetBranchConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ActionableRemediationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ActionableRemediation model = BinaryData.fromString(
            "{\"state\":\"Enabled\",\"categoryConfigurations\":[{\"minimumSeverityLevel\":\"nplfac\",\"category\":\"IaC\"},{\"minimumSeverityLevel\":\"qrqxwetjt\",\"category\":\"Secrets\"},{\"minimumSeverityLevel\":\"tfdoadtx\",\"category\":\"Artifacts\"}],\"branchConfiguration\":{\"branchNames\":[\"adkm\",\"zgssz\",\"vctkbbx\",\"harls\"],\"annotateDefaultBranch\":\"Enabled\"},\"inheritFromParentState\":\"Disabled\"}")
            .toObject(ActionableRemediation.class);
        Assertions.assertEquals(ActionableRemediationState.ENABLED, model.state());
        Assertions.assertEquals("nplfac", model.categoryConfigurations().get(0).minimumSeverityLevel());
        Assertions.assertEquals(RuleCategory.IAC, model.categoryConfigurations().get(0).category());
        Assertions.assertEquals("adkm", model.branchConfiguration().branchNames().get(0));
        Assertions.assertEquals(AnnotateDefaultBranchState.ENABLED,
            model.branchConfiguration().annotateDefaultBranch());
        Assertions.assertEquals(InheritFromParentState.DISABLED, model.inheritFromParentState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ActionableRemediation model = new ActionableRemediation().withState(ActionableRemediationState.ENABLED)
            .withCategoryConfigurations(Arrays.asList(
                new CategoryConfiguration().withMinimumSeverityLevel("nplfac").withCategory(RuleCategory.IAC),
                new CategoryConfiguration().withMinimumSeverityLevel("qrqxwetjt").withCategory(RuleCategory.SECRETS),
                new CategoryConfiguration().withMinimumSeverityLevel("tfdoadtx").withCategory(RuleCategory.ARTIFACTS)))
            .withBranchConfiguration(
                new TargetBranchConfiguration().withBranchNames(Arrays.asList("adkm", "zgssz", "vctkbbx", "harls"))
                    .withAnnotateDefaultBranch(AnnotateDefaultBranchState.ENABLED))
            .withInheritFromParentState(InheritFromParentState.DISABLED);
        model = BinaryData.fromObject(model).toObject(ActionableRemediation.class);
        Assertions.assertEquals(ActionableRemediationState.ENABLED, model.state());
        Assertions.assertEquals("nplfac", model.categoryConfigurations().get(0).minimumSeverityLevel());
        Assertions.assertEquals(RuleCategory.IAC, model.categoryConfigurations().get(0).category());
        Assertions.assertEquals("adkm", model.branchConfiguration().branchNames().get(0));
        Assertions.assertEquals(AnnotateDefaultBranchState.ENABLED,
            model.branchConfiguration().annotateDefaultBranch());
        Assertions.assertEquals(InheritFromParentState.DISABLED, model.inheritFromParentState());
    }
}
