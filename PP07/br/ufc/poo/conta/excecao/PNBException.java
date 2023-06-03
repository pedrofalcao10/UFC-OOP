package br.ufc.poo.conta.excecao;

public class PNBException extends Exception {
  private double percentagem;
  private String numero;

  public PNBException(String numero, double percentagem) {
    super("Percentagem Negativa do Bonus!");
    this.percentagem = percentagem;
    this.numero = numero;
  }

  public double getPercentagem() {
    return percentagem;
  }

  public String getNumero() {
    return numero;
  }
}