package org.openapitools.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${users.name:users}", configuration = ClientConfiguration.class)
public interface UsersApiClient extends UsersApi {
}
