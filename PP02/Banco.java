public class Banco {
  private Conta[] contas;
  private int indice = 0;

  public Banco() {
    contas = new Conta[100];
  }

  public void cadastrar(Conta conta) {
    contas[indice] = conta;
    indice++;
  }

  private Conta procurar(String numero) {
    int i = 0;
    boolean achou = false;

    while ((!achou) && (i < indice)) {
      if (contas[i].getNumero().equals(numero)) {
        achou = true;
      } else {
        i++;
      }
    }

    if (achou == true) {
      return contas[i];
    }

    return null;
  }

  public void creditar(String numero, double valor) {
    Conta conta = procurar(numero);

    if (conta == null) {
      System.out.println("Conta inexistente!");
      return;
    }

    conta.creditar(valor);
  }

  public void debitar(String numero, double valor) {
    Conta conta = procurar(numero);

    if (conta == null) {
      System.out.println("Conta inexistente!");
      return;
    }

    conta.debitar(valor);
  }

  public double saldo(String numero) {
    Conta conta = procurar(numero);

    if (conta == null) {
      System.out.println("Conta inexistente!");
      return -0;
    }

    return conta.getSaldo();
  }

  public void transferir(String origem, String destino, double valor) {
    Conta conta_origem = procurar(origem), conta_destino = procurar(destino);

    if (conta_origem == null || conta_destino == null) {
      System.out.println("Alguma conta inexistente!");
      return;
    }

    conta_origem.debitar(valor);
    conta_destino.creditar(valor);

  }
}