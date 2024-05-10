package br.com.pokemon_api.pokemon_api.model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "POKEMON")
public class Pokemon {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_POKEMON")
  private Long idPokemon;

  @Column(name = "NOME")
  private String nome;

  @Column(name = "FLAG_EVOLUCAO")
  private boolean flagEvolucao;
  
  @OneToOne
  @JoinColumn(name = "REGIAO")
  private Regiao regiao;

  @OneToOne
  @JoinColumn(name = "RARIDADE")
  private Raridade raridade;

}
