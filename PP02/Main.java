import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escolha a opção desejada:\n 1) Testa Calculadora\n 2) Testa Conta \n 3) Testa Banco");
    int opcao = scanner.nextInt();
    switch (opcao) {
      case 1:
        testaCalculadora();
        break;

      case 2:
        testaConta();
        break;

      case 3:
        testaBanco();
        break;

      default:
        System.out.println("Opção inexistente!");
        break;
    }
  }

  public static void testaCalculadora() {
    // escreva o código de teste aqui
    Calculadora calculadora = new Calculadora();
    System.out.println(calculadora.adicionar(3.999999, 5.6));
    System.out.println(calculadora.subtrair(3.999999, 5.6));
    System.out.println(calculadora.multiplicar(3.9999, 5.6));
    System.out.println(calculadora.dividir(3.999999, 5.6));
    System.out.println(calculadora.potencia(3.999999, 2));
    System.out.println(calculadora.raiz(3.999999));
    System.out.println(calculadora.seno(Math.PI / 3));
    System.out.println(calculadora.coseno(Math.PI / 3));
    System.out.println(calculadora.tangente(Math.PI / 3));
  }

  public static void testaConta() {
    // escreva o código de teste aqui
    Conta conta1 = new Conta("xx.xxx-x");
    conta1.creditar(100);
    System.out.println(conta1.getSaldo());
    conta1.debitar(79.82);
    System.out.println(conta1.getSaldo());
    conta1.debitar(30.18);
    System.out.println(conta1.getSaldo());
    conta1.creditar(10);
    System.out.println(conta1.getSaldo());
    System.out.println(conta1.getNumero());
  }

  public static void testaBanco() {
    // escreva o código de teste aqui
    Banco banco = new Banco();
    Conta conta1 = new Conta("11.111-1");
    Conta conta2 = new Conta("22.222-2");

    banco.cadastrar(conta1);
    banco.cadastrar(conta2);
    banco.creditar("11.111-1", 10);
    System.out.println(conta1.getSaldo());
    System.out.println(banco.saldo("11.111-1"));
    banco.creditar("22.222-2", 20);
    System.out.println(conta2.getSaldo());
    banco.debitar("11.111-1", 14);
    banco.transferir("22.222-2", "11.111-1", 12);
    System.out.println(banco.saldo("11.111-1"));
    System.out.println(conta2.getSaldo());
    
    System.out.println(banco.saldo("2345678"));
  }
}