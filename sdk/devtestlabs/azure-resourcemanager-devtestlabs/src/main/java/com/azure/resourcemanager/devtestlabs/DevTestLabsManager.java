// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.fluent.DevTestLabsClient;
import com.azure.resourcemanager.devtestlabs.implementation.ArmTemplatesImpl;
import com.azure.resourcemanager.devtestlabs.implementation.ArtifactSourcesImpl;
import com.azure.resourcemanager.devtestlabs.implementation.ArtifactsImpl;
import com.azure.resourcemanager.devtestlabs.implementation.CostsImpl;
import com.azure.resourcemanager.devtestlabs.implementation.CustomImagesImpl;
import com.azure.resourcemanager.devtestlabs.implementation.DevTestLabsClientBuilder;
import com.azure.resourcemanager.devtestlabs.implementation.DisksImpl;
import com.azure.resourcemanager.devtestlabs.implementation.EnvironmentsImpl;
import com.azure.resourcemanager.devtestlabs.implementation.FormulasImpl;
import com.azure.resourcemanager.devtestlabs.implementation.GalleryImagesImpl;
import com.azure.resourcemanager.devtestlabs.implementation.GlobalSchedulesImpl;
import com.azure.resourcemanager.devtestlabs.implementation.LabsImpl;
import com.azure.resourcemanager.devtestlabs.implementation.NotificationChannelsImpl;
import com.azure.resourcemanager.devtestlabs.implementation.OperationsImpl;
import com.azure.resourcemanager.devtestlabs.implementation.PoliciesImpl;
import com.azure.resourcemanager.devtestlabs.implementation.PolicySetsImpl;
import com.azure.resourcemanager.devtestlabs.implementation.ProviderOperationsImpl;
import com.azure.resourcemanager.devtestlabs.implementation.SchedulesImpl;
import com.azure.resourcemanager.devtestlabs.implementation.SecretsImpl;
import com.azure.resourcemanager.devtestlabs.implementation.ServiceFabricSchedulesImpl;
import com.azure.resourcemanager.devtestlabs.implementation.ServiceFabricsImpl;
import com.azure.resourcemanager.devtestlabs.implementation.ServiceRunnersImpl;
import com.azure.resourcemanager.devtestlabs.implementation.UsersImpl;
import com.azure.resourcemanager.devtestlabs.implementation.VirtualMachineSchedulesImpl;
import com.azure.resourcemanager.devtestlabs.implementation.VirtualMachinesImpl;
import com.azure.resourcemanager.devtestlabs.implementation.VirtualNetworksImpl;
import com.azure.resourcemanager.devtestlabs.models.ArmTemplates;
import com.azure.resourcemanager.devtestlabs.models.ArtifactSources;
import com.azure.resourcemanager.devtestlabs.models.Artifacts;
import com.azure.resourcemanager.devtestlabs.models.Costs;
import com.azure.resourcemanager.devtestlabs.models.CustomImages;
import com.azure.resourcemanager.devtestlabs.models.Disks;
import com.azure.resourcemanager.devtestlabs.models.Environments;
import com.azure.resourcemanager.devtestlabs.models.Formulas;
import com.azure.resourcemanager.devtestlabs.models.GalleryImages;
import com.azure.resourcemanager.devtestlabs.models.GlobalSchedules;
import com.azure.resourcemanager.devtestlabs.models.Labs;
import com.azure.resourcemanager.devtestlabs.models.NotificationChannels;
import com.azure.resourcemanager.devtestlabs.models.Operations;
import com.azure.resourcemanager.devtestlabs.models.Policies;
import com.azure.resourcemanager.devtestlabs.models.PolicySets;
import com.azure.resourcemanager.devtestlabs.models.ProviderOperations;
import com.azure.resourcemanager.devtestlabs.models.Schedules;
import com.azure.resourcemanager.devtestlabs.models.Secrets;
import com.azure.resourcemanager.devtestlabs.models.ServiceFabricSchedules;
import com.azure.resourcemanager.devtestlabs.models.ServiceFabrics;
import com.azure.resourcemanager.devtestlabs.models.ServiceRunners;
import com.azure.resourcemanager.devtestlabs.models.Users;
import com.azure.resourcemanager.devtestlabs.models.VirtualMachineSchedules;
import com.azure.resourcemanager.devtestlabs.models.VirtualMachines;
import com.azure.resourcemanager.devtestlabs.models.VirtualNetworks;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to DevTestLabsManager.
 * The DevTest Labs Client.
 */
public final class DevTestLabsManager {
    private ProviderOperations providerOperations;

    private Labs labs;

    private Operations operations;

    private GlobalSchedules globalSchedules;

    private ArtifactSources artifactSources;

    private ArmTemplates armTemplates;

    private Artifacts artifacts;

    private Costs costs;

    private CustomImages customImages;

    private Formulas formulas;

    private GalleryImages galleryImages;

    private NotificationChannels notificationChannels;

    private PolicySets policySets;

    private Policies policies;

    private Schedules schedules;

    private ServiceRunners serviceRunners;

    private Users users;

    private Disks disks;

    private Environments environments;

    private Secrets secrets;

    private ServiceFabrics serviceFabrics;

    private ServiceFabricSchedules serviceFabricSchedules;

    private VirtualMachines virtualMachines;

    private VirtualMachineSchedules virtualMachineSchedules;

    private VirtualNetworks virtualNetworks;

    private final DevTestLabsClient clientObject;

    private DevTestLabsManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new DevTestLabsClientBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
            .subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval)
            .buildClient();
    }

    /**
     * Creates an instance of DevTestLabs service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the DevTestLabs service API instance.
     */
    public static DevTestLabsManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of DevTestLabs service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the DevTestLabs service API instance.
     */
    public static DevTestLabsManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new DevTestLabsManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create DevTestLabsManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new DevTestLabsManager.Configurable();
    }

    /**
     * The Configurable allowing configurations to be set.
     */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         * <p>
         * This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval
                = Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of DevTestLabs service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the DevTestLabs service API instance.
         */
        public DevTestLabsManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.devtestlabs")
                .append("/")
                .append("1.1.0");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder.append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new BearerTokenAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline = new HttpPipelineBuilder().httpClient(httpClient)
                .policies(policies.toArray(new HttpPipelinePolicy[0]))
                .build();
            return new DevTestLabsManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of ProviderOperations.
     * 
     * @return Resource collection API of ProviderOperations.
     */
    public ProviderOperations providerOperations() {
        if (this.providerOperations == null) {
            this.providerOperations = new ProviderOperationsImpl(clientObject.getProviderOperations(), this);
        }
        return providerOperations;
    }

    /**
     * Gets the resource collection API of Labs. It manages Lab.
     * 
     * @return Resource collection API of Labs.
     */
    public Labs labs() {
        if (this.labs == null) {
            this.labs = new LabsImpl(clientObject.getLabs(), this);
        }
        return labs;
    }

    /**
     * Gets the resource collection API of Operations.
     * 
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of GlobalSchedules. It manages Schedule.
     * 
     * @return Resource collection API of GlobalSchedules.
     */
    public GlobalSchedules globalSchedules() {
        if (this.globalSchedules == null) {
            this.globalSchedules = new GlobalSchedulesImpl(clientObject.getGlobalSchedules(), this);
        }
        return globalSchedules;
    }

    /**
     * Gets the resource collection API of ArtifactSources. It manages ArtifactSource.
     * 
     * @return Resource collection API of ArtifactSources.
     */
    public ArtifactSources artifactSources() {
        if (this.artifactSources == null) {
            this.artifactSources = new ArtifactSourcesImpl(clientObject.getArtifactSources(), this);
        }
        return artifactSources;
    }

    /**
     * Gets the resource collection API of ArmTemplates.
     * 
     * @return Resource collection API of ArmTemplates.
     */
    public ArmTemplates armTemplates() {
        if (this.armTemplates == null) {
            this.armTemplates = new ArmTemplatesImpl(clientObject.getArmTemplates(), this);
        }
        return armTemplates;
    }

    /**
     * Gets the resource collection API of Artifacts.
     * 
     * @return Resource collection API of Artifacts.
     */
    public Artifacts artifacts() {
        if (this.artifacts == null) {
            this.artifacts = new ArtifactsImpl(clientObject.getArtifacts(), this);
        }
        return artifacts;
    }

    /**
     * Gets the resource collection API of Costs. It manages LabCost.
     * 
     * @return Resource collection API of Costs.
     */
    public Costs costs() {
        if (this.costs == null) {
            this.costs = new CostsImpl(clientObject.getCosts(), this);
        }
        return costs;
    }

    /**
     * Gets the resource collection API of CustomImages. It manages CustomImage.
     * 
     * @return Resource collection API of CustomImages.
     */
    public CustomImages customImages() {
        if (this.customImages == null) {
            this.customImages = new CustomImagesImpl(clientObject.getCustomImages(), this);
        }
        return customImages;
    }

    /**
     * Gets the resource collection API of Formulas. It manages Formula.
     * 
     * @return Resource collection API of Formulas.
     */
    public Formulas formulas() {
        if (this.formulas == null) {
            this.formulas = new FormulasImpl(clientObject.getFormulas(), this);
        }
        return formulas;
    }

    /**
     * Gets the resource collection API of GalleryImages.
     * 
     * @return Resource collection API of GalleryImages.
     */
    public GalleryImages galleryImages() {
        if (this.galleryImages == null) {
            this.galleryImages = new GalleryImagesImpl(clientObject.getGalleryImages(), this);
        }
        return galleryImages;
    }

    /**
     * Gets the resource collection API of NotificationChannels. It manages NotificationChannel.
     * 
     * @return Resource collection API of NotificationChannels.
     */
    public NotificationChannels notificationChannels() {
        if (this.notificationChannels == null) {
            this.notificationChannels = new NotificationChannelsImpl(clientObject.getNotificationChannels(), this);
        }
        return notificationChannels;
    }

    /**
     * Gets the resource collection API of PolicySets.
     * 
     * @return Resource collection API of PolicySets.
     */
    public PolicySets policySets() {
        if (this.policySets == null) {
            this.policySets = new PolicySetsImpl(clientObject.getPolicySets(), this);
        }
        return policySets;
    }

    /**
     * Gets the resource collection API of Policies. It manages Policy.
     * 
     * @return Resource collection API of Policies.
     */
    public Policies policies() {
        if (this.policies == null) {
            this.policies = new PoliciesImpl(clientObject.getPolicies(), this);
        }
        return policies;
    }

    /**
     * Gets the resource collection API of Schedules.
     * 
     * @return Resource collection API of Schedules.
     */
    public Schedules schedules() {
        if (this.schedules == null) {
            this.schedules = new SchedulesImpl(clientObject.getSchedules(), this);
        }
        return schedules;
    }

    /**
     * Gets the resource collection API of ServiceRunners. It manages ServiceRunner.
     * 
     * @return Resource collection API of ServiceRunners.
     */
    public ServiceRunners serviceRunners() {
        if (this.serviceRunners == null) {
            this.serviceRunners = new ServiceRunnersImpl(clientObject.getServiceRunners(), this);
        }
        return serviceRunners;
    }

    /**
     * Gets the resource collection API of Users. It manages User.
     * 
     * @return Resource collection API of Users.
     */
    public Users users() {
        if (this.users == null) {
            this.users = new UsersImpl(clientObject.getUsers(), this);
        }
        return users;
    }

    /**
     * Gets the resource collection API of Disks. It manages Disk.
     * 
     * @return Resource collection API of Disks.
     */
    public Disks disks() {
        if (this.disks == null) {
            this.disks = new DisksImpl(clientObject.getDisks(), this);
        }
        return disks;
    }

    /**
     * Gets the resource collection API of Environments. It manages DtlEnvironment.
     * 
     * @return Resource collection API of Environments.
     */
    public Environments environments() {
        if (this.environments == null) {
            this.environments = new EnvironmentsImpl(clientObject.getEnvironments(), this);
        }
        return environments;
    }

    /**
     * Gets the resource collection API of Secrets. It manages Secret.
     * 
     * @return Resource collection API of Secrets.
     */
    public Secrets secrets() {
        if (this.secrets == null) {
            this.secrets = new SecretsImpl(clientObject.getSecrets(), this);
        }
        return secrets;
    }

    /**
     * Gets the resource collection API of ServiceFabrics. It manages ServiceFabric.
     * 
     * @return Resource collection API of ServiceFabrics.
     */
    public ServiceFabrics serviceFabrics() {
        if (this.serviceFabrics == null) {
            this.serviceFabrics = new ServiceFabricsImpl(clientObject.getServiceFabrics(), this);
        }
        return serviceFabrics;
    }

    /**
     * Gets the resource collection API of ServiceFabricSchedules.
     * 
     * @return Resource collection API of ServiceFabricSchedules.
     */
    public ServiceFabricSchedules serviceFabricSchedules() {
        if (this.serviceFabricSchedules == null) {
            this.serviceFabricSchedules
                = new ServiceFabricSchedulesImpl(clientObject.getServiceFabricSchedules(), this);
        }
        return serviceFabricSchedules;
    }

    /**
     * Gets the resource collection API of VirtualMachines. It manages LabVirtualMachine.
     * 
     * @return Resource collection API of VirtualMachines.
     */
    public VirtualMachines virtualMachines() {
        if (this.virtualMachines == null) {
            this.virtualMachines = new VirtualMachinesImpl(clientObject.getVirtualMachines(), this);
        }
        return virtualMachines;
    }

    /**
     * Gets the resource collection API of VirtualMachineSchedules.
     * 
     * @return Resource collection API of VirtualMachineSchedules.
     */
    public VirtualMachineSchedules virtualMachineSchedules() {
        if (this.virtualMachineSchedules == null) {
            this.virtualMachineSchedules
                = new VirtualMachineSchedulesImpl(clientObject.getVirtualMachineSchedules(), this);
        }
        return virtualMachineSchedules;
    }

    /**
     * Gets the resource collection API of VirtualNetworks. It manages VirtualNetwork.
     * 
     * @return Resource collection API of VirtualNetworks.
     */
    public VirtualNetworks virtualNetworks() {
        if (this.virtualNetworks == null) {
            this.virtualNetworks = new VirtualNetworksImpl(clientObject.getVirtualNetworks(), this);
        }
        return virtualNetworks;
    }

    /**
     * Gets wrapped service client DevTestLabsClient providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     * 
     * @return Wrapped service client DevTestLabsClient.
     */
    public DevTestLabsClient serviceClient() {
        return this.clientObject;
    }
}
