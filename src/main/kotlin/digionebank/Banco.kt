package digionebank

data class Banco(
    val nome: String,
    val numero: Int,

) {
    fun infoBanco() = "Nome do banco: $nome e nº$numero"
}


