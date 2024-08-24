package school.sptech;

public enum Sabor {
    CALABRESA(35.00),
    MUSSARELA(30.00),
    FRANGO(35.00),
    CARNE(40.00),
    PALMITO(40.00),
    CHOCOLATE(50.00);

    private Double preco;

    Sabor(Double preco) {
        this.preco = preco;
    }

    public final Double getPreco() {
        return preco;
    }
}
