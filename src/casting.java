public class casting {
    public static void main(String[] args){
        int inteiro = 42;
        double flutuante = inteiro; // Casting implícito de int para double

        double flutuante2 = 42.0;
        int inteiro2 = (int) flutuante; // Casting explícito de double para int

        // De int para String
        int numeroInteiro = 42;
        String texto = String.valueOf(numeroInteiro);
        // ou
        String texto2 = Integer.toString(numeroInteiro);

        //de String para int

        String text = "42";
        int numeroInteiro2 = Integer.parseInt(texto);

    }
}
