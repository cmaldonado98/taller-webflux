package com.pichincha.controller;

import com.pichincha.domain.dto.CoinDto;
import com.pichincha.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class CoinController {

    @Autowired
    private CoinService coinService;

    @GetMapping("retrieve-coins222")
    public Mono<ResponseEntity<CoinDto>> getCoins() {
        Mono<CoinDto> coin = coinService.getCoinById("ada");
        return coin.map(ResponseEntity::ok);
    }
}
