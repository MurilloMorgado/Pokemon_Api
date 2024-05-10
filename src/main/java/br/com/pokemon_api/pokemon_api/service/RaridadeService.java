package br.com.pokemon_api.pokemon_api.service;

import java.util.List;

import br.com.pokemon_api.pokemon_api.model.Raridade;

public interface RaridadeService {

  List<Raridade> listarRaridade();

  Raridade buscRaridade(long idRaridade);

  Raridade criarRaridade(Raridade raridade);

  void atualizarRaridade(Raridade raridade, long idRaridade);

  void deletarRaridade(long idRaridade);
  
}
