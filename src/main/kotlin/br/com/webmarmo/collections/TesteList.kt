package br.com.webmarmo.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("-----------------------")
    // Localiza dentro do list por nome
    println(funcionarios.find { it.nome == "Maria" })

    println("-----------------------")
    funcionarios
        // ordem crescente
        .sortedBy { it.salario }
        // Imprime pra mim
        .forEach { println(it) }

    println("-----------------------")
    funcionarios
        // Agrupamento
        .groupBy { it.tipoContratacao }
        // Imprime pra mim
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $salario
            Tipo Contratação: $tipoContratacao
        """.trimIndent()
}