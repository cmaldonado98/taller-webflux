package com.pichincha.repository;

import com.pichincha.domain.dto.SkillDto;

import reactor.core.publisher.Mono;

public interface SkillsRepository {  
  Mono<SkillDto> getSkills(Integer id);      
}
