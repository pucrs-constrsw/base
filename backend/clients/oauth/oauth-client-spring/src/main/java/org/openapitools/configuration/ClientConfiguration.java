package org.openapitools.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;


public class ClientConfiguration {
    @Bean
    String getBasePath()
    {
        return oauthUrl;
    }


    @Value("${oauth.url}")
    private String oauthUrl;
}
