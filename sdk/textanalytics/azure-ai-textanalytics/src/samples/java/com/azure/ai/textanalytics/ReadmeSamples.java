// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics;

import com.azure.ai.textanalytics.models.DetectLanguageInput;
import com.azure.ai.textanalytics.models.DetectedLanguage;
import com.azure.ai.textanalytics.models.DocumentSentiment;
import com.azure.ai.textanalytics.models.PiiEntityCollection;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpClient;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.util.Context;
import com.azure.identity.DefaultAzureCredentialBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * WARNING: MODIFYING THIS FILE WILL REQUIRE CORRESPONDING UPDATES TO README.md FILE. LINE NUMBERS ARE USED TO EXTRACT
 * APPROPRIATE CODE SEGMENTS FROM THIS FILE. ADD NEW CODE AT THE BOTTOM TO AVOID CHANGING LINE NUMBERS OF EXISTING CODE
 * SAMPLES.
 *
 * Class containing code snippets that will be injected to README.md.
 */
public class ReadmeSamples {
    private TextAnalyticsClient textAnalyticsClient = new TextAnalyticsClientBuilder().buildClient();

    /**
     * Code snippet for configuring http client.
     */
    public void configureHttpClient() {
        // BEGIN: readme-sample-configureHttpClient
        HttpClient client = new NettyAsyncHttpClientBuilder()
            .port(8080)
            .wiretap(true)
            .build();
        // END: readme-sample-configureHttpClient
    }

    /**
     * Code snippet for getting sync client using the AzureKeyCredential authentication.
     */
    public void useAzureKeyCredentialSyncClient() {
        // BEGIN: readme-sample-createTextAnalyticsClientWithKeyCredential
        TextAnalyticsClient textAnalyticsClient = new TextAnalyticsClientBuilder()
            .credential(new AzureKeyCredential("{key}"))
            .endpoint("{endpoint}")
            .buildClient();
        // END: readme-sample-createTextAnalyticsClientWithKeyCredential
    }

    /**
     * Code snippet for getting async client using AzureKeyCredential authentication.
     */
    public void useAzureKeyCredentialAsyncClient() {
        // BEGIN: readme-sample-createTextAnalyticsAsyncClientWithKeyCredential
        TextAnalyticsAsyncClient textAnalyticsAsyncClient = new TextAnalyticsClientBuilder()
            .credential(new AzureKeyCredential("{key}"))
            .endpoint("{endpoint}")
            .buildAsyncClient();
        // END: readme-sample-createTextAnalyticsAsyncClientWithKeyCredential
    }

    /**
     * Code snippet for getting async client using AAD authentication.
     */
    public void useAadAsyncClient() {
        // BEGIN: readme-sample-createTextAnalyticsAsyncClientWithAAD
        TokenCredential defaultCredential = new DefaultAzureCredentialBuilder().build();
        TextAnalyticsAsyncClient textAnalyticsAsyncClient = new TextAnalyticsClientBuilder()
            .endpoint("{endpoint}")
            .credential(defaultCredential)
            .buildAsyncClient();
        // END: readme-sample-createTextAnalyticsAsyncClientWithAAD
    }

    /**
     * Code snippet for rotating AzureKeyCredential of the client
     */
    public void rotatingAzureKeyCredential() {
        // BEGIN: readme-sample-rotatingAzureKeyCredential
        AzureKeyCredential credential = new AzureKeyCredential("{key}");
        TextAnalyticsClient textAnalyticsClient = new TextAnalyticsClientBuilder()
            .credential(credential)
            .endpoint("{endpoint}")
            .buildClient();

        credential.update("{new_key}");
        // END: readme-sample-rotatingAzureKeyCredential
    }

    /**
     * Code snippet for handling exception
     */
    public void handlingException() {
        // BEGIN: readme-sample-handlingException
        List<DetectLanguageInput> documents = Arrays.asList(
            new DetectLanguageInput("1", "This is written in English.", "us"),
            new DetectLanguageInput("1", "Este es un documento  escrito en Español.", "es")
        );

        try {
            textAnalyticsClient.detectLanguageBatchWithResponse(documents, null, Context.NONE);
        } catch (HttpResponseException e) {
            System.out.println(e.getMessage());
        }
        // END: readme-sample-handlingException
    }

    /**
     * Code snippet for analyzing sentiment of a document.
     */
    public void analyzeSentiment() {
        // BEGIN: readme-sample-analyzeSentiment
        String document = "The hotel was dark and unclean. I like microsoft.";
        DocumentSentiment documentSentiment = textAnalyticsClient.analyzeSentiment(document);
        System.out.printf("Analyzed document sentiment: %s.%n", documentSentiment.getSentiment());
        documentSentiment.getSentences().forEach(sentenceSentiment ->
            System.out.printf("Analyzed sentence sentiment: %s.%n", sentenceSentiment.getSentiment()));
        // END: readme-sample-analyzeSentiment
    }

    /**
     * Code snippet for detecting language in a document.
     */
    public void detectLanguages() {
        // BEGIN: readme-sample-detectLanguages
        String document = "Bonjour tout le monde";
        DetectedLanguage detectedLanguage = textAnalyticsClient.detectLanguage(document);
        System.out.printf("Detected language name: %s, ISO 6391 name: %s, confidence score: %f.%n",
            detectedLanguage.getName(), detectedLanguage.getIso6391Name(), detectedLanguage.getConfidenceScore());
        // END: readme-sample-detectLanguages
    }

    /**
     * Code snippet for recognizing category entity in a document.
     */
    public void recognizeEntity() {
        // BEGIN: readme-sample-recognizeEntity
        String document = "Satya Nadella is the CEO of Microsoft";
        textAnalyticsClient.recognizeEntities(document).forEach(entity ->
            System.out.printf("Recognized entity: %s, category: %s, subcategory: %s, confidence score: %f.%n",
                entity.getText(), entity.getCategory(), entity.getSubcategory(), entity.getConfidenceScore()));
        // END: readme-sample-recognizeEntity
    }

    /**
     * Code snippet for recognizing linked entity in a document.
     */
    public void recognizeLinkedEntity() {
        // BEGIN: readme-sample-recognizeLinkedEntity
        String document = "Old Faithful is a geyser at Yellowstone Park.";
        textAnalyticsClient.recognizeLinkedEntities(document).forEach(linkedEntity -> {
            System.out.println("Linked Entities:");
            System.out.printf("Name: %s, entity ID in data source: %s, URL: %s, data source: %s.%n",
                linkedEntity.getName(), linkedEntity.getDataSourceEntityId(), linkedEntity.getUrl(), linkedEntity.getDataSource());
            linkedEntity.getMatches().forEach(match ->
                System.out.printf("Text: %s, confidence score: %f.%n", match.getText(), match.getConfidenceScore()));
        });
        // END: readme-sample-recognizeLinkedEntity
    }

    /**
     * Code snippet for extracting key phrases in a document.
     */
    public void extractKeyPhrases() {
        // BEGIN: readme-sample-extractKeyPhrases
        String document = "My cat might need to see a veterinarian.";
        System.out.println("Extracted phrases:");
        textAnalyticsClient.extractKeyPhrases(document).forEach(keyPhrase -> System.out.printf("%s.%n", keyPhrase));
        // END: readme-sample-extractKeyPhrases
    }

    /**
     * Code snippet for recognizing Personally Identifiable Information entity in a document.
     */
    public void recognizePiiEntity() {
        // BEGIN: readme-sample-recognizePiiEntity
        String document = "My SSN is 859-98-0987";
        PiiEntityCollection piiEntityCollection = textAnalyticsClient.recognizePiiEntities(document);
        System.out.printf("Redacted Text: %s%n", piiEntityCollection.getRedactedText());
        piiEntityCollection.forEach(entity -> System.out.printf(
            "Recognized Personally Identifiable Information entity: %s, entity category: %s, entity subcategory: %s,"
                + " confidence score: %f.%n",
            entity.getText(), entity.getCategory(), entity.getSubcategory(), entity.getConfidenceScore()));
        // END: readme-sample-recognizePiiEntity
    }
}
