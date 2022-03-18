package com.pichincha.handler;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public interface PokemonHandler {
    Mono<ServerResponse> getPokemon(ServerRequest serverRequest);

    Mono<ServerResponse> getSkill(ServerRequest serverRequest);
}
