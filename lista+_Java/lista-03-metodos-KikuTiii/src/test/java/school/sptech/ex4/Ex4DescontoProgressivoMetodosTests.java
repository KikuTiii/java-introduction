package school.sptech.ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@DisplayName("Exercício 4 - Desconto Progressivo")
public class Ex4DescontoProgressivoMetodosTests {

  @Nested
  @DisplayName("Método - calcularDesconto")
  class MetodoCalcularDesconto {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {

      Class<?> clazz = Ex4DescontoProgressivoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularDesconto", Double.class, Integer.class);

      Object obj = new Ex4DescontoProgressivoMetodos();
      Object resposta = metodo.invoke(obj, 20.0, 2);

      Assertions.assertEquals(16.0, (Double) resposta, 0.001);
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {

      Class<?> clazz = Ex4DescontoProgressivoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularDesconto", Double.class, Integer.class);

      Object obj = new Ex4DescontoProgressivoMetodos();
      Object resposta = metodo.invoke(obj, 50.0, 1);

      Assertions.assertEquals(45.0, (Double) resposta, 0.001);
    }

    @Test
    @DisplayName("Cenário 3")
    void cenario3() throws ReflectiveOperationException {

      Class<?> clazz = Ex4DescontoProgressivoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularDesconto", Double.class, Integer.class);

      Object obj = new Ex4DescontoProgressivoMetodos();
      Object resposta = metodo.invoke(obj, 100.0, 3);

      Assertions.assertEquals(70.0, (Double) resposta, 0.001);
    }

    @Test
    @DisplayName("Cenário 4")
    void cenario4() throws ReflectiveOperationException {

      Class<?> clazz = Ex4DescontoProgressivoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularDesconto", Double.class, Integer.class);

      Object obj = new Ex4DescontoProgressivoMetodos();
      Object resposta = metodo.invoke(obj, 45.0, 6);

      Assertions.assertEquals(31.499, (Double) resposta, 0.001);
    }

    @Test
    @DisplayName("Cenário 5")
    void cenario5() throws ReflectiveOperationException {

      Class<?> clazz = Ex4DescontoProgressivoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularDesconto", Double.class, Integer.class);

      Object obj = new Ex4DescontoProgressivoMetodos();
      Object resposta = metodo.invoke(obj, 2580.0, 1);

      Assertions.assertEquals(2322.0, (Double) resposta, 0.001);
    }
  }

  /*
  @Nested
  @DisplayName("Método - exibirNotaFiscal")
  class MetodoExibirNotaFiscal {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex4DescontoProgressivoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("exibirNotaFiscal", Double.class, Integer.class, Double.class);

      Object obj = new Ex4DescontoProgressivoMetodos();
      metodo.invoke(obj, 20.0, 2, 16.0);

      String[] lines = baos.toString().split(System.lineSeparator());
      List<String> linhasResposta = Arrays.stream(lines)
          .filter(item -> !(item.startsWith("-") && item.endsWith("-")))
          .toList();

      Assertions.assertEquals(3, linhasResposta.size(), "Saída deve conter 3 linhas de informações");
      Assertions.assertEquals("Valor do produto: R$20,00", linhasResposta.get(0));
      Assertions.assertEquals("Quantidade: 2", linhasResposta.get(1));
      Assertions.assertEquals("Valor com desconto: R$16,00", linhasResposta.get(2));
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex4DescontoProgressivoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("exibirNotaFiscal", Double.class, Integer.class, Double.class);

      Object obj = new Ex4DescontoProgressivoMetodos();
      metodo.invoke(obj, 50.0, 1, 45.0);

      String[] lines = baos.toString().split(System.lineSeparator());
      List<String> linhasResposta = Arrays.stream(lines)
          .filter(item -> !(item.startsWith("-") && item.endsWith("-")))
          .toList();

      Assertions.assertEquals(3, linhasResposta.size(), "Saída deve conter 3 linhas de informações");
      Assertions.assertEquals("Valor do produto: R$50,00", linhasResposta.get(0));
      Assertions.assertEquals("Quantidade: 1", linhasResposta.get(1));
      Assertions.assertEquals("Valor com desconto: R$45,00", linhasResposta.get(2));
    }

    @Test
    @DisplayName("Cenário 3")
    void cenario3() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex4DescontoProgressivoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("exibirNotaFiscal", Double.class, Integer.class, Double.class);

      Object obj = new Ex4DescontoProgressivoMetodos();
      metodo.invoke(obj, 100.0, 3, 70.0);

      String[] lines = baos.toString().split(System.lineSeparator());
      List<String> linhasResposta = Arrays.stream(lines)
          .filter(item -> !(item.startsWith("-") && item.endsWith("-")))
          .toList();

      Assertions.assertEquals(3, linhasResposta.size(), "Saída deve conter 3 linhas de informações");
      Assertions.assertEquals("Valor do produto: R$100,00", linhasResposta.get(0));
      Assertions.assertEquals("Quantidade: 3", linhasResposta.get(1));
      Assertions.assertEquals("Valor com desconto: R$70,00", linhasResposta.get(2));
    }

    @Test
    @DisplayName("Cenário 4")
    void cenario4() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex4DescontoProgressivoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("exibirNotaFiscal", Double.class, Integer.class, Double.class);

      Object obj = new Ex4DescontoProgressivoMetodos();
      metodo.invoke(obj, 45.0, 6, 31.4999999);

      String[] lines = baos.toString().split(System.lineSeparator());
      List<String> linhasResposta = Arrays.stream(lines)
          .filter(item -> !(item.startsWith("-") && item.endsWith("-")))
          .toList();

      Assertions.assertEquals(3, linhasResposta.size(), "Saída deve conter 3 linhas de informações");
      Assertions.assertEquals("Valor do produto: R$45,00", linhasResposta.get(0));
      Assertions.assertEquals("Quantidade: 6", linhasResposta.get(1));
      Assertions.assertEquals("Valor com desconto: R$31,50", linhasResposta.get(2));
    }

    @Test
    @DisplayName("Cenário 5")
    void cenario5() throws ReflectiveOperationException {

      Locale.setDefault(new Locale("pt", "BR"));

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream printStream = new PrintStream(baos);
      System.setOut(printStream);

      Class<?> clazz = Ex4DescontoProgressivoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("exibirNotaFiscal", Double.class, Integer.class, Double.class);

      Object obj = new Ex4DescontoProgressivoMetodos();
      metodo.invoke(obj, 2580.0, 1, 2322.0);

      String[] lines = baos.toString().split(System.lineSeparator());
      List<String> linhasResposta = Arrays.stream(lines)
          .filter(item -> !(item.startsWith("-") && item.endsWith("-")))
          .toList();

      Assertions.assertEquals(3, linhasResposta.size(), "Saída deve conter 3 linhas de informações");
      Assertions.assertEquals("Valor do produto: R$2580,00", linhasResposta.get(0));
      Assertions.assertEquals("Quantidade: 1", linhasResposta.get(1));
      Assertions.assertEquals("Valor com desconto: R$2322,00", linhasResposta.get(2));
    }
  }
  */
}
