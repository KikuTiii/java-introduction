package school.sptech;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.List;

@DisplayName("AC1 - Gestão de Loja - Métodos")
public class GestaoLojaTests {

  @Nested
  @DisplayName("Método - calcularTroco")
  class MetodoCalcularTroco {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {

      Class<GestaoLoja> clazz = GestaoLoja.class;
      Method metodo = clazz.getDeclaredMethod("calcularTroco", Double.class, Double.class);

      Object obj = new GestaoLoja();
      Object resposta = metodo.invoke(obj, 20.0, 25.0);

      Assertions.assertEquals(5.0, (Double) resposta, 0.01);
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {

      Class<GestaoLoja> clazz = GestaoLoja.class;
      Method metodo = clazz.getDeclaredMethod("calcularTroco", Double.class, Double.class);

      Object obj = new GestaoLoja();
      Object resposta = metodo.invoke(obj, 18.0, 50.0);

      Assertions.assertEquals(32.0, (Double) resposta, 0.01);
    }

    @Test
    @DisplayName("Cenário 3")
    void cenario3() throws ReflectiveOperationException {

      Class<GestaoLoja> clazz = GestaoLoja.class;
      Method metodo = clazz.getDeclaredMethod("calcularTroco", Double.class, Double.class);

      Object obj = new GestaoLoja();
      Object resposta = metodo.invoke(obj, 1990.0, 2000.0);

      Assertions.assertEquals(10.0, (Double) resposta, 0.01);
    }
  }

  @Nested
  @DisplayName("Método - calcularVendas")
  class MetodoCalcularVendas {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {

      Class<GestaoLoja> clazz = GestaoLoja.class;
      Method metodo = clazz.getDeclaredMethod("calcularVendas", List.class);

      Object obj = new GestaoLoja();
      Object resposta = metodo.invoke(obj, List.of(30.0, 10.0, 60.0, 42.0));

      Assertions.assertEquals(142.0, (Double) resposta, 0.01);
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {

      Class<GestaoLoja> clazz = GestaoLoja.class;
      Method metodo = clazz.getDeclaredMethod("calcularVendas", List.class);

      Object obj = new GestaoLoja();
      Object resposta = metodo.invoke(obj, List.of(1000.0, 250.0, 50.0, 42.0));

      Assertions.assertEquals(1342.0, (Double) resposta, 0.01);
    }

    @Test
    @DisplayName("Cenário 3")
    void cenario3() throws ReflectiveOperationException {

      Class<GestaoLoja> clazz = GestaoLoja.class;
      Method metodo = clazz.getDeclaredMethod("calcularVendas", List.class);

      Object obj = new GestaoLoja();
      Object resposta = metodo.invoke(obj, List.of(1.50, 2.0, 4.0, 5.0));

      Assertions.assertEquals(12.5, (Double) resposta, 0.01);
    }
  }

  @Nested
  @DisplayName("Método - buscarMenorVenda")
  class MetodoBuscarMenorVenda {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {

      Class<GestaoLoja> clazz = GestaoLoja.class;
      Method metodo = clazz.getDeclaredMethod("buscarMenorVenda", List.class);

      Object obj = new GestaoLoja();
      Object resposta = metodo.invoke(obj, List.of(1.50, 2.0, 4.0, 5.0));

      Assertions.assertEquals(1.5, (Double) resposta, 0.01);
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {

      Class<GestaoLoja> clazz = GestaoLoja.class;
      Method metodo = clazz.getDeclaredMethod("buscarMenorVenda", List.class);

      Object obj = new GestaoLoja();
      Object resposta = metodo.invoke(obj, List.of(99999.9, 29323.0, 1212.0, 3787438.0));

      Assertions.assertEquals(1212.0, (Double) resposta, 0.01);
    }

    @Test
    @DisplayName("Cenário 3")
    void cenario3() throws ReflectiveOperationException {

      Class<GestaoLoja> clazz = GestaoLoja.class;
      Method metodo = clazz.getDeclaredMethod("buscarMenorVenda", List.class);

      Object obj = new GestaoLoja();
      Object resposta = metodo.invoke(obj, List.of(1.8, 1.1, 1.2, 1.3));

      Assertions.assertEquals(1.1, (Double) resposta, 0.01);
    }
  }

  @Nested
  @DisplayName("Método - verificarFuncionario")
  class MetodoVerificarFuncionario {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {

      Class<GestaoLoja> clazz = GestaoLoja.class;
      Method metodo = clazz.getDeclaredMethod("verificarFuncionario", List.class, String.class);

      Object obj = new GestaoLoja();
      Object resposta = metodo.invoke(obj, List.of("Diego", "wIllIam", "Manoel", "Giuliana"), "william");

      Assertions.assertEquals(true, resposta);
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {

      Class<GestaoLoja> clazz = GestaoLoja.class;
      Method metodo = clazz.getDeclaredMethod("verificarFuncionario", List.class, String.class);

      Object obj = new GestaoLoja();
      Object resposta = metodo.invoke(obj, List.of("Diego", "wIllIam", "Manoel", "Giuliana"), "Paulo");

      Assertions.assertEquals(false, resposta);
    }

    @Test
    @DisplayName("Cenário 3")
    void cenario3() throws ReflectiveOperationException {

      Class<GestaoLoja> clazz = GestaoLoja.class;
      Method metodo = clazz.getDeclaredMethod("verificarFuncionario", List.class, String.class);

      Object obj = new GestaoLoja();
      Object resposta = metodo.invoke(obj, List.of("Diego", "wIllIam", "Manoel", "Giuliana"), "Diego");

      Assertions.assertEquals(true, resposta);
    }

    @Test
    @DisplayName("Cenário 4")
    void cenario4() throws ReflectiveOperationException {

      Class<GestaoLoja> clazz = GestaoLoja.class;
      Method metodo = clazz.getDeclaredMethod("verificarFuncionario", List.class, String.class);

      Object obj = new GestaoLoja();
      Object resposta = metodo.invoke(obj, List.of("Diego", "wIllIam", "Manoel", "Giuliana"), "rafael");

      Assertions.assertEquals(false, resposta);
    }

    @Test
    @DisplayName("Cenário 5")
    void cenario5() throws ReflectiveOperationException {

      Class<GestaoLoja> clazz = GestaoLoja.class;
      Method metodo = clazz.getDeclaredMethod("verificarFuncionario", List.class, String.class);

      Object obj = new GestaoLoja();
      Object resposta = metodo.invoke(obj, List.of("Diego", "wIllIam", "Manoel", "Giuliana"), "dIeGO");

      Assertions.assertEquals(true, resposta);
    }
  }
}
