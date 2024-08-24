package school.sptech.ex1;

public class Colaborador {
    private String nome = "lua";
    private String cargo = "Estagiária";
    private Double salario = 2.600;

    public Colaborador(){}

    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double valorReajuste) {
        this.salario = salario;
    }
}