package school.sptech.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Locale;

@DisplayName("Exercício 3 - Idade")
public class Ex3IdadeMetodosTests {

  @Nested
  @DisplayName("Método - classificaIdade")
  class MetodoClassificaIdade {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex3IdadeMetodos.class;
      Method metodo = clazz.getDeclaredMethod("classificaIdade", Integer.class);

      Object obj = new Ex3IdadeMetodos();
      metodo.invoke(obj, 8);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("Criança", saidaRecebida);
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex3IdadeMetodos.class;
      Method metodo = clazz.getDeclaredMethod("classificaIdade", Integer.class);

      Object obj = new Ex3IdadeMetodos();
      metodo.invoke(obj, 1);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("Bebê", saidaRecebida);
    }

    @Test
    @DisplayName("Cenário 3")
    void cenario3() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex3IdadeMetodos.class;
      Method metodo = clazz.getDeclaredMethod("classificaIdade", Integer.class);

      Object obj = new Ex3IdadeMetodos();
      metodo.invoke(obj, 78);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("Idoso", saidaRecebida);
    }

    @Test
    @DisplayName("Cenário 4")
    void cenario4() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex3IdadeMetodos.class;
      Method metodo = clazz.getDeclaredMethod("classificaIdade", Integer.class);

      Object obj = new Ex3IdadeMetodos();
      metodo.invoke(obj, 42);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("Adulto", saidaRecebida);
    }

    @Test
    @DisplayName("Cenário 5")
    void cenario5() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex3IdadeMetodos.class;
      Method metodo = clazz.getDeclaredMethod("classificaIdade", Integer.class);

      Object obj = new Ex3IdadeMetodos();
      metodo.invoke(obj, 18);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("Adolescente", saidaRecebida);
    }

    @Test
    @DisplayName("Cenário 6")
    void cenario6() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex3IdadeMetodos.class;
      Method metodo = clazz.getDeclaredMethod("classificaIdade", Integer.class);

      Object obj = new Ex3IdadeMetodos();
      metodo.invoke(obj, 25);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("Jovem", saidaRecebida);
    }
  }
}
