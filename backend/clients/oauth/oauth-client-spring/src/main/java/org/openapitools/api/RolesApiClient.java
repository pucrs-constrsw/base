package org.openapitools.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${roles.name:roles}", configuration = ClientConfiguration.class)
public interface RolesApiClient extends RolesApi {
}
