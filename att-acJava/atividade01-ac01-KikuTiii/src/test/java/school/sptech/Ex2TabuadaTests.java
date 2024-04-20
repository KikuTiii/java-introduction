package school.sptech;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@DisplayName("Exercício 2 - Tabuada")
public class Ex2TabuadaTests {

  @Nested
  @DisplayName("Adição")
  public class Adicao {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() {

      Locale.setDefault(new Locale("pt", "BR"));

      String input = "";

      input += "1" + System.lineSeparator();
      input += "6" + System.lineSeparator();

      ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
      System.setIn(bais);

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Ex2Tabuada.main(null);

      String[] lines = baos.toString().split(System.lineSeparator());

      List<String> linhasResposta = Arrays.stream(lines).skip(2).toList();

      Assertions.assertEquals(10, linhasResposta.size());
      Assertions.assertEquals("6 + 1 = 7", linhasResposta.get(0));
      Assertions.assertEquals("6 + 2 = 8", linhasResposta.get(1));
      Assertions.assertEquals("6 + 3 = 9", linhasResposta.get(2));
      Assertions.assertEquals("6 + 4 = 10", linhasResposta.get(3));
      Assertions.assertEquals("6 + 5 = 11", linhasResposta.get(4));
      Assertions.assertEquals("6 + 6 = 12", linhasResposta.get(5));
      Assertions.assertEquals("6 + 7 = 13", linhasResposta.get(6));
      Assertions.assertEquals("6 + 8 = 14", linhasResposta.get(7));
      Assertions.assertEquals("6 + 9 = 15", linhasResposta.get(8));
      Assertions.assertEquals("6 + 10 = 16", linhasResposta.get(9));
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() {

      Locale.setDefault(new Locale("pt", "BR"));

      String input = "";

      input += "1" + System.lineSeparator();
      input += "14" + System.lineSeparator();

      ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
      System.setIn(bais);

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Ex2Tabuada.main(null);

      String[] lines = baos.toString().split(System.lineSeparator());

      List<String> linhasResposta = Arrays.stream(lines).skip(2).toList();

      Assertions.assertEquals(10, linhasResposta.size());
      Assertions.assertEquals("14 + 1 = 15", linhasResposta.get(0));
      Assertions.assertEquals("14 + 2 = 16", linhasResposta.get(1));
      Assertions.assertEquals("14 + 3 = 17", linhasResposta.get(2));
      Assertions.assertEquals("14 + 4 = 18", linhasResposta.get(3));
      Assertions.assertEquals("14 + 5 = 19", linhasResposta.get(4));
      Assertions.assertEquals("14 + 6 = 20", linhasResposta.get(5));
      Assertions.assertEquals("14 + 7 = 21", linhasResposta.get(6));
      Assertions.assertEquals("14 + 8 = 22", linhasResposta.get(7));
      Assertions.assertEquals("14 + 9 = 23", linhasResposta.get(8));
      Assertions.assertEquals("14 + 10 = 24", linhasResposta.get(9));
    }
  }

  @Nested
  @DisplayName("Multiplicação")
  public class Multiplicacao {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() {

      Locale.setDefault(new Locale("pt", "BR"));

      String input = "";

      input += "2" + System.lineSeparator();
      input += "4" + System.lineSeparator();

      ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
      System.setIn(bais);

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Ex2Tabuada.main(null);

      String[] lines = baos.toString().split(System.lineSeparator());

      List<String> linhasResposta = Arrays.stream(lines).skip(2).toList();

      Assertions.assertEquals(10, linhasResposta.size());
      Assertions.assertEquals("4 * 1 = 4", linhasResposta.get(0));
      Assertions.assertEquals("4 * 2 = 8", linhasResposta.get(1));
      Assertions.assertEquals("4 * 3 = 12", linhasResposta.get(2));
      Assertions.assertEquals("4 * 4 = 16", linhasResposta.get(3));
      Assertions.assertEquals("4 * 5 = 20", linhasResposta.get(4));
      Assertions.assertEquals("4 * 6 = 24", linhasResposta.get(5));
      Assertions.assertEquals("4 * 7 = 28", linhasResposta.get(6));
      Assertions.assertEquals("4 * 8 = 32", linhasResposta.get(7));
      Assertions.assertEquals("4 * 9 = 36", linhasResposta.get(8));
      Assertions.assertEquals("4 * 10 = 40", linhasResposta.get(9));
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() {

      Locale.setDefault(new Locale("pt", "BR"));

      String input = "";

      input += "2" + System.lineSeparator();
      input += "9" + System.lineSeparator();

      ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
      System.setIn(bais);

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Ex2Tabuada.main(null);

      String[] lines = baos.toString().split(System.lineSeparator());

      List<String> linhasResposta = Arrays.stream(lines).skip(2).toList();

      Assertions.assertEquals(10, linhasResposta.size());
      Assertions.assertEquals("9 * 1 = 9", linhasResposta.get(0));
      Assertions.assertEquals("9 * 2 = 18", linhasResposta.get(1));
      Assertions.assertEquals("9 * 3 = 27", linhasResposta.get(2));
      Assertions.assertEquals("9 * 4 = 36", linhasResposta.get(3));
      Assertions.assertEquals("9 * 5 = 45", linhasResposta.get(4));
      Assertions.assertEquals("9 * 6 = 54", linhasResposta.get(5));
      Assertions.assertEquals("9 * 7 = 63", linhasResposta.get(6));
      Assertions.assertEquals("9 * 8 = 72", linhasResposta.get(7));
      Assertions.assertEquals("9 * 9 = 81", linhasResposta.get(8));
      Assertions.assertEquals("9 * 10 = 90", linhasResposta.get(9));
    }
  }

  @Nested
  @DisplayName("Divisão")
  public class Divisao {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() {

      Locale.setDefault(new Locale("pt", "BR"));

      String input = "";

      input += "3" + System.lineSeparator();
      input += "5" + System.lineSeparator();

      ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
      System.setIn(bais);

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Ex2Tabuada.main(null);

      String[] lines = baos.toString().split(System.lineSeparator());

      List<String> linhasResposta = Arrays.stream(lines).skip(2).toList();

      Assertions.assertEquals(10, linhasResposta.size());
      Assertions.assertEquals("5 / 1 = 5", linhasResposta.get(0));
      Assertions.assertEquals("5 / 2 = 2", linhasResposta.get(1));
      Assertions.assertEquals("5 / 3 = 1", linhasResposta.get(2));
      Assertions.assertEquals("5 / 4 = 1", linhasResposta.get(3));
      Assertions.assertEquals("5 / 5 = 1", linhasResposta.get(4));
      Assertions.assertEquals("5 / 6 = 0", linhasResposta.get(5));
      Assertions.assertEquals("5 / 7 = 0", linhasResposta.get(6));
      Assertions.assertEquals("5 / 8 = 0", linhasResposta.get(7));
      Assertions.assertEquals("5 / 9 = 0", linhasResposta.get(8));
      Assertions.assertEquals("5 / 10 = 0", linhasResposta.get(9));
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() {

      Locale.setDefault(new Locale("pt", "BR"));

      String input = "";

      input += "3" + System.lineSeparator();
      input += "9" + System.lineSeparator();

      ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
      System.setIn(bais);

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Ex2Tabuada.main(null);

      String[] lines = baos.toString().split(System.lineSeparator());

      List<String> linhasResposta = Arrays.stream(lines).skip(2).toList();

      Assertions.assertEquals(10, linhasResposta.size());
      Assertions.assertEquals("9 / 1 = 9", linhasResposta.get(0));
      Assertions.assertEquals("9 / 2 = 4", linhasResposta.get(1));
      Assertions.assertEquals("9 / 3 = 3", linhasResposta.get(2));
      Assertions.assertEquals("9 / 4 = 2", linhasResposta.get(3));
      Assertions.assertEquals("9 / 5 = 1", linhasResposta.get(4));
      Assertions.assertEquals("9 / 6 = 1", linhasResposta.get(5));
      Assertions.assertEquals("9 / 7 = 1", linhasResposta.get(6));
      Assertions.assertEquals("9 / 8 = 1", linhasResposta.get(7));
      Assertions.assertEquals("9 / 9 = 1", linhasResposta.get(8));
      Assertions.assertEquals("9 / 10 = 0", linhasResposta.get(9));
    }
  }

  @Nested
  @DisplayName("Subtração")
  public class Subtracao {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() {

      Locale.setDefault(new Locale("pt", "BR"));

      String input = "";

      input += "4" + System.lineSeparator();
      input += "7" + System.lineSeparator();

      ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
      System.setIn(bais);

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Ex2Tabuada.main(null);

      String[] lines = baos.toString().split(System.lineSeparator());

      List<String> linhasResposta = Arrays.stream(lines).skip(2).toList();

      Assertions.assertEquals(10, linhasResposta.size());
      Assertions.assertEquals("7 - 1 = 6", linhasResposta.get(0));
      Assertions.assertEquals("7 - 2 = 5", linhasResposta.get(1));
      Assertions.assertEquals("7 - 3 = 4", linhasResposta.get(2));
      Assertions.assertEquals("7 - 4 = 3", linhasResposta.get(3));
      Assertions.assertEquals("7 - 5 = 2", linhasResposta.get(4));
      Assertions.assertEquals("7 - 6 = 1", linhasResposta.get(5));
      Assertions.assertEquals("7 - 7 = 0", linhasResposta.get(6));
      Assertions.assertEquals("7 - 8 = -1", linhasResposta.get(7));
      Assertions.assertEquals("7 - 9 = -2", linhasResposta.get(8));
      Assertions.assertEquals("7 - 10 = -3", linhasResposta.get(9));
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() {

      Locale.setDefault(new Locale("pt", "BR"));

      String input = "";

      input += "4" + System.lineSeparator();
      input += "15" + System.lineSeparator();

      ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
      System.setIn(bais);

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Ex2Tabuada.main(null);

      String[] lines = baos.toString().split(System.lineSeparator());

      List<String> linhasResposta = Arrays.stream(lines).skip(2).toList();

      Assertions.assertEquals(10, linhasResposta.size());
      Assertions.assertEquals("15 - 1 = 14", linhasResposta.get(0));
      Assertions.assertEquals("15 - 2 = 13", linhasResposta.get(1));
      Assertions.assertEquals("15 - 3 = 12", linhasResposta.get(2));
      Assertions.assertEquals("15 - 4 = 11", linhasResposta.get(3));
      Assertions.assertEquals("15 - 5 = 10", linhasResposta.get(4));
      Assertions.assertEquals("15 - 6 = 9", linhasResposta.get(5));
      Assertions.assertEquals("15 - 7 = 8", linhasResposta.get(6));
      Assertions.assertEquals("15 - 8 = 7", linhasResposta.get(7));
      Assertions.assertEquals("15 - 9 = 6", linhasResposta.get(8));
      Assertions.assertEquals("15 - 10 = 5", linhasResposta.get(9));
    }
  }

  @Nested
  @DisplayName("Potenciação")
  public class Potenciacao {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() {

      Locale.setDefault(new Locale("pt", "BR"));

      String input = "";

      input += "5" + System.lineSeparator();
      input += "2" + System.lineSeparator();

      ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
      System.setIn(bais);

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Ex2Tabuada.main(null);

      String[] lines = baos.toString().split(System.lineSeparator());

      List<String> linhasResposta = Arrays.stream(lines).skip(2).toList();

      Assertions.assertEquals(10, linhasResposta.size());
      Assertions.assertEquals("2 ^ 1 = 2", linhasResposta.get(0));
      Assertions.assertEquals("2 ^ 2 = 4", linhasResposta.get(1));
      Assertions.assertEquals("2 ^ 3 = 8", linhasResposta.get(2));
      Assertions.assertEquals("2 ^ 4 = 16", linhasResposta.get(3));
      Assertions.assertEquals("2 ^ 5 = 32", linhasResposta.get(4));
      Assertions.assertEquals("2 ^ 6 = 64", linhasResposta.get(5));
      Assertions.assertEquals("2 ^ 7 = 128", linhasResposta.get(6));
      Assertions.assertEquals("2 ^ 8 = 256", linhasResposta.get(7));
      Assertions.assertEquals("2 ^ 9 = 512", linhasResposta.get(8));
      Assertions.assertEquals("2 ^ 10 = 1024", linhasResposta.get(9));
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() {

      Locale.setDefault(new Locale("pt", "BR"));

      String input = "";

      input += "5" + System.lineSeparator();
      input += "3" + System.lineSeparator();

      ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
      System.setIn(bais);

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Ex2Tabuada.main(null);

      String[] lines = baos.toString().split(System.lineSeparator());

      List<String> linhasResposta = Arrays.stream(lines).skip(2).toList();

      Assertions.assertEquals(10, linhasResposta.size());
      Assertions.assertEquals("3 ^ 1 = 3", linhasResposta.get(0));
      Assertions.assertEquals("3 ^ 2 = 9", linhasResposta.get(1));
      Assertions.assertEquals("3 ^ 3 = 27", linhasResposta.get(2));
      Assertions.assertEquals("3 ^ 4 = 81", linhasResposta.get(3));
      Assertions.assertEquals("3 ^ 5 = 243", linhasResposta.get(4));
      Assertions.assertEquals("3 ^ 6 = 729", linhasResposta.get(5));
      Assertions.assertEquals("3 ^ 7 = 2187", linhasResposta.get(6));
      Assertions.assertEquals("3 ^ 8 = 6561", linhasResposta.get(7));
      Assertions.assertEquals("3 ^ 9 = 19683", linhasResposta.get(8));
      Assertions.assertEquals("3 ^ 10 = 59049", linhasResposta.get(9));
    }
  }

  @Nested
  @DisplayName("Resto da divisão")
  public class RestoDaDivisao {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() {

      Locale.setDefault(new Locale("pt", "BR"));

      String input = "";

      input += "6" + System.lineSeparator();
      input += "10" + System.lineSeparator();

      ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
      System.setIn(bais);

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Ex2Tabuada.main(null);

      String[] lines = baos.toString().split(System.lineSeparator());

      List<String> linhasResposta = Arrays.stream(lines).skip(2).toList();

      Assertions.assertEquals(10, linhasResposta.size());
      Assertions.assertEquals("10 % 1 = 0", linhasResposta.get(0));
      Assertions.assertEquals("10 % 2 = 0", linhasResposta.get(1));
      Assertions.assertEquals("10 % 3 = 1", linhasResposta.get(2));
      Assertions.assertEquals("10 % 4 = 2", linhasResposta.get(3));
      Assertions.assertEquals("10 % 5 = 0", linhasResposta.get(4));
      Assertions.assertEquals("10 % 6 = 4", linhasResposta.get(5));
      Assertions.assertEquals("10 % 7 = 3", linhasResposta.get(6));
      Assertions.assertEquals("10 % 8 = 2", linhasResposta.get(7));
      Assertions.assertEquals("10 % 9 = 1", linhasResposta.get(8));
      Assertions.assertEquals("10 % 10 = 0", linhasResposta.get(9));
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() {

      Locale.setDefault(new Locale("pt", "BR"));

      String input = "";

      input += "6" + System.lineSeparator();
      input += "5" + System.lineSeparator();

      ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
      System.setIn(bais);

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Ex2Tabuada.main(null);

      String[] lines = baos.toString().split(System.lineSeparator());

      List<String> linhasResposta = Arrays.stream(lines).skip(2).toList();

      Assertions.assertEquals(10, linhasResposta.size());
      Assertions.assertEquals("5 % 1 = 0", linhasResposta.get(0));
      Assertions.assertEquals("5 % 2 = 1", linhasResposta.get(1));
      Assertions.assertEquals("5 % 3 = 2", linhasResposta.get(2));
      Assertions.assertEquals("5 % 4 = 1", linhasResposta.get(3));
      Assertions.assertEquals("5 % 5 = 0", linhasResposta.get(4));
      Assertions.assertEquals("5 % 6 = 5", linhasResposta.get(5));
      Assertions.assertEquals("5 % 7 = 5", linhasResposta.get(6));
      Assertions.assertEquals("5 % 8 = 5", linhasResposta.get(7));
      Assertions.assertEquals("5 % 9 = 5", linhasResposta.get(8));
      Assertions.assertEquals("5 % 10 = 5", linhasResposta.get(9));
    }
  }
}
