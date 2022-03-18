package com.pichincha.service.impl;

import com.pichincha.domain.dto.SkillDto;
import com.pichincha.repository.SkillRepository;
import com.pichincha.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Override
    public Mono<SkillDto> getSkill(SkillDto skillDto) {
        return skillRepository.getSkill(skillDto);
    }
}
