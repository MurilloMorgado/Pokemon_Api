package br.com.pokemon_api.pokemon_api.service.iml;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import br.com.pokemon_api.pokemon_api.exception.InternalServerException;
import br.com.pokemon_api.pokemon_api.exception.NotFoundException;
import br.com.pokemon_api.pokemon_api.model.Pokemon;
import br.com.pokemon_api.pokemon_api.repository.PokemonRepository;
import br.com.pokemon_api.pokemon_api.service.PokemonService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PokemonServiceImpl implements PokemonService {

  private final PokemonRepository pokemonRepository;

  @Override
  public List<Pokemon> listarPokemon() {
    return pokemonRepository.findAll();
  }

  @Override
  public Pokemon buscarPokemon(long idPokemon) {
    return pokemonRepository.findById(idPokemon).orElseThrow(() -> new NotFoundException("Falaha ao buscar pokemon"));
  }

  @Override
  public Pokemon criarPokemon(Pokemon pokemon) {
    try {
      return pokemonRepository.save(pokemon);
    } catch (Exception e) {
      throw new InternalServerException("Falha ao criar pokemon");
    }
  }

  @Override
  public void atualizarPokemon(long idPokemon, Pokemon pokemon) {
    try {
      Pokemon pokemonDB = buscarPokemon(idPokemon);

      BeanUtils.copyProperties(pokemon, pokemonDB);
      pokemonRepository.save(pokemonDB);

    } catch (Exception e) {
      throw new InternalServerException("Falha ao atualizar pokemon");
    }

  }

  @Override
  public void deletarPokemon(long idPokemon) {
    try {
      pokemonRepository.deleteById(idPokemon);
    } catch (Exception e) {
      throw new InternalServerException("Falha ao deletar pokemon");
    }
  }

}
