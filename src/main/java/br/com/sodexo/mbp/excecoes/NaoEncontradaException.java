package br.com.sodexo.mbp.excecoes;

public class NaoEncontradaException extends Exception {
  public NaoEncontradaException(String mensagem) {
    super(mensagem);
  }
}
