package com.pichincha.handler;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.pichincha.configuration.RouterConfiguration;
import com.pichincha.model.entity.PokemonCoin;
import com.pichincha.service.PokemonCoinService;
import reactor.core.publisher.Mono;

@WebFluxTest(controllers = { RouterConfiguration.class, PokemonCoinHandler.class })
public class PokemonCoinHandlerTest {
  static final String ID="1";
  @Autowired
  private RouterConfiguration routerConfiguration;
  @MockBean
  private PokemonCoinService pokemonCoinService;
  
  private WebTestClient webTestClient;
  PokemonCoin pokemonCoin;
  @Test
  void shouldReturnAllOkWhenExistPokemon() {
    this.webTestClient = WebTestClient.bindToRouterFunction(routerConfiguration.routes()).build();
    pokemonCoin=PokemonCoin.builder().build();
    when(pokemonCoinService.getPokemonCoin(ID))
    .thenReturn(Mono.just(pokemonCoin));
    
    webTestClient
    .get()
    .uri("/api/pokemon/{id}")
    .exchange()
    .expectStatus()
    .isOk()
    .expectBody(PokemonCoin.class)
    .value(actual -> assertEquals(pokemonCoin, actual));
  }
}
