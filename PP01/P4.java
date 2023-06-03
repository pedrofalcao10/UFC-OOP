import java.util.Scanner;

public class P4 {
  Scanner scanner = new Scanner(System.in);

  public void run() {
    // escreva o código da resposta aqui.
    System.out.print("Insira os coeficientes a, b e c da equação do 2º grau: ax²+bx+c ");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();

    double delta = (b * b) - (4 * a * c), x1 = 0f, x2 = 0f;

    if (delta < 0) {
      System.out.print("Não existem raízes reais.");
    } else {
      x1 = (-b - Math.sqrt(delta)) / (2 * a);
      x2 = (-b + Math.sqrt(delta)) / (2 * a);

      System.out.print("x` = " + x1);
      System.out.print("\n");
      System.out.print("x`` = " + x2);
    }
  }
}