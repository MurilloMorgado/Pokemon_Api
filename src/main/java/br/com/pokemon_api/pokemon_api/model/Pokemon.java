package br.com.pokemon_api.pokemon_api.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
  @JoinColumn(name = "ID_REGIAO")
  private Regiao regiao;

  @ManyToOne
  @JoinColumn(name = "ID_RARIDADE")
  private Raridade raridade;

  @ManyToMany
  @JoinTable(name = "pokemon_natureza", joinColumns = @JoinColumn(name = "pokemon_id"), inverseJoinColumns = @JoinColumn(name = "natureza_id"))
  private List<Natureza> naturezas;

  public Pokemon(String nome, boolean flagEvolucao, Regiao regiao, Raridade raridade) {
    this.nome = nome;
    this.flagEvolucao = flagEvolucao;
    this.regiao = regiao;
    this.raridade = raridade;
  }

}
