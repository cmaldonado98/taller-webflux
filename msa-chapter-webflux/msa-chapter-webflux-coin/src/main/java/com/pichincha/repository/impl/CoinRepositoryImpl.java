package com.pichincha.repository.impl;

import com.pichincha.domain.dto.CoinDto;
import com.pichincha.repository.CoinRepository;
import com.pichincha.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class CoinRepositoryImpl implements CoinRepository {

    private static final String URL_COIN = "https://47d1f209-3c16-4ed4-b8d4-21a668b3e00c.mock.pstmn.io/bp-coins?id=";
    private final WebClientUtil webClientUtil;

    @Override
    public Mono<CoinDto> getCoin(CoinDto coinDto) {
        return webClientUtil.builder()
                .build()
                .get()
                .uri(URL_COIN.concat(coinDto.getId()))
                .retrieve()
                .bodyToMono(CoinDto.class);
    }


}
