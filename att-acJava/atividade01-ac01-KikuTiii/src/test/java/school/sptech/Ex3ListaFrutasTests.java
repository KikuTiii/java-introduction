package school.sptech;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

@DisplayName("Exercício 3 - Lista Frutas")
public class Ex3ListaFrutasTests {

  @Test
  @DisplayName("Cenário 1 - Fruta não existe na lista")
  void cenario1() {

    Locale.setDefault(new Locale("pt", "BR"));

    String input = "";

    input += "Abacaxi" + System.lineSeparator();
    input += "Laranja" + System.lineSeparator();
    input += "0" + System.lineSeparator();
    input += "Goiaba" + System.lineSeparator();

    ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
    System.setIn(bais);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    Ex3ListaFrutas.main(null);

    String saidaEsperada = "Não existe a fruta Goiaba na lista";

    String[] lines = baos.toString().split(System.lineSeparator());
    String saidaRecebida = lines[lines.length-1];

    Assertions.assertEquals(saidaEsperada, saidaRecebida);
  }

  @Test
  @DisplayName("Cenário 2 - Fruta existe na lista")
  void cenario2() {

    Locale.setDefault(new Locale("pt", "BR"));

    String input = "";

    input += "Abacaxi" + System.lineSeparator();
    input += "Laranja" + System.lineSeparator();
    input += "Tomate" + System.lineSeparator();
    input += "Banana" + System.lineSeparator();
    input += "Uva" + System.lineSeparator();
    input += "0" + System.lineSeparator();
    input += "Tomate" + System.lineSeparator();

    ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
    System.setIn(bais);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    Ex3ListaFrutas.main(null);

    String saidaEsperada = "A fruta Tomate existe na lista";

    String[] lines = baos.toString().split(System.lineSeparator());
    String saidaRecebida = lines[lines.length-1];

    Assertions.assertEquals(saidaEsperada, saidaRecebida);
  }

  @Test
  @DisplayName("Cenário 3 - Fruta existe na lista")
  void cenario3() {

    Locale.setDefault(new Locale("pt", "BR"));

    String input = "";

    input += "Abacaxi" + System.lineSeparator();
    input += "Laranja" + System.lineSeparator();
    input += "Tomate" + System.lineSeparator();
    input += "Banana" + System.lineSeparator();
    input += "Uva" + System.lineSeparator();
    input += "0" + System.lineSeparator();
    input += "Abacaxi" + System.lineSeparator();

    ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
    System.setIn(bais);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    Ex3ListaFrutas.main(null);

    String saidaEsperada = "A fruta Abacaxi existe na lista";

    String[] lines = baos.toString().split(System.lineSeparator());
    String saidaRecebida = lines[lines.length-1];

    Assertions.assertEquals(saidaEsperada, saidaRecebida);
  }

  @Test
  @DisplayName("Cenário 4 - Fruta não existe na lista")
  void cenario4() {

    Locale.setDefault(new Locale("pt", "BR"));

    String input = "";

    input += "Abacaxi" + System.lineSeparator();
    input += "Laranja" + System.lineSeparator();
    input += "Tomate" + System.lineSeparator();
    input += "Banana" + System.lineSeparator();
    input += "Uva" + System.lineSeparator();
    input += "0" + System.lineSeparator();
    input += "Kiwi" + System.lineSeparator();

    ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
    System.setIn(bais);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    Ex3ListaFrutas.main(null);

    String saidaEsperada = "Não existe a fruta Kiwi na lista";

    String[] lines = baos.toString().split(System.lineSeparator());
    String saidaRecebida = lines[lines.length-1];

    Assertions.assertEquals(saidaEsperada, saidaRecebida);
  }
}
