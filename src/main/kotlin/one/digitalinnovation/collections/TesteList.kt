package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("JOão", 1000.0)
    val maria = Funcionario("Maria", 2000.0)
    val jose = Funcionario("José", 3000.0)

    val funcionarios = listOf(joao, jose, maria)
    funcionarios.forEach{println(it)}

    println ("--- imprimir um funcionario específico")
    println(funcionarios.find{it.nome == "Maria"})
}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
}