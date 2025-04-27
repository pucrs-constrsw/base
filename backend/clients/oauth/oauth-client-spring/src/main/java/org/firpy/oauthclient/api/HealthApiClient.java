package org.firpy.oauthclient.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="${health.name:health}", url = "http://${OAUTH_HOST}:${OAUTH_PORT}")
public interface HealthApiClient extends HealthApi {
}
