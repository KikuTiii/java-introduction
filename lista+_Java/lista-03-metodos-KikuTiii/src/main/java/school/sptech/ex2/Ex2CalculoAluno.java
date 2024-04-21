package school.sptech.ex2;

public class Ex2CalculoAluno {
    public static void main(String[] args) {
        Ex2CalculoAlunoMetodos calc = new Ex2CalculoAlunoMetodos();

        Double nota1 = 8.0;
        Double nota2 = 7.0;
        Double media = calc.calcularMedia(nota1, nota2);

        System.out.println("A média do aluno é: " + media);
    }
}
