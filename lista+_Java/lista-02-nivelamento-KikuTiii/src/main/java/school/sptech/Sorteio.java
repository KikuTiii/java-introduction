package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args){

        Integer numerosPares = 0;
        Integer numerosImpares = 0;
        Integer primeiroNumero = 0;
        
        for(int i = 0; i <= 200; i++){
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1, 101);
            if(i == 0)
                primeiroNumero = numeroSorteado;
            if(i % 2 != 0)
                numerosImpares++;
            if(i % 2 == 0)
                numerosPares++;
        }

        System.out.println("o primeiro número sorteado é: " + primeiroNumero);
        System.out.println("A quantidade de números pares foi: " + numerosPares);
        System.out.println("A quantidade de números impares foi: " + numerosImpares);
    }
}