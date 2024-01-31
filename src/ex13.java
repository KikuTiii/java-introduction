//Desenvolva um programa para realizar a leitura de um número entre 0 e 10. O
// programa deverá apresentar a descrição deste número. Exemplo: 9 – nove.

import java.util.Scanner;
public class ex13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero entre 0 e 10: ");

        int numero = scanner.nextInt();

        if(numero >= 0 && numero <= 10){

            String descricao = obterDescricao(numero);

            System.out.println(numero + " - " + descricao);
        }else
            System.out.println("numero invalido, insira um numero entre 0 e 10");

        scanner.close();
    }

    public static String obterDescricao(int numero){
        String[] descricoes = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez"};

        return descricoes[numero];
    }
}
