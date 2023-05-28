class Conta(
    val titular: String,
    val numeroConta: Int
) {
    var saldo = 0.0
        private set

    fun depositar(valor: Double) {
        if (valor > 0) this.saldo += valor
    }

    fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun trasnferir(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }

}