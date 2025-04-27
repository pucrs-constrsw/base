package org.firpy.oauthclient.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="${users.name:users}", url = "http://${OAUTH_HOST}:${OAUTH_PORT}")
public interface UsersApiClient extends UsersApi {
}
