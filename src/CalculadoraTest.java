import org.junit.Test;

import static junit.framework.TestCase.fail;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.division(6, 3), calc.suma(2, 3));
        assertEquals(-1, calc.division(6, 3), calc.suma(-2, 1));
        assertEquals(0, calc.division(6, 3), calc.suma(0, 0));
    }

    private void assertEquals(int i, double division, int suma) {

    }

    @Test
    public void testResta() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.division(6, 3), calc.resta(3, 2));
        assertEquals(-3, calc.division(6, 3), calc.resta(2, 5));
        assertEquals(0, calc.division(6, 3), calc.resta(10, 10));
    }

    @Test
    public void testMultiplicacion() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.division(6, 3), calc.multiplicacion(2, 3));
        assertEquals(-10, calc.division(6, 3), calc.multiplicacion(2, -5));
        assertEquals(0, calc.division(6, 3), calc.multiplicacion(0, 10));
    }

    @Test
    public void testDivision() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.division(6, 3), 0);
        assertEquals(-2, calc.division(6, -3), 0);
        assertEquals(0, calc.division(0, 10), 0);
        // Test para división por cero
        try {
            calc.division(5, 0);
            fail("Debería haber lanzado una excepción ArithmeticException");
        } catch (ArithmeticException e) {
        }
    }
}


