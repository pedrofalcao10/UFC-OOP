public abstract class ContaAbstrata {
  protected String numero;
  protected double saldo;

  public ContaAbstrata(String numero) {
    this.numero = numero;
    saldo = 0;
  }

  public void creditar(double valor) {
    if (valor >= 0) {
      this.saldo += valor;
    }
  }

  public abstract void debitar(double valor);

  public String getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }
}