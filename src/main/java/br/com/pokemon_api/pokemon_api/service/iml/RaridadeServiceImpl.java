package br.com.pokemon_api.pokemon_api.service.iml;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import br.com.pokemon_api.pokemon_api.exception.InternalServerException;
import br.com.pokemon_api.pokemon_api.exception.NotFoundException;
import br.com.pokemon_api.pokemon_api.model.Raridade;
import br.com.pokemon_api.pokemon_api.repository.RaridadeRepository;
import br.com.pokemon_api.pokemon_api.service.RaridadeService;
import ch.qos.logback.core.joran.util.beans.BeanUtil;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RaridadeServiceImpl implements RaridadeService {

  private final RaridadeRepository raridadeRepository;

  @Override
  public List<Raridade> listarRaridade() {
    return raridadeRepository.findAll();
  }

  @Override
  public Raridade buscarRaridade(long idRaridade) {
    return raridadeRepository.findById(idRaridade).orElseThrow(() -> new NotFoundException("Falha ao buscar raridade"));
  }

  @Override
  public Raridade criarRaridade(Raridade raridade) {
    try {
      return raridadeRepository.save(raridade);
    } catch (Exception e) {
      throw new InternalServerException("Falha ao criar raridde");
    }
  }

  @Override
  public void atualizarRaridade(Raridade raridade, long idRaridade) {
    try {
      Raridade raridadeDB = buscarRaridade(idRaridade);

      BeanUtils.copyProperties(raridade, raridadeDB);
      raridadeRepository.save(raridadeDB);

    } catch (Exception e) {
      throw new InternalServerException("Falha ao atualizar raridade");
    }
  }

  @Override
  public void deletarRaridade(long idRaridade) {
    try {
      raridadeRepository.deleteById(idRaridade);
    } catch (Exception e) {
      throw new InternalServerException("Falha ao deletar raridade");
    }

  }

}
