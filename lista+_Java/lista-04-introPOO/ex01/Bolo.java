package ex01;

public class Bolo{
    private String sabor;
    private Double valor;
    private Integer qtdVendida;

    public Bolo(String sabor, Double valor){
        this.sabor = sabor;
        this.valor = valor;
        this.qtdVendida = 0;
    }

    public void comprarBolo(Integer quantidade){
        if(quantidade + qtdVendida > 100)
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        else
            qtdVendida += quantidade;
    }

    public void exibirRelatorio(){
        Double totalVendas = qtdVendida * valor;
        System.out.println("O bolo sabor " + sabor + " foi comprado " + qtdVendida + " vezes hoje, totalizando R$ " + totalVendas);
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(Integer qtdVendida) {
        this.qtdVendida = qtdVendida;
    }
}