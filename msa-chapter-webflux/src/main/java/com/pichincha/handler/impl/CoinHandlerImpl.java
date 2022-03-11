package com.pichincha.handler.impl;

import com.pichincha.handler.CoinHandler;
import com.pichincha.services.CoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
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
    public Mono<ServerResponse> getAllCoins(ServerRequest serverRequest) {
        return coinService.getCoins().flatMap(response -> ok().body(BodyInserters.fromValue(response)));
    }
}
