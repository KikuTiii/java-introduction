//Desenvolva um programa para ler dois valores numéricos e apresentar a diferença do
//maior pelo menor.

import java.util.Scanner;
public class ex12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        int nbOne = scanner.nextInt();

        System.out.println("Insira o segundo numero: ");
        int nbTwo = scanner.nextInt();

        if(nbOne > nbTwo){
            int diff = nbOne - nbTwo;
            System.out.println("A diferenca entre o primeiro e o segundo numero eh: " + diff);
        }else if(nbOne == nbTwo)
            System.out.println("Os dois numeros sao iguais");
        else{
            int diff = nbTwo - nbOne;
            System.out.println("A diferenca entre o segundo e o primeiro numero eh: " + diff);
        }
    }
}
