public class Conta {

  private String numero;
  private double saldo;

  public Conta(String numero) {
    this.numero = numero;
    saldo = 0;
  }

  public void creditar(double valor) {
    saldo += valor;
  }

  public void debitar(double valor) {
    saldo -= valor;
  }

  public String getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }
}