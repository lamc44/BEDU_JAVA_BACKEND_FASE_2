import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraMultiplicaTest {
    static Calculadora calculadora;

    @BeforeAll
    static void setup(){
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Prueba multiplicacion")
    void sumaTest() {
        int esperado = 6;
        assertEquals(esperado, calculadora.multiplica(3,2));
    }
}
