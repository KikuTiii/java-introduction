package school.sptech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteLivraria {
    public static void main(String[] args){
        GestaoLoja loja = new GestaoLoja();
        List<Double> vendas = new ArrayList<Double>();
        List<String> funcionarios = Arrays.asList("Kikuti", "Luana", "Gustavão", "Leonel");
        vendas.add(110.0);
        vendas.add(470.0);
        vendas.add(350.0);
        vendas.add(800.0);
        vendas.add(600.0);
        System.out.println("Total de vendas: " + loja.calcularVendas(vendas));
        System.out.println("Menor venda: " + loja.buscarMenorVenda(vendas));
        System.out.println("Funcionário encontrado: " + loja.verificarFuncionario(funcionarios, "Kikuti"));
    }
}