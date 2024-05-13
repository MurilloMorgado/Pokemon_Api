package br.com.pokemon_api.pokemon_api.service;

import java.util.List;

import br.com.pokemon_api.pokemon_api.model.Regiao;

public interface RegiaoService {

  List<Regiao> listarRegiao();

  Regiao buscarRegiao(long idRegiao);

  Regiao criarRegiao(Regiao regiao);

  void atualizarRegiao(Regiao regiao, long idRegiao);

  void deletarRegiao(long idRegiao);
}
