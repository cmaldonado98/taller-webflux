package com.pichincha.service;

import com.pichincha.domain.dto.CoinDto;
import reactor.core.publisher.Mono;

public interface CoinService {
    Mono<CoinDto> getCoinById(String id);
}
