package school.sptech.ex5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Locale;

@DisplayName("Exercício 5 - Calculo Nutrição")
public class Ex5CalculoNutricaoMetodosTests {

  @Nested
  @DisplayName("Método - calculaIMC")
  class MetodoCalculaImc {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex5CalculoNutricaoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calculaIMC", Double.class, Double.class);

      Object obj = new Ex5CalculoNutricaoMetodos();
      metodo.invoke(obj, 70.0, 1.80);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("O IMC é 21,60", saidaRecebida);
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex5CalculoNutricaoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calculaIMC", Double.class, Double.class);

      Object obj = new Ex5CalculoNutricaoMetodos();
      metodo.invoke(obj, 62.0, 1.69);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("O IMC é 21,71", saidaRecebida);
    }

    @Test
    @DisplayName("Cenário 3")
    void cenario3() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex5CalculoNutricaoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calculaIMC", Double.class, Double.class);

      Object obj = new Ex5CalculoNutricaoMetodos();
      metodo.invoke(obj, 57.0, 1.55);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("O IMC é 23,73", saidaRecebida);
    }

    @Test
    @DisplayName("Cenário 4")
    void cenario4() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex5CalculoNutricaoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calculaIMC", Double.class, Double.class);

      Object obj = new Ex5CalculoNutricaoMetodos();
      metodo.invoke(obj, 89.0, 1.85);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("O IMC é 26,00", saidaRecebida);
    }

    @Test
    @DisplayName("Cenário 5")
    void cenario5() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex5CalculoNutricaoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calculaIMC", Double.class, Double.class);

      Object obj = new Ex5CalculoNutricaoMetodos();
      metodo.invoke(obj, 105.0, 2.04);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("O IMC é 25,23", saidaRecebida);
    }
  }
}
