package school.sptech.ex5;

import java.util.Scanner;

public class Ex5CalculoNutricao {

  public static void main(String[] args) {
    Ex5CalculoNutricaoMetodos calc = new Ex5CalculoNutricaoMetodos();
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o peso: ");
    Double peso = sc.nextDouble();

    System.out.println("Digite a altura: ");
    Double altura = sc.nextDouble();

    calc.calculaIMC(peso, altura);
  }
}
