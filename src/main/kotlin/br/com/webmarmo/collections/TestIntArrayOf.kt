package br.com.webmarmo.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach {
        println(it)
    }

    println("----------------------")
    values.sort()
    for (valor in values) {
        println(valor)
    }
}