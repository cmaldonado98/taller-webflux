package com.pichincha.services;

import java.util.List;

import com.pichincha.domain.PokemonCoin;



public interface PokemonServices {

  List<Object> getAllPokemons();
  List<Object> getAllValidPokemons();
  PokemonCoin getPokemonsCoin(String string);

  
}
