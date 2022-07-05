package one.digitalinnovation.digionebank.Teste

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.Descricao}")

    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.Descricao}")
    }

    val pf = ClienteTipo.PF
    println(">> ${pf.name} - ${pf.Descricao}")

    val pj = ClienteTipo.PF
    println(">> ${pj.name} - ${pj.Descricao}")
}