package school.sptech.ex2;

public class Pokemon {
    private String nome;
    private String tipo;
    private Double forca;
    private Integer doces;

    public Pokemon(String nome, String tipo, Double forca, Integer doces) {
        this.nome = "Tentacool";
        this.tipo = "Água";
        this.forca = 0.0;
        this.doces = 0;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Double getForca() {
        return forca;
    }
    public void setForca(Double forca) {
        this.forca = forca;
    }
    public Integer getDoces() {
        return doces;
    }
    public void setDoces(Integer doces) {
        this.doces = doces;
    }    
}