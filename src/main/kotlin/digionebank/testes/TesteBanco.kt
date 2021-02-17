package digionebank.testes

import digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)
    // uma vez instanciada uma data class ela será imutável
    println(digiOneBank.nome)
    println(digiOneBank.numero)

// realizando uma cópia do data class pode-se realizar a alteração
    val banco2 = digiOneBank.copy(nome = "DigiTwo")
    println(banco2.nome)
    println(banco2.numero)

    println(digiOneBank.infoBanco())

}