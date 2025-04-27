package org.firpy.oauthclient.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="${login.name:login}", url = "http://${OAUTH_HOST}:${OAUTH_PORT}")
public interface LoginApiClient extends LoginApi {
}
