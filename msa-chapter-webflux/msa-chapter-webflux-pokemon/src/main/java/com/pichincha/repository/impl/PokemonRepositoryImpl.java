package com.pichincha.repository.impl;

import com.pichincha.domain.dto.PokemonDto;
import com.pichincha.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.pichincha.repository.PokemonRepository;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class PokemonRepositoryImpl implements PokemonRepository {

    @Value("${ws.pokemon.url}")
    private String URL_POKEMON;
    private final WebClientUtil webClientUtil;

    @Override
    public Mono<PokemonDto> getPokemon(String pokemonId) {
        return webClientUtil.builder()
                .build()
                .get()
                .uri(URL_POKEMON.concat(String.valueOf(pokemonId)))
                .retrieve()
                .bodyToMono(PokemonDto.class);
    }


}
