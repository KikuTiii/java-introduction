//Desenvolva um programa para auxiliar uma empresa na classificação dos funcionários
//nos departamentos da empresa. O programa devera solicitar a cada funcionário o código do
//departamento em que ele deverá trabalhar e apresentar ao funcionário a descrição do
//departamento correspondente ao código indicado.

//        Código Departamento:
//   1 Expedição
//   2 Recursos Humanos
//   3 Logística
//   4 Contabilidade


import java.util.Scanner;
public class ex11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu codigo de funcionario: ");
        int code = scanner.nextInt();

        if(code == 1)
            System.out.println("Funcionario do departamento de Expedição");
        else if(code == 2)
            System.out.println("Funcionario do departamento de Recursos Humanos");
        else if(code == 3)
            System.out.println("Funcionario do departamento de Logística");
        else if(code == 4)
            System.out.println("Funcionario do departamento de Contabilidade");
        else
            System.out.println("Codigo invalido, insira novamente.");
    }
}
