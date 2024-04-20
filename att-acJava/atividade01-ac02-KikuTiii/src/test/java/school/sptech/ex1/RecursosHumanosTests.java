package school.sptech.ex1;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

@DisplayName("Atividade 1 - Recursos Humanos (RecursosHumanos)")
public class RecursosHumanosTests {

  @Nested
  @DisplayName("1. Atributos")
  class AtributosTests {

    @Test
    @DisplayName("Validar Atributos")
    void cenario1() {
      Class<RecursosHumanos> clazz = RecursosHumanos.class;

      Assertions.assertAll(
          () -> Assertions.assertDoesNotThrow(() -> clazz.getDeclaredField("totalPromovidos")),
          () -> Assertions.assertDoesNotThrow(() -> clazz.getDeclaredField("totalReajustados"))
      );
    }
  }

  @Nested
  @DisplayName("2. Métodos")
  class MetodosTests {

    @Test
    @DisplayName("Validar métodos")
    void validarMetodos() {
      Class<RecursosHumanos> clazz = RecursosHumanos.class;

      Assertions.assertAll(
          () -> Assertions.assertDoesNotThrow(() ->
              clazz.getDeclaredMethod("reajustarSalario", Colaborador.class, Double.class)),
          () -> Assertions.assertDoesNotThrow(() ->
              clazz.getDeclaredMethod("promover", Colaborador.class, String.class, Double.class))
      );
    }
  }

  @Nested
  @DisplayName("3. Encapsulamento")
  class EncapsulamentoTests {

    @Test
    @DisplayName("Atributos Privados")
    void cenario1() {
      Class<RecursosHumanos> clazz = RecursosHumanos.class;
      Field[] campos = clazz.getDeclaredFields();

      Stream<Executable> validacoes = Arrays.stream(campos)
          .map((campo) -> () -> Assertions.assertTrue(Modifier.isPrivate(campo.getModifiers())));

      Assertions.assertAll(validacoes);
    }

    @Test
    @DisplayName("Métodos públicos")
    void cenario2() throws ReflectiveOperationException {
      Class<RecursosHumanos> clazz = RecursosHumanos.class;
      Method metodoReajustarSalario = clazz.getDeclaredMethod("reajustarSalario", Colaborador.class, Double.class);
      Method metodoPromover = clazz.getDeclaredMethod("promover", Colaborador.class, String.class, Double.class);

      Assertions.assertAll(
          () -> Assertions.assertTrue(Modifier.isPublic(metodoReajustarSalario.getModifiers())),
          () -> Assertions.assertTrue(Modifier.isPublic(metodoPromover.getModifiers()))
      );
    }

    @Test
    @DisplayName("Atributos devem possuir getters e não possuir setters")
    void cenario3() {
      Class<RecursosHumanos> clazz = RecursosHumanos.class;
      Field[] campos = clazz.getDeclaredFields();

      Stream<Executable> validacoesGetter = Arrays.stream(campos)
          .map((campo) -> () -> {
            String getName = String.format("get%s", StringUtils.capitalize(campo.getName()));
            Method getter = clazz.getDeclaredMethod(getName);
            int getModifier = getter.getModifiers();
            Assertions.assertTrue(Modifier.isPublic(getModifier));
          });

      Stream<Executable> validacoesSetter = Arrays.stream(campos)
          .map((campo) -> () -> {
            String setName = String.format("set%s", StringUtils.capitalize(campo.getName()));
            Assertions.assertThrows(NoSuchMethodException.class, () -> clazz.getDeclaredMethod(setName, campo.getType()));
          });

      Assertions.assertAll(Stream.concat(validacoesGetter, validacoesSetter));
    }
  }

  @Nested
  @DisplayName("4. Método - reajustarSalario")
  class MetodoReajustarSalarioTests {

    Map<String, Field> campos() throws ReflectiveOperationException {
      Class<RecursosHumanos> clazz = RecursosHumanos.class;

      Field totalPromovidos = clazz.getDeclaredField("totalPromovidos");
      totalPromovidos.trySetAccessible();

      Field totalReajustados = clazz.getDeclaredField("totalReajustados");
      totalReajustados.trySetAccessible();

      return Map.of("totalPromovidos", totalPromovidos, "totalReajustados", totalReajustados);
    }

    Map<String, Field> camposColaborador() throws ReflectiveOperationException {
      Class<Colaborador> clazz = Colaborador.class;

      Field nome = clazz.getDeclaredField("nome");
      nome.trySetAccessible();

      Field cargo = clazz.getDeclaredField("cargo");
      cargo.trySetAccessible();

      Field salario = clazz.getDeclaredField("salario");
      salario.trySetAccessible();

      return Map.of("nome", nome, "cargo", cargo, "salario", salario);
    }

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {
      Class<RecursosHumanos> clazzRecursosHumanos = RecursosHumanos.class;
      Method metodo = clazzRecursosHumanos.getDeclaredMethod("reajustarSalario", Colaborador.class, Double.class);

      Object obj = new RecursosHumanos();
      Colaborador colaborador = new Colaborador();

      // Case
      camposColaborador().get("nome").set(colaborador, "Vitor");
      camposColaborador().get("cargo").set(colaborador, "Desenvolvedor Junior");
      camposColaborador().get("salario").set(colaborador, 4_000.0);

      campos().get("totalPromovidos").set(obj, 0);
      campos().get("totalReajustados").set(obj, 0);

      // When
      metodo.invoke(obj, colaborador, 15.0);

      // Then
      Assertions.assertAll(
          () -> Assertions.assertEquals(4600.0, camposColaborador().get("salario").get(colaborador)),
          () -> Assertions.assertEquals(1, campos().get("totalReajustados").get(obj))
      );
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {
      Class<RecursosHumanos> clazzRecursosHumanos = RecursosHumanos.class;
      Method metodo = clazzRecursosHumanos.getDeclaredMethod("reajustarSalario", Colaborador.class, Double.class);

      Object obj = new RecursosHumanos();
      Colaborador colaborador = new Colaborador();

      // Case
      camposColaborador().get("nome").set(colaborador, "Isabella");
      camposColaborador().get("cargo").set(colaborador, "Analista de Qualidade");
      camposColaborador().get("salario").set(colaborador, 8_500.0);

      campos().get("totalPromovidos").set(obj, 99);
      campos().get("totalReajustados").set(obj, 41);

      // When
      metodo.invoke(obj, colaborador, 20.0);

      // Then
      Assertions.assertAll(
          () -> Assertions.assertEquals(10_200.0, camposColaborador().get("salario").get(colaborador)),
          () -> Assertions.assertEquals(42, campos().get("totalReajustados").get(obj))
      );
    }
  }

  @Nested
  @DisplayName("5. Método - promover")
  class MetodoPromoverTests {

    Map<String, Field> campos() throws ReflectiveOperationException {
      Class<RecursosHumanos> clazz = RecursosHumanos.class;

      Field totalPromovidos = clazz.getDeclaredField("totalPromovidos");
      totalPromovidos.trySetAccessible();

      Field totalReajustados = clazz.getDeclaredField("totalReajustados");
      totalReajustados.trySetAccessible();

      return Map.of("totalPromovidos", totalPromovidos, "totalReajustados", totalReajustados);
    }

    Map<String, Field> camposColaborador() throws ReflectiveOperationException {
      Class<Colaborador> clazz = Colaborador.class;

      Field nome = clazz.getDeclaredField("nome");
      nome.trySetAccessible();

      Field cargo = clazz.getDeclaredField("cargo");
      cargo.trySetAccessible();

      Field salario = clazz.getDeclaredField("salario");
      salario.trySetAccessible();

      return Map.of("nome", nome, "cargo", cargo, "salario", salario);
    }

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {
      Class<RecursosHumanos> clazzRecursosHumanos = RecursosHumanos.class;
      Method metodo = clazzRecursosHumanos.getDeclaredMethod("promover", Colaborador.class, String.class, Double.class);

      Object obj = new RecursosHumanos();
      Colaborador colaborador = new Colaborador();

      // Case
      camposColaborador().get("nome").set(colaborador, "Vitor");
      camposColaborador().get("cargo").set(colaborador, "Desenvolvedor Junior");
      camposColaborador().get("salario").set(colaborador, 4_000.0);

      campos().get("totalPromovidos").set(obj, 0);
      campos().get("totalReajustados").set(obj, 0);

      // When
      metodo.invoke(obj, colaborador, "Desenvolvedor Backend Pleno", 5_500.0);

      // Then
      Assertions.assertAll(
          () -> Assertions.assertEquals(5_500.0, camposColaborador().get("salario").get(colaborador)),
          () -> Assertions.assertEquals("Desenvolvedor Backend Pleno", camposColaborador().get("cargo").get(colaborador)),
          () -> Assertions.assertEquals(1, campos().get("totalPromovidos").get(obj))
      );
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {
      Class<RecursosHumanos> clazzRecursosHumanos = RecursosHumanos.class;
      Method metodo = clazzRecursosHumanos.getDeclaredMethod("promover", Colaborador.class, String.class, Double.class);

      Object obj = new RecursosHumanos();
      Colaborador colaborador = new Colaborador();

      // Case
      camposColaborador().get("nome").set(colaborador, "Isabella");
      camposColaborador().get("cargo").set(colaborador, "Analista de Qualidade");
      camposColaborador().get("salario").set(colaborador, 8_500.0);

      campos().get("totalPromovidos").set(obj, 99);
      campos().get("totalReajustados").set(obj, 41);

      // When
      metodo.invoke(obj, colaborador, "Gerente de Qualidade", 10_000.0);

      // Then
      Assertions.assertAll(
          () -> Assertions.assertEquals(10_000.0, camposColaborador().get("salario").get(colaborador)),
          () -> Assertions.assertEquals("Gerente de Qualidade", camposColaborador().get("cargo").get(colaborador)),
          () -> Assertions.assertEquals(100, campos().get("totalPromovidos").get(obj))
      );
    }

    @Test
    @DisplayName("Cenário 3 - Salário menor")
    void cenario3() throws ReflectiveOperationException {
      Class<RecursosHumanos> clazzRecursosHumanos = RecursosHumanos.class;
      Method metodo = clazzRecursosHumanos.getDeclaredMethod("promover", Colaborador.class, String.class, Double.class);

      Object obj = new RecursosHumanos();
      Colaborador colaborador = new Colaborador();

      // Case
      camposColaborador().get("nome").set(colaborador, "Isabella");
      camposColaborador().get("cargo").set(colaborador, "Analista de Qualidade");
      camposColaborador().get("salario").set(colaborador, 8_500.0);

      campos().get("totalPromovidos").set(obj, 99);
      campos().get("totalReajustados").set(obj, 41);

      // When
      metodo.invoke(obj, colaborador, "Gerente de Qualidade", 2.0);

      // Then
      Assertions.assertAll(
          () -> Assertions.assertEquals(8_500.0, camposColaborador().get("salario").get(colaborador)),
          () -> Assertions.assertEquals("Analista de Qualidade", camposColaborador().get("cargo").get(colaborador)),
          () -> Assertions.assertEquals(99, campos().get("totalPromovidos").get(obj))
      );
    }

    @Test
    @DisplayName("Cenário 4 - Salário igual")
    void cenario4() throws ReflectiveOperationException {
      Class<RecursosHumanos> clazzRecursosHumanos = RecursosHumanos.class;
      Method metodo = clazzRecursosHumanos.getDeclaredMethod("promover", Colaborador.class, String.class, Double.class);

      Object obj = new RecursosHumanos();
      Colaborador colaborador = new Colaborador();

      // Case
      camposColaborador().get("nome").set(colaborador, "Isabella");
      camposColaborador().get("cargo").set(colaborador, "Analista de Qualidade");
      camposColaborador().get("salario").set(colaborador, 8_500.0);

      campos().get("totalPromovidos").set(obj, 99);
      campos().get("totalReajustados").set(obj, 41);

      // When
      metodo.invoke(obj, colaborador, "Gerente de Qualidade", 8_500.0);

      // Then
      Assertions.assertAll(
          () -> Assertions.assertEquals(8_500.0, camposColaborador().get("salario").get(colaborador)),
          () -> Assertions.assertEquals("Gerente de Qualidade", camposColaborador().get("cargo").get(colaborador)),
          () -> Assertions.assertEquals(100, campos().get("totalPromovidos").get(obj))
      );
    }
  }
}
