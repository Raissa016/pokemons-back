package com.pokedex.repository;

import com.pokedex.model.Pokemon;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.lang.String;

@Repository
public class PokemonRepository {

    private List<Pokemon> listaPokemon;

    public PokemonRepository(List<Pokemon> listaPokemon) {
        this.listaPokemon = listaPokemon;
    }


    public Pokemon buscarPokemon() {

        return new Pokemon(
                "Pikachu",
                "Elétrico"
        );

    }

    public String addPokemon(Pokemon pokemon){
        this.listaPokemon.add(pokemon);

        return "Deu certo!";
    }

    public List<Pokemon> getLista(){
        return this.listaPokemon;
    }


    public String updatePokemon(String nome, Pokemon pokemonAtualizado) {
        for (Pokemon pokemon : listaPokemon) {
            // Compara o nome ignorando maiúsculas/minúsculas
            if (pokemon.getNome().equalsIgnoreCase(nome)) {

                // Opção 1: Atualiza os dados do objeto existente (Recomendado)
                pokemon.setNome(pokemonAtualizado.getNome());
                pokemon.setTipo(pokemonAtualizado.getTipo());

                return "Pokémon atualizado com sucesso!";
            }
        }
        return "Pokémon não encontrado.";
    }



}