package com.pokedex.controller;


import com.pokedex.model.Pokemon;
import com.pokedex.service.PokemonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }



    @GetMapping("/tchau")
    public String ByeWorld(){
        return "Bye World!";
    }



    @PostMapping("/add")
    public String addPokemon(@RequestBody Pokemon pokemon){

        return pokemonService.adicionarPokemon(pokemon);
    }

    @GetMapping("/lista")
    public List<Pokemon> getLista(){
        return pokemonService.getLista();
    }

}