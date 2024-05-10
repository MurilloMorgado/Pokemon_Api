package br.com.pokemon_api.pokemon_api.service.iml;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.pokemon_api.pokemon_api.model.Raridade;
import br.com.pokemon_api.pokemon_api.service.RaridadeService;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class RaridadeServiceImpl implements RaridadeService {@Override
  public List<Raridade> listarRaridade() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarRaridade'");
  }

  @Override
  public Raridade buscRaridade(long idRaridade) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'buscRaridade'");
  }

  @Override
  public Raridade criarRaridade(Raridade raridade) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'criarRaridade'");
  }

  @Override
  public void atualizarRaridade(Raridade raridade, long idRaridade) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'atualizarRaridade'");
  }

  @Override
  public void deletarRaridade(long idRaridade) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deletarRaridade'");
  }

}
