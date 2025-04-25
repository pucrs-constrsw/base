package org.firpy.oauthclient.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="${resource.name:resource}", url = "${oauth.url}")
public interface ResourceApiClient extends ResourceApi {
}
