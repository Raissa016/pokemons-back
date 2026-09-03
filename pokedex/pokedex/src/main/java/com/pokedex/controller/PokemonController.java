package com.pokedex.controller;

import com.pokedex.model.Pokemon;
import com.pokedex.repository.PokemonRepository;
import com.pokedex.service.PokemonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
                public List<Pokemon> mostrarPokemon(){
             List<Pokemon> pikachu = pokemonService.addPokemon(Pokemon);
            return  pikachu;
        }

@PostMapping ("oi/{pokemon}")
    public void  addpokemon(@RequestBody Pokemon pokemon) {
    pokemonService.addPokemon(pokemon);
}

}







}
