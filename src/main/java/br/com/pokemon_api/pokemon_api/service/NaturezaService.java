package br.com.pokemon_api.pokemon_api.service;

import java.util.List;

import br.com.pokemon_api.pokemon_api.model.Natureza;

public interface NaturezaService {

  List<Natureza> listarNatureza();

  Natureza buscarNatureza(long idNatureza);

  Natureza criarNatureza(Natureza natureza);

  void atualizarNatureza(Natureza natureza, long idNatureza);

  void deletarNatureza(long idNatureza);


  
} 
