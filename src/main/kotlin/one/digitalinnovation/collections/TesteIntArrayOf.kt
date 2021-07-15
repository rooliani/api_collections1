package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2,3,6,9,1)
    // se tiver que aumentar o tamanho do array

    values.forEach {
        println(it)
    }

    values.sort()

    println ("____________________")

    values.forEach {
        println(it)
    }
}