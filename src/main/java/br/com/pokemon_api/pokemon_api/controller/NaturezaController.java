package br.com.pokemon_api.pokemon_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pokemon_api.pokemon_api.model.Natureza;
import br.com.pokemon_api.pokemon_api.service.NaturezaService;

@RestController
@RequestMapping("/natureza")
public class NaturezaController {

  @Autowired
  private NaturezaService naturezaService;

  @Autowired
  public ResponseEntity<List<Natureza>> listarNatureza() {
    List<Natureza> listaNatureza = naturezaService.listarNatureza();
    return ResponseEntity.ok().body(listaNatureza);
  }
}
