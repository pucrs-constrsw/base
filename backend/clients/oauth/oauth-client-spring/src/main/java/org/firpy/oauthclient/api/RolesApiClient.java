package org.firpy.oauthclient.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="${roles.name:roles}", url = "${oauth.url}")
public interface RolesApiClient extends RolesApi {
}
