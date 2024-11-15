package org.example.hazards.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HazzardConfig {

    @Bean
    public RestTemplate getTemplate() {

        RestTemplate template = new RestTemplate();
        // setup RestTemplate here
        return template;
    }
}
