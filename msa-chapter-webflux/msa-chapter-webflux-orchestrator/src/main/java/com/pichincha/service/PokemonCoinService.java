package com.pichincha.service;

import com.pichincha.model.entity.PokemonCoin;
import reactor.core.publisher.Mono;

public interface PokemonCoinService {
  public Mono<PokemonCoin> getPokemonCoin(String id);
}
