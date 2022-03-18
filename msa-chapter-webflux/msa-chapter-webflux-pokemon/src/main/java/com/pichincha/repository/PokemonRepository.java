package com.pichincha.repository;

import com.pichincha.domain.dto.PokemonDto;
import reactor.core.publisher.Mono;

public interface PokemonRepository {
    Mono<PokemonDto> getPokemon(PokemonDto pokemonDto);
}
