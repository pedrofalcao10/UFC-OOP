class Main {
  public static void main(String[] args) {
    Ventilador ventilador_teste = new Ventilador();

    ventilador_teste.setLigado();

    if (ventilador_teste.ligado == true) {
      System.out.println("estou ligado");
      System.out.println(ventilador_teste.getVelocidade());
    } else {
      System.out.println("n");
    }

    ventilador_teste.setVelocidade_aumentar();
    System.out.println(ventilador_teste.getVelocidade());

    ventilador_teste.setRotacao_habilitar();

    if (ventilador_teste.rotacionando == true) {
      System.out.println("estou rodando111111");
    } else {
      System.out.println("nnnnn");
    }

    ventilador_teste.setDesligado();

    if (ventilador_teste.ligado == false) {
      System.out.println("desligado");
    }

    if (ventilador_teste.rotacionando == true) {
      System.out.println("estou rodando22222");
    } else {
      System.out.println("nnnnnnnnnnnnn");
    }
  }

}