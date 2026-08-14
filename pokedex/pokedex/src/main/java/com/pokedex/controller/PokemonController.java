package com.pokedex.controller;

import com.pokedex.model.Pokemon;
import com.pokedex.repository.PokemonRepository;
import com.pokedex.service.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {



    private PokemonService pokemonService;


    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/oi/{nome}")
    public String HelloWorld(@PathVariable String nome){

        String saudacao = pokemonService.HelloWorld(nome);

        return saudacao;

    }
    @GetMapping("tchau/{acao}")
    public String ByeWorld(@PathVariable String acao) {
        //return "Bye World!" + acao;


        String abraco = pokemonService.ByeWorld(acao);

        return abraco;

    }
        @GetMapping("/pikachu/{tipo}")
                public Pokemon pikachu(@PathVariable String tipo){
            Pokemon pikachu = pokemonService.pikachu(tipo);
            return  pikachu;
        }









}
