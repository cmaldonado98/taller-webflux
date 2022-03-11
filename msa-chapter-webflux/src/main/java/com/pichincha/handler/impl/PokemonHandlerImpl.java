package com.pichincha.handler.impl;

import com.pichincha.domain.dto.pokemon.response.Pokemon;
import com.pichincha.handler.PokemonHandler;
import com.pichincha.services.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyExtractors;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@RequiredArgsConstructor
public class PokemonHandlerImpl implements PokemonHandler {

    private final PokemonService pokemonService;

    @Override
    public Mono<ServerResponse> getAllPokemons(ServerRequest serverRequest) {
        return pokemonService.getAllPokemons()
               .flatMap(response -> ok().body(BodyInserters.fromValue(response)));
    }
}
