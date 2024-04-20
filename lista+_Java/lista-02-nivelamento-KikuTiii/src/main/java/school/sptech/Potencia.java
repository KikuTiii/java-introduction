package school.sptech;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um numero base: ");
        int base = sc.nextInt();

        System.out.println("informe o expoente: ");
        int expoente = sc.nextInt();

        int resultado = 1;

        for(int i = 0; i < expoente; i++)
            resultado *= base;

        System.out.println("o resultado é: " + resultado);
    }
}