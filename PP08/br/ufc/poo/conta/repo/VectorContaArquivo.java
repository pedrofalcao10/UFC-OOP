package br.ufc.poo.conta.repo;

import br.ufc.poo.conta.ContaAbstrata;
import br.ufc.poo.conta.repo.excecao.CEException;
import br.ufc.poo.conta.repo.excecao.CIException;

import java.util.Vector;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class VectorContaArquivo implements IRepositorioConta {
  private Vector<ContaAbstrata> contas;

  public VectorContaArquivo() {
    this.contas = new Vector<ContaAbstrata>();
    this.desserializar();
  }

  public void inserir(ContaAbstrata conta) throws CEException {

    if (this.existe(conta.getNumero())) {
      throw new CEException(conta.getNumero());
    }

    this.contas.add(conta);
    this.serializar();
  }

  public void remover(String numero) throws CIException {

    if (!this.existe(numero)) {
      throw new CIException(numero);
    }

    this.contas.remove(this.procurar(numero));
    this.serializar();

  }

  public ContaAbstrata procurar(String numero) {
    for (ContaAbstrata conta : this.contas) {
      if (conta.getNumero().equals(numero)) {
        return conta;
      }
    }
    return null;
  }

  public ContaAbstrata recuperar(String numero) throws CIException {
    if (!this.existe(numero)) {
      throw new CIException(numero);
    }

    return this.procurar(numero);
    // this.desserializar();
  }

  public boolean existe(String numero) {
    return numero != null && this.procurar(numero) != null;
  }

  public ContaAbstrata[] listar() {
    ContaAbstrata[] lista = null;
    if (this.tamanho() > 0) {
      lista = new ContaAbstrata[this.tamanho()];
      int i = 0;
      for (ContaAbstrata conta : this.contas) {
        lista[i++] = conta;
      }
    }
    return lista;
  }

  public int tamanho() {
    return this.contas.size();
  }

  private void serializar() {
    // TODO
    String pathDir = "./arquivo";
    File diretorio = new File(pathDir);
    if (!diretorio.isDirectory()) {
      diretorio.mkdir();
    }
    try {
      String pathArquivo = pathDir + "/contas.bin";
      FileOutputStream gravador = new FileOutputStream(pathArquivo);
      ObjectOutputStream conversor = new ObjectOutputStream(gravador);
      conversor.writeObject(this.contas);
      conversor.close();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }

  private void desserializar() {
    // TODO
    String pathArquivo = "./arquivo/contas.bin";
    File diretorio = new File(pathArquivo);

    if (diretorio.isFile()) {
      diretorio.mkdir();

      try {
        FileInputStream leitor = new FileInputStream(pathArquivo);
        ObjectInputStream conversor = new ObjectInputStream(leitor);
        this.contas = (Vector<ContaAbstrata>) conversor.readObject();
        conversor.close();
      } catch (IOException ioe) {
        ioe.printStackTrace();
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
    }
  }
}