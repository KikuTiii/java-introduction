package school.sptech;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class GerenciadorDeNotasTests {

    @Nested
    class MetodoLerNotas{
        @Test
        @DisplayName("Cenário 1")
        void cenario1() throws ReflectiveOperationException {

            Class<?> clazz = GerenciadorDeNotas.class;
            Method metodo = clazz.getDeclaredMethod("lerNotas");

            Locale.setDefault(new Locale("pt", "BR"));

            String input = "";

            input += "3" + System.lineSeparator();
            input += "10,0" + System.lineSeparator() + "5,0" + System.lineSeparator() + "6,0" + System.lineSeparator();
            ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
            System.setIn(bais);

            Object obj = new GerenciadorDeNotas();
            Object resposta = metodo.invoke(obj);

            Assertions.assertEquals(3, ((List) resposta).size());
        }

        @Test
        @DisplayName("Cenário 2")
        void cenario2() throws ReflectiveOperationException {

            Class<?> clazz = GerenciadorDeNotas.class;
            Method metodo = clazz.getDeclaredMethod("lerNotas");

            Locale.setDefault(new Locale("pt", "BR"));

            String input = "";

            input += "0" + System.lineSeparator();
            input += "10,0" + System.lineSeparator() + "5,0" + System.lineSeparator() + "6,0" + System.lineSeparator();
            ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
            System.setIn(bais);

            Object obj = new GerenciadorDeNotas();
            Object resposta = metodo.invoke(obj);

            Assertions.assertTrue(((List) resposta).isEmpty());
        }

        @Test
        @DisplayName("Cenário 3")
        void cenario3() throws ReflectiveOperationException {

            Class<?> clazz = GerenciadorDeNotas.class;
            Method metodo = clazz.getDeclaredMethod("lerNotas");

            Locale.setDefault(new Locale("pt", "BR"));

            String input = "";

            input += "1" + System.lineSeparator();
            input += "10,0" + System.lineSeparator();
            ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
            System.setIn(bais);

            Object obj = new GerenciadorDeNotas();
            Object resposta = metodo.invoke(obj);

            Assertions.assertEquals(1, ((List) resposta).size());
        }
    }

    @Nested
    class MetodoCalcularMedia{
        @Test
        @DisplayName("Cenário 1")
        void cenario1() throws ReflectiveOperationException {

            Class<?> clazz = GerenciadorDeNotas.class;
            Method metodo = clazz.getDeclaredMethod("calcularMedia", List.class);

            Object obj = new GerenciadorDeNotas();
            Object resposta = metodo.invoke(obj, List.of(10.0, 5.0, 6.0));

            Assertions.assertEquals(7.0, (Double) resposta, 0.01);
        }

        @Test
        @DisplayName("Cenário 2")
        void cenario2() throws ReflectiveOperationException {

            Class<?> clazz = GerenciadorDeNotas.class;
            Method metodo = clazz.getDeclaredMethod("calcularMedia", List.class);

            Object obj = new GerenciadorDeNotas();
            Object resposta = metodo.invoke(obj, (Object) null);

            Assertions.assertNull(resposta);
        }

        @Test
        @DisplayName("Cenário 3")
        void cenario3() throws ReflectiveOperationException {

            Class<?> clazz = GerenciadorDeNotas.class;
            Method metodo = clazz.getDeclaredMethod("calcularMedia", List.class);

            Object obj = new GerenciadorDeNotas();
            Double resposta = (Double) metodo.invoke(obj, new ArrayList<Double>());

            Assertions.assertNull(resposta);
        }
    }

    @Nested
    class MetodoVerificarResultado{
        @Test
        @DisplayName("Cenário 1")
        void cenario1() throws ReflectiveOperationException {

            Class<?> clazz = GerenciadorDeNotas.class;
            Method metodo = clazz.getDeclaredMethod("verificarResultado", Double.class);

            Object obj = new GerenciadorDeNotas();
            Boolean resposta = (Boolean) metodo.invoke(obj, 5.0);

            Assertions.assertFalse(resposta);
        }

        @Test
        @DisplayName("Cenário 2")
        void cenario2() throws ReflectiveOperationException {

            Class<?> clazz = GerenciadorDeNotas.class;
            Method metodo = clazz.getDeclaredMethod("verificarResultado", Double.class);

            Object obj = new GerenciadorDeNotas();
            Boolean resposta = (Boolean) metodo.invoke(obj, 9.0);

            Assertions.assertTrue(resposta);
        }

        @Test
        @DisplayName("Cenário 3")
        void cenario3() throws ReflectiveOperationException {

            Class<?> clazz = GerenciadorDeNotas.class;
            Method metodo = clazz.getDeclaredMethod("verificarResultado", Double.class);

            Object obj = new GerenciadorDeNotas();
            Double resposta = (Double) metodo.invoke(obj, (Object) null);

            Assertions.assertNull(resposta);
        }

        @Test
        @DisplayName("Cenário 4")
        void cenario4() throws ReflectiveOperationException {

            Class<?> clazz = GerenciadorDeNotas.class;
            Method metodo = clazz.getDeclaredMethod("verificarResultado", Double.class);

            Object obj = new GerenciadorDeNotas();
            Double resposta = (Double) metodo.invoke(obj, -1.0);

            Assertions.assertNull(resposta);
        }
    }
}
