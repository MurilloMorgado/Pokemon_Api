package br.com.pokemon_api.pokemon_api.exception;

public class InternalServerException extends RuntimeException  {

  public InternalServerException(String msg){
    super(msg);
  }
}
