package sptech.school.aula2;

public class Filme {

    private String titulo;
    private String diretor;

    public Filme(String titulo, String diretor) {
        this.titulo = titulo;
        this.diretor = diretor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
