package br.com.pokemon_api.pokemon_api.service.iml;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.pokemon_api.pokemon_api.model.Pokemon;
import br.com.pokemon_api.pokemon_api.service.PokemonSerivice;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class PokemonServiceImpl implements PokemonSerivice{

  @Override
  public List<Pokemon> listarPokemon() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarPokemon'");
  }

  @Override
  public Pokemon buscarPokemon(long idPokemon) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'buscarPokemon'");
  }

  @Override
  public Pokemon criarPokemon(Pokemon pokemon) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'criarPokemon'");
  }

  @Override
  public void atualizarPokemon(long idPokemon, Pokemon pokemon) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'atualizarPokemon'");
  }

  @Override
  public void deletarPokemon(long idPokemon) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deletarPokemon'");
  }

}
