package school.sptech;

import java.util.Scanner;
public class Loteria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um número entre 0 e 10");
        Integer nb = sc.nextInt();
        Integer numeroSorteado = (int)(Math.random() * 10);
        Integer acerto = 0;

        if(nb < 0 || nb > 10)
            System.out.println("Insira um número válido");
        else{
            for(int i = 0; i < 10; i++){
                if(numeroSorteado == nb)
                    acerto++;
            }

            if(acerto <= 3)
                System.out.println("Você é MUITO sortudo");
            else if(acerto <= 10)
                System.out.println("você é sortudo");
            else
                System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}