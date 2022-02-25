package com.pichincha.repository;

import com.pichincha.domain.dto.coin.response.Coin;
import reactor.core.publisher.Mono;

public interface CoinRepository {

    Mono<Coin> getCoin();
}
