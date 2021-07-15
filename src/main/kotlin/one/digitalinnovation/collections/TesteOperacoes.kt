package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1500.00,20100.00,5002.00)

    for (salario in salarios){
        println(salario)
    }

    println("______________________")

    println("Maior salário:  ${salarios.max()}")
    println("Menor salário:  ${salarios.min()}")
    println("Média salário:  ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter{it > 2500.0}

    println(" ------ sal maior que 2500 ______")

    salariosMaiorQue2500.forEach{println(it)}
}