package com.pichincha.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.reactive.function.server.RouterFunction;

import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import com.pichincha.handler.PokemonCoinHandler;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class RouterConfiguration {

private final PokemonCoinHandler pokemonCoinHandler;

  @Bean
  public RouterFunction<ServerResponse> routes() {
    return route().GET("/api/pokemon/{id}", pokemonCoinHandler::getPokemonCoin).build();

  }
}
