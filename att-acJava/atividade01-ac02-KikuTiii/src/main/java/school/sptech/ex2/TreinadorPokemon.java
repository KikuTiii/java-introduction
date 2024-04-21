package school.sptech.ex2;

public class TreinadorPokemon {
    private String nome;
    private Double nivel;

    public TreinadorPokemon(String nome, Double nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void treinarPokemon(Pokemon pokemon){
        Double novaForca = pokemon.getForca() * 1.0;
        Integer novosDoces = pokemon.getDoces() + 10;
        pokemon.setForca(novaForca);
        pokemon.setDoces(novosDoces);
    }

    public void evoluirPokemon(Pokemon pokemon, String nomeEvolução){
        if(pokemon.getDoces() >= 50){
            pokemon.setNome(nomeEvolução);
            pokemon.setDoces(pokemon.getDoces() - 50);
            this.nivel += 10;
        }
        else
            System.out.println("Não foi possível realizar a operação. Quantidade de doces insuficiente.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNivel() {
        return nivel;
    }

    public void setNivel(Double nivel) {
        this.nivel = nivel;
    }    
}
