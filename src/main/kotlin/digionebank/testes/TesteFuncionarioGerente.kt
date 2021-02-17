package digionebank.testes

import digionebank.Funcionario
import digionebank.Gerente
import digionebank.imprimeRelatorioFuncionario

fun main(){
    val maria = Gerente("Maria Elena", "789456123", 10000.00)
    imprimeRelatorioFuncionario.imprime(maria)
}
