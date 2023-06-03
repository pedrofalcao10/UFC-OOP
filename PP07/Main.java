import br.ufc.poo.conta.ContaAbstrata;
import br.ufc.poo.conta.Conta;
import br.ufc.poo.conta.ContaPoupanca;
import br.ufc.poo.conta.ContaEspecial;
import br.ufc.poo.conta.ContaImposto;
import br.ufc.poo.conta.excecao.*;

import br.ufc.poo.conta.repo.excecao.*;
import br.ufc.poo.conta.repo.VectorConta;

import br.ufc.poo.banco.excecao.*;
import br.ufc.poo.banco.BancoIndependente;

public class Main {
  public static void main(String[] args) {
    testaPasso_(); // COPIAR "testaPassoX" E COLAR

    // testaPasso1();
    // testaPasso2();
    // testaPasso3();
    // testaPasso4();
    // testaPasso5();
    // testaPasso6();
    // testaPasso7();
    // testaPasso8();
  }

  public static void testaPasso1() {
    // TODO SIException
    Conta conta = new Conta("4002-8922");
    try {
      conta.creditar(200);
      conta.debitar(300);
    } catch (SIException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void testaPasso2() {
    // TODO VNException
    Conta conta = new Conta("4002-8922");
    try {
      conta.creditar(200);
      conta.debitar(-300);
    } catch (VNException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void testaPasso3() {
    // TODO TNPException
    ContaPoupanca conta = new ContaPoupanca("4002-8922");
    try {
      conta.creditar(500);
      conta.renderJuros(-0.888);
    } catch (TNPException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void testaPasso4() {
    // TODO PNBException
    ContaEspecial conta = new ContaEspecial("4002-8922");
    try {
      conta.creditar(500);
      conta.setBonusPercentagem(-0.888);
    } catch (PNBException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void testaPasso5() {
    // TODO TNIException
    ContaImposto conta = new ContaImposto("4002-8922");
    try {
      conta.creditar(500);
      conta.setTaxa(-0.888);
    } catch (TNIException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void testaPasso6() {
    // TODO CIException
    VectorConta contas = new VectorConta();
    Conta conta = new Conta("4002-8922");
    try {
      contas.inserir(conta);
      contas.remover("8004-6844");
    } catch (CIException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void testaPasso7() {
    // TODO CEException
    VectorConta contas = new VectorConta();
    Conta conta1 = new Conta("4002-8922");
    Conta conta2 = new Conta("4002-8922");
    try {
      contas.inserir(conta1);
      contas.inserir(conta2);
    } catch (CEException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void testaPasso8() {
    // TODO TIException
    VectorConta contas = new VectorConta();
    Conta conta1 = new Conta("4002-8922");
    Conta conta2 = new Conta("8004-6844");

    BancoIndependente banco = new BancoIndependente(contas);
    try {
      banco.creditar("4002-8922", 2000);
      banco.transferir("4002-8922", "8004-6844", -5000);
    } catch (TIException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}