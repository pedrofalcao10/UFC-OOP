public class Ventilador {
  public boolean ligado = false;
  public boolean rotacionando = false;
  public int velocidade = 0;

  public Ventilador() {
  }

  public void setLigado() {
    if (this.ligado == false) {
      this.ligado = true;
      this.velocidade = 1;
    }
  }

  public void setDesligado() {
    if (this.ligado == true) {
      this.velocidade = 0;
      this.rotacionando = false;
      this.ligado = false;
    }
  }

  public int setVelocidade_aumentar() {
    if (1 <= this.velocidade && this.velocidade <= 4) {
      this.velocidade++;
    } else {
      System.out.println("Já na velocidade máxima.");
    }
    return this.velocidade;
  }

  public int setVelocidade_diminuir() {
    if (2 <= this.velocidade && this.velocidade <= 5) {
      this.velocidade++;
    } else {
      System.out.println("Já na velocidade mínima.");
    }
    return this.velocidade;
  }

  public void setRotacao_habilitar() {
    if (this.ligado == false) {
      return;
    }
    if (this.rotacionando == false) {
      this.rotacionando = true;
    }
  }

  public void setRotacao_desabilitar() {
    if (this.ligado == false) {
      return;
    }
    if (this.rotacionando == true) {
      this.rotacionando = false;
    }
  }

  public boolean getLigado() {
    return this.ligado;
  }

  public int getVelocidade() {
    return this.velocidade;
  }

  public boolean getRotacao() {
    return this.rotacionando;
  }

}