package com.pokedex.repository;


import com.pokedex.model.Pokemon;
import org.springframework.stereotype.Repository;

@Repository
public class PokemonRepository {

    private String nome ;


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
}





