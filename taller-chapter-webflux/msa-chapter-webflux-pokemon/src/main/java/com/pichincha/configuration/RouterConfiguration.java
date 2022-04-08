package com.pichincha.configuration;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import com.pichincha.handler.PokemonHandler;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@RequiredArgsConstructor
public class RouterConfiguration {

    private final PokemonHandler pokemonHandler;

    @Bean
    public RouterFunction<ServerResponse> routes() {
        return route().GET("/retrieve-pokemon/{pokemonId}", pokemonHandler::getPokemon).build();
    }

    @Bean
    public RouterFunction<ServerResponse> routes2() {
        return route().GET("/retrieve-skill/{skillId}", pokemonHandler::getSkill).build();
    }
}
