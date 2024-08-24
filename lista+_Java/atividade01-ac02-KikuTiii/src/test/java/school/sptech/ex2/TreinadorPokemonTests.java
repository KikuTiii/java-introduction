package school.sptech.ex2;

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

@DisplayName("Atividade 2 - Pokémon (TreinadorPokemon)")
public class TreinadorPokemonTests {

  @Nested
  @DisplayName("1. Atributos")
  class AtributosTests {

    @Test
    @DisplayName("Validar Atributos")
    void cenario1() {
      Class<TreinadorPokemon> clazz = TreinadorPokemon.class;

      Assertions.assertAll(
          () -> Assertions.assertDoesNotThrow(() -> clazz.getDeclaredField("nome")),
          () -> Assertions.assertDoesNotThrow(() -> clazz.getDeclaredField("nivel"))
      );
    }
  }

  @Nested
  @DisplayName("2. Métodos")
  class MetodosTests {

    @Test
    @DisplayName("Validar métodos")
    void validarMetodos() {
      Class<TreinadorPokemon> clazz = TreinadorPokemon.class;

      Assertions.assertAll(
          () -> Assertions.assertDoesNotThrow(() ->
              clazz.getDeclaredMethod("treinarPokemon", Pokemon.class)),
          () -> Assertions.assertDoesNotThrow(() ->
              clazz.getDeclaredMethod("evoluirPokemon", Pokemon.class, String.class))
      );
    }
  }

  @Nested
  @DisplayName("3. Encapsulamento")
  class EncapsulamentoTests {

    @Test
    @DisplayName("Atributos Privados")
    void cenario1() {
      Class<TreinadorPokemon> clazz = TreinadorPokemon.class;
      Field[] campos = clazz.getDeclaredFields();

      Stream<Executable> validacoes = Arrays.stream(campos)
          .map((campo) -> () -> Assertions.assertTrue(Modifier.isPrivate(campo.getModifiers())));

      Assertions.assertAll(validacoes);
    }

    @Test
    @DisplayName("Métodos públicos")
    void cenario2() throws ReflectiveOperationException {
      Class<TreinadorPokemon> clazz = TreinadorPokemon.class;
      Method metodoTreinarPokemon = clazz.getDeclaredMethod("treinarPokemon", Pokemon.class);
      Method metodoEvoluirPokemon = clazz.getDeclaredMethod("evoluirPokemon", Pokemon.class, String.class);

      Assertions.assertAll(
          () -> Assertions.assertTrue(Modifier.isPublic(metodoTreinarPokemon.getModifiers())),
          () -> Assertions.assertTrue(Modifier.isPublic(metodoEvoluirPokemon.getModifiers()))
      );
    }

    @Test
    @DisplayName("Atributos devem possuir getters e setters")
    void cenario3() {
      Class<TreinadorPokemon> clazz = TreinadorPokemon.class;
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
            Method setter = clazz.getDeclaredMethod(setName, campo.getType());
            int setModifier = setter.getModifiers();
            Assertions.assertTrue(Modifier.isPublic(setModifier));
          });

      Assertions.assertAll(Stream.concat(validacoesGetter, validacoesSetter));
    }
  }

  @Nested
  @DisplayName("4. Método - treinarPokemon")
  class MetodoTreinarPokemonTests {

    Map<String, Field> campos() throws ReflectiveOperationException {
      Class<TreinadorPokemon> clazz = TreinadorPokemon.class;

      Field nome = clazz.getDeclaredField("nome");
      nome.trySetAccessible();

      Field nivel = clazz.getDeclaredField("nivel");
      nivel.trySetAccessible();

      return Map.of("nome", nome, "nivel", nivel);
    }

    Map<String, Field> camposPokemon() throws ReflectiveOperationException {
      Class<Pokemon> clazz = Pokemon.class;

      Field nome = clazz.getDeclaredField("nome");
      nome.trySetAccessible();

      Field tipo = clazz.getDeclaredField("tipo");
      tipo.trySetAccessible();

      Field forca = clazz.getDeclaredField("forca");
      forca.trySetAccessible();

      Field doces = clazz.getDeclaredField("doces");
      doces.trySetAccessible();

      return Map.of("nome", nome, "tipo", tipo, "forca", forca, "doces", doces);
    }

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {
      Class<TreinadorPokemon> clazzTreinadorPokemon = TreinadorPokemon.class;
      Method metodo = clazzTreinadorPokemon.getDeclaredMethod("treinarPokemon", Pokemon.class);

      Object obj = new TreinadorPokemon();
      Pokemon pokemon = new Pokemon();

      // Case
      camposPokemon().get("nome").set(pokemon, "Charmander");
      camposPokemon().get("tipo").set(pokemon, "Fogo");
      camposPokemon().get("forca").set(pokemon, 400.0);
      camposPokemon().get("doces").set(pokemon, 40);

      campos().get("nome").set(obj, "Paulo");
      campos().get("nivel").set(obj, 10.0);

      // When
      metodo.invoke(obj, pokemon);

      // Then
      Assertions.assertAll(
          () -> Assertions.assertEquals(440.0, (Double) camposPokemon().get("forca").get(pokemon), 0.01),
          () -> Assertions.assertEquals(50, camposPokemon().get("doces").get(pokemon))
      );
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {
      Class<TreinadorPokemon> clazzTreinadorPokemon = TreinadorPokemon.class;
      Method metodo = clazzTreinadorPokemon.getDeclaredMethod("treinarPokemon", Pokemon.class);

      Object obj = new TreinadorPokemon();
      Pokemon pokemon = new Pokemon();

      // Case
      camposPokemon().get("nome").set(pokemon, "Mudkip");
      camposPokemon().get("tipo").set(pokemon, "Água");
      camposPokemon().get("forca").set(pokemon, 750.0);
      camposPokemon().get("doces").set(pokemon, 90);

      campos().get("nome").set(obj, "Paulo");
      campos().get("nivel").set(obj, 10.0);

      // When
      metodo.invoke(obj, pokemon);

      // Then
      Assertions.assertAll(
          () -> Assertions.assertEquals(825.0, (Double) camposPokemon().get("forca").get(pokemon), 0.01),
          () -> Assertions.assertEquals(100, camposPokemon().get("doces").get(pokemon))
      );
    }
  }

  @Nested
  @DisplayName("5. Método - evoluirPokemon")
  class MetodoEvoluirPokemonTests {

    Map<String, Field> campos() throws ReflectiveOperationException {
      Class<TreinadorPokemon> clazz = TreinadorPokemon.class;

      Field nome = clazz.getDeclaredField("nome");
      nome.trySetAccessible();

      Field nivel = clazz.getDeclaredField("nivel");
      nivel.trySetAccessible();

      return Map.of("nome", nome, "nivel", nivel);
    }

    Map<String, Field> camposPokemon() throws ReflectiveOperationException {
      Class<Pokemon> clazz = Pokemon.class;

      Field nome = clazz.getDeclaredField("nome");
      nome.trySetAccessible();

      Field tipo = clazz.getDeclaredField("tipo");
      tipo.trySetAccessible();

      Field forca = clazz.getDeclaredField("forca");
      forca.trySetAccessible();

      Field doces = clazz.getDeclaredField("doces");
      doces.trySetAccessible();

      return Map.of("nome", nome, "tipo", tipo, "forca", forca, "doces", doces);
    }

    @Test
    @DisplayName("Cenário 1")
    void cenario1() throws ReflectiveOperationException {
      Class<TreinadorPokemon> clazzTreinadorPokemon = TreinadorPokemon.class;
      Method metodo = clazzTreinadorPokemon.getDeclaredMethod("evoluirPokemon", Pokemon.class, String.class);

      Object obj = new TreinadorPokemon();
      Pokemon pokemon = new Pokemon();

      // Case
      camposPokemon().get("nome").set(pokemon, "Charmander");
      camposPokemon().get("tipo").set(pokemon, "Fogo");
      camposPokemon().get("forca").set(pokemon, 400.0);
      camposPokemon().get("doces").set(pokemon, 90);

      campos().get("nome").set(obj, "Paulo");
      campos().get("nivel").set(obj, 10.0);

      // When
      metodo.invoke(obj, pokemon, "Charmeleon");

      // Then
      Assertions.assertAll(
          () -> Assertions.assertEquals("Charmeleon", camposPokemon().get("nome").get(pokemon)),
          () -> Assertions.assertEquals(40, camposPokemon().get("doces").get(pokemon)),
          () -> Assertions.assertEquals(20.0, (Double) campos().get("nivel").get(obj), 0.01)
      );
    }

    @Test
    @DisplayName("Cenário 2")
    void cenario2() throws ReflectiveOperationException {
      Class<TreinadorPokemon> clazzTreinadorPokemon = TreinadorPokemon.class;
      Method metodo = clazzTreinadorPokemon.getDeclaredMethod("evoluirPokemon", Pokemon.class, String.class);

      Object obj = new TreinadorPokemon();
      Pokemon pokemon = new Pokemon();

      // Case
      camposPokemon().get("nome").set(pokemon, "Mudkip");
      camposPokemon().get("tipo").set(pokemon, "Água");
      camposPokemon().get("forca").set(pokemon, 750.0);
      camposPokemon().get("doces").set(pokemon, 200);

      campos().get("nome").set(obj, "Paulo");
      campos().get("nivel").set(obj, 90.0);

      // When
      metodo.invoke(obj, pokemon, "Marshtomp");

      // Then
      Assertions.assertAll(
          () -> Assertions.assertEquals("Marshtomp", camposPokemon().get("nome").get(pokemon)),
          () -> Assertions.assertEquals(150, camposPokemon().get("doces").get(pokemon)),
          () -> Assertions.assertEquals(100.0, (Double) campos().get("nivel").get(obj), 0.01)
      );
    }

    @Test
    @DisplayName("Cenário 3")
    void cenario3() throws ReflectiveOperationException {
      Class<TreinadorPokemon> clazzTreinadorPokemon = TreinadorPokemon.class;
      Method metodo = clazzTreinadorPokemon.getDeclaredMethod("evoluirPokemon", Pokemon.class, String.class);

      Object obj = new TreinadorPokemon();
      Pokemon pokemon = new Pokemon();

      // Case
      camposPokemon().get("nome").set(pokemon, "Mudkip");
      camposPokemon().get("tipo").set(pokemon, "Água");
      camposPokemon().get("forca").set(pokemon, 750.0);
      camposPokemon().get("doces").set(pokemon, 40);

      campos().get("nome").set(obj, "Paulo");
      campos().get("nivel").set(obj, 90.0);

      // When
      metodo.invoke(obj, pokemon, "Marshtomp");

      // Then
      Assertions.assertAll(
          () -> Assertions.assertEquals("Mudkip", camposPokemon().get("nome").get(pokemon)),
          () -> Assertions.assertEquals(40, camposPokemon().get("doces").get(pokemon)),
          () -> Assertions.assertEquals(90.0, (Double) campos().get("nivel").get(obj), 0.01)
      );
    }

    @Test
    @DisplayName("Cenário 4")
    void cenario4() throws ReflectiveOperationException {
      Class<TreinadorPokemon> clazzTreinadorPokemon = TreinadorPokemon.class;
      Method metodo = clazzTreinadorPokemon.getDeclaredMethod("evoluirPokemon", Pokemon.class, String.class);

      Object obj = new TreinadorPokemon();
      Pokemon pokemon = new Pokemon();

      // Case
      camposPokemon().get("nome").set(pokemon, "Treecko");
      camposPokemon().get("tipo").set(pokemon, "Grama");
      camposPokemon().get("forca").set(pokemon, 500.0);
      camposPokemon().get("doces").set(pokemon, 50);

      campos().get("nome").set(obj, "Paulo");
      campos().get("nivel").set(obj, 50.0);

      // When
      metodo.invoke(obj, pokemon, "Grovyle");

      // Then
      Assertions.assertAll(
          () -> Assertions.assertEquals("Grovyle", camposPokemon().get("nome").get(pokemon)),
          () -> Assertions.assertEquals(0, camposPokemon().get("doces").get(pokemon)),
          () -> Assertions.assertEquals(60.0, (Double) campos().get("nivel").get(obj), 0.01)
      );
    }
  }
}
