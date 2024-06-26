// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.keys;

import com.azure.security.keyvault.keys.models.CreateEcKeyOptions;
import com.azure.security.keyvault.keys.models.CreateRsaKeyOptions;
import com.azure.identity.DefaultAzureCredentialBuilder;

import java.time.OffsetDateTime;

/**
 * Sample demonstrates how to asynchronously list keys and versions of a given key in the key vault.
 */
public class ListOperationsAsync {
    /**
     * Authenticates with the key vault and shows how to asynchronously list keys and list versions of a specific key in
     * the key vault.
     *
     * @param args Unused. Arguments to the program.
     *
     * @throws IllegalArgumentException when invalid key vault endpoint is passed.
     * @throws InterruptedException when the thread is interrupted in sleep mode.
     */
    public static void main(String[] args) throws InterruptedException {
        /* Instantiate a KeyAsyncClient that will be used to call the service. Notice that the client is using default
        Azure credentials. For more information on this and other types of credentials, see this document:
        https://docs.microsoft.com/java/api/overview/azure/identity-readme?view=azure-java-stable.

        To get started, you'll need a URL to an Azure Key Vault. See the README
        (https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/azure-security-keyvault-keys/README.md)
        for links and instructions. */
        KeyAsyncClient keyAsyncClient = new KeyClientBuilder()
            .vaultUrl("<your-key-vault-url>")
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildAsyncClient();

        // Let's create EC and RSA keys valid for 1 year. If a key already exists in the key vault, then a new version
        // of the key is created.
        keyAsyncClient.createEcKey(new CreateEcKeyOptions("CloudEcKey")
                .setExpiresOn(OffsetDateTime.now().plusYears(1)))
            .subscribe(keyResponse ->
                System.out.printf("Key is created with name %s and type %s \n", keyResponse.getName(),
                    keyResponse.getKeyType()));

        Thread.sleep(2000);

        keyAsyncClient.createRsaKey(new CreateRsaKeyOptions("CloudRsaKey")
                .setExpiresOn(OffsetDateTime.now().plusYears(1)))
            .subscribe(keyResponse ->
                System.out.printf("Key is created with name %s and type %s \n", keyResponse.getName(),
                    keyResponse.getKeyType()));

        Thread.sleep(2000);

        // You need to check te type of keys already exist in your key vault. Let's list the keys and print their types.
        // List operations don't return the keys with key material information. So, for each returned key we call
        // getKey() to get the key with its key material information.
        keyAsyncClient.listPropertiesOfKeys()
            .subscribe(keyBase ->
                keyAsyncClient.getKey(keyBase.getName(), keyBase.getVersion())
                    .subscribe(keyResponse ->
                        System.out.printf("Received key with name %s and type %s \n", keyResponse.getName(),
                            keyResponse.getKeyType())));

        Thread.sleep(15000);

        // We need the RSA key with a bigger key size, so you want to update the key in key vault to ensure it has the
        // required size. Calling createRsaKey on an existing key creates a new version of the key in the key vault
        // with the new specified size.
        keyAsyncClient.createRsaKey(new CreateRsaKeyOptions("CloudRsaKey")
                .setKeySize(4096)
                .setExpiresOn(OffsetDateTime.now().plusYears(1)))
            .subscribe(keyResponse ->
                System.out.printf("Key is created with name %s and type %s \n", keyResponse.getName(),
                    keyResponse.getKeyType()));

        Thread.sleep(2000);

        // You need to check all the different versions RSA key had previously. Lets print all the versions of this key.
        keyAsyncClient.listPropertiesOfKeyVersions("CloudRsaKey")
            .subscribe(keyBase ->
                keyAsyncClient.getKey(keyBase.getName(), keyBase.getVersion())
                    .subscribe(keyResponse ->
                        System.out.printf("Received key's version with name %s, type %s and version %s \n",
                            keyResponse.getName(), keyResponse.getKeyType(),
                            keyResponse.getProperties().getVersion())));

        Thread.sleep(15000);
    }
}
