package com.pichincha.repository.impl;

import org.springframework.stereotype.Component;

import com.pichincha.domain.dto.SkillDto;
import com.pichincha.repository.SkillsRepository;
import com.pichincha.util.WebClientUtil;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class skillsRepositoryImpl implements SkillsRepository {
  private static final String URL_COIN = "https://47d1f209-3c16-4ed4-b8d4-21a668b3e00c.mock.pstmn.io/bp-pokemon-skills?id=";
  private final WebClientUtil webClientUtil;

  public Mono<SkillDto> getSkills(Integer id) {
      return webClientUtil.builder()              
              .build()    
              .get()
              .uri(URL_COIN.concat(String.valueOf(id)))
              .retrieve()
              .bodyToMono(SkillDto.class);
  }
}
