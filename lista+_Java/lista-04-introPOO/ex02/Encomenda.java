package ex02;

public class Encomenda {
    private String tamanho;
    private String enderecoRemetente;
    private String enderecoDestinatario;
    private Double distancia;
    private Double valorEncomenda;

    public Encomenda(String tamanho, String enderecoRemetente, String enderecoDestinatario,
            Double distancia, Double valorEncomenda) {
        this.tamanho = tamanho;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
    }

    Double calcularFrete(){
        if(this.distancia <= 50){
            if(this.tamanho.equals("P") ){
                return 3 + valorEncomenda * 0.9;
            } else if(this.tamanho.equals("M")){
                return 3 + valorEncomenda * 0.1;
            } else if(this.tamanho.equals("G")){
                return 3 + valorEncomenda * 0.5;
            }
        }
        else if(this.distancia > 50 && this.distancia <= 200){
            if(this.tamanho.equals("P") ){
                return 5 + valorEncomenda * 0.9;
            } else if(this.tamanho.equals("M")){
                return 5 + valorEncomenda * 0.1;
            } else if(this.tamanho.equals("G")){
                return 5 + valorEncomenda * 0.5;
            }
        }
        else{
            if(this.tamanho.equals("P") ){
                return 7 + valorEncomenda * 0.9;
            } else if(this.tamanho.equals("M")){
                return 7 + valorEncomenda * 0.1;
            } else if(this.tamanho.equals("G")){
                return 7 + valorEncomenda * 0.5;
            }
        }
        return 0.0;
    }

    void emitirEtiqueta(){
        System.out.println("Endereço do remetente: %s".formatted(this.enderecoRemetente));
        System.out.println("Endereço do destinatário: %s".formatted(this.enderecoDestinatario));
        System.out.println("Tamanho da encomenda: %s".formatted(this.tamanho));
        System.out.println("Valor do frete: R$ %.2f".formatted(this.calcularFrete()));
        System.out.println("Valor da encomenda: R$ %.2f".formatted(this.valorEncomenda));
        System.out.println("Valor encomenda : R$ %.2f".formatted(this.valorEncomenda));
        System.out.println("valor frete : R$ %.2f".formatted(this.calcularFrete()));
        System.out.println("valor total : R$ %.2f".formatted(this.valorEncomenda + this.calcularFrete()));
    }
}
