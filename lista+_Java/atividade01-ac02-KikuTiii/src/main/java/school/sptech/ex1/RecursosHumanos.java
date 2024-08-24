package school.sptech.ex1;

public class RecursosHumanos {
    private Integer totalPromovidos = 0;
    private Integer totalReajustados = 0;

    public void reajustarSalario(Colaborador colaborador, Double porcentagem){
        Double valorReajuste = colaborador.getSalario() * (porcentagem / 100);
        colaborador.setSalario(valorReajuste);
        totalReajustados++;
    }

    public void promover(Colaborador colaborador, String novoCargo, Double novoSalario){
        if(colaborador.getSalario() >= novoSalario) {
            System.out.println("Promoção inválida!");
        } else {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            totalPromovidos++;
        }
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalReajustado() {
        return totalReajustados;
    }
}