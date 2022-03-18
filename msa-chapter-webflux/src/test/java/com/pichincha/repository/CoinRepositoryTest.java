package com.pichincha.repository;

import com.pichincha.domain.dto.coin.response.Coin;
import com.pichincha.domain.dto.coin.response.Criptos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

import java.util.Collections;

public class CoinRepositoryTest {
    @Autowired
    private CoinRepository coinRepository;

    Coin validCoin = Coin.builder()
            .Criptos(Collections.singletonList(Criptos.builder()
                    .Id("1")
                    .Nombre("PokeCoin")
                    .Precio("9999,99")
                    .build()))
            .build();

//    @Test
//    void shouldFindValidCoin(){
//        Mono<Coin> coinMono = coinRepository.getCoin();
//        assertThat(coinMono).isPresent();
//    }
}
