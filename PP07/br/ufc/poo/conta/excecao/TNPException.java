package br.ufc.poo.conta.excecao;

public class TNPException extends Exception {
  private String numero;
  private double taxa;

  public TNPException(String numero, double taxa) {
    super("Taxa Negativa da Poupanca!" + numero);
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