package br.com.pokemon_api.pokemon_api.service.iml;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.pokemon_api.pokemon_api.model.Natureza;
import br.com.pokemon_api.pokemon_api.service.NaturezaService;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor

public class NaturezaServiceImpl implements NaturezaService {

  @Override
  public List<Natureza> listarNatureza() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarNatureza'");
  }

  @Override
  public Natureza buscarNatureza(long idNatureza) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'buscarNatureza'");
  }

  @Override
  public Natureza criarNatureza(Natureza natureza) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'criarNatureza'");
  }

  @Override
  public void atualizarNatureza(Natureza natureza, long idNatureza) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'atualizarNatureza'");
  }

  @Override
  public void deletarNatureza(long idNatureza) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deletarNatureza'");
  }

}
