//Faça um algoritmo que calcule a quantidade de litros de combustível gasta em uma viagem,
//utilizando um automóvel que faz 12Km por litro. Para obter o cálculo, o usuário deve fornecer o
//tempo gasto na viagem e a velocidade média durante ela. Desta forma, será possível obter a
//distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da
//distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
//fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da

//  velocidade média, tempo gasto na viagem, a distância percorrida e a quantidade de litros utilizada
//na viagem.


public class ex07 {
    public static void main(String[] args){
        int tempo = 5;
        int velocidade = 50;
        int distancia = tempo * velocidade;
        int qtd_litros = distancia / 12;

        System.out.println(velocidade);
        System.out.println(tempo);
        System.out.println(distancia);
        System.out.println(qtd_litros);
    }
}
