package com.pichincha.repository.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.pichincha.domain.dto.SkillDto;
import com.pichincha.repository.SkillsRepository;
import com.pichincha.util.WebClientUtil;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class SkillsRepositoryImpl implements SkillsRepository {

  @Value("${ws.skill.url}")
  private String URL_SKILL;
  private final WebClientUtil webClientUtil;

  public Mono<SkillDto> getSkills(Integer id) {
      return webClientUtil.builder()              
              .build()    
              .get()
              .uri(URL_SKILL.concat(String.valueOf(id)))
              .retrieve()
              .bodyToMono(SkillDto.class);
  }
}
