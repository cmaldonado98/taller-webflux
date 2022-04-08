package com.pichincha.repository.impl;

import com.pichincha.domain.dto.CoinDto;
import com.pichincha.repository.CoinRepository;
import com.pichincha.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class CoinRepositoryImpl implements CoinRepository {

    private final WebClientUtil webClientUtil;

    @Value("${ws.coin.url}")
    private String coinServiceUrl;

    @Override
    public Mono<CoinDto> getCoinById(String id) {
        return webClientUtil.builder()
                .build()
                .get()
                .uri(coinServiceUrl.concat(id))
                .retrieve()
                .bodyToMono(CoinDto.class);
    }


}
