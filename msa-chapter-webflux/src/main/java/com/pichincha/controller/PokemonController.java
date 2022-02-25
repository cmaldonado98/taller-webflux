package com.pichincha.controller;

import com.pichincha.domain.dto.pokemon.response.Pokemon;
import com.pichincha.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("retrieve-pokemons")
    public Mono<ResponseEntity<Pokemon>> getPokemons() {
        Mono<Pokemon> pokemon = pokemonService.getAllPokemons();
        return pokemon.map(ResponseEntity::ok);
    }

}
