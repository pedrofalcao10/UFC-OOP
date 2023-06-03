package br.ufc.poo.banco.excecao;

public class TIException extends Exception {
  private Throwable cause;

  public TIException(Throwable cause) {
    super(cause);
  }
}