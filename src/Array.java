import java.util.ArrayList; //biblioteca para usar o array dinamico

public class Array {

    public static void main( String[] args){
        // Sintaxe 1: Tipo[] nomeDoVetor;
        //int[] numeros;

        // Sintaxe 2: Tipo nomeDoVetor[];
        //float[] valores;

        // Inicialização durante a declaração
        //int[] numeros = {1, 2, 3, 4, 5};

        // Ou inicialização posterior
        //float[] valores;
        //valores = new float[3]; // Inicializa um vetor com 3 elementos de ponto flutuante, todos inicializados como 0.0



        // ArrayList eh um tipo de array dinamico onde nao precisa declarar o tamanho fixo dela.

        ArrayList<Integer> idades = new ArrayList<Integer>();
        idades.add(22); //para adicionar um valor no array
        idades.remove(0); // para remover um valor no array
        idades.get(1); // para obter um valor do array
        idades.size(); // para obter o tamanho do array
    }
}
