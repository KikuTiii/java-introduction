package school.sptech;

public class Main {

  public static void main(String[] args) {
    GerenciadorDeNotas metodo = new GerenciadorDeNotas();

    metodo.verificarResultado(metodo.calcularMedia(metodo.lerNotas()));
  }
}