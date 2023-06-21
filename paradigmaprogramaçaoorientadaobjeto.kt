
//faça um programa Calculadora em kotlin, o programa solicita que o usuário digite dois numeros inteiros, operações (soma, subtração, multiplicação, divisão) e responde o usuário com as  operações. O programa será orientado para objeto, deverá ter uma classe calculadora, dois atributos num1 e num2 quatro metodos soma, subtracao, multiplicacão e disao
//(FIZ PELO CHATGPT)





class Calculadora(private val num1: Int, private val num2: Int) {
    fun soma(): Int {
        return num1 + num2
    }

    fun subtracao(): Int {
        return num1 - num2
    }

    fun multiplicacao(): Int {
        return num1 * num2
    }

    fun divisao(): Double {
        if (num2 != 0) {
            return num1.toDouble() / num2.toDouble()
        } else {
            throw IllegalArgumentException("Divisão por zero não é permitida.")
        }
    }
}

fun main() {
    println("Calculadora")
    println("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()
    println("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()

    val calculadora = Calculadora(num1, num2)

    println("Selecione a operação:")
    println("1. Soma")
    println("2. Subtração")
    println("3. Multiplicação")
    println("4. Divisão")
    val escolha = readLine()!!.toInt()

    when (escolha) {
        1 -> println("Resultado da soma: ${calculadora.soma()}")
        2 -> println("Resultado da subtração: ${calculadora.subtracao()}")
        3 -> println("Resultado da multiplicação: ${calculadora.multiplicacao()}")
        4 -> {
            try {
                println("Resultado da divisão: ${calculadora.divisao()}")
            } catch (ex: IllegalArgumentException) {
                println(ex.message)
            }
        }
        else -> println("Escolha inválida.")
    }
}





