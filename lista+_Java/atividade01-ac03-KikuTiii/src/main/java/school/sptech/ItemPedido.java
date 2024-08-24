package school.sptech;

public class ItemPedido {
    private Sabor sabor;
    private Integer quantidade;

    public ItemPedido() {
    }

    public ItemPedido(Sabor sabor, Integer quantidade) {
        this.sabor = sabor;
        this.quantidade = quantidade;
    }

    public Double calcularSubtotal(){
        Double subtotal = sabor.getPreco() * quantidade;
        return subtotal;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
