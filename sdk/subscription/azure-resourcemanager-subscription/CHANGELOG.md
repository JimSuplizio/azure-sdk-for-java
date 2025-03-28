# Release History

## 1.1.0-beta.1 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 1.0.0 (2024-12-25)

- Azure Resource Manager Subscription client library for Java. This package contains Microsoft Azure SDK for Subscription Management SDK. The subscription client. Package tag package-2020-09. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Other Changes

- Release for Azure Resource Manager Subscription client library for Java.

## 1.0.0-beta.3 (2024-10-17)

- Azure Resource Manager Subscription client library for Java. This package contains Microsoft Azure SDK for Subscription Management SDK. The subscription client. Package tag package-2020-09. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.OperationDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Operation` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PutAliasRequestProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PutAliasRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SubscriptionPolicies` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SubscriptionListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.LocationListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TenantListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SubscriptionName` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PutAliasResponseProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

## 1.0.0-beta.2 (2023-01-19)

- Azure Resource Manager Subscription client library for Java. This package contains Microsoft Azure SDK for Subscription Management SDK. The subscription client. Package tag package-2020-09. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.CanceledSubscriptionId` was modified

* `value()` was removed

#### `models.EnabledSubscriptionId` was modified

* `value()` was removed

#### `models.RenamedSubscriptionId` was modified

* `value()` was removed

### Features Added

#### `SubscriptionManager$Configurable` was modified

* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added
* `withScope(java.lang.String)` was added

#### `models.TenantIdDescription` was modified

* `domains()` was added
* `defaultDomain()` was added
* `countryCode()` was added
* `tenantCategory()` was added
* `displayName()` was added
* `country()` was added
* `tenantType()` was added

#### `models.CanceledSubscriptionId` was modified

* `subscriptionId()` was added

#### `models.Subscription` was modified

* `tags()` was added
* `tenantId()` was added

#### `models.EnabledSubscriptionId` was modified

* `subscriptionId()` was added

#### `models.RenamedSubscriptionId` was modified

* `subscriptionId()` was added

#### `SubscriptionManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

## 1.0.0-beta.1 (2021-04-19)

- Azure Resource Manager Subscription client library for Java. This package contains Microsoft Azure SDK for Subscription Management SDK. The subscription client. Package tag package-2020-09. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
