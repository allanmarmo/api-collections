package br.com.webmarmo.collections

fun main() {
    val salarios = doubleArrayOf(1000.00, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("-----------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salario: ${salarios.average()}")

    // Se for verdadeiro, coleta
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("-----------------------")
    salariosMaiorQue2500.forEach { println(it) }

    println("-----------------------")
    // Conta quantos(count) registro esta entre os dois valores
    println(salarios.count { it in 2000.0..5000.0 })

    println("-----------------------")
    // Encontre dentro do array, o valor informado ou não(null) se não
    // localizar o valor informado.
    println(salarios.find { it == 2250.0 }) // sim, encontramos
    println(salarios.find { it == 2251.0 }) // não encontrado

    println("-----------------------")
    // Se encontrar o elemento dentro do array, retorna true ou false
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })
}