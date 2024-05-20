package br.com.pokemon_api.pokemon_api.service.iml;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import br.com.pokemon_api.pokemon_api.exception.InternalServerException;
import br.com.pokemon_api.pokemon_api.exception.NotFoundException;
import br.com.pokemon_api.pokemon_api.model.Natureza;
import br.com.pokemon_api.pokemon_api.repository.NaturezaRepository;
import br.com.pokemon_api.pokemon_api.service.NaturezaService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class NaturezaServiceImpl implements NaturezaService {

  private final NaturezaRepository naturezaRepository;

  @Override
  public List<Natureza> listarNatureza() {
    return naturezaRepository.findAll();
  }

  @Override
  public Natureza buscarNatureza(long idNatureza) {
    return naturezaRepository.findById(idNatureza).orElseThrow(() -> new NotFoundException("Falha ao buscar natureza"));
  }

  @Override
  public Natureza criarNatureza(Natureza natureza) {
    try {
      return naturezaRepository.save(natureza);
    } catch (Exception e) {
      throw new InternalServerException("Falha ao criar nova região");
    }
  }

  @Override
  public void atualizarNatureza(Natureza natureza, long idNatureza) {

    try {
      Natureza naturezaDB = buscarNatureza(idNatureza);

      BeanUtils.copyProperties(natureza, naturezaDB);
      naturezaRepository.save(naturezaDB);

    } catch (Exception e) {
      throw new InternalServerException("Falha ao atualizar natureza");
    }
  }

  @Override
  public void deletarNatureza(long idNatureza) {
    try {
      naturezaRepository.deleteById(idNatureza);
    } catch (Exception e) {
      throw new InternalServerException("Falha ao deletar natureza");
    }
  }

}
