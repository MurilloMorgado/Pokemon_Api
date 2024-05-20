package br.com.pokemon_api.pokemon_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pokemon_api.pokemon_api.model.Raridade;
import br.com.pokemon_api.pokemon_api.service.RaridadeService;

@RestController
@RequestMapping(value = "/raridade")
public class RaridadeController {

  @Autowired
  private RaridadeService raridadeService;

  @GetMapping
  public ResponseEntity<List<Raridade>> listarRaridades() {
    List<Raridade> listaRaridade = raridadeService.listarRaridade();
    return ResponseEntity.ok().body(listaRaridade);
  }

  @GetMapping(value = "/{idRaridade}")
  public ResponseEntity<Raridade> buscarRaridade(@PathVariable Long idRaridade) {
    Raridade buscaRaridade = raridadeService.buscarRaridade(idRaridade);
    return ResponseEntity.ok().body(buscaRaridade);
  }

  @PostMapping
  public ResponseEntity<Long> criarRaridade(@RequestBody Raridade raridade) {
    Raridade idRaridade = raridadeService.criarRaridade(raridade);
    return ResponseEntity.status(HttpStatus.CREATED).body(idRaridade.getIdRaridade());
  }

  @PutMapping(value = "/{idRaridade}")
  public ResponseEntity<Long> atualizarRaridade(@PathVariable Long idRaridade, Raridade raridade) {
    raridadeService.atualizarRaridade(raridade, idRaridade);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping(value = "/{idRaridade}")
  public ResponseEntity<Long> deletarRaridade(@PathVariable Long idRaridade) {
    raridadeService.deletarRaridade(idRaridade);
    return ResponseEntity.ok().build();
  }

}
