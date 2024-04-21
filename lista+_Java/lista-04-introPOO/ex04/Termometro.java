package ex04;

public class Termometro {
    Double temperaturaAtual;
    Double temperaturaMaxima;
    Double temperaturaMinima;

    void aumentarTemperatura(Double temperatura){
        if(temperaturaAtual + temperatura > temperaturaMaxima)
            temperaturaMaxima = temperaturaAtual + temperatura;
    }

    void diminuirTemperatura(Double temperatura){
        if(temperaturaAtual - temperatura < temperaturaMinima)
            temperaturaMinima = temperaturaAtual - temperatura;
    }

    void exibirFahreinheit(){
        System.out.println("Temperatura atual: %.2f".formatted(temperaturaAtual * 1.8 + 32));
        System.out.println("Temperatura máxima: %.2f".formatted(temperaturaMaxima * 1.8 + 32));
        System.out.println("Temperatura mínima: %.2f".formatted(temperaturaMinima * 1.8 + 32));
    }
}
