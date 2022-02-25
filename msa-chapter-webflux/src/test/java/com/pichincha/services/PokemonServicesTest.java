package com.pichincha.services;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PokemonServicesTest {

  /*
@InjectMocks
PokemonServicesImpl pokemonServices;

@Test
void returnListEmpty(){
  assertTrue(pokemonServices.getAllPokemons().isEmpty());
}

@Test
void returnListPokemons(){
  assertTrue(!pokemonServices.getAllValidPokemons().isEmpty());
}

@Test
void returnObjectPokemon() {
  PokemonCoin pokemonValue=pokemonServices.getPokemonsCoin("Pikachu");
  assertNotNull(pokemonValue);
}

@Test
void returnObjectPokemonPicachu() {
  PokemonCoin expectedPokemon=PokemonCoin.builder()
                            .name("Pikachu")
                            .url("htpp:/pokemon/1")
                            .coin("etherum")
                            .price(125)
                            .build();
  PokemonCoin Actualpokemon=pokemonServices.getPokemonsCoin("PiKachu");
  assertEquals(expectedPokemon,Actualpokemon);
}
*/
}
