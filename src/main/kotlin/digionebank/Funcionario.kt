package digionebank

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double,
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
    Nome: $nome
    cpf: $cpf
    Salario: $salario
    Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}