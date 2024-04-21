package school.sptech.ex5;

public class Ex5CalculoNutricaoMetodos {
    public void calculaIMC(Double peso, Double altura){
        Double IMC = peso / (altura * altura);

        System.out.println("O IMC é %.2f".formatted(IMC));
    }
}
