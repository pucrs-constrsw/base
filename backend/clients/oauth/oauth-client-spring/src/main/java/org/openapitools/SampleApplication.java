package org.openapitools;

import org.openapitools.api.HealthApiClient;
import org.openapitools.api.LoginApiClient;
import org.openapitools.api.RolesApiClient;
import org.openapitools.api.UsersApiClient;
import org.openapitools.model.AccessToken;
import org.openapitools.model.GetUserResponse;
import org.openapitools.model.RoleRepresentation;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@EnableFeignClients
public class SampleApplication implements ApplicationRunner
{
    public SampleApplication(HealthApiClient client, LoginApiClient loginClient, UsersApiClient usersClient, RolesApiClient rolesClient)
    {
        this.client = client;
        this.loginClient = loginClient;
        this.usersClient = usersClient;
        this.rolesClient = rolesClient;
    }

    public static void main(String[] args)
    {
        SpringApplication.run(SampleApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception
    {
        client.health();
        ResponseEntity<AccessToken> accessToken = loginClient.login(new org.openapitools.model.LoginRequest("admin@pucrs.br", "a12345678"));
        String authorization = "Bearer %s".formatted(Objects.requireNonNull(accessToken.getBody()).getAccessToken());
        ResponseEntity<List<GetUserResponse>> users = usersClient.getUsers(authorization, null, null, null, null, null);
        ResponseEntity<List<RoleRepresentation>> roles = rolesClient.getRoles(authorization);
    }

    private final HealthApiClient client;
    private final LoginApiClient loginClient;
    private final UsersApiClient usersClient;
    private final RolesApiClient rolesClient;
}
