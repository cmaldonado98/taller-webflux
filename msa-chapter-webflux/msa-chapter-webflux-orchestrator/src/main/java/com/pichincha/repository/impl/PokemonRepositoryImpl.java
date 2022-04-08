package com.pichincha.repository.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.pichincha.domain.dto.PokemonDto;
import com.pichincha.repository.PokemonRepository;
import com.pichincha.util.WebClientUtil;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class PokemonRepositoryImpl implements PokemonRepository {

  @Value("${ws.pokemon.url}")
  private String URL_POKEMON;
  private final WebClientUtil webClientUtil;

  public Mono<PokemonDto> getPokemon(String id) {
      return webClientUtil.builder()              
              .build()    
              .get()
              .uri(URL_POKEMON.concat(id))
              .retrieve()
              .bodyToMono(PokemonDto.class);
  }
}
