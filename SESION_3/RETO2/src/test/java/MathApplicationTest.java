import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MathApplicationTest {
    @Mock
    CalculadoraService calcService;

    @InjectMocks
    MathApplication mathApplication;

    @Test
    public void testAdd() {
        when(calcService.add(3.0, 4.5)).thenReturn(7.5);

        assertEquals(mathApplication.add(3.0, 4.5), 7.5,0);

        verify(calcService).add(15.0,2.0);
    }
}
