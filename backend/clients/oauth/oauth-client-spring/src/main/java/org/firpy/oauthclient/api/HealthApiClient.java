package org.firpy.oauthclient.api;

import org.firpy.oauthclient.configuration.ClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="${health.name:health}", url = "${oauth.url}")
public interface HealthApiClient extends HealthApi {
}
