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

import br.com.pokemon_api.pokemon_api.model.Regiao;
import br.com.pokemon_api.pokemon_api.service.RegiaoService;

@RestController
@RequestMapping(value = "/regiao")
public class RegiaoController {

  @Autowired
  private RegiaoService regiaoService;

  @GetMapping
  public ResponseEntity<List<Regiao>> listarRegiao() {
    List<Regiao> listarRegiao = regiaoService.listarRegiao();
    return ResponseEntity.ok().body(listarRegiao);
  }

  @GetMapping(value = "/{idRegiao}")
  public ResponseEntity<Regiao> buscarRegiao(@PathVariable Long idRegiao) {
    Regiao buscarRegiao = regiaoService.buscarRegiao(idRegiao);
    return ResponseEntity.ok().body(buscarRegiao);
  }

  @PostMapping
  public ResponseEntity<Long> criarRegiao(@RequestBody Regiao regiao) {
    Regiao novaRegiao = regiaoService.criarRegiao(regiao);
    return ResponseEntity.status(HttpStatus.CREATED).body(novaRegiao.getIdRegiao());
  }

  @PutMapping(value = "{idRegiao}")
  public ResponseEntity<Void> atualizarRegiao(@PathVariable Long idRegiao, Regiao regiao) {
    regiaoService.atualizarRegiao(regiao, idRegiao);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping(value = "/{idRegiao}")
  public ResponseEntity<Void> deletarRegiao(@PathVariable Long idRegiao) {
    regiaoService.deletarRegiao(idRegiao);
    return ResponseEntity.ok().build();
  }

}
