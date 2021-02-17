package digionebank

import java.math.BigDecimal

class Conta (
    //construtor primario
    val agencia: String,
    val numero: String,
    val saldo: Double
) {
    fun deposito(valor: BigDecimal){
    }

    fun saque (valor: BigDecimal){
    }
}