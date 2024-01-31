//Desenvolva um programa para ler um número e verificar se o mesmo é menor que 5,
//        maior que 10 ou entre 5 e 10.

import java.util.Scanner;
public class ex14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        int numero = scanner.nextInt();

        if(numero < 5)
            System.out.println("Numero menor que 5");
        else if(numero > 5 && numero < 10)
            System.out.println("Numero entre 5 e 10");
        else
            System.out.println("Numero maior que 10");

        scanner.close();
    }
}
