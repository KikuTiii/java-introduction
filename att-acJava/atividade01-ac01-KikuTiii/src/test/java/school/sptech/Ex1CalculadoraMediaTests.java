package school.sptech;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

@DisplayName("Exercício 1 - Calculadora Média")
class Ex1CalculadoraMediaTests {

  @Test
  @DisplayName("Cenário 1")
  void cenario1() {

    Locale.setDefault(new Locale("pt", "BR"));

    String input = "";

    input += "8,5" + System.lineSeparator();
    input += "10" + System.lineSeparator();

    ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
    System.setIn(bais);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    Ex1CalculadoraMedia.main(null);

    String saidaEsperada = "Média: 9,4";

    String[] lines = baos.toString().split(System.lineSeparator());
    String saidaRecebida = lines[lines.length-1];

    Assertions.assertEquals(saidaEsperada, saidaRecebida);
  }

  @Test
  @DisplayName("Cenário 2")
  void cenario2() {

    Locale.setDefault(new Locale("pt", "BR"));

    String input = "";

    input += "8" + System.lineSeparator();
    input += "9" + System.lineSeparator();

    ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
    System.setIn(bais);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    Ex1CalculadoraMedia.main(null);

    String saidaEsperada = "Média: 8,6";

    String[] lines = baos.toString().split(System.lineSeparator());
    String saidaRecebida = lines[lines.length-1];

    Assertions.assertEquals(saidaEsperada, saidaRecebida);
  }

  @Test
  @DisplayName("Cenário 3")
  void cenario3() {

    Locale.setDefault(new Locale("pt", "BR"));

    String input = "";

    input += "5" + System.lineSeparator();
    input += "2" + System.lineSeparator();

    ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
    System.setIn(bais);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    Ex1CalculadoraMedia.main(null);

    String saidaEsperada = "Média: 3,2";

    String[] lines = baos.toString().split(System.lineSeparator());
    String saidaRecebida = lines[lines.length-1];

    Assertions.assertEquals(saidaEsperada, saidaRecebida);
  }

  @Test
  @DisplayName("Cenário 4")
  void cenario4() {

    Locale.setDefault(new Locale("pt", "BR"));

    String input = "";

    input += "7,7" + System.lineSeparator();
    input += "9,5" + System.lineSeparator();

    ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
    System.setIn(bais);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    Ex1CalculadoraMedia.main(null);

    String saidaEsperada = "Média: 8,8";

    String[] lines = baos.toString().split(System.lineSeparator());
    String saidaRecebida = lines[lines.length-1];

    Assertions.assertEquals(saidaEsperada, saidaRecebida);
  }

  @Test
  @DisplayName("Cenário 5")
  void cenario5() {

    Locale.setDefault(new Locale("pt", "BR"));

    String input = "";

    input += "10" + System.lineSeparator();
    input += "3,5" + System.lineSeparator();

    ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
    System.setIn(bais);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    Ex1CalculadoraMedia.main(null);

    String saidaEsperada = "Média: 6,1";

    String[] lines = baos.toString().split(System.lineSeparator());
    String saidaRecebida = lines[lines.length-1];

    Assertions.assertEquals(saidaEsperada, saidaRecebida);
  }
}
