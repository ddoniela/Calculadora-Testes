import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {

    companion object{

        fun soma(n1: Int, n2: Int): Int{
            return n1 + n2
        }

        fun subtracao(n1: Int, n2: Int): Int{
            return n1 - n2
        }

        fun mult(n1: Double, n2: Double): Double {
            return n1 * n2
        }

        fun divisao(n1: Double, n2: Double): Double {
            return n1 / n2
        }

        fun mod(n1: Int, n2: Int): Int {
            return n1 % n2
        }

        fun pot(n1: Double, n2: Double): Double{
            return n1.pow(n2)
        }

        fun raizQuadrada(num: Double): Double{
            return sqrt(num)
        }

    }
}
