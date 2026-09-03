package com.pokedex.repository;


import com.pokedex.model.Pokemon;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PokemonRepository {

    private String nome = "kauan caralho";
    private List<Pokemon> listaPokemon;
    public String nomepokemon = "pokemons";

    public PokemonRepository(String nome, List<Pokemon> listaPokemon, String nomepokemon) {
        this.nome = nome;
        this.listaPokemon = listaPokemon;
        this.nomepokemon = nomepokemon;
    }

    public PokemonRepository() {
        this.nome =  "Kauan kralho";
    }

    public String mostrarNome(){
        return nome;
    }

    public Pokemon pegarPokemon(){
        Pokemon pikachu = new Pokemon("pikachu","raio");

        return pikachu;

    }
    public List<Pokemon> pegarpokemon(){
        Pokemon pikachu = new Pokemon("pikachu","eletrico");
        return this.pokemonList;

    }


    List<Pokemon> pokemonList = new ArrayList<Pokemon>();
    public void addPokemon(Pokemon pokemon){
        pokemonList.add(pokemon);
    }

}






