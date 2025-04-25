package org.openapitools.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${login.name:login}", configuration = ClientConfiguration.class)
public interface LoginApiClient extends LoginApi {
}
