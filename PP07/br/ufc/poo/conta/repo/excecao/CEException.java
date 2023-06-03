package br.ufc.poo.conta.repo.excecao;

public class CEException extends Exception {
  private String numero;

  public CEException(String numero) {
    super("Conta Existente!");
    this.numero = numero;
  }

  public String getNumero() {
    return numero;
  }
}