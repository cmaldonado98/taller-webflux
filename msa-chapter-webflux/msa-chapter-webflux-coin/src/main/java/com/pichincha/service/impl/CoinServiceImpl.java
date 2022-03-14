package com.pichincha.service.impl;

import com.pichincha.domain.dto.CoinDto;
import com.pichincha.repository.CoinRepository;
import com.pichincha.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CoinServiceImpl implements CoinService {

    @Autowired
    private CoinRepository coinRepository;

    @Override
    public Mono<CoinDto> getCoin(CoinDto coinDto) {
        return coinRepository.getCoin(coinDto);
    }
}
