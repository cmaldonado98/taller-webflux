package com.pichincha.handler.impl;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.pichincha.handler.PokemonCoinHandler;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class PokemonCoinHandlerImpl implements PokemonCoinHandler {
  public final PokemonCoinService pokemonCoinService;

  @Override
  public Mono<ServerResponse> getPokemonCoin(ServerRequest serverRequest) {
    return

    pokemonCoinService.getPokemonCoin(serverRequest.pathVariable("id"))
        .flatMap(response -> ok().body(BodyInserters.fromValue(response)));
  }

}
