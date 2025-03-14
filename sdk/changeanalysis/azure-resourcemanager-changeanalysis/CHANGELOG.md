# Release History

## 1.2.0-beta.1 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 1.1.0 (2024-12-06)

- Azure Resource Manager AzureChangeAnalysis client library for Java. This package contains Microsoft Azure SDK for AzureChangeAnalysis Management SDK.  Package tag package-2021-04-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### Serialization/Deserialization change

- `Jackson` is removed from dependency and no longer supported.

##### Migration Guide

If you are using `Jackson`/`ObjectMapper` for manual serialization/deserialization, configure your `ObjectMapper` for backward compatibility:
```java
objectMapper.registerModule(com.azure.core.serializer.json.jackson.JacksonJsonProvider.getJsonSerializableDatabindModule());
```

## 1.0.1 (2023-01-12)

- Azure Resource Manager AzureChangeAnalysis client library for Java. This package contains Microsoft Azure SDK for AzureChangeAnalysis Management SDK.  Package tag package-2021-04-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `AzureChangeAnalysisManager$Configurable` was modified

* `withScope(java.lang.String)` was added
* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added

#### `AzureChangeAnalysisManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

## 1.0.0 (2021-04-21)

- Azure Resource Manager AzureChangeAnalysis client library for Java. This package contains Microsoft Azure SDK for AzureChangeAnalysis Management SDK.  Package tag package-2021-04-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Change

* `models.ErrorAdditionalInfo` was removed

## 1.0.0-beta.1 (2021-03-26)

- Azure Resource Manager AzureChangeAnalysis client library for Java. This package contains Microsoft Azure SDK for AzureChangeAnalysis Management SDK.  Package tag package-2021-04-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

