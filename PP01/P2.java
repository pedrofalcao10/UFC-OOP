import java.util.Scanner;

public class P2 {
  Scanner scanner = new Scanner(System.in);

  public void run() {
    // escreva o código da resposta aqui.

    System.out.print("digite 2 numeros: ");
    float n1 = scanner.nextFloat();
    float n2 = scanner.nextFloat();
    float result = 0f;

    System.out.print("+ -> somar\n- -> subtrair\n* -> multiplicar\n/ -> dividir\n");
    String op = scanner.next();

    if (op.equals("+")) {
      result = n1 + n2;
    } else if (op.equals("-")) {
      result = n1 - n2;
    } else if (op.equals("*")) {
      result = n1 * n2;
    } else {
      result = n1 / n2;
    }

    System.out.print(result);
  }
}