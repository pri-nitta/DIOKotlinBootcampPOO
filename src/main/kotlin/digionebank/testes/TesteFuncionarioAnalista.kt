package digionebank.testes

import digionebank.Analista
import digionebank.Funcionario
import digionebank.imprimeRelatorioFuncionario

fun main(){
    val joao = Analista("João Pedro", "123456789", 3000.00)
    imprimeRelatorioFuncionario.imprime(joao)
}
