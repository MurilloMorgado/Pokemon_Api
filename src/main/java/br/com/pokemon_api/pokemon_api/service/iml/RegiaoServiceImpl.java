package br.com.pokemon_api.pokemon_api.service.iml;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import br.com.pokemon_api.pokemon_api.exception.InternalServerException;
import br.com.pokemon_api.pokemon_api.exception.NotFoundException;
import br.com.pokemon_api.pokemon_api.model.Regiao;
import br.com.pokemon_api.pokemon_api.repository.RegiaoRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RegiaoServiceImpl implements RegiaoService {

  private final RegiaoRepository regiaoRepository;

  @Override
  public List<Regiao> listarRegiao() {
    return regiaoRepository.findAll();
  }

  @Override
  public Regiao buscarRegiao(long idRegiao) {
    return regiaoRepository.findById(idRegiao).orElseThrow(() -> new NotFoundException("Falha ao procurar região"));
  }

  @Override
  public Regiao criarRegiao(Regiao regiao) {
    try {
    return regiaoRepository.save(regiao);      
    } catch (Exception e) {
      throw new InternalServerException("Falha ao criar nova região");
    }
  }

  @Override
  public void atualizarRegiao(Regiao regiao, long idRegiao) {
    try {
      Regiao regiarDB = buscarRegiao(idRegiao);

      BeanUtils.copyProperties(regiao, regiarDB);

      regiaoRepository.save(regiarDB);
    } catch (Exception e) {
      throw new InternalServerException("Falha ao atualziar região");
    }
  }

  @Override
  public void deletarRegiao(long idRegiao) {
    try {
      regiaoRepository.deleteById(idRegiao);
    } catch (Exception e) {
      throw new InternalServerException("Falha ao deletar região");
    }
  }

}
