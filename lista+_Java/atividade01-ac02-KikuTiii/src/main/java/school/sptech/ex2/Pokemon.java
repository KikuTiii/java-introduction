package school.sptech.ex2;

public class Pokemon {
   private String nome;
   private String tipo;
   private Double forca;
   private Integer doces;

   public Pokemon(String nome, String tipo, Double forca) {
      this.nome = nome;
      this.tipo = tipo;
      this.forca = forca;
   }

   public Pokemon() {
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