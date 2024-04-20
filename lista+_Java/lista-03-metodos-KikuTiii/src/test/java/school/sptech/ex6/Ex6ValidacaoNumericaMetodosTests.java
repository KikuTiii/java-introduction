package school.sptech.ex6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Locale;

@DisplayName("Exercício 6 - Validação Numérica")
public class Ex6ValidacaoNumericaMetodosTests {

  @Nested
  @DisplayName("Método - verificarPrimo")
  class MetodoVerificarPrimo {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex6ValidacaoNumericaMetodos.class;
      Method metodo = clazz.getDeclaredMethod("verificarPrimo", Integer.class);

      Object obj = new Ex6ValidacaoNumericaMetodos();
      metodo.invoke(obj, 2);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("É primo", saidaRecebida);
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex6ValidacaoNumericaMetodos.class;
      Method metodo = clazz.getDeclaredMethod("verificarPrimo", Integer.class);

      Object obj = new Ex6ValidacaoNumericaMetodos();
      metodo.invoke(obj, 11);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("É primo", saidaRecebida);
    }

    @Test
    @DisplayName("Cenário 3")
    void cenario3() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex6ValidacaoNumericaMetodos.class;
      Method metodo = clazz.getDeclaredMethod("verificarPrimo", Integer.class);

      Object obj = new Ex6ValidacaoNumericaMetodos();
      metodo.invoke(obj, 10);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("Não é primo", saidaRecebida);
    }

    @Test
    @DisplayName("Cenário 4")
    void cenario4() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex6ValidacaoNumericaMetodos.class;
      Method metodo = clazz.getDeclaredMethod("verificarPrimo", Integer.class);

      Object obj = new Ex6ValidacaoNumericaMetodos();
      metodo.invoke(obj, 999);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("Não é primo", saidaRecebida);
    }

    @Test
    @DisplayName("Cenário 5")
    void cenario5() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex6ValidacaoNumericaMetodos.class;
      Method metodo = clazz.getDeclaredMethod("verificarPrimo", Integer.class);

      Object obj = new Ex6ValidacaoNumericaMetodos();
      metodo.invoke(obj, 967);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("É primo", saidaRecebida);
    }

    @Test
    @DisplayName("Cenário 6")
    void cenario6() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex6ValidacaoNumericaMetodos.class;
      Method metodo = clazz.getDeclaredMethod("verificarPrimo", Integer.class);

      Object obj = new Ex6ValidacaoNumericaMetodos();
      metodo.invoke(obj, 307);

      String[] lines = baos.toString().split(System.lineSeparator());
      String saidaRecebida = lines[lines.length-1];

      Assertions.assertEquals("É primo", saidaRecebida);
    }
  }
}
