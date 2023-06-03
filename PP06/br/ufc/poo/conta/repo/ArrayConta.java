package br.ufc.poo.conta.repo;

import br.ufc.poo.conta.ContaAbstrata;

public class ArrayConta implements IRepositorioConta {
  private ContaAbstrata[] contas;
  private int indice = 0;

  public ArrayConta() {
    this.contas = new ContaAbstrata[100];
  }

  public ArrayConta(int capacidade) {
    this.contas = new ContaAbstrata[capacidade];
  }

  public void inserir(ContaAbstrata conta) {
    if (conta != null && !this.existe(conta.getNumero())) {
      this.contas[indice] = conta;
      this.indice++;
    }
  }

  public void remover(String numero) {
    if (numero != null && this.existe(numero)) {

      int aux = this.procurar_indice(numero);

      while (aux < indice) {
        this.contas[aux] = this.contas[aux + 1];

        aux++;
      }

      this.contas[indice] = null;
      indice--;
    }
  }

  public ContaAbstrata procurar(String numero) {
    for (int i = 0; i < indice; i++) {
      if (contas[i].getNumero().equals(numero)) {
        return contas[i];
      }
    }
    return null;
  }

  public int procurar_indice(String numero) {
    for (int i = 0; i < indice; i++) {
      if (contas[i].getNumero().equals(numero)) {
        return i;
      }
    }
    return -1;
  }

  public boolean existe(String numero) {
    return this.procurar(numero) != null;
  }

  public ContaAbstrata[] listar() {
    ContaAbstrata[] lista = null;
    if (this.tamanho() > 0) {
      lista = new ContaAbstrata[this.tamanho()];
      for (int i = 0; i < this.tamanho(); i++) {
        lista[i] = this.contas[i];
      }
    }
    return lista;
  }

  public int tamanho() {
    return this.indice;
  }
}