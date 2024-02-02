//Desenvolva um programa para ler dois números e realizar a divisão do maior pelo
//menor, apresentando o resultado.

import java.util.Scanner;
public class ex15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        int nbOne = scanner.nextInt();

        System.out.println("Insira o segundo numero: ");
        int nbTwo = scanner.nextInt();

        if(nbOne > nbTwo){
            int div = nbOne / nbTwo;
            System.out.println("O resultado da divisao do maior pelo menor eh: " + div);
        }else if(nbOne == nbTwo){
            int div = nbOne / nbTwo;
            System.out.println("O resultado da divisao por iguai eh: " + div);
        }else{
            int div = nbTwo / nbOne;
            System.out.println("O resultado da divisao do maior pelo menor eh: " + div);
        }
        scanner.close();
    }
}
