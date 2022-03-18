package com.pichincha.controller;

//import com.pichincha.domain.dto.coin.response.Coin;
//import com.pichincha.domain.dto.coin.response.Criptos;
import com.pichincha.domain.dto.pokemon.response.Pokemon;
import com.pichincha.repository.PokemonRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import java.util.Collections;

@WebFluxTest
public class PokemonControllerTest {

    @Autowired
    WebTestClient webTestClient;

    @MockBean
    PokemonRepository pokemonRepository;

//    @Test
//    void testGetPokemon(){
//        Mono<Pokemon> pokemonMono = Mono.just(new Pokemon())
//    }

}
