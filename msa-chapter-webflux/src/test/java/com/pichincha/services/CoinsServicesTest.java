package com.pichincha.services;

import com.pichincha.domain.dto.coin.response.Coin;
import com.pichincha.domain.dto.coin.response.Criptos;
import com.pichincha.services.impl.CoinServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
public class CoinsServicesTest {

//    @InjectMocks
//    CoinServiceImpl coinServices;
//
//    Coin validCoin = Coin.builder()
//            .Criptos(Collections.singletonList(Criptos.builder()
//                    .Id("1")
//                    .Nombre("PokeCoin")
//                    .Precio("9999,99")
//                    .build()))
//            .build();

//    @Test
//    void returnListEmpty() {
//        assertTrue(coinServices.getCoins().equals(null));
//    }
//
//    @Test
//    void returnListCoins() {
//        assertTrue(!coinServices.getAllCoins().isEmpty());
//    }
}
