package org.openapitools.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${{resource}.name:{resource}}", configuration = ClientConfiguration.class)
public interface ResourceApiClient extends ResourceApi {
}
