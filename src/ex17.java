//Desenvolva um programa para auxiliar uma empresa na classificação dos funcionários nos
//departamentos da empresa. O programa devera solicitar a cada funcionário o código do
//departamento em que ele deverá trabalhar e apresentar ao funcionário a descrição do departamento
//correspondente ao código indicado.
//
//Código Departamento
//          10 Contabilidade
//          12 Almoxarifado
//          14 Informática

import java.util.Scanner;
public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o código do departamento: ");
        int codigo = scanner.nextInt();

        if (codigo == 10) {
            System.out.println("Contabilidade");
        } else if (codigo == 12) {
            System.out.println("Almoxarifado");
        } else {
            System.out.println("Informática");
        }
        scanner.close();
    }
}
