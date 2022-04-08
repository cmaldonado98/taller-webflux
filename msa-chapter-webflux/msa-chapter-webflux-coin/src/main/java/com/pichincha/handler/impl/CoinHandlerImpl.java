package com.pichincha.handler.impl;

import com.pichincha.domain.dto.CoinDto;
import com.pichincha.handler.CoinHandler;
import com.pichincha.service.CoinService;
import com.pichincha.util.Constant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyExtractors;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromValue;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@RequiredArgsConstructor
public class CoinHandlerImpl implements CoinHandler {

    private final CoinService coinService;

    @Override
    public Mono<ServerResponse> getCoinById(ServerRequest serverRequest) {
        return coinService.getCoinById(serverRequest.pathVariable(Constant.REQUEST_ID_LABEL)).
                flatMap(response -> ok().body(fromValue(response)));
    }
}
