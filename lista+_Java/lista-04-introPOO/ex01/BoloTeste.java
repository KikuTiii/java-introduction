package ex01;
public class BoloTeste {
    public static void main(String[] args) {
        Bolo boloChocolate = new Bolo("chocolate", 40.00);
        Bolo boloMorango = new Bolo("Morango", 40.00);
        Bolo boloAbacaxi = new Bolo("Abacaxi", 40.00);

        boloChocolate.comprarBolo(5);
        boloMorango.comprarBolo(3);
        boloAbacaxi.comprarBolo(7);

        boloChocolate.exibirRelatorio();
        boloMorango.exibirRelatorio();
        boloAbacaxi.exibirRelatorio();
    }
}
