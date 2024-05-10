package br.com.pokemon_api.pokemon_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pokemon_api.pokemon_api.model.PokemonNatureza;

public interface PokemonNaturezaRepository extends JpaRepository <PokemonNatureza, Long>{

}
