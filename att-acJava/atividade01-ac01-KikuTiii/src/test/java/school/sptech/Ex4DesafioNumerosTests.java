package school.sptech;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@DisplayName("Exercício 4 - Desafio Números")
public class Ex4DesafioNumerosTests {

  @Test
  @DisplayName("Cenário 1 - 2, 4, 7, 0")
  void cenario1() {

    Locale.setDefault(new Locale("pt", "BR"));

    String input = "";

    input += "2" + System.lineSeparator();
    input += "4" + System.lineSeparator();
    input += "7" + System.lineSeparator();
    input += "0" + System.lineSeparator();

    ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
    System.setIn(bais);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    Ex4DesafioNumeros.main(null);

    String[] lines = baos.toString().split(System.lineSeparator());

    List<String> linhasResposta = Arrays.stream(lines).skip(lines.length - 5).toList();

    Assertions.assertEquals("Pares: 2, 4", linhasResposta.get(0));
    Assertions.assertEquals("Ímpares: 7", linhasResposta.get(1));
    Assertions.assertEquals("Soma: 13", linhasResposta.get(2));
    Assertions.assertEquals("Menor número: 2", linhasResposta.get(3));
    Assertions.assertEquals("Maior número: 7", linhasResposta.get(4));
  }

  @Test
  @DisplayName("Cenário 2 - 6, 5, 10, 50, -5, 0")
  void cenario2() {

    Locale.setDefault(new Locale("pt", "BR"));

    String input = "";

    input += "6" + System.lineSeparator();
    input += "5" + System.lineSeparator();
    input += "10" + System.lineSeparator();
    input += "50" + System.lineSeparator();
    input += "-5" + System.lineSeparator();
    input += "0" + System.lineSeparator();

    ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
    System.setIn(bais);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    Ex4DesafioNumeros.main(null);

    String[] lines = baos.toString().split(System.lineSeparator());

    List<String> linhasResposta = Arrays.stream(lines).skip(lines.length - 5).toList();

    Assertions.assertEquals("Pares: 6, 10, 50", linhasResposta.get(0));
    Assertions.assertEquals("Ímpares: 5, -5", linhasResposta.get(1));
    Assertions.assertEquals("Soma: 66", linhasResposta.get(2));
    Assertions.assertEquals("Menor número: -5", linhasResposta.get(3));
    Assertions.assertEquals("Maior número: 50", linhasResposta.get(4));
  }

  @Test
  @DisplayName("Cenário 3 - -8, 1, 3, 5, -10, -999, 80000, 0")
  void cenario3() {

    Locale.setDefault(new Locale("pt", "BR"));

    String input = "";

    input += "-8" + System.lineSeparator();
    input += "1" + System.lineSeparator();
    input += "3" + System.lineSeparator();
    input += "5" + System.lineSeparator();
    input += "-10" + System.lineSeparator();
    input += "-999" + System.lineSeparator();
    input += "80000" + System.lineSeparator();
    input += "0" + System.lineSeparator();

    ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
    System.setIn(bais);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    Ex4DesafioNumeros.main(null);

    String[] lines = baos.toString().split(System.lineSeparator());

    List<String> linhasResposta = Arrays.stream(lines).skip(lines.length - 5).toList();

    Assertions.assertEquals("Pares: -8, -10, 80000", linhasResposta.get(0));
    Assertions.assertEquals("Ímpares: 1, 3, 5, -999", linhasResposta.get(1));
    Assertions.assertEquals("Soma: 78992", linhasResposta.get(2));
    Assertions.assertEquals("Menor número: -999", linhasResposta.get(3));
    Assertions.assertEquals("Maior número: 80000", linhasResposta.get(4));
  }
}
