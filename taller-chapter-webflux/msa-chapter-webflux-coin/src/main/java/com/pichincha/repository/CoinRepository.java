package com.pichincha.repository;

import com.pichincha.domain.dto.CoinDto;
import reactor.core.publisher.Mono;

public interface CoinRepository {
    Mono<CoinDto> getCoinById(String id);
}
