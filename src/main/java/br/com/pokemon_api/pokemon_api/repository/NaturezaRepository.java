package br.com.pokemon_api.pokemon_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pokemon_api.pokemon_api.model.Natureza;

public interface NaturezaRepository extends JpaRepository <Natureza, Long>{
  
}
