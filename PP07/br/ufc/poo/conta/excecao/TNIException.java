package br.ufc.poo.conta.excecao;

public class TNIException extends Exception {
  private double taxa;
  private String numero;

  public TNIException(String numero, double taxa) {
    super("Taxa negativa de Imposto!");
    this.taxa = taxa;
    this.numero = numero;
  }

  public double getTaxa() {
    return taxa;
  }

  public String getNumero() {
    return numero;
  }
}