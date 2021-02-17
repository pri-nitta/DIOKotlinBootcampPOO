package digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel{
    override fun login(): Boolean = "senha123" == senha
    override fun calculoAuxilio() = salario * 0.4
}