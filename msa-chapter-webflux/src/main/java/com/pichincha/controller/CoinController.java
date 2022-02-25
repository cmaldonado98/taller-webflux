package com.pichincha.controller;

import com.pichincha.domain.dto.coin.response.Coin;
import com.pichincha.services.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class CoinController {

    @Autowired
    private CoinService coinService;

    @GetMapping("retrieve-coins")
    public Mono<ResponseEntity<Coin>> getCoins() {
        Mono<Coin> coin = coinService.getCoins();
        return coin.map(ResponseEntity::ok);
    }
}
