package br.com.pokemon_api.pokemon_api.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "RARIDADE")
public class Raridade {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_RARIDADE")
  private Long idRaridade;

  @Column(name = "RARIDADE")
  private String raridade;

  @OneToMany(mappedBy = "raridade")
  private List<Pokemon> pokemon;

  public Raridade(String raridade) {
    this.raridade = raridade;
  }

}
