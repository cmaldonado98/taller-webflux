package com.pichincha.repository.impl;

import com.pichincha.domain.dto.SkillDto;
import com.pichincha.repository.SkillRepository;
import com.pichincha.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class SkillRepositoryImpl implements SkillRepository {

    @Value("${ws.skill.url}")
    private String URL_SKILL;
    private final WebClientUtil webClientUtil;

    @Override
    public Mono<SkillDto> getSkill(String skillId) {

        return webClientUtil.builder()
                .build()
                .get()
                .uri(URL_SKILL.concat(String.valueOf(skillId)))
                .retrieve()
                .bodyToMono(SkillDto.class);
    }

}
