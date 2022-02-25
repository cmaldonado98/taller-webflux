package com.pichincha.services.impl;

import com.pichincha.domain.dto.coin.response.Coin;
import com.pichincha.repository.CoinRepository;
import com.pichincha.services.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CoinServiceImpl implements CoinService {

    @Autowired
    private CoinRepository coinRepository;

    @Override
    public Mono<Coin> getCoins() {
        return coinRepository.getCoin();
    }
}
