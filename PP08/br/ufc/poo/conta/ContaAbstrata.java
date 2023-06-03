package br.ufc.poo.conta;

import br.ufc.poo.conta.excecao.SIException;
import br.ufc.poo.conta.excecao.VNException;

import java.io.Serializable;

public abstract class ContaAbstrata implements Serializable {
  protected String numero;
  protected double saldo;

  private static final long serialVersionUID = 1L;

  public ContaAbstrata(String numero) {
    this.numero = numero;
    this.saldo = 0.0;
  }

  public void creditar(double valor) throws VNException {
    if (valor < 0.0) {
      throw new VNException(this.numero, valor);
    }
    this.saldo = this.saldo + valor;
  }

  public abstract void debitar(double valor) throws SIException, VNException;

  public String getNumero() {
    return this.numero;
  }

  public double getSaldo() {
    return this.saldo;
  }
}