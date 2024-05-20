package br.com.pokemon_api.pokemon_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pokemon_api.pokemon_api.model.Natureza;
import br.com.pokemon_api.pokemon_api.service.NaturezaService;

@RestController
@RequestMapping("/natureza")
public class NaturezaController {

  @Autowired
  private NaturezaService naturezaService;

  public ResponseEntity<List<Natureza>> listarNatureza() {
    List<Natureza> listaNatureza = naturezaService.listarNatureza();
    return ResponseEntity.ok().body(listaNatureza);
  }

  @GetMapping(value = "/{idNatureza}")
  public ResponseEntity<Natureza> buscarNatureza(@PathVariable Long idNatureza) {
    Natureza buscNatureza = naturezaService.buscarNatureza(idNatureza);
    return ResponseEntity.ok().body(buscNatureza);
  }

  @PostMapping
  public ResponseEntity<Long> criarNatureza(@RequestBody Natureza natureza) {
    Long idNatureza = naturezaService.criarNatureza(natureza).getIdNatureza();
    return ResponseEntity.ok().body(idNatureza);
  }

  @PutMapping(value = "/{idNatureza}")
  public ResponseEntity<Long> atualizarNatureza(@RequestBody Natureza natureza, @PathVariable Long idNatureza) {

    naturezaService.atualizarNatureza(natureza, idNatureza);
    return ResponseEntity.ok().build();

  }

  @DeleteMapping(value = "/{idNatureza}")
  public ResponseEntity<Natureza> deletaNatureza(@PathVariable Long idNatureza) {
    naturezaService.deletarNatureza(idNatureza);
    return ResponseEntity.ok().build();
  }
}
