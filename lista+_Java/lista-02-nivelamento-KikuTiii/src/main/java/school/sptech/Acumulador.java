package school.sptech;

public class Acumulador {
    public static void main(String[] args){
        Integer soma = 0;
        Integer numeroSorteado = 0;

        for(int i = 0; i < 10; i++){
            numeroSorteado = (int) (Math.random() * 10);
            if(numeroSorteado != 0)
                soma += numeroSorteado;
        }
        System.out.println("A soma dos números sorteados é: " + soma);
    }
}