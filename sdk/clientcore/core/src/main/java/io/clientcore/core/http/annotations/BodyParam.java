// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.http.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Annotation to annotate a parameter to send to a REST endpoint as HTTP Request content.
 *
 * <p>If the parameter type extends <code>InputStream</code>, this payload is streamed to server through
 * "application/octet-stream". Otherwise, the body is serialized first and sent as "application/json" or
 * "application/xml", based on the serializer.
 * </p>
 *
 * <p><strong>Example 1: Put JSON</strong></p>
 *
 * <!-- src_embed io.clientcore.core.annotation.http.BodyParam.class1 -->
 * <pre>
 * &#64;HttpRequestInformation&#40;method = HttpMethod.PUT, path = &quot;&#47;subscriptions&#47;&#123;subscriptionId&#125;&#47;resourceGroups&#47;&quot;
 *     + &quot;&#123;resourceGroupName&#125;&#47;providers&#47;Microsoft.Compute&#47;virtualMachines&#47;&#123;vmName&#125;&quot;,
 *     returnValueWireType = VirtualMachine.class&#41;
 * VirtualMachine createOrUpdate&#40;&#64;PathParam&#40;&quot;resourceGroupName&quot;&#41; String rgName, &#64;PathParam&#40;&quot;vmName&quot;&#41; String vmName,
 *     &#64;PathParam&#40;&quot;subscriptionId&quot;&#41; String subscriptionId, &#64;BodyParam&#40;&quot;application&#47;json&quot;&#41; VirtualMachine vm&#41;;
 * </pre>
 * <!-- end io.clientcore.core.annotation.http.BodyParam.class1 -->
 *
 * <p><strong>Example 2: Stream</strong></p>
 *
 * <!-- src_embed io.clientcore.core.annotation.http.BodyParam.class2 -->
 * <pre>
 * &#64;HttpRequestInformation&#40;method = HttpMethod.POST, path = &quot;&#47;formdata&#47;stream&#47;uploadfile&quot;,
 *     returnValueWireType = void.class&#41;
 * void uploadFileViaBody&#40;&#64;BodyParam&#40;&quot;application&#47;octet-stream&quot;&#41; FileInputStream fileContent&#41;;
 * </pre>
 * <!-- end io.clientcore.core.annotation.http.BodyParam.class2 -->
 */
@Retention(RUNTIME)
@Target(PARAMETER)
public @interface BodyParam {
    /**
     * Gets the Content-Type for the body.
     *
     * @return The Content-Type for the body.
     */
    String value();
}
