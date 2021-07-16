package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("JOão", 4000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "PJ")
    val jose = Funcionario("José", 3000.0, "CLT")

    val funcionarios = listOf(joao, jose, maria)

    funcionarios.forEach{println(it)}

    println ("\n--- imprimir um funcionario específico")
    println(funcionarios.find{it.nome == "Maria"})

    println ("\n--- sortedby - ordenar por algo")
    funcionarios
        .sortedBy { it.salario }
        .forEach{println(it)}  // operação coletora

    println ("\n--- groupby agrupar por tipo de contratação")
    funcionarios
        .sortedBy { it.tipoContratacao }
        .forEach{println(it)}

    println ("\n---  adcionar um novo funcionário")
    // não dá para adiconar item aqui desta forma só com multable list

    println ("\n--- UNION -  conjunto de funcionário")
    val funcionarios1 = setOf(joao, maria) // conjunto de funcionários
    val funcionarios2 = setOf(jose)


    // fazer a união do conjunto 1 e 2 para fazer a impressão
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println ("\n--- SUBTRACT - extrair/subtrair o item desejado ")
    val funcionarios3 = setOf(jose, maria, joao)
    val resultSubstract = funcionarios3.subtract(funcionarios2)
    resultSubstract.forEach { println(it) }

    println ("\n--- intersect - o que tem de comum entre os conjuntos")
    val funcionarios4 = setOf(jose, maria, joao)
    val resultIntersect = funcionarios4.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }

}

