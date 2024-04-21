package school.sptech.ex1;

public class TesteRecursosHumanos {

  public static void main(String[] args) {
    RecursosHumanos rh = new RecursosHumanos();
    Colaborador colaborador = new Colaborador("Kikuti", "estagiário", 4.800);

    rh.reajustarSalario(colaborador, 0.8);
    rh.promover(colaborador, "especialista", 24.600);

  }
}