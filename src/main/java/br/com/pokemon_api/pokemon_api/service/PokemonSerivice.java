package br.com.pokemon_api.pokemon_api.service;

import java.util.List;

import br.com.pokemon_api.pokemon_api.model.Pokemon;

public interface PokemonSerivice {

  List<Pokemon> listarPokemon();

  Pokemon buscarPokemon(long idPokemon);

  Pokemon criarPokemon(Pokemon pokemon);

  void atualizarPokemon(long idPokemon, Pokemon pokemon);

  void deletarPokemon(long idPokemon);

}
