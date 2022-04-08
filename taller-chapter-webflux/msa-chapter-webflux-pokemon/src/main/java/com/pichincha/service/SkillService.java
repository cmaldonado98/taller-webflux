package com.pichincha.service;

import com.pichincha.domain.dto.SkillDto;
import reactor.core.publisher.Mono;

public interface SkillService {
    Mono<SkillDto> getSkill(String skillId);
}
