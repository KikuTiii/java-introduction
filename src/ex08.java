import java.util.Scanner;

//Desenvolva um programa para ler dois valores para as variáveis A e B, efetuar a troca dos
//valores de forma que a variável A passe a possuir o valor da variável B e que a variável B passe a
//possuir o valor da variável A. Apresentar os valores trocados.
public class ex08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da variavel A: ");
        int A = scanner.nextInt();

        System.out.println("Digite o valor da varivel B: ");
        int B = scanner.nextInt();

        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valores trocados: ");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        scanner.close();
    }
}
