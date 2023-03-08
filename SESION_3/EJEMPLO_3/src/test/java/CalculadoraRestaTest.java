import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraRestaTest {
    static Calculadora calculadora;

    @BeforeAll
    static void setup(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Prueba resta")
    void sumaTest() {
        int esperado = 1;
        assertEquals(esperado, calculadora.resta(3,2));
    }
}
