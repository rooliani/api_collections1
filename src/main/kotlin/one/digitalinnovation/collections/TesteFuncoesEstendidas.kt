package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000.0".toBigDecimal(),
        "3000.0".toBigDecimal(),
        "10000.0".toBigDecimal()
    )

    println(salarios.somatoria())

    println(salarios.media())
}