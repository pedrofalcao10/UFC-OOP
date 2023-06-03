import java.util.Scanner;

public class P3 {
  Scanner scanner = new Scanner(System.in);

  public void run() {
    // escreva o código da resposta aqui.

    System.out.print("digite 2 numeros: ");
    float n1 = scanner.nextFloat();
    float n2 = scanner.nextFloat();
    float result = 0f;

    System.out.print("+ -> somar\n- -> subtrair\n* -> multiplicar\n/ -> dividir\n");
    String op = scanner.next();

    switch (op) {
      case "+":
        result = n1 + n2;
        break;
      case "-":
        result = n1 - n2;
        break;
      case "*":
        result = n1 * n2;
        break;
      case "/":
        result = n1 / n2;
        break;
    }

    System.out.print(result);
  }

}