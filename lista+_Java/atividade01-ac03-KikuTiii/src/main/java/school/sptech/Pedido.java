package school.sptech;

import java.util.List;

public abstract class Pedido {
    protected String cliente;
    protected Status status;
    protected List<ItemPedido> itens;

    public void adicionarItem(Sabor sabor, Integer quantidade){
            itens.add(new ItemPedido(sabor,quantidade));
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
