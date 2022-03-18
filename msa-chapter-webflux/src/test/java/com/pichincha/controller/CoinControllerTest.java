package com.pichincha.controller;

import com.pichincha.domain.dto.coin.response.Coin;
import com.pichincha.domain.dto.coin.response.Criptos;
import com.pichincha.repository.CoinRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import java.util.Collections;

@WebFluxTest
public class CoinControllerTest {

    @Autowired
    WebTestClient webTestClient;

    @Autowired
    CoinRepository coinRepository;

    @Test
    void testGetCoin() {
        Mono<Coin> coinMono = Mono.just(Coin.builder()
                .Criptos(Collections.singletonList(Criptos.builder()
                        .Id("1")
                        .Nombre("PokeCoin")
                        .Precio("9999,99")
                        .build()))
                .build());
        Mockito.when(coinRepository.getCoin().thenReturn(coinMono));

        webTestClient.get()
                .uri("/retrieve-coin")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$").exists()
                .jsonPath("$").isArray()
                .jsonPath("$[0].Precio").isEqualTo("9999,99")
                .jsonPath("$[1].Nombre").isEqualTo("PokeCoin")
                .jsonPath("$[2].Id").isEqualTo("1");

    }
}
