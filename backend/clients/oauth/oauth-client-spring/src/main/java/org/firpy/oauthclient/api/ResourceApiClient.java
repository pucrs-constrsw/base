package org.firpy.oauthclient.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="${resource.name:resource}", url = "http://${OAUTH_HOST}:${OAUTH_PORT}")
public interface ResourceApiClient extends ResourceApi {
}
