package com.pichincha.services;

import com.pichincha.domain.dto.pokemon.response.Pokemon;
import reactor.core.publisher.Mono;


public interface PokemonService {

    Mono<Pokemon> getAllPokemons();
    
}
