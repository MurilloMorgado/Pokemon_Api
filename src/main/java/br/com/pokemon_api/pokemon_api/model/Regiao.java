package br.com.pokemon_api.pokemon_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "REGIAO")
public class Regiao {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_REGIAO")
  private Long idRegiao;

  @Column(name = "REGIAO")
  private String regiao;

  @OneToOne(mappedBy = "regiao")
  private Pokemon pokemon;

}
