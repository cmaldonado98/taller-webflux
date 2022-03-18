package com.pichincha.repository.impl;

import com.pichincha.domain.dto.PokemonDto;
import com.pichincha.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.pichincha.repository.PokemonRepository;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class PokemonRepositoryImpl implements PokemonRepository {

    private static final String URL_POKEMON = "https://47d1f209-3c16-4ed4-b8d4-21a668b3e00c.mock.pstmn.io/bp-pokemon?id=";
    private final WebClientUtil webClientUtil;

    @Override
    public Mono<PokemonDto> getPokemon(PokemonDto pokemonDto) {
        return webClientUtil.builder()
                .build()
                .get()
                .uri(URL_POKEMON.concat(String.valueOf(pokemonDto.getId())))
                .retrieve()
                .bodyToMono(PokemonDto.class);
    }


}
