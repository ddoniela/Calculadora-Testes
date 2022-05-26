fun main(){

    while (true) {

        println("Menu\n")

        println("1 - Adição")
        println("2 - Subtração")
        println("3 - Multiplicação")
        println("4 - Divisão")
        println("5 - Módulo")
        println("6 - Potência")
        println("7 - Raiz Quadradada")
        println("8 - Sair\n")


        println("Digite uma operação: ")


        val opc = readln().toInt()

        when (opc) {

            1 -> {
                println("Digite o primeiro valor: ")
                val n1 = readln().toInt()
                println("Digite o segundo valor: ")
                val n2 = readln().toInt()
                println("A soma entre $n1 e $n2 é ${Calculadora.soma(n1, n2)}")
            }

            2 -> {
                println("Digite o primeiro valor: ")
                val n1 = readln().toInt()
                println("Digite o segundo valor: ")
                val n2 = readln().toInt()
                println("A subtração entre $n1 e $n2 é ${Calculadora.subtracao(n1, n2)}")
            }

            3 -> {
                println("Digite o primeiro valor: ")
                val n1 = readln().toDouble()
                println("Digite o segundo valor: ")
                val n2 = readln().toDouble()
                println("A multiplicação entre $n1 e $n2 é ${Calculadora.mult(n1, n2)}")
            }

            4 -> {
                println("Digite o primeiro valor: ")
                val n1 = readln().toDouble()
                println("Digite o segundo valor: ")
                val n2 = readln().toDouble()
                println("A divisão entre $n1 e $n2 é ${Calculadora.divisao(n1, n2)}")
            }

            5 -> {
                println("Digite o primeiro valor: ")
                val n1 = readln().toInt()
                println("Digite o segundo valor: ")
                val n2 = readln().toInt()
                println("O módulo entre $n1 e $n2 é ${Calculadora.mod(n1, n2)}")
            }

            6 -> {
                println("Digite o primeiro valor: ")
                val n1 = readln().toDouble()
                println("Digite o segundo valor: ")
                val n2 = readln().toDouble()
                println("A potência de $n1 é ${Calculadora.pot(n1, n2)}")
            }

            7 -> {
                println("Digite o primeiro valor: ")
                val n1 = readln().toDouble()
                println("Digite o segundo valor: ")
                val n2 = readln().toDouble()
                println("A raiz quadrada de $n1 é ${Calculadora.raizQuadrada(n1)}")
            }

            8 -> break

            else -> println("Opção inválida")
        }
    }
}