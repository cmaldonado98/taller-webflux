package com.pichincha.configuration;


import com.pichincha.handler.CoinHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@RequiredArgsConstructor
public class RouterConfiguration {

    private final CoinHandler coinHandler;

    @Bean
    public RouterFunction<ServerResponse> routes() {
        return route().POST("/retrieve-coin", coinHandler::getCoin).build();
    }
}
