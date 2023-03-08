
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Prueba suma")
    void sumaTest() {
        int esperado = 5;

        assertEquals(esperado, calculadora.suma(3, 2));
    }

    @Test
    @DisplayName("Prueba resta")
    void restaTest() {
        int esperado = 1;

        assertEquals(esperado, calculadora.resta(3, 2));
    }

    @Test
    @DisplayName("Prueba multiplicación")
    void multiplicaTest() {
        int esperado = 6;

        assertEquals(esperado, calculadora.multiplica(3, 2));
    }

    @Test
    @DisplayName("Prueba division")
    void dividirTest() {
        Throwable ex = assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(2,0));
        assertEquals("El divisor no puede ser 0", ex.getMessage());
    }
}
