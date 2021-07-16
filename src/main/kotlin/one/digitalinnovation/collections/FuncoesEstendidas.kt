package one.digitalinnovation.collections

import java.math.BigDecimal

//função estendida

// Reduce
//Como a tradução sugere, reduce (ou reduzir, em português)
// trata-se de uma função disponível nas collections que serve para “reduzir” a lista a uma única variável.

//Podemos notar que reduce nos traz dois parâmetros que neste caso são acc e valor.
// Basicamente o acc é a variável que vai armazenar a contagem, enquanto o valor o próprio número da lista.

fun Array<BigDecimal>.somatoria() = this.reduce {
    acc, valor -> acc + valor
}

//função estendida
fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()


