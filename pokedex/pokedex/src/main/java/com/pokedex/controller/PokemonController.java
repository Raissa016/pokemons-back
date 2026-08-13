package com.pokedex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @GetMapping("/oi/{nome}")
    public String HelloWorld(@PathVariable String nome){
        return "Hello!" + nome;

    }
    @GetMapping("tchau/{acao}")
    public String ByeWorld(@PathVariable String acao) {
        return "Bye World!" + acao;
    }






}
