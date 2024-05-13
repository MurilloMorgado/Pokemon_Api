package br.com.pokemon_api.pokemon_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pokemon_api.pokemon_api.model.Pokemon;
import br.com.pokemon_api.pokemon_api.service.PokemonService;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
  
  @Autowired
  private PokemonService pokemonService;


  @Autowired
  public ResponseEntity<List<Pokemon>> listarPokemon(){
    List<Pokemon> listarPokemon = pokemonService.listarPokemon();
    return ResponseEntity.ok().body(listarPokemon);
  }
  
}
