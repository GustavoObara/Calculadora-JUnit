package calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraJunitTest {
    Somar       sum  = new Somar();
    Subtrair    sub  = new Subtrair();
    Dividir     div  = new Dividir();
    Multiplicar mult = new Multiplicar();
    @Test
    public void testSomar() {
        assertEquals(100, sum.somar(70, 30));
        assertEquals(-100, sum.somar(-60, -40));
        assertEquals(100, sum.somar(150, -50));
        assertEquals(0, sum.somar(0, 0));
        assertEquals(100, sum.somar(100, 0));
        assertEquals(-100, sum.somar(-100, 0));
    }
    @Test
    public void testSubtrair() {
        assertEquals(40, sub.subtrair(70, 30));
        assertEquals(-20, sub.subtrair(-60, -40));
        assertEquals(200, sub.subtrair(150, -50));
        assertEquals(0, sub.subtrair(0, 0));
        assertEquals(100, sub.subtrair(100, 0));
        assertEquals(-100, sub.subtrair(-100, 0));
    }
    @Test
    public void testDividir() {
        assertEquals(2, div.dividir(70, 30));
        assertEquals(1, div.dividir(-60, -40));
        assertEquals(-3, div.dividir(150, -50));
    }
    @Test
    public void testMultiplicar() {
        assertEquals(2100, mult.multiplicar(70, 30));
        assertEquals(2400, mult.multiplicar(-60, -40));
        assertEquals(-7500, mult.multiplicar(150, -50));
        assertEquals(0, mult.multiplicar(0, 0));
        assertEquals(0, mult.multiplicar(100, 0));
        assertEquals(0, mult.multiplicar(-100, 0));
    }
}

