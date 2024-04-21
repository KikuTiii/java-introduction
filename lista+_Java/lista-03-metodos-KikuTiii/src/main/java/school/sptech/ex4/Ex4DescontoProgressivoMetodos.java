package school.sptech.ex4;

public class Ex4DescontoProgressivoMetodos {
    public Double calcularDesconto(Double valor, Integer quantidade){
        if(quantidade == 1)
            return valor * 0.9;
        else if(quantidade == 2)
            return valor * 0.8;
        else
            return valor * 0.7;
    }

    public String exibirNotaFiscal(Double valor, Integer quantidade, Double valorDesconto){
        return """
            Valor: %.2f
            Quantidade: %d
            Valor com desconto: %.2f
            """.formatted(valor, quantidade, valorDesconto);
    }
}