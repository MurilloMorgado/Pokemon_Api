package br.com.pokemon_api.pokemon_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pokemon_api.pokemon_api.model.Pokemon;
import br.com.pokemon_api.pokemon_api.service.PokemonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

  @Autowired
  private PokemonService pokemonService;

  @GetMapping
  public ResponseEntity<List<Pokemon>> listarPokemon() {
    List<Pokemon> listarPokemon = pokemonService.listarPokemon();
    return ResponseEntity.ok().body(listarPokemon);
  }

  @GetMapping(value = "/{idPokemon}")
  public ResponseEntity<Pokemon> buscarPokemon(@PathVariable Long idPokemon) {
    Pokemon buscarPokemon = pokemonService.buscarPokemon(idPokemon);
    return ResponseEntity.ok().body(buscarPokemon);
  }

  @PostMapping
  public ResponseEntity<Long> criarPokemon(@RequestBody Pokemon pokemon) {
    Long idPokemon = pokemonService.criarPokemon(pokemon).getIdPokemon();
    return ResponseEntity.ok().body(idPokemon);
  }

  @PutMapping(value = "/{idPokemon}")
  public ResponseEntity<Pokemon> atualizarPokemon(@PathVariable Long idPokemon, Pokemon pokemon) {
    pokemonService.atualizarPokemon(idPokemon, pokemon);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping(value = "/{idPokemon}")
  public ResponseEntity<Pokemon> deletarPokemon(@PathVariable Long idPokemon) {
    pokemonService.deletarPokemon(idPokemon);
    return ResponseEntity.ok().build();
  }
}
