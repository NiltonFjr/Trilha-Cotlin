package one.digitalinnovation.collections

class Pessoa {
    var nome: String = "Nilton"
    var cpf: String = "123.456.789-00"
    private set

    constructor()

}
fun main() {
    val nilton = Pessoa()

    println(nilton)
    println(nilton.nome)
    println(nilton.cpf)
}