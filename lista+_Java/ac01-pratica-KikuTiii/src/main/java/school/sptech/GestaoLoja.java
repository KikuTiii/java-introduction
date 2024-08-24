package school.sptech;

import java.util.List;

public class GestaoLoja {
    public Double calcularTroco(Double totalCompra, Double valorEntregue){
        return valorEntregue - totalCompra;
    }

    Double calcularVendas (List<Double> vendas){
        Double totalVendas = 0.0;
        for (int i = 0; i < vendas.size(); i++) {
            totalVendas += vendas.get(i);
        }
        return totalVendas;
    }

    Double buscarMenorVenda(List<Double> vendas){
        Double menorVenda = vendas.get(0);
        for (int i = 0; i < vendas.size(); i++) {
            if(vendas.get(i) < menorVenda)
                menorVenda = vendas.get(i);
        }
        return menorVenda;
    }

    Boolean verificarFuncionario(List<String> funcionarios, String nomeFuncionario){
        for (int i = 0; i < funcionarios.size(); i++) {
            if(nomeFuncionario.equalsIgnoreCase(funcionarios.get(i)))
                return true;
        }
        return false;
    }
}
