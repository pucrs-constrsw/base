package org.firpy.oauthclient;

import org.firpy.oauthclient.api.LoginApiClient;
import org.firpy.oauthclient.api.RolesApiClient;
import org.firpy.oauthclient.api.UsersApiClient;
import org.firpy.oauthclient.model.AccessToken;
import org.firpy.oauthclient.model.GetUserResponse;
import org.firpy.oauthclient.model.LoginRequest;
import org.firpy.oauthclient.model.RoleRepresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class OauthClientApplication implements ApplicationRunner
{

    public OauthClientApplication(LoginApiClient loginApiClient, UsersApiClient usersApiClient, RolesApiClient rolesApiClient)
    {
        this.loginApiClient = loginApiClient;
        this.usersApiClient = usersApiClient;
        this.rolesApiClient = rolesApiClient;
    }

    public static void main(String[] args)
	{
		SpringApplication.run(OauthClientApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception
	{
		ResponseEntity<AccessToken> accessToken = loginApiClient.login(new LoginRequest("admin@pucrs.br", "a12345678"));
		String authorization = "Bearer %s".formatted(Objects.requireNonNull(accessToken.getBody()).getAccessToken());
		ResponseEntity<List<GetUserResponse>> users = usersApiClient.getUsers(authorization, null, null, null, null, null);
		ResponseEntity<List<RoleRepresentation>> roles = rolesApiClient.getRoles(authorization);

		logger.info("Users: {}", users.getBody());
		logger.info("Roles: {}", roles.getBody());
	}

	private final LoginApiClient loginApiClient;
	private final UsersApiClient usersApiClient;
	private final RolesApiClient rolesApiClient;

	private final Logger logger = LoggerFactory.getLogger(OauthClientApplication.class);
}
