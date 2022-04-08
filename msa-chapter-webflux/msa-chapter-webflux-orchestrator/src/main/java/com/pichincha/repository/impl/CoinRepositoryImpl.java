package com.pichincha.repository.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.pichincha.domain.dto.CoinDto;
import com.pichincha.repository.CoinRepository;
import com.pichincha.util.WebClientUtil;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;


@RequiredArgsConstructor
@Component
public class CoinRepositoryImpl implements CoinRepository{

  @Value("${ws.coin.url}")
  private String URL_COIN;
  private final WebClientUtil webClientUtil;

  public Mono<CoinDto> getCoin(String id) {
      return webClientUtil.builder()              
              .build()    
              .get()
              .uri(URL_COIN.concat(id))
              .retrieve()
              .bodyToMono(CoinDto.class);
  }
}
