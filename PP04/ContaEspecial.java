public class ContaEspecial extends Conta {
  private double percentagem = 0.01;
  private double bonus;

  public ContaEspecial(String numero) {
    super(numero);
    bonus = 0;
  }

  public void renderBonus() {
    super.creditar(bonus);
    bonus = 0;
  }

  public void creditar(double valor) {
    bonus = bonus + (valor * 0.01);
    super.creditar(valor);
  }

  public double getBonus() {
    return this.bonus;
  }

  public double getBonusPercentagem() {
    return this.percentagem;
  }

  public void setBonusPercentagem(double percentagem) {
    if (percentagem >= 0) {
      this.percentagem = percentagem;
    }
  }
}