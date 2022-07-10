package one.digitalinnovation.digionebank.Teste

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario


fun main() {
    val jose = Gerente( nome = "Jose Jose", cpf = "123.456.789-000", salario = 5000.0)

    ImprimeRelatorioFuncionario.imprime(jose)

}

