package school.sptech.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

@DisplayName("Exercício 1 - Classe Social - Métodos")
public class Ex1ClasseSocialMetodosTests {

  @Nested
  @DisplayName("Método - calcularQtdSalariosMinimos")
  public class MetodoCalcularSalariosMinimos {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {

      Class<?> clazz = Ex1ClasseSocialMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularQtdSalariosMinimos", Double.class);

      Object obj = new Ex1ClasseSocialMetodos();
      Object resposta = metodo.invoke(obj,2090.00);

      Assertions.assertEquals(2.0, (Double) resposta, 0.01);
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {

      Class<?> clazz = Ex1ClasseSocialMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularQtdSalariosMinimos", Double.class);

      Object obj = new Ex1ClasseSocialMetodos();
      Object resposta = metodo.invoke(obj,1045.0);

      Assertions.assertEquals(1.0, (Double) resposta, 0.01);
    }

    @Test
    @DisplayName("Cenário 3")
    void cenario3() throws ReflectiveOperationException {

      Class<?> clazz = Ex1ClasseSocialMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularQtdSalariosMinimos", Double.class);

      Object obj = new Ex1ClasseSocialMetodos();
      Object resposta = metodo.invoke(obj,15675.0);

      Assertions.assertEquals(15.0, (Double) resposta, 0.01);
    }

    @Test
    @DisplayName("Cenário 4")
    void cenario4() throws ReflectiveOperationException {

      Class<?> clazz = Ex1ClasseSocialMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularQtdSalariosMinimos", Double.class);

      Object obj = new Ex1ClasseSocialMetodos();
      Object resposta = metodo.invoke(obj,33440.0);

      Assertions.assertEquals(32.0, (Double) resposta, 0.01);
    }

    @Test
    @DisplayName("Cenário 5")
    void cenario5() throws ReflectiveOperationException {

      Class<?> clazz = Ex1ClasseSocialMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularQtdSalariosMinimos", Double.class);

      Object obj = new Ex1ClasseSocialMetodos();
      Object resposta = metodo.invoke(obj,17242.5);

      Assertions.assertEquals(16.5, (Double) resposta, 0.01);
    }
  }

  @Nested
  @DisplayName("Método - classeSocial")
  public class MetodoClasseSocial {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {

      Class<?> clazz = Ex1ClasseSocialMetodos.class;
      Method metodo = clazz.getDeclaredMethod("classeSocial", Double.class);

      Object obj = new Ex1ClasseSocialMetodos();
      Object resposta = metodo.invoke(obj, 2.0);

      Assertions.assertEquals("E", resposta);
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {

      Class<?> clazz = Ex1ClasseSocialMetodos.class;
      Method metodo = clazz.getDeclaredMethod("classeSocial", Double.class);

      Object obj = new Ex1ClasseSocialMetodos();
      Object resposta = metodo.invoke(obj, 25.0);

      Assertions.assertEquals("A", resposta);
    }

    @Test
    @DisplayName("Cenário 3")
    void cenario3() throws ReflectiveOperationException {

      Class<?> clazz = Ex1ClasseSocialMetodos.class;
      Method metodo = clazz.getDeclaredMethod("classeSocial", Double.class);

      Object obj = new Ex1ClasseSocialMetodos();
      Object resposta = metodo.invoke(obj, 8.3);

      Assertions.assertEquals("C", resposta);
    }

    @Test
    @DisplayName("Cenário 4")
    void cenario4() throws ReflectiveOperationException {

      Class<?> clazz = Ex1ClasseSocialMetodos.class;
      Method metodo = clazz.getDeclaredMethod("classeSocial", Double.class);

      Object obj = new Ex1ClasseSocialMetodos();
      Object resposta = metodo.invoke(obj, 4.0);

      Assertions.assertEquals("D", resposta);
    }

    @Test
    @DisplayName("Cenário 5")
    void cenario5() throws ReflectiveOperationException {

      Class<?> clazz = Ex1ClasseSocialMetodos.class;
      Method metodo = clazz.getDeclaredMethod("classeSocial", Double.class);

      Object obj = new Ex1ClasseSocialMetodos();
      Object resposta = metodo.invoke(obj, 20.0);

      Assertions.assertEquals("B", resposta);
    }
  }
}
