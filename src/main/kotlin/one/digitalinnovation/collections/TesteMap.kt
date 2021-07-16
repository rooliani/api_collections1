package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String,Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    // conjunto de pares alocados dentro de um mapa
    // 1 pair é adicionado com chave valor no mapof
    map1.forEach{ (k,v) -> println (" MAP1 = Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )

    map2.forEach{ (k,v) -> println ("MAP2 = Chave: $k - Valor: $v") }


}