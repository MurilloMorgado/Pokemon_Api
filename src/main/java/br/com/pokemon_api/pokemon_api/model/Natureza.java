package br.com.pokemon_api.pokemon_api.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "NATUREZA")
public class Natureza {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_NATUREZA")
  private Long idNatureza;

  @Column(name = "NATUREZA")
  private String natureza;

  @ManyToMany(mappedBy = "naturezas")
  private List<Pokemon> pokemons;

  public Natureza(Long idNatureza, String natureza) {
    this.idNatureza = idNatureza;
    this.natureza = natureza;
  }

  

}
