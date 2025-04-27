package org.firpy.oauthclient.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="${roles.name:roles}", url = "http://${OAUTH_HOST}:${OAUTH_PORT}")
public interface RolesApiClient extends RolesApi {
}
