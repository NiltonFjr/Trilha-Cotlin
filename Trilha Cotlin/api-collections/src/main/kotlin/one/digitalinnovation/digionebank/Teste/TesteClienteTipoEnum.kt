package one.digitalinnovation.digionebank.Teste

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.toString()}")

    }

    ClienteTipo.values().forEach {
        println("${it.name} - $it")
    }
}