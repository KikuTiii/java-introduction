//Desenvolva um programa que leia dois valores e informe qual dos valores é o maior.
//Se os números forem iguais, o programa deverá indicar esta igualdade.

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor: ");
        int a = scanner.nextInt();

        System.out.println("Entre com o segundo valor: ");
        int b = scanner.nextInt();

        if(a > b){
            System.out.println("O primeiro valor eh maior que o segundo");
        }else if( a == b){
            System.out.println("Os dois valores sao iguais");
        }else{
            System.out.println("O segundo valor eh maior que o primeiro");
        }
    }
}
