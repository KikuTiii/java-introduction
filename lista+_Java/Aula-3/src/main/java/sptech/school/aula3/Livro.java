package sptech.school.aula3;

import java.time.LocalDate;

public class Livro {

    private int id;
    private String titulo;
    private String nomeAutor;
    private LocalDate dataLancamento;

    public Livro() {
    }

    public Livro(String titulo, String nomeAutor, LocalDate dataLancamento, int id) {
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.dataLancamento = dataLancamento;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
