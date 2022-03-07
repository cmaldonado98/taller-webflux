package com.pichincha.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@RequiredArgsConstructor
public class RouterConfiguration {

    private final PropertiesConfiguration propertiesConfiguration;

    @Bean
    public RouterFunction<ServerResponse> routes() {
        return route().path(propertiesConfiguration.getPokemon().getBasePath(), () ->
                route()
                        .path("/web-flux/")).build();
    }
}
