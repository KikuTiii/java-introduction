package school.sptech.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

@DisplayName("Exercício 2 - Cálculo Alunos")
public class Ex2CalculoAlunoMetodosTests {

  @Nested
  @DisplayName("Método - calcularMedia")
  class MetodoCalcularMedia {

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {

      Class<?> clazz = Ex2CalculoAlunoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularMedia", Double.class, Double.class);

      Object obj = new Ex2CalculoAlunoMetodos();
      Object resposta = metodo.invoke(obj, 8.5, 10.0);

      Assertions.assertEquals(9.4, (Double) resposta, 0.001);
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {

      Class<?> clazz = Ex2CalculoAlunoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularMedia", Double.class, Double.class);

      Object obj = new Ex2CalculoAlunoMetodos();
      Object resposta = metodo.invoke(obj, 8.0, 7.5);

      Assertions.assertEquals(7.7, (Double) resposta, 0.001);
    }

    @Test
    @DisplayName("Cenário 3")
    void cenario3() throws ReflectiveOperationException {

      Class<?> clazz = Ex2CalculoAlunoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularMedia", Double.class, Double.class);

      Object obj = new Ex2CalculoAlunoMetodos();
      Object resposta = metodo.invoke(obj, 4.5, 7.0);

      Assertions.assertEquals(6.0, (Double) resposta, 0.001);
    }

    @Test
    @DisplayName("Cenário 4")
    void cenario4() throws ReflectiveOperationException {

      Class<?> clazz = Ex2CalculoAlunoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularMedia", Double.class, Double.class);

      Object obj = new Ex2CalculoAlunoMetodos();
      Object resposta = metodo.invoke(obj, 7.5, 4.0);

      Assertions.assertEquals(5.4, (Double) resposta, 0.001);
    }

    @Test
    @DisplayName("Cenário 5")
    void cenario5() throws ReflectiveOperationException {

      Class<?> clazz = Ex2CalculoAlunoMetodos.class;
      Method metodo = clazz.getDeclaredMethod("calcularMedia", Double.class, Double.class);

      Object obj = new Ex2CalculoAlunoMetodos();
      Object resposta = metodo.invoke(obj, 10.0, 9.9);

      Assertions.assertEquals(9.94, (Double) resposta, 0.001);
    }
  }
}
