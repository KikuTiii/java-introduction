//Desenvolva um programa para calcular o reajuste salarial dos funcionários de um
//empresa de desenvolvimento de softwares. O programa deverá solicitar a leitura do código
//e o salário atual do funcionário e realizar o reajuste salarial de acordo com a tabela abaixo.
//O programa deverá apresentar o salário antigo, o novo salário, o valor do reajuste e a
//função do funcionário.
//Código Função Percentual
//        1 Operador 5%
//        2 Programador 10%
//        3 Analista 15%

import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o salário atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Insira o código de trabalho: ");
        int codigo = scanner.nextInt();

        if (codigo >= 1 && codigo <= 3) {
            double  valorReajuste = 0;

            if (codigo == 1) {
                valorReajuste = salarioAtual * 0.05;
            } else if (codigo == 2) {
                valorReajuste = salarioAtual * 0.10;
            } else {
                valorReajuste = salarioAtual * 0.15;
            }

            double salarioNovo = salarioAtual + valorReajuste;

            System.out.println("\nResultados:");
            System.out.println("Salário antigo: R$ " + salarioAtual);
            System.out.println("Novo salário: R$ " + salarioNovo);
            System.out.println("Valor do reajuste: R$ " + valorReajuste);
        } else {
            System.out.println("Código de função inválido.");
        }

        scanner.close();
    }
}
