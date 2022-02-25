package com.pichincha.services.impl;

import com.pichincha.domain.dto.pokemon.response.Pokemon;
import com.pichincha.repository.PokemonRepository;
import com.pichincha.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PokemonServiceImpl implements PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Override
    public Mono<Pokemon> getAllPokemons() {
        return pokemonRepository.getPokemons();
    }
}
