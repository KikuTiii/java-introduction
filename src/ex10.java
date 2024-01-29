import java.util.Scanner;

//Desenvolva um programa que leia um número e informe se este número é maior,
//menor ou igual a 100.
public class ex10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor: ");
        int nb = scanner.nextInt();

        if(nb > 100){
            System.out.println("Este numero eh maior que 100");
        }else if(nb == 100){
            System.out.println("este numero eh igual a 100");
        }else
            System.out.println("este numero eh menor que 100");
    }
}
