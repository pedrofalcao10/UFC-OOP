package br.ufc.poo.conta.excecao;

public class VNException extends Exception {
  private double valor;
  private String numero;

  public VNException(String numero, double valor) {
    super("Valor negativo!");
    this.valor = valor;
    this.numero = numero;
  }

  public double getValor() {
    return valor;
  }

  public String getNumero() {
    return numero;
  }
}