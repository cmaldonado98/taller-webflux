package com.pichincha.services;

import com.pichincha.domain.dto.coin.response.Coin;
import reactor.core.publisher.Mono;

public interface CoinService {

    Mono<Coin> getCoins();
}
