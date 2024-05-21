package br.com.pokemon_api.pokemon_api;

import java.util.Arrays;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.pokemon_api.pokemon_api.model.Natureza;
import br.com.pokemon_api.pokemon_api.model.Pokemon;
import br.com.pokemon_api.pokemon_api.model.PokemonNatureza;
import br.com.pokemon_api.pokemon_api.model.Raridade;
import br.com.pokemon_api.pokemon_api.model.Regiao;
import br.com.pokemon_api.pokemon_api.repository.NaturezaRepository;
import br.com.pokemon_api.pokemon_api.repository.PokemonRepository;
import br.com.pokemon_api.pokemon_api.repository.RaridadeRepository;
import br.com.pokemon_api.pokemon_api.repository.RegiaoRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
  
  @Autowired
  private PokemonRepository pokemonRepository;
  @Autowired
  private NaturezaRepository naturezaRepository;
  @Autowired
  private RaridadeRepository raridadeRepository;
  @Autowired
  private RegiaoRepository regiaoRepository;
  // @Autowired
  // private PokemonNatureza pokemonNatureza;

  @Override
  public void run(String... args) throws Exception {

    Natureza naturezaEletrico = new Natureza(null, "Eletrico");
    Natureza naturezaGrama = new Natureza(null, "Grama");
    Natureza naturezaFogo = new Natureza(null, "Fogo");
    
    Regiao regiaoKanto = new Regiao("Kanto");

    Raridade raridadeComum = new Raridade( "Comum");
    
    naturezaRepository.saveAll(Arrays.asList(naturezaEletrico, naturezaGrama,naturezaFogo));
    raridadeRepository.saveAll(Arrays.asList(raridadeComum));
    regiaoRepository.saveAll(Arrays.asList(regiaoKanto));

    Pokemon pokemonPicachu = new Pokemon("Picachu", true, regiaoKanto, raridadeComum);
    Pokemon pokemonCharmander = new Pokemon( "Charmander", true, regiaoKanto, raridadeComum);
    Pokemon pokemonBulbasaur = new Pokemon( "Bulbasaur", true, regiaoKanto, raridadeComum);

    pokemonRepository.saveAll(Arrays.asList(pokemonPicachu, pokemonCharmander,pokemonBulbasaur));
  }
}
