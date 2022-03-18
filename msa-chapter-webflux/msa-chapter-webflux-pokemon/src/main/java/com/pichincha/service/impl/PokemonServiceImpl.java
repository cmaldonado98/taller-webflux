package com.pichincha.service.impl;

import com.pichincha.domain.dto.PokemonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pichincha.repository.PokemonRepository;
import com.pichincha.service.PokemonService;
import reactor.core.publisher.Mono;

@Service
public class PokemonServiceImpl implements PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Override
    public Mono<PokemonDto> getPokemon (PokemonDto pokemonDto) {
        return pokemonRepository.getPokemon(pokemonDto);
    }
}
