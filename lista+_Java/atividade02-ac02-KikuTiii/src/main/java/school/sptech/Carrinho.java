package school.sptech;

import java.util.List;

public class Carrinho {
    private String cliente;
    private List <Produto> produtos;

    public Integer getQuantidade(){
        return produtos.size();
    }

    public void adicionar(Produto p){
        produtos.add(p);
    }

    public Boolean existsPorNome(String nome){
        for (Produto produtoNome : produtos) {
            if (produtoNome.getNome().equalsIgnoreCase(nome))
                return true;
        }
        return false;
    }

    public Integer getQuantidadePorCategoria(String nome){
        Integer qtd = 0;
        for (Produto produto : produtos){
            if(produto.getCategoria().equalsIgnoreCase(nome))
                qtd++;
        }
        return qtd;
    }

    public void limpar(){
        produtos.clear();
    }

    public void removerPorNome(String nome){
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)){
                produtos.remove(i);
                i--;
            }
        }
    }

    public Produto getPorNome(String nome){
        for(Produto nomeProduto : produtos){
            if(nomeProduto.getNome().equalsIgnoreCase(nome))
                return nomeProduto;
        }
        return null;
    }

    public double getValorTotal(){
        Double valorTotal = 0.0;
        for(Produto produto : produtos)
            valorTotal += produto.getPreco();
        return valorTotal;
    }
}
