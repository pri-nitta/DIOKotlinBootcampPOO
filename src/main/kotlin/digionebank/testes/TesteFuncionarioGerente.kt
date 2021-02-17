package digionebank.testes

import digionebank.Gerente

fun main(){
    val maria = Gerente("Maria Elena", "789456123", 10000.00, "senha123")
    imprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}
