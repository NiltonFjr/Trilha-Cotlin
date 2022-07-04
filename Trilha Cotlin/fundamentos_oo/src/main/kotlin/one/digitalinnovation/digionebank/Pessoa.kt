package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Nilton"

    var cpf: String = "123.456.789-00"
    private set
}

fun main() {
    val nilton = Pessoa()

    println(nilton)
    println(nilton.nome)
    println(nilton.cpf)
}