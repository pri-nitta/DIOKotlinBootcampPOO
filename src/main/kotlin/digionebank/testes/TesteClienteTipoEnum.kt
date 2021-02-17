package digionebank.testes

import digionebank.ClienteTipo

fun main(){
    //renomeando o it
    ClienteTipo.values().forEach { elemento ->
        println("Renomeando: ${elemento.name} = ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("Usando it: ${it.name} - ${it.descricao}")
    }

    //teste
    val pf = ClienteTipo.PF
    println (">> ${pf.name} - ${pf.descricao}")
}