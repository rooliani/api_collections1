package one.digitalinnovation.collections

fun main() {
    val paulo = Funcionario("Paulo", 8000.0, "CLT")
    val edu = Funcionario("Eduardo", 2000.0, "PJ")
    val jose = Funcionario("José", 3000.0, "CLT")

    // com o T generics na classe, agora podemos falar que o tipo que queremos criar é Funcionario
    val repositorio = Repositorio<Funcionario>()

    repositorio.create(paulo.nome, paulo)
    repositorio.create(jose.nome, jose)
    repositorio.create(edu.nome, edu)

    println(repositorio.findById(edu.nome))
    println("---- findAll")
    println(repositorio.findAll().forEach{ println(it)})

    println(repositorio.remove(jose.nome))
    println("---- remove")
    println(repositorio.findAll().forEach{ println(it)})

}