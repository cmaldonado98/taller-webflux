package com.pichincha.repository.impl;

import com.pichincha.domain.dto.coin.response.Coin;
import com.pichincha.repository.CoinRepository;
import com.pichincha.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class CoinRepositoryImpl implements CoinRepository {

    private static final String URL_COIN = "https://mocki.io/v1/5058649e-2100-40f8-9eee-891dec28312d";

    private final WebClientUtil webClientUtil;

    @Override
    public Mono<Coin> getCoin() {
        return webClientUtil.builder()
                .build()
                .get()
                .uri(URL_COIN)
                .retrieve()
                .bodyToMono(Coin.class);
    }
}
