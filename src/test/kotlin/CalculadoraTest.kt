import org.junit.jupiter.api.Assertions.*
import org.junit.Test as Test

internal class CalculadoraTest {

    @Test

    fun somaTest() {

        assertEquals(8, Calculadora.soma(4, 4))
    }

    @Test

    fun subtracaoTest() {

        assertEquals(0, Calculadora.subtracao(4, 4))
    }

    @Test

    fun multTest() {

        assertEquals(16.0, Calculadora.mult(4.0, 4.0))
    }

    @Test

    fun divisaoTest() {

        assertEquals(1.0, Calculadora.divisao(4.0, 4.0))
    }

    @Test

    fun modTest() {

        assertEquals(0, Calculadora.mod(4, 4))
    }

    @Test

    fun potTest() {

        assertEquals(16.0, Calculadora.pot(4.0, 2.0))

    }

    @Test

    fun raizQuadradaTest() {

        assertEquals(10.0, Calculadora.raizQuadrada(100.0))
    }



}