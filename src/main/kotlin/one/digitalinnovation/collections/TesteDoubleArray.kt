package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1500.00
    salarios[1] = 1900.00
    salarios[2] = 1400.00

    salarios.forEach { println(it) }

    println("------- aumento -------")


    // iterar o valor direto pelo index
    salarios.forEachIndexed{ index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("------- salário 2 -------")
    val salarios2 = doubleArrayOf(1400.00,5000.05,1458.23)
    salarios2.sort()
    salarios2.forEach { (println(it)) }


}