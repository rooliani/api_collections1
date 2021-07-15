package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)
    values[0] =1
    values[1] =3
    values[2] =4
    values[3] =2
    values[4] =7

    for (valor in values)
        println(valor)

    println("-------------------------")

    values.forEach { println(it) }
    // usando recurso lambda forEach
    // it faz referencia a variável

    println("-------------------------")
    values.forEach { valor -> println(valor) }
    println("-------------------------")
    for (index in values.indices){
        println(values[index])
    }

    println("-------------------------")
    values.sort()
    for(valor in values)
        println(valor)
}