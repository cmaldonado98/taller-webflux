package com.pichincha.repository;

import com.pichincha.domain.dto.pokemon.response.Pokemon;
import reactor.core.publisher.Mono;

public interface PokemonRepository {

    Mono<Pokemon> getPokemons();
}
