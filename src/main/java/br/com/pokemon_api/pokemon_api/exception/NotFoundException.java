package br.com.pokemon_api.pokemon_api.exception;

public class NotFoundException extends RuntimeException {

  public NotFoundException(String msg){
    super(msg);
  }

}
