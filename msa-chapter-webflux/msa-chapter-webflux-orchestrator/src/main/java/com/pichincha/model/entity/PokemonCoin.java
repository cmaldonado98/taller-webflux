package com.pichincha.model.entity;

import static lombok.AccessLevel.PRIVATE;

import com.pichincha.domain.dto.CoinDto;
import com.pichincha.domain.dto.PokemonDto;
import com.pichincha.domain.dto.SkillDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
public class PokemonCoin {
   
      PokemonDto pokemonDto;
      SkillDto skillDto;
      CoinDto cointDto;
      int priceUsd;
}
