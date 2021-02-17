package digionebank.testes

import digionebank.Cliente
import digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.456.789-11",
        clienteTipo = ClienteTipo.PF,
        senha = "12345"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)
}