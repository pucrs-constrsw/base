package org.firpy.oauthclient.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="${users.name:users}", url = "${oauth.url}")
public interface UsersApiClient extends UsersApi {
}
