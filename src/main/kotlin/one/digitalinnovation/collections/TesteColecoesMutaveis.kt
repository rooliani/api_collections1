package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("JOão", 4000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "PJ")
    val jose = Funcionario("José", 3000.0, "CLT")

    // lista multavel - pode alterar a lista add/remover
    println("\n --- mutableListOf ")
    val funcionarios = mutableListOf(joao,maria)
    funcionarios.forEach { println(it) }

    println("\n--- ADD - adicionar item")
    funcionarios.add(jose)
    funcionarios.forEach { println(it) }

    println("\n--- REMOVE - remover item")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("\n--- SET - ADD")
    val funcionarioSet = mutableSetOf(joao)

    funcionarioSet.add(maria)
    funcionarioSet.add(jose)

    funcionarioSet.forEach { println(it) }

    println("\n--- SET - REMOVE")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

}