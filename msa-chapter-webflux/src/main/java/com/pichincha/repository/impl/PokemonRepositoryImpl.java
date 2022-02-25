package com.pichincha.repository.impl;

import com.pichincha.domain.dto.pokemon.response.Pokemon;
import com.pichincha.repository.PokemonRepository;
import com.pichincha.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class PokemonRepositoryImpl implements PokemonRepository {

    private static final String URL_POKEMON = "https://pokeapi.co/api/v2/pokemon?limit=50&offset=200";

    private final WebClientUtil webClientUtil;

    @Override
    public Mono<Pokemon> getPokemons() {
        return webClientUtil.builder()
                .build()
                .get()
                .uri(URL_POKEMON)
                .retrieve()
                .bodyToMono(Pokemon.class);
    }
}
