# Release History

## 1.2.0-beta.1 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 1.1.0 (2024-12-06)

- Azure Resource Manager Voice Services client library for Java. This package contains Microsoft Azure SDK for Voice Services Management SDK.  Package tag package-2023-01-31. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### Serialization/Deserialization change

- `Jackson` is removed from dependency and no longer supported.

##### Migration Guide

If you are using `Jackson`/`ObjectMapper` for manual serialization/deserialization, configure your `ObjectMapper` for backward compatibility:
```java
objectMapper.registerModule(com.azure.core.serializer.json.jackson.JacksonJsonProvider.getJsonSerializableDatabindModule());
```

## 1.0.0 (2023-04-25)

- Azure Resource Manager Voice Services client library for Java. This package contains Microsoft Azure SDK for Voice Services Management SDK.  Package tag package-2023-01-31. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `VoiceservicesManager$Configurable` was removed

* `VoiceservicesManager` was removed

### Features Added

* `VoiceServicesManager$Configurable` was added

* `VoiceServicesManager` was added

## 1.0.0-beta.1 (2023-02-20)

- Azure Resource Manager voiceservices client library for Java. This package contains Microsoft Azure SDK for voiceservices Management SDK.  Package tag package-2023-01-31. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
