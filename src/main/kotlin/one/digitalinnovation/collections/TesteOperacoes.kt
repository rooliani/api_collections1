package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1500.00,20100.00,5002.00,5002.0)

    for (salario in salarios){
        println(salario)
    }

    println("______________________")

    println("Maior salário:  ${salarios.max()}") // max() esta depreciado
    println("Menor salário:  ${salarios.min()}")
    println("Média salário:  ${salarios.average()}")

    println("Maior salário:  ${salarios.maxOrNull()}") //  nova forma
    println("Menor salário:  ${salarios.minOrNull()}")


    val salariosMaiorQue2500 = salarios.filter{it > 2500.0}

    println(" ------ sal maior que 2500 ______")

    salariosMaiorQue2500.forEach{println(it)}

    println(" ------ quantos salário estão entre 2000 e 6000 ______")
    println(salarios.count{it in 2000.00..6000.0})  // utilizando um range

    println(" ------ quantos salário estão entre 2000 e 6000 ______")
    println(salarios.find{it == 5002.0})

    println(" ------ existe dentro da coleção? ______")
    println(salarios.any{it ==1000.0})
    println(salarios.any{it ==20100.0})





}