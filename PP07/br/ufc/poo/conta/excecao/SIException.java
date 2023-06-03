package br.ufc.poo.conta.excecao;

public class SIException extends Exception {
  private double saldo;
  private String numero;

  public SIException(String numero, double saldo) {
    super("Saldo Insuficiente!");
    this.saldo = saldo;
    this.numero = numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public String getNumero() {
    return numero;
  }
}