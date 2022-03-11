package com.pichincha.configuration;


import com.pichincha.handler.PokemonHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@RequiredArgsConstructor
public class RouterConfiguration {
    
    private final PokemonHandler pokemonHandler;

    @Bean
    public RouterFunction<ServerResponse> routes() {
       return route().GET("/retrieve-pokemons-router-configuration", pokemonHandler::getAllPokemons).build();
    }
}
