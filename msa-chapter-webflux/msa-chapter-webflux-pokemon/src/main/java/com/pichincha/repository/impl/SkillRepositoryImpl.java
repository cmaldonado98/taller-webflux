package com.pichincha.repository.impl;

import com.pichincha.domain.dto.PokemonDto;
import com.pichincha.domain.dto.SkillDto;
import com.pichincha.repository.SkillRepository;
import com.pichincha.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class SkillRepositoryImpl implements SkillRepository {

    private static final String URL_POKEMON = "https://47d1f209-3c16-4ed4-b8d4-21a668b3e00c.mock.pstmn.io/bp-pokemon-skills?id=";
    private final WebClientUtil webClientUtil;

    @Override
    public Mono<SkillDto> getSkill(SkillDto skillDto) {

        return webClientUtil.builder()
                .build()
                .get()
                .uri(URL_POKEMON.concat(String.valueOf(skillDto.getId())))
                .retrieve()
                .bodyToMono(SkillDto.class);
    }

}
