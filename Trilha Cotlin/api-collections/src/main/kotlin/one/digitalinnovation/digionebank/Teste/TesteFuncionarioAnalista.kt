package one.digitalinnovation.digionebank.Teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val nilton = Analista( nome = "Nilton Junior", cpf = "123.456.789-000", salario = 2000.0)
    imprimeRelatorio(nilton)

}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())