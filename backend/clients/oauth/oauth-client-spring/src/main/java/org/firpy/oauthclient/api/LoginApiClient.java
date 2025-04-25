package org.firpy.oauthclient.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="${login.name:login}", url = "${oauth.url}")
public interface LoginApiClient extends LoginApi {
}
