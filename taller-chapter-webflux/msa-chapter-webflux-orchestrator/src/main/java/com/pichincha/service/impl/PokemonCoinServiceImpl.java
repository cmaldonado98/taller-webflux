package com.pichincha.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pichincha.domain.dto.PokemonDto;
import com.pichincha.domain.dto.SkillDto;
import com.pichincha.model.entity.PokemonCoin;
import com.pichincha.repository.CoinRepository;
import com.pichincha.repository.PokemonRepository;
import com.pichincha.repository.SkillsRepository;
import com.pichincha.service.PokemonCoinService;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import reactor.util.function.Tuple2;

@Service
public class PokemonCoinServiceImpl implements PokemonCoinService {
@Autowired
CoinRepository coinRepository;

@Autowired
PokemonRepository pokemonRepository;

@Autowired
SkillsRepository  skillsRepository;

@Override
public Mono<PokemonCoin> getPokemonCoin(String id) {    
  return  Mono.zip(pokemonRepository.getPokemon(id).subscribeOn(Schedulers.parallel()),
      skillsRepository.getSkills(Integer.valueOf(id)).subscribeOn(Schedulers.parallel())).flatMap(this::buildResponse);
}

private Mono<PokemonCoin> buildResponse(Tuple2<PokemonDto, SkillDto>  tup){  
  return coinRepository.getCoin(tup.getT1().getAsset()).map(coin->
    PokemonCoin.builder()
        .pokemonDto(tup.getT1())
        .skillDto(tup.getT2())
        .cointDto(coin)
        .priceUsd(tup.getT1().getPrice()*coin.getUsd())
        .build());    
}

}
