package school.sptech.ex3;

import java.util.Scanner;

public class Ex3Idade {

  public static void main(String[] args) {
    Ex3IdadeMetodos calc = new Ex3IdadeMetodos();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Informe sua idade: ");
    Integer idade = sc.nextInt();
    
    calc.classificaIdade(idade);
  }
}
