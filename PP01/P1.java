import java.util.Scanner;

public class P1 {
  Scanner scanner = new Scanner(System.in);

  public void run() {
    // escreva o código da resposta aqui.
    // while (true) {
    System.out.print("digite 2 numeros: ");
    int n1 = scanner.nextInt(); // lê o 1º número
    int n2 = scanner.nextInt(); // lê o 2º número

    while (n1 == n2) {
      System.out.print("As variáveis devem ser diferentes. Reinsira-as.");
      n1 = scanner.nextInt();
      n2 = scanner.nextInt();
    }

    if (n1 > n2) {
      System.out.print("o maior valor é: " + n1);
    } else {
      System.out.print("o maior valor é: " + n2);
    }
  }
}