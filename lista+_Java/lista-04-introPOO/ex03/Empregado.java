package ex03;

public class Empregado {
    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(Double porcentagem){
        salario *= porcentagem / 100;
    }
}
