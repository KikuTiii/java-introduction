package school.sptech.ex1;

public class RecursosHumanos {
     private Integer totalPromovidos = 0;
     private Integer totalReajustado = 0;

    public void reajustarSalario(Colaborador colaborador, Double porcentagem){
        Double valorReajuste = colaborador.getSalario() * (1 + porcentagem / 100);
        colaborador.setSalario(valorReajuste);
        totalReajustado++;
    }

    public void promover(Colaborador colaborador, String novoCargo, Double novoSalario){
        if(novoSalario < colaborador.getSalario())
            System.out.println("Promoção inválida");
        else {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            System.out.println("""
                Parabéns! Você foi promovido à %s, com um salário de %.2f
                """.formatted(novoCargo, novoSalario));
            totalPromovidos++;
        }
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalReajustado() {
        return totalReajustado;
    }
}
