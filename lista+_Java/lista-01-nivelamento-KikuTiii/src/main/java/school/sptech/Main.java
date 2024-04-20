package school.sptech;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a quantidade de filhos de 0 a 3 anos: ");
    Integer filhos0a3 = sc.nextInt();

    System.out.println("Digite a quantidade de filhos de 4 a 16 anos: ");
    Integer filhos4a16 = sc.nextInt();

    System.out.println("Digite a quantidade de filhos de 17 a 18 anos: ");
    Integer filhos17a18 = sc.nextInt();

    Double valorBolsa = (filhos0a3 * 25.12) + (filhos4a16 * 15.88) + (filhos17a18 * 12.44);

    Integer totalFilhos = filhos0a3 + filhos4a16 + filhos17a18;

    System.out.println("Você tem um total de " + totalFilhos + " filhos e vai receber " + valorBolsa + " de bolsa");

    sc.close();
  }
}