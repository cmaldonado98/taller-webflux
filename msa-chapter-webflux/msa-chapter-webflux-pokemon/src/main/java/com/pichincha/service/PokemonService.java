package com.pichincha.service;

import com.pichincha.domain.dto.PokemonDto;
import reactor.core.publisher.Mono;

public interface PokemonService {
    Mono<PokemonDto> getPokemon(PokemonDto pokemonDto);
}
