package school.sptech;

public class Votacao {
    public static void main(String[] args){
        Integer votosMussarela = 0;
        Integer votosCalabresa = 0;
        Integer votosQuatroQueijos = 0;

        for(int i = 0; i < 10; i++){
          int voto = (int) (Math.random() * 3);

            if(voto == 1)
                votosMussarela++;
            else if(voto == 2)
                votosCalabresa++;
            else
                votosQuatroQueijos++;
        }

        System.out.println("Quantidade de votos para Mussarela: " + votosMussarela);
        System.out.println("Quantidade de votos para Calabresa: " + votosCalabresa);
        System.out.println("Quantidade de votos para Quatro Queijos: " + votosQuatroQueijos);

        // Determina o sabor favorito
        String saborFavorito;
        if (votosMussarela > votosCalabresa && votosMussarela > votosQuatroQueijos) {
            saborFavorito = "Mussarela";
        } else if (votosCalabresa > votosMussarela && votosCalabresa > votosQuatroQueijos) {
            saborFavorito = "Calabresa";
        } else {
            saborFavorito = "Quatro Queijos";
        }

        System.out.println("O sabor favorito é: " + saborFavorito);
    }
}
