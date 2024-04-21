package school.sptech.ex4;

import java.util.Scanner;

public class Ex4DescontoProgressivo {

  public static void main(String[] args) {
    Ex4DescontoProgressivoMetodos calc = new Ex4DescontoProgressivoMetodos();
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o valor do produto: ");
    Double valor = sc.nextDouble();

    System.out.println("Informe a quantidade: ");
    Integer quantidade = sc.nextInt();

    Double desconto = calc.calcularDesconto(valor, quantidade);
    System.out.println(calc.exibirNotaFiscal(valor, quantidade, desconto));
  }
}