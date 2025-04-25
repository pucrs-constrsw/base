package org.openapitools.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${health.name:health}", configuration = ClientConfiguration.class)
public interface HealthApiClient extends HealthApi {
}
