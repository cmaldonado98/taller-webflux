package com.pichincha.handler.impl;

import com.pichincha.domain.dto.CoinDto;
import com.pichincha.handler.CoinHandler;
import com.pichincha.service.CoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyExtractors;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@RequiredArgsConstructor
public class CoinHandlerImpl implements CoinHandler {

    private final CoinService coinService;

    @Override
    public Mono<ServerResponse> getCoin(ServerRequest serverRequest) {
        return serverRequest.body(BodyExtractors.toMono(CoinDto.class))
                .flatMap(coinService::getCoin)
                .flatMap(response -> ok().body(BodyInserters.fromValue(response)));
    }
}
